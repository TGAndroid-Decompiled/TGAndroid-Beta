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
public final class ke7 implements Callable {
    public final byte a;
    public final Object b;

    public ke7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object call() {
        boolean z;
        e8d e8dVar;
        int i;
        String str;
        fi0 fi0Var;
        fi0 fi0Var2;
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
                nx nxVar = (nx) this.b;
                nxVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    nxVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        nxVar.c.set(true);
                        throw th;
                    } finally {
                        nxVar.b(null);
                    }
                }
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((js) ((ShortcutInfoCompatSaverImpl) this.b).b.values()).iterator();
                while (true) {
                    ms msVar = (ms) it;
                    if (msVar.hasNext()) {
                        oga ogaVar = ((uga) msVar.next()).c;
                        ?? obj = new Object();
                        obj.a = ogaVar.a;
                        obj.b = ogaVar.b;
                        Intent[] intentArr = ogaVar.c;
                        obj.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                        obj.d = ogaVar.d;
                        obj.e = ogaVar.e;
                        obj.f = ogaVar.f;
                        obj.g = ogaVar.g;
                        obj.h = ogaVar.h;
                        obj.k = ogaVar.k;
                        obj.l = ogaVar.l;
                        obj.m = ogaVar.m;
                        l38[] l38VarArr = ogaVar.i;
                        if (l38VarArr != null) {
                            obj.i = (l38[]) Arrays.copyOf(l38VarArr, l38VarArr.length);
                        }
                        if (ogaVar.j != null) {
                            obj.j = new HashSet(ogaVar.j);
                        }
                        PersistableBundle persistableBundle = ogaVar.n;
                        if (persistableBundle != null) {
                            obj.n = persistableBundle;
                        }
                        if (!TextUtils.isEmpty(obj.e)) {
                            Intent[] intentArr2 = obj.c;
                            if (intentArr2 != null && intentArr2.length != 0) {
                                arrayList.add(obj);
                            }
                        } else {
                            w26.j("Shortcut must have a non-empty label");
                            return null;
                        }
                    } else {
                        return arrayList;
                    }
                }
                w26.j("Shortcut must have an intent");
                return null;
            case 2:
                return BitmapFactory.decodeFile(((uga) this.b).b);
            case 3:
                ucd ucdVar = (ucd) this.b;
                uh0 uh0Var = ucdVar.d;
                synchronized (uh0Var.a) {
                    if (uh0Var.b != 3) {
                        if (uh0Var.b == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        synchronized (uh0Var.a) {
                            e8dVar = uh0Var.i;
                        }
                        uh0 uh0Var2 = ucdVar.d;
                        if (e8dVar == null) {
                            uh0Var2.k(0);
                            fi0 fi0Var3 = qjd.h;
                            uh0Var2.j(107, fi0Var3);
                            ucdVar.c(fi0Var3);
                        } else {
                            String packageName = uh0Var2.g.getPackageName();
                            int i3 = 25;
                            int i4 = 3;
                            int i5 = 25;
                            while (true) {
                                if (i5 >= 3) {
                                    try {
                                        t7d t7dVar = (t7d) e8dVar;
                                        Parcel X = t7dVar.X();
                                        X.writeInt(i5);
                                        X.writeString(packageName);
                                        X.writeString("subs");
                                        Parcel Y = t7dVar.Y(X, 1);
                                        int readInt = Y.readInt();
                                        Y.recycle();
                                        if (readInt == 0) {
                                            xgd.g("BillingClient", "highestLevelSupportedForSubs: " + i5);
                                            i4 = readInt;
                                        } else {
                                            i5--;
                                            i4 = readInt;
                                        }
                                    } catch (Exception e) {
                                        xgd.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
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
                                        if (ug8.c(i, 42)) {
                                            str = yid.a(e);
                                        } else {
                                            str = null;
                                        }
                                        ucdVar.d.k(0);
                                        if (z14) {
                                            fi0Var = qjd.h;
                                        } else {
                                            fi0Var = qjd.f;
                                        }
                                        ucdVar.b(fi0Var, i, str, z);
                                        if (z14) {
                                            fi0Var2 = qjd.h;
                                        } else {
                                            fi0Var2 = qjd.f;
                                        }
                                        ucdVar.c(fi0Var2);
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
                            uh0Var2.k = z2;
                            if (i5 < 3) {
                                xgd.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                i2 = 9;
                            } else {
                                i2 = 1;
                            }
                            while (true) {
                                if (i3 >= 3) {
                                    t7d t7dVar2 = (t7d) e8dVar;
                                    Parcel X2 = t7dVar2.X();
                                    X2.writeInt(i3);
                                    X2.writeString(packageName);
                                    X2.writeString("inapp");
                                    Parcel Y2 = t7dVar2.Y(X2, 1);
                                    int readInt2 = Y2.readInt();
                                    Y2.recycle();
                                    if (readInt2 == 0) {
                                        uh0Var2.l = i3;
                                        xgd.g("BillingClient", "mHighestLevelSupportedForInApp: " + i3);
                                        i4 = readInt2;
                                    } else {
                                        i3--;
                                        i4 = readInt2;
                                    }
                                }
                            }
                            int i6 = uh0Var2.l;
                            uh0Var2.l = i6;
                            if (i6 >= 26) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            uh0Var2.w = z3;
                            if (i6 >= 24) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            uh0Var2.v = z4;
                            if (i6 >= 21) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            uh0Var2.u = z5;
                            if (i6 >= 20) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            uh0Var2.t = z6;
                            if (i6 >= 19) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            uh0Var2.s = z7;
                            if (i6 >= 17) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            uh0Var2.r = z8;
                            if (i6 >= 16) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            uh0Var2.q = z9;
                            if (i6 >= 15) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            uh0Var2.p = z10;
                            if (i6 >= 14) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            uh0Var2.o = z11;
                            if (i6 >= 9) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            uh0Var2.n = z12;
                            if (i6 < 6) {
                                z13 = false;
                            }
                            uh0Var2.m = z13;
                            if (i6 < 3) {
                                xgd.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i2 = 36;
                            }
                            uh0.p(uh0Var2, i4);
                            if (i4 != 0) {
                                fi0 fi0Var4 = qjd.a;
                                ucdVar.b(fi0Var4, i2, null, z);
                                ucdVar.c(fi0Var4);
                            } else {
                                try {
                                    Long a = ucdVar.a(z);
                                    if (z) {
                                        nhe s = fie.s();
                                        s.b();
                                        fie.r((fie) s.b, 6);
                                        vqe r = dre.r();
                                        r.c(false);
                                        r.d();
                                        if (a != null) {
                                            long longValue = a.longValue();
                                            r.b();
                                            dre.p((dre) r.b, longValue);
                                        }
                                        uh0 uh0Var3 = ucdVar.d;
                                        s.b();
                                        fie.q((fie) s.b, (dre) r.a());
                                        uh0Var3.i((fie) s.a());
                                    } else {
                                        ope p = zpe.p();
                                        mie s2 = fje.s();
                                        s2.b();
                                        fje.r((fje) s2.b, 0);
                                        p.b();
                                        zpe.n((zpe) p.b, (fje) s2.a());
                                        if (a != null) {
                                            long longValue2 = a.longValue();
                                            p.b();
                                            zpe.o((zpe) p.b, longValue2);
                                        }
                                        ucdVar.d.h.q((zpe) p.a());
                                    }
                                } catch (Throwable th2) {
                                    xgd.i("BillingClient", "Unable to log.", th2);
                                }
                                ucdVar.c(qjd.g);
                            }
                        }
                    }
                }
                return null;
            case 4:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
            case 5:
                return r06.c.a(((sxe) this.b).g);
            case 6:
                return r06.c.a(((f1f) this.b).g);
            case 7:
                return r06.c.a(((z3f) this.b).g);
            case 8:
                return r06.c.a(((hdf) this.b).a);
            default:
                return r06.c.a(((sef) this.b).g);
        }
    }
}
