package e7;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.internal.play_billing.z3;
import e0.p0;
import g7.b9;
import h7.ka;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import k7.wf;
import n2.a0;
import n2.y;

public final class p implements Callable {

    public final int f5336a;

    public final Object f5337b;

    public p(Object obj, int i10) {
        this.f5336a = i10;
        this.f5337b = obj;
    }

    @Override
    public final Object call() {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Long lA;
        y3 y3VarP;
        b4 b4VarR;
        switch (this.f5336a) {
            case 0:
                r rVar = (r) this.f5337b;
                rVar.getClass();
                return y5.i.f49650c.a(rVar.f5341a);
            case 1:
                ((com.google.firebase.messaging.v) this.f5337b).run();
                return null;
            case 2:
                b9 b9Var = (b9) this.f5337b;
                b9Var.getClass();
                return y5.i.f49650c.a(b9Var.f6425g);
            case 3:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((a0.e) ((ShortcutInfoCompatSaverImpl) this.f5337b).f1872b.values()).iterator();
                while (true) {
                    a0.b bVar = (a0.b) it;
                    if (!bVar.hasNext()) {
                        return arrayList;
                    }
                    g0.c cVar2 = ((h2.f) bVar.next()).f7761c;
                    g0.c cVar3 = new g0.c();
                    cVar3.f6331a = cVar2.f6331a;
                    cVar3.f6332b = cVar2.f6332b;
                    Intent[] intentArr = cVar2.f6333c;
                    cVar3.f6333c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                    cVar3.d = cVar2.d;
                    cVar3.f6334e = cVar2.f6334e;
                    cVar3.f6335f = cVar2.f6335f;
                    cVar3.f6336g = cVar2.f6336g;
                    cVar3.h = cVar2.h;
                    cVar3.f6339k = cVar2.f6339k;
                    cVar3.f6340l = cVar2.f6340l;
                    cVar3.f6341m = cVar2.f6341m;
                    p0[] p0VarArr = cVar2.f6337i;
                    if (p0VarArr != null) {
                        cVar3.f6337i = (p0[]) Arrays.copyOf(p0VarArr, p0VarArr.length);
                    }
                    if (cVar2.f6338j != null) {
                        cVar3.f6338j = new HashSet(cVar2.f6338j);
                    }
                    PersistableBundle persistableBundle = cVar2.f6342n;
                    if (persistableBundle != null) {
                        cVar3.f6342n = persistableBundle;
                    }
                    if (TextUtils.isEmpty(cVar3.f6334e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr2 = cVar3.f6333c;
                    if (intentArr2 == null || intentArr2.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    arrayList.add(cVar3);
                }
                break;
            case 4:
                return BitmapFactory.decodeFile(((h2.f) this.f5337b).f7760b);
            case 5:
                ka kaVar = (ka) this.f5337b;
                kaVar.getClass();
                return y5.i.f49650c.a(kaVar.f8454g);
            case 6:
                i7.ka kaVar2 = (i7.ka) this.f5337b;
                kaVar2.getClass();
                return y5.i.f49650c.a(kaVar2.f10713g);
            case 7:
                wf wfVar = (wf) this.f5337b;
                wfVar.getClass();
                return y5.i.f49650c.a(wfVar.f15025g);
            case 8:
                n2.s sVar = (n2.s) this.f5337b;
                n2.b bVar2 = sVar.d;
                synchronized (bVar2.f18106a) {
                    try {
                        if (bVar2.f18107b != 3) {
                            boolean z20 = true;
                            boolean z21 = bVar2.f18107b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                com.google.android.gms.internal.play_billing.u.b(bundle, bVar2.f18108c, bVar2.d, bVar2.A.longValue());
                            }
                            synchronized (bVar2.f18106a) {
                                cVar = bVar2.f18112i;
                                break;
                            }
                            if (cVar == null) {
                                n2.b bVar3 = sVar.d;
                                bVar3.k(0);
                                n2.g gVar = a0.h;
                                bVar3.j(107, gVar);
                                sVar.c(gVar);
                            } else {
                                n2.b bVar4 = sVar.d;
                                String packageName = bVar4.f18111g.getPackageName();
                                int i13 = 25;
                                int iU0 = 3;
                                while (true) {
                                    if (i13 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel parcelS0 = aVar.S0();
                                                parcelS0.writeInt(i13);
                                                parcelS0.writeString(packageName);
                                                parcelS0.writeString("subs");
                                                Parcel parcelT0 = aVar.T0(parcelS0, 1);
                                                int i14 = parcelT0.readInt();
                                                parcelT0.recycle();
                                                iU0 = i14;
                                            } catch (Exception e9) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e9);
                                                boolean z22 = e9 instanceof DeadObjectException;
                                                if (z22) {
                                                    i10 = 91;
                                                } else if (e9 instanceof RemoteException) {
                                                    i10 = 90;
                                                } else {
                                                    i10 = e9 instanceof SecurityException ? 92 : 42;
                                                }
                                                String strA = m1.j.a(i10, 42) ? y.a(e9) : null;
                                                sVar.d.k(0);
                                                sVar.b(z22 ? a0.h : a0.f18096f, i10, strA, z21);
                                                sVar.c(z22 ? a0.h : a0.f18096f);
                                            }
                                        } else {
                                            iU0 = ((com.google.android.gms.internal.play_billing.a) cVar).U0(i13, packageName, "subs", bundle);
                                        }
                                        if (iU0 == 0) {
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "highestLevelSupportedForSubs: " + i13);
                                        } else {
                                            i13--;
                                        }
                                    } else {
                                        i13 = 0;
                                    }
                                }
                                bVar4.f18114k = i13 >= 3;
                                if (i13 < 3) {
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i11 = 9;
                                } else {
                                    i11 = 1;
                                }
                                int iU1 = iU0;
                                for (int i15 = 25; i15 >= 3; i15--) {
                                    if (bundle == null) {
                                        com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                        Parcel parcelS1 = aVar2.S0();
                                        parcelS1.writeInt(i15);
                                        parcelS1.writeString(packageName);
                                        parcelS1.writeString("inapp");
                                        Parcel parcelT1 = aVar2.T0(parcelS1, 1);
                                        iU1 = parcelT1.readInt();
                                        parcelT1.recycle();
                                    } else {
                                        iU1 = ((com.google.android.gms.internal.play_billing.a) cVar).U0(i15, packageName, "inapp", bundle);
                                    }
                                    if (iU1 == 0) {
                                        bVar4.f18115l = i15;
                                        com.google.android.gms.internal.play_billing.u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i15);
                                        i12 = bVar4.f18115l;
                                        bVar4.f18115l = i12;
                                        if (i12 >= 26) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        bVar4.f18125w = z10;
                                        if (i12 >= 24) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        bVar4.v = z11;
                                        if (i12 >= 21) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        bVar4.f18124u = z12;
                                        if (i12 >= 20) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        bVar4.f18123t = z13;
                                        if (i12 >= 19) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        bVar4.f18122s = z14;
                                        if (i12 >= 17) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        bVar4.f18121r = z15;
                                        if (i12 >= 16) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        bVar4.f18120q = z16;
                                        if (i12 >= 15) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        bVar4.f18119p = z17;
                                        if (i12 >= 14) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        bVar4.f18118o = z18;
                                        if (i12 >= 9) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        bVar4.f18117n = z19;
                                        if (i12 >= 6) {
                                            z20 = false;
                                        }
                                        bVar4.f18116m = z20;
                                        if (i12 < 3) {
                                            com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                            i11 = 36;
                                        }
                                        n2.b.p(bVar4, iU1);
                                        if (iU1 != 0) {
                                            n2.g gVar2 = a0.f18092a;
                                            sVar.b(gVar2, i11, null, z21);
                                            sVar.c(gVar2);
                                        } else {
                                            try {
                                                lA = sVar.a(z21);
                                                if (z21) {
                                                    g3 g3VarS = h3.s();
                                                    g3VarS.c();
                                                    h3.r((h3) g3VarS.f4129b, 6);
                                                    b4VarR = c4.r();
                                                    b4VarR.d(false);
                                                    b4VarR.e();
                                                    if (lA != null) {
                                                        long jLongValue = lA.longValue();
                                                        b4VarR.c();
                                                        c4.p((c4) b4VarR.f4129b, jLongValue);
                                                    }
                                                    n2.b bVar5 = sVar.d;
                                                    g3VarS.c();
                                                    h3.q((h3) g3VarS.f4129b, (c4) b4VarR.a());
                                                    bVar5.i((h3) g3VarS.a());
                                                } else {
                                                    y3VarP = z3.p();
                                                    i3 i3VarS = j3.s();
                                                    i3VarS.c();
                                                    j3.r((j3) i3VarS.f4129b, 0);
                                                    y3VarP.c();
                                                    z3.n((z3) y3VarP.f4129b, (j3) i3VarS.a());
                                                    if (lA != null) {
                                                        long jLongValue2 = lA.longValue();
                                                        y3VarP.c();
                                                        z3.o((z3) y3VarP.f4129b, jLongValue2);
                                                    }
                                                    sVar.d.h.B((z3) y3VarP.a());
                                                }
                                            } catch (Throwable th) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th);
                                            }
                                            sVar.c(a0.f18097g);
                                        }
                                    }
                                }
                                i12 = bVar4.f18115l;
                                bVar4.f18115l = i12;
                                if (i12 >= 26) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                bVar4.f18125w = z10;
                                if (i12 >= 24) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                bVar4.v = z11;
                                if (i12 >= 21) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                bVar4.f18124u = z12;
                                if (i12 >= 20) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar4.f18123t = z13;
                                if (i12 >= 19) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                bVar4.f18122s = z14;
                                if (i12 >= 17) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                bVar4.f18121r = z15;
                                if (i12 >= 16) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                bVar4.f18120q = z16;
                                if (i12 >= 15) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                bVar4.f18119p = z17;
                                if (i12 >= 14) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                bVar4.f18118o = z18;
                                if (i12 >= 9) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                bVar4.f18117n = z19;
                                if (i12 >= 6) {
                                    z20 = false;
                                }
                                bVar4.f18116m = z20;
                                if (i12 < 3) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i11 = 36;
                                }
                                n2.b.p(bVar4, iU1);
                                if (iU1 != 0) {
                                    n2.g gVar3 = a0.f18092a;
                                    sVar.b(gVar3, i11, null, z21);
                                    sVar.c(gVar3);
                                } else {
                                    lA = sVar.a(z21);
                                    if (z21) {
                                        g3 g3VarS2 = h3.s();
                                        g3VarS2.c();
                                        h3.r((h3) g3VarS2.f4129b, 6);
                                        b4VarR = c4.r();
                                        b4VarR.d(false);
                                        b4VarR.e();
                                        if (lA != null) {
                                            long jLongValue3 = lA.longValue();
                                            b4VarR.c();
                                            c4.p((c4) b4VarR.f4129b, jLongValue3);
                                        }
                                        n2.b bVar6 = sVar.d;
                                        g3VarS2.c();
                                        h3.q((h3) g3VarS2.f4129b, (c4) b4VarR.a());
                                        bVar6.i((h3) g3VarS2.a());
                                    } else {
                                        y3VarP = z3.p();
                                        i3 i3VarS2 = j3.s();
                                        i3VarS2.c();
                                        j3.r((j3) i3VarS2.f4129b, 0);
                                        y3VarP.c();
                                        z3.n((z3) y3VarP.f4129b, (j3) i3VarS2.a());
                                        if (lA != null) {
                                            long jLongValue4 = lA.longValue();
                                            y3VarP.c();
                                            z3.o((z3) y3VarP.f4129b, jLongValue4);
                                        }
                                        sVar.d.h.B((z3) y3VarP.a());
                                    }
                                    sVar.c(a0.f18097g);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            case 9:
                return ((Context) this.f5337b).getSharedPreferences("google_sdk_flags", 0);
            default:
                x1.a aVar3 = (x1.a) this.f5337b;
                aVar3.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar3.a();
                    Binder.flushPendingCommands();
                    aVar3.b(null);
                    return null;
                } catch (Throwable th3) {
                    try {
                        aVar3.f49327c.set(true);
                        throw th3;
                    } catch (Throwable th4) {
                        aVar3.b(null);
                        throw th4;
                    }
                }
        }
    }
}
