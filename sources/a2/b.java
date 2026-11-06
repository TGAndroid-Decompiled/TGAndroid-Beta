package a2;

import a0.e;
import a8.ta;
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
import c8.uf;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.j3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.z3;
import e0.j0;
import f5.f;
import f5.s;
import f5.x;
import f5.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import p1.g;
import q6.j;
import w7.p;
import y7.e9;
import z7.ma;
public final class b implements Callable {
    public final int f54a;
    public final Object f55b;

    public b(Object obj, int i7) {
        this.f54a = i7;
        this.f55b = obj;
    }

    @Override
    public final Object call() {
        boolean z9;
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i7;
        String str;
        f fVar;
        f fVar2;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        switch (this.f54a) {
            case 0:
                a aVar = (a) this.f55b;
                aVar.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 1:
                ta taVar = (ta) this.f55b;
                taVar.getClass();
                return j.f53799c.a(taVar.f669g);
            case 2:
                uf ufVar = (uf) this.f55b;
                ufVar.getClass();
                return j.f53799c.a(ufVar.f5899g);
            case 3:
                s sVar = (s) this.f55b;
                f5.b bVar = sVar.d;
                synchronized (bVar.f11117a) {
                    try {
                        if (bVar.f11118b != 3) {
                            boolean z21 = true;
                            if (bVar.f11118b == 1) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (!TextUtils.isEmpty(null)) {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                u.b(bundle, bVar.f11119c, bVar.d, bVar.A.longValue());
                            } else {
                                bundle = null;
                            }
                            synchronized (bVar.f11117a) {
                                cVar = bVar.f11123i;
                            }
                            if (cVar == null) {
                                f5.b bVar2 = sVar.d;
                                bVar2.k(0);
                                f fVar3 = z.h;
                                bVar2.j(107, fVar3);
                                sVar.c(fVar3);
                            } else {
                                f5.b bVar3 = sVar.d;
                                String packageName = bVar3.f11122g.getPackageName();
                                int i11 = 3;
                                int i12 = 25;
                                while (true) {
                                    if (i12 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel V0 = aVar2.V0();
                                                V0.writeInt(i12);
                                                V0.writeString(packageName);
                                                V0.writeString("subs");
                                                Parcel W0 = aVar2.W0(V0, 1);
                                                int readInt = W0.readInt();
                                                W0.recycle();
                                                i11 = readInt;
                                            } catch (Exception e10) {
                                                u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                                boolean z22 = e10 instanceof DeadObjectException;
                                                if (z22) {
                                                    i7 = 91;
                                                } else if (e10 instanceof RemoteException) {
                                                    i7 = 90;
                                                } else if (e10 instanceof SecurityException) {
                                                    i7 = 92;
                                                } else {
                                                    i7 = 42;
                                                }
                                                if (g.b(i7, 42)) {
                                                    str = x.a(e10);
                                                } else {
                                                    str = null;
                                                }
                                                sVar.d.k(0);
                                                if (z22) {
                                                    fVar = z.h;
                                                } else {
                                                    fVar = z.f11199f;
                                                }
                                                sVar.b(fVar, i7, str, z9);
                                                if (z22) {
                                                    fVar2 = z.h;
                                                } else {
                                                    fVar2 = z.f11199f;
                                                }
                                                sVar.c(fVar2);
                                            }
                                        } else {
                                            i11 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(i12, packageName, "subs", bundle);
                                        }
                                        if (i11 == 0) {
                                            u.g("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                        } else {
                                            i12--;
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                }
                                if (i12 >= 3) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                bVar3.f11125k = z10;
                                if (i12 < 3) {
                                    u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i10 = 9;
                                } else {
                                    i10 = 1;
                                }
                                int i13 = i11;
                                int i14 = 25;
                                while (true) {
                                    if (i14 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar3 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel V02 = aVar3.V0();
                                            V02.writeInt(i14);
                                            V02.writeString(packageName);
                                            V02.writeString("inapp");
                                            Parcel W02 = aVar3.W0(V02, 1);
                                            i13 = W02.readInt();
                                            W02.recycle();
                                        } else {
                                            i13 = ((com.google.android.gms.internal.play_billing.a) cVar).X0(i14, packageName, "inapp", bundle);
                                        }
                                        if (i13 == 0) {
                                            bVar3.f11126l = i14;
                                            u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
                                        } else {
                                            i14--;
                                        }
                                    }
                                }
                                int i15 = bVar3.f11126l;
                                bVar3.f11126l = i15;
                                if (i15 >= 26) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                bVar3.f11136w = z11;
                                if (i15 >= 24) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                bVar3.v = z12;
                                if (i15 >= 21) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar3.f11135u = z13;
                                if (i15 >= 20) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                bVar3.f11134t = z14;
                                if (i15 >= 19) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                bVar3.f11133s = z15;
                                if (i15 >= 17) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                bVar3.f11132r = z16;
                                if (i15 >= 16) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                bVar3.f11131q = z17;
                                if (i15 >= 15) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                bVar3.f11130p = z18;
                                if (i15 >= 14) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                bVar3.f11129o = z19;
                                if (i15 >= 9) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                bVar3.f11128n = z20;
                                if (i15 < 6) {
                                    z21 = false;
                                }
                                bVar3.f11127m = z21;
                                if (i15 < 3) {
                                    u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i10 = 36;
                                }
                                f5.b.p(bVar3, i13);
                                if (i13 != 0) {
                                    f fVar4 = z.f11195a;
                                    sVar.b(fVar4, i10, null, z9);
                                    sVar.c(fVar4);
                                } else {
                                    try {
                                        Long a10 = sVar.a(z9);
                                        if (z9) {
                                            h3 s5 = i3.s();
                                            s5.c();
                                            i3.r((i3) s5.f7469b, 6);
                                            c4 r10 = d4.r();
                                            r10.d(false);
                                            r10.e();
                                            if (a10 != null) {
                                                long longValue = a10.longValue();
                                                r10.c();
                                                d4.p((d4) r10.f7469b, longValue);
                                            }
                                            f5.b bVar4 = sVar.d;
                                            s5.c();
                                            i3.q((i3) s5.f7469b, (d4) r10.a());
                                            bVar4.i((i3) s5.a());
                                        } else {
                                            z3 p10 = a4.p();
                                            j3 s9 = k3.s();
                                            s9.c();
                                            k3.r((k3) s9.f7469b, 0);
                                            p10.c();
                                            a4.n((a4) p10.f7469b, (k3) s9.a());
                                            if (a10 != null) {
                                                long longValue2 = a10.longValue();
                                                p10.c();
                                                a4.o((a4) p10.f7469b, longValue2);
                                            }
                                            sVar.d.h.m((a4) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    sVar.c(z.f11200g);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 4:
                return ((Context) this.f55b).getSharedPreferences("google_sdk_flags", 0);
            case 5:
                p pVar = (p) this.f55b;
                pVar.getClass();
                return j.f53799c.a(pVar.f57515a);
            case 6:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((e) ((ShortcutInfoCompatSaverImpl) this.f55b).f2879b.values()).iterator();
                while (true) {
                    a0.b bVar5 = (a0.b) it;
                    if (bVar5.hasNext()) {
                        g0.c cVar2 = ((x4.f) bVar5.next()).f58538c;
                        ?? obj = new Object();
                        obj.f13396a = cVar2.f13396a;
                        obj.f13397b = cVar2.f13397b;
                        Intent[] intentArr = cVar2.f13398c;
                        obj.f13398c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                        obj.d = cVar2.d;
                        obj.f13399e = cVar2.f13399e;
                        obj.f13400f = cVar2.f13400f;
                        obj.f13401g = cVar2.f13401g;
                        obj.h = cVar2.h;
                        obj.f13404k = cVar2.f13404k;
                        obj.f13405l = cVar2.f13405l;
                        obj.f13406m = cVar2.f13406m;
                        j0[] j0VarArr = cVar2.f13402i;
                        if (j0VarArr != null) {
                            obj.f13402i = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
                        }
                        if (cVar2.f13403j != null) {
                            obj.f13403j = new HashSet(cVar2.f13403j);
                        }
                        PersistableBundle persistableBundle = cVar2.f13407n;
                        if (persistableBundle != null) {
                            obj.f13407n = persistableBundle;
                        }
                        if (!TextUtils.isEmpty(obj.f13399e)) {
                            Intent[] intentArr2 = obj.f13398c;
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
            case 7:
                return BitmapFactory.decodeFile(((x4.f) this.f55b).f58537b);
            case 8:
                e9 e9Var = (e9) this.f55b;
                e9Var.getClass();
                return j.f53799c.a(e9Var.f58925g);
            default:
                ma maVar = (ma) this.f55b;
                maVar.getClass();
                return j.f53799c.a(maVar.f59800g);
        }
    }
}
