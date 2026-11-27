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
public final class tg7 implements Callable {
    public final byte a;
    public final Object b;

    public tg7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object call() {
        boolean z;
        xcd xcdVar;
        int i;
        String str;
        gi0 gi0Var;
        gi0 gi0Var2;
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
                ox oxVar = (ox) this.b;
                oxVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    oxVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        oxVar.c.set(true);
                        throw th;
                    } finally {
                        oxVar.b(null);
                    }
                }
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ks) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    ns nsVar = (ns) it;
                    if (nsVar.hasNext()) {
                        hka hkaVar = ((nka) nsVar.next()).c;
                        ?? obj = new Object();
                        obj.a = hkaVar.a;
                        obj.b = hkaVar.b;
                        Intent[] intentArr = hkaVar.c;
                        obj.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                        obj.d = hkaVar.d;
                        obj.e = hkaVar.e;
                        obj.f = hkaVar.f;
                        obj.g = hkaVar.g;
                        obj.h = hkaVar.h;
                        obj.k = hkaVar.k;
                        obj.l = hkaVar.l;
                        obj.m = hkaVar.m;
                        b78[] b78VarArr = hkaVar.i;
                        if (b78VarArr != null) {
                            obj.i = (b78[]) Arrays.copyOf(b78VarArr, b78VarArr.length);
                        }
                        if (hkaVar.j != null) {
                            obj.j = new HashSet(hkaVar.j);
                        }
                        PersistableBundle persistableBundle = hkaVar.n;
                        if (persistableBundle != null) {
                            obj.n = persistableBundle;
                        }
                        if (!TextUtils.isEmpty(obj.e)) {
                            Intent[] intentArr2 = obj.c;
                            if (intentArr2 != null && intentArr2.length != 0) {
                                arrayList.add(obj);
                            }
                        } else {
                            lq5.j("Shortcut must have a non-empty label");
                            return null;
                        }
                    } else {
                        return arrayList;
                    }
                }
                lq5.j("Shortcut must have an intent");
                return null;
            case 2:
                return BitmapFactory.decodeFile(((nka) this.b).b);
            case 3:
                nhd nhdVar = (nhd) this.b;
                vh0 vh0Var = nhdVar.d;
                synchronized (vh0Var.a) {
                    if (vh0Var.b != 3) {
                        if (vh0Var.b == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        synchronized (vh0Var.a) {
                            xcdVar = vh0Var.i;
                        }
                        vh0 vh0Var2 = nhdVar.d;
                        if (xcdVar == null) {
                            vh0Var2.k(0);
                            gi0 gi0Var3 = hod.h;
                            vh0Var2.j(107, gi0Var3);
                            nhdVar.c(gi0Var3);
                        } else {
                            String packageName = vh0Var2.g.getPackageName();
                            int i3 = 25;
                            int i4 = 3;
                            int i5 = 25;
                            while (true) {
                                if (i5 >= 3) {
                                    try {
                                        mcd mcdVar = (mcd) xcdVar;
                                        Parcel X = mcdVar.X();
                                        X.writeInt(i5);
                                        X.writeString(packageName);
                                        X.writeString("subs");
                                        Parcel Y = mcdVar.Y(X, 1);
                                        int readInt = Y.readInt();
                                        Y.recycle();
                                        if (readInt == 0) {
                                            old.g("BillingClient", "highestLevelSupportedForSubs: " + i5);
                                            i4 = readInt;
                                        } else {
                                            i5--;
                                            i4 = readInt;
                                        }
                                    } catch (Exception e) {
                                        old.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
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
                                        if (ik8.c(i, 42)) {
                                            str = pnd.a(e);
                                        } else {
                                            str = null;
                                        }
                                        nhdVar.d.k(0);
                                        if (z14) {
                                            gi0Var = hod.h;
                                        } else {
                                            gi0Var = hod.f;
                                        }
                                        nhdVar.b(gi0Var, i, str, z);
                                        if (z14) {
                                            gi0Var2 = hod.h;
                                        } else {
                                            gi0Var2 = hod.f;
                                        }
                                        nhdVar.c(gi0Var2);
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
                            vh0Var2.k = z2;
                            if (i5 < 3) {
                                old.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                i2 = 9;
                            } else {
                                i2 = 1;
                            }
                            while (true) {
                                if (i3 >= 3) {
                                    mcd mcdVar2 = (mcd) xcdVar;
                                    Parcel X2 = mcdVar2.X();
                                    X2.writeInt(i3);
                                    X2.writeString(packageName);
                                    X2.writeString("inapp");
                                    Parcel Y2 = mcdVar2.Y(X2, 1);
                                    int readInt2 = Y2.readInt();
                                    Y2.recycle();
                                    if (readInt2 == 0) {
                                        vh0Var2.l = i3;
                                        old.g("BillingClient", "mHighestLevelSupportedForInApp: " + i3);
                                        i4 = readInt2;
                                    } else {
                                        i3--;
                                        i4 = readInt2;
                                    }
                                }
                            }
                            int i6 = vh0Var2.l;
                            vh0Var2.l = i6;
                            if (i6 >= 26) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            vh0Var2.w = z3;
                            if (i6 >= 24) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            vh0Var2.v = z4;
                            if (i6 >= 21) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            vh0Var2.u = z5;
                            if (i6 >= 20) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            vh0Var2.t = z6;
                            if (i6 >= 19) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            vh0Var2.s = z7;
                            if (i6 >= 17) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            vh0Var2.r = z8;
                            if (i6 >= 16) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            vh0Var2.q = z9;
                            if (i6 >= 15) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            vh0Var2.p = z10;
                            if (i6 >= 14) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            vh0Var2.o = z11;
                            if (i6 >= 9) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            vh0Var2.n = z12;
                            if (i6 < 6) {
                                z13 = false;
                            }
                            vh0Var2.m = z13;
                            if (i6 < 3) {
                                old.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i2 = 36;
                            }
                            vh0.p(vh0Var2, i4);
                            if (i4 != 0) {
                                gi0 gi0Var4 = hod.a;
                                nhdVar.b(gi0Var4, i2, null, z);
                                nhdVar.c(gi0Var4);
                            } else {
                                try {
                                    Long a = nhdVar.a(z);
                                    if (z) {
                                        eme s = wme.s();
                                        s.b();
                                        wme.r((wme) s.b, 6);
                                        mve r = uve.r();
                                        r.c(false);
                                        r.d();
                                        if (a != null) {
                                            long longValue = a.longValue();
                                            r.b();
                                            uve.p((uve) r.b, longValue);
                                        }
                                        vh0 vh0Var3 = nhdVar.d;
                                        s.b();
                                        wme.q((wme) s.b, (uve) r.a());
                                        vh0Var3.i((wme) s.a());
                                    } else {
                                        fue p = que.p();
                                        dne s2 = wne.s();
                                        s2.b();
                                        wne.r((wne) s2.b, 0);
                                        p.b();
                                        que.n((que) p.b, (wne) s2.a());
                                        if (a != null) {
                                            long longValue2 = a.longValue();
                                            p.b();
                                            que.o((que) p.b, longValue2);
                                        }
                                        nhdVar.d.h.o((que) p.a());
                                    }
                                } catch (Throwable th2) {
                                    old.i("BillingClient", "Unable to log.", th2);
                                }
                                nhdVar.c(hod.g);
                            }
                        }
                    }
                }
                return null;
            case 4:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            case 5:
                return v26.c.a(((j2f) this.b).g);
            case 6:
                return v26.c.a(((w5f) this.b).g);
            case 7:
                return v26.c.a(((q8f) this.b).g);
            case 8:
                return v26.c.a(((xhf) this.b).a);
            default:
                return v26.c.a(((ijf) this.b).g);
        }
    }
}
