package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
public final class mg7 implements Callable {
    public final byte a;
    public final Object b;

    public mg7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object call() {
        boolean z;
        gad gadVar;
        int i;
        String str;
        fj0 fj0Var;
        fj0 fj0Var2;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        switch (this.a) {
            case 0:
                oy oyVar = (oy) this.b;
                oyVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    oyVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        oyVar.c.set(true);
                        throw th;
                    } finally {
                        oyVar.b(null);
                    }
                }
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((kt) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    nt ntVar = (nt) it;
                    if (ntVar.hasNext()) {
                        qia qiaVar = ((wia) ntVar.next()).c;
                        ?? obj = new Object();
                        obj.a = qiaVar.a;
                        obj.b = qiaVar.b;
                        Intent[] intentArr = qiaVar.c;
                        obj.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                        obj.d = qiaVar.d;
                        obj.e = qiaVar.e;
                        obj.f = qiaVar.f;
                        obj.g = qiaVar.g;
                        obj.h = qiaVar.h;
                        obj.k = qiaVar.k;
                        obj.l = qiaVar.l;
                        obj.m = qiaVar.m;
                        n58[] n58VarArr = qiaVar.i;
                        if (n58VarArr != null) {
                            obj.i = (n58[]) Arrays.copyOf(n58VarArr, n58VarArr.length);
                        }
                        if (qiaVar.j != null) {
                            obj.j = new HashSet(qiaVar.j);
                        }
                        PersistableBundle persistableBundle = qiaVar.n;
                        if (persistableBundle != null) {
                            obj.n = persistableBundle;
                        }
                        if (!TextUtils.isEmpty(obj.e)) {
                            Intent[] intentArr2 = obj.c;
                            if (intentArr2 != null && intentArr2.length != 0) {
                                arrayList.add(obj);
                            }
                        } else {
                            u36.j("Shortcut must have a non-empty label");
                            return null;
                        }
                    } else {
                        return arrayList;
                    }
                }
                u36.j("Shortcut must have an intent");
                return null;
            case 2:
                return BitmapFactory.decodeFile(((wia) this.b).b);
            case 3:
                wed wedVar = (wed) this.b;
                ui0 ui0Var = wedVar.d;
                synchronized (ui0Var.a) {
                    if (ui0Var.b != 3) {
                        if (ui0Var.b == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        synchronized (ui0Var.a) {
                            gadVar = ui0Var.i;
                        }
                        ui0 ui0Var2 = wedVar.d;
                        if (gadVar == null) {
                            ui0Var2.k(0);
                            fj0 fj0Var3 = sld.h;
                            ui0Var2.j(107, fj0Var3);
                            wedVar.c(fj0Var3);
                        } else {
                            String packageName = ui0Var2.g.getPackageName();
                            int i3 = 25;
                            int i4 = 3;
                            int i5 = 25;
                            while (true) {
                                if (i5 >= 3) {
                                    try {
                                        v9d v9dVar = (v9d) gadVar;
                                        Parcel X = v9dVar.X();
                                        X.writeInt(i5);
                                        X.writeString(packageName);
                                        X.writeString("subs");
                                        Parcel Y = v9dVar.Y(X, 1);
                                        int readInt = Y.readInt();
                                        Y.recycle();
                                        if (readInt == 0) {
                                            yid.g("BillingClient", "highestLevelSupportedForSubs: " + i5);
                                            i4 = readInt;
                                        } else {
                                            i5--;
                                            i4 = readInt;
                                        }
                                    } catch (Exception e) {
                                        yid.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                        boolean z14 = e instanceof DeadObjectException;
                                        if (z14) {
                                            i = 91;
                                        } else if (e instanceof RemoteException) {
                                            i = 90;
                                        } else if (e instanceof SecurityException) {
                                            i = 92;
                                        } else {
                                            i = 42;
                                        }
                                        if (wi8.c(i, 42)) {
                                            str = ald.a(e);
                                        } else {
                                            str = null;
                                        }
                                        wedVar.d.k(0);
                                        if (z14) {
                                            fj0Var = sld.h;
                                        } else {
                                            fj0Var = sld.f;
                                        }
                                        wedVar.b(fj0Var, i, str, z);
                                        if (z14) {
                                            fj0Var2 = sld.h;
                                        } else {
                                            fj0Var2 = sld.f;
                                        }
                                        wedVar.c(fj0Var2);
                                    }
                                } else {
                                    i5 = 0;
                                }
                            }
                            if (i5 >= 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            ui0Var2.k = z2;
                            if (i5 < 3) {
                                yid.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                i2 = 9;
                            } else {
                                i2 = 1;
                            }
                            while (true) {
                                if (i3 >= 3) {
                                    v9d v9dVar2 = (v9d) gadVar;
                                    Parcel X2 = v9dVar2.X();
                                    X2.writeInt(i3);
                                    X2.writeString(packageName);
                                    X2.writeString("inapp");
                                    Parcel Y2 = v9dVar2.Y(X2, 1);
                                    int readInt2 = Y2.readInt();
                                    Y2.recycle();
                                    if (readInt2 == 0) {
                                        ui0Var2.l = i3;
                                        yid.g("BillingClient", "mHighestLevelSupportedForInApp: " + i3);
                                        i4 = readInt2;
                                    } else {
                                        i3--;
                                        i4 = readInt2;
                                    }
                                }
                            }
                            int i6 = ui0Var2.l;
                            ui0Var2.l = i6;
                            if (i6 >= 26) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            ui0Var2.w = z3;
                            if (i6 >= 24) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            ui0Var2.v = z4;
                            if (i6 >= 21) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            ui0Var2.u = z5;
                            if (i6 >= 20) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            ui0Var2.t = z6;
                            if (i6 >= 19) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            ui0Var2.s = z7;
                            if (i6 >= 17) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            ui0Var2.r = z8;
                            if (i6 >= 16) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            ui0Var2.q = z9;
                            if (i6 >= 15) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ui0Var2.p = z10;
                            if (i6 >= 14) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ui0Var2.o = z11;
                            if (i6 >= 9) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ui0Var2.n = z12;
                            if (i6 < 6) {
                                z13 = false;
                            }
                            ui0Var2.m = z13;
                            if (i6 < 3) {
                                yid.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i2 = 36;
                            }
                            ui0.p(ui0Var2, i4);
                            if (i4 != 0) {
                                fj0 fj0Var4 = sld.a;
                                wedVar.b(fj0Var4, i2, null, z);
                                wedVar.c(fj0Var4);
                            } else {
                                try {
                                    Long a = wedVar.a(z);
                                    if (z) {
                                        oje s = gke.s();
                                        s.b();
                                        gke.r((gke) s.b, 6);
                                        yse r = gte.r();
                                        r.c(false);
                                        r.d();
                                        if (a != null) {
                                            long longValue = a.longValue();
                                            r.b();
                                            gte.p((gte) r.b, longValue);
                                        }
                                        ui0 ui0Var3 = wedVar.d;
                                        s.b();
                                        gke.q((gke) s.b, (gte) r.a());
                                        ui0Var3.i((gke) s.a());
                                    } else {
                                        rre p = cse.p();
                                        nke s2 = gle.s();
                                        s2.b();
                                        gle.r((gle) s2.b, 0);
                                        p.b();
                                        cse.n((cse) p.b, (gle) s2.a());
                                        if (a != null) {
                                            long longValue2 = a.longValue();
                                            p.b();
                                            cse.o((cse) p.b, longValue2);
                                        }
                                        wedVar.d.h.C((cse) p.a());
                                    }
                                } catch (Throwable th2) {
                                    yid.i("BillingClient", "Unable to log.", th2);
                                }
                                wedVar.c(sld.g);
                            }
                        }
                    }
                }
                return null;
            case 4:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            case 5:
                return r26.c.a(((uze) this.b).g);
            case 6:
                return r26.c.a(((h3f) this.b).g);
            case 7:
                return r26.c.a(((b6f) this.b).g);
            case 8:
                return r26.c.a(((iff) this.b).a);
            default:
                return r26.c.a(((tgf) this.b).g);
        }
    }
}
