package b8;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
public final class dg implements Callable {
    public final int f2552a;
    public final Object f2553b;

    public dg(Object obj, int i3) {
        this.f2552a = i3;
        this.f2553b = obj;
    }

    @Override
    public final Object call() {
        boolean z10;
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i3;
        String str;
        e5.f fVar;
        e5.f fVar2;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        switch (this.f2552a) {
            case 0:
                hg hgVar = (hg) this.f2553b;
                hgVar.getClass();
                return p6.j.f53268c.a(hgVar.f2663g);
            case 1:
                e5.s sVar = (e5.s) this.f2553b;
                e5.b bVar = sVar.d;
                synchronized (bVar.f9559a) {
                    try {
                        if (bVar.f9560b != 3) {
                            boolean z22 = true;
                            if (bVar.f9560b == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!TextUtils.isEmpty(null)) {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                com.google.android.gms.internal.play_billing.u.b(bundle, bVar.f9561c, bVar.d, bVar.A.longValue());
                            } else {
                                bundle = null;
                            }
                            synchronized (bVar.f9559a) {
                                cVar = bVar.f9565i;
                            }
                            if (cVar == null) {
                                e5.b bVar2 = sVar.d;
                                bVar2.k(0);
                                e5.f fVar3 = e5.z.h;
                                bVar2.j(107, fVar3);
                                sVar.c(fVar3);
                            } else {
                                e5.b bVar3 = sVar.d;
                                String packageName = bVar3.f9564g.getPackageName();
                                int i11 = 3;
                                int i12 = 25;
                                while (true) {
                                    if (i12 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel V0 = aVar.V0();
                                                V0.writeInt(i12);
                                                V0.writeString(packageName);
                                                V0.writeString("subs");
                                                Parcel W0 = aVar.W0(V0, 1);
                                                int readInt = W0.readInt();
                                                W0.recycle();
                                                i11 = readInt;
                                            } catch (Exception e10) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                                boolean z23 = e10 instanceof DeadObjectException;
                                                if (z23) {
                                                    i3 = 91;
                                                } else if (e10 instanceof RemoteException) {
                                                    i3 = 90;
                                                } else if (e10 instanceof SecurityException) {
                                                    i3 = 92;
                                                } else {
                                                    i3 = 42;
                                                }
                                                if (o1.g.b(i3, 42)) {
                                                    str = e5.x.a(e10);
                                                } else {
                                                    str = null;
                                                }
                                                sVar.d.k(0);
                                                if (z23) {
                                                    fVar = e5.z.h;
                                                } else {
                                                    fVar = e5.z.f9642f;
                                                }
                                                sVar.b(fVar, i3, str, z10);
                                                if (z23) {
                                                    fVar2 = e5.z.h;
                                                } else {
                                                    fVar2 = e5.z.f9642f;
                                                }
                                                sVar.c(fVar2);
                                            }
                                        } else {
                                            i11 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(i12, packageName, "subs", bundle);
                                        }
                                        if (i11 == 0) {
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                        } else {
                                            i12--;
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                }
                                if (i12 >= 3) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                bVar3.f9567k = z11;
                                if (i12 < 3) {
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i10 = 9;
                                } else {
                                    i10 = 1;
                                }
                                int i13 = i11;
                                int i14 = 25;
                                while (true) {
                                    if (i14 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel V02 = aVar2.V0();
                                            V02.writeInt(i14);
                                            V02.writeString(packageName);
                                            V02.writeString("inapp");
                                            Parcel W02 = aVar2.W0(V02, 1);
                                            i13 = W02.readInt();
                                            W02.recycle();
                                        } else {
                                            i13 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(i14, packageName, "inapp", bundle);
                                        }
                                        if (i13 == 0) {
                                            bVar3.f9568l = i14;
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
                                        } else {
                                            i14--;
                                        }
                                    }
                                }
                                int i15 = bVar3.f9568l;
                                bVar3.f9568l = i15;
                                if (i15 >= 26) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                bVar3.f9578w = z12;
                                if (i15 >= 24) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar3.v = z13;
                                if (i15 >= 21) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                bVar3.f9577u = z14;
                                if (i15 >= 20) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                bVar3.f9576t = z15;
                                if (i15 >= 19) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                bVar3.f9575s = z16;
                                if (i15 >= 17) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                bVar3.f9574r = z17;
                                if (i15 >= 16) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                bVar3.f9573q = z18;
                                if (i15 >= 15) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                bVar3.f9572p = z19;
                                if (i15 >= 14) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                bVar3.f9571o = z20;
                                if (i15 >= 9) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                bVar3.f9570n = z21;
                                if (i15 < 6) {
                                    z22 = false;
                                }
                                bVar3.f9569m = z22;
                                if (i15 < 3) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i10 = 36;
                                }
                                e5.b.p(bVar3, i13);
                                if (i13 != 0) {
                                    e5.f fVar4 = e5.z.f9638a;
                                    sVar.b(fVar4, i10, null, z10);
                                    sVar.c(fVar4);
                                } else {
                                    try {
                                        Long a10 = sVar.a(z10);
                                        if (z10) {
                                            com.google.android.gms.internal.play_billing.h3 s6 = com.google.android.gms.internal.play_billing.i3.s();
                                            s6.c();
                                            com.google.android.gms.internal.play_billing.i3.r((com.google.android.gms.internal.play_billing.i3) s6.f7524b, 6);
                                            com.google.android.gms.internal.play_billing.c4 r5 = com.google.android.gms.internal.play_billing.d4.r();
                                            r5.d(false);
                                            r5.e();
                                            if (a10 != null) {
                                                long longValue = a10.longValue();
                                                r5.c();
                                                com.google.android.gms.internal.play_billing.d4.p((com.google.android.gms.internal.play_billing.d4) r5.f7524b, longValue);
                                            }
                                            e5.b bVar4 = sVar.d;
                                            s6.c();
                                            com.google.android.gms.internal.play_billing.i3.q((com.google.android.gms.internal.play_billing.i3) s6.f7524b, (com.google.android.gms.internal.play_billing.d4) r5.a());
                                            bVar4.i((com.google.android.gms.internal.play_billing.i3) s6.a());
                                        } else {
                                            com.google.android.gms.internal.play_billing.z3 p10 = com.google.android.gms.internal.play_billing.a4.p();
                                            com.google.android.gms.internal.play_billing.j3 s10 = com.google.android.gms.internal.play_billing.k3.s();
                                            s10.c();
                                            com.google.android.gms.internal.play_billing.k3.r((com.google.android.gms.internal.play_billing.k3) s10.f7524b, 0);
                                            p10.c();
                                            com.google.android.gms.internal.play_billing.a4.n((com.google.android.gms.internal.play_billing.a4) p10.f7524b, (com.google.android.gms.internal.play_billing.k3) s10.a());
                                            if (a10 != null) {
                                                long longValue2 = a10.longValue();
                                                p10.c();
                                                com.google.android.gms.internal.play_billing.a4.o((com.google.android.gms.internal.play_billing.a4) p10.f7524b, longValue2);
                                            }
                                            sVar.d.h.K((com.google.android.gms.internal.play_billing.a4) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    sVar.c(e5.z.f9643g);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 2:
                return ((Context) this.f2553b).getSharedPreferences("google_sdk_flags", 0);
            case 3:
                v7.p pVar = (v7.p) this.f2553b;
                pVar.getClass();
                return p6.j.f53268c.a(pVar.f56470a);
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((a0.e) ((ShortcutInfoCompatSaverImpl) this.f2553b).f2311b.values()).iterator();
                while (true) {
                    a0.b bVar5 = (a0.b) it;
                    if (bVar5.hasNext()) {
                        g0.c cVar2 = ((w4.f) bVar5.next()).f57389c;
                        ?? obj = new Object();
                        obj.f11781a = cVar2.f11781a;
                        obj.f11782b = cVar2.f11782b;
                        Intent[] intentArr = cVar2.f11783c;
                        obj.f11783c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                        obj.d = cVar2.d;
                        obj.f11784e = cVar2.f11784e;
                        obj.f11785f = cVar2.f11785f;
                        obj.f11786g = cVar2.f11786g;
                        obj.h = cVar2.h;
                        obj.f11789k = cVar2.f11789k;
                        obj.f11790l = cVar2.f11790l;
                        obj.f11791m = cVar2.f11791m;
                        e0.k0[] k0VarArr = cVar2.f11787i;
                        if (k0VarArr != null) {
                            obj.f11787i = (e0.k0[]) Arrays.copyOf(k0VarArr, k0VarArr.length);
                        }
                        if (cVar2.f11788j != null) {
                            obj.f11788j = new HashSet(cVar2.f11788j);
                        }
                        PersistableBundle persistableBundle = cVar2.f11792n;
                        if (persistableBundle != null) {
                            obj.f11792n = persistableBundle;
                        }
                        if (!TextUtils.isEmpty(obj.f11784e)) {
                            Intent[] intentArr2 = obj.f11783c;
                            if (intentArr2 != null && intentArr2.length != 0) {
                                arrayList.add(obj);
                            }
                        } else {
                            throw new IllegalArgumentException("Shortcut must have a non-empty label");
                        }
                    } else {
                        return arrayList;
                    }
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            case 5:
                return BitmapFactory.decodeFile(((w4.f) this.f2553b).f57388b);
            case 6:
                x7.b9 b9Var = (x7.b9) this.f2553b;
                b9Var.getClass();
                return p6.j.f53268c.a(b9Var.f58251g);
            case 7:
                y7.ma maVar = (y7.ma) this.f2553b;
                maVar.getClass();
                return p6.j.f53268c.a(maVar.f59223g);
            case 8:
                z1.a aVar3 = (z1.a) this.f2553b;
                aVar3.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar3.a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            default:
                z7.da daVar = (z7.da) this.f2553b;
                daVar.getClass();
                return p6.j.f53268c.a(daVar.f59846g);
        }
    }
}
