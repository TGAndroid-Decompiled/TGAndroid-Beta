package a2;

import a0.e;
import a8.ua;
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
import f5.t;
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
import y7.d9;
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
        boolean z10;
        Bundle bundle;
        com.google.android.gms.internal.play_billing.c cVar;
        int i7;
        String str;
        f fVar;
        f fVar2;
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
        boolean z22;
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
                ua uaVar = (ua) this.f55b;
                uaVar.getClass();
                return j.f55924c.a(uaVar.f672g);
            case 2:
                uf ufVar = (uf) this.f55b;
                ufVar.getClass();
                return j.f55924c.a(ufVar.f5004g);
            case 3:
                t tVar = (t) this.f55b;
                f5.b bVar = tVar.f11315e;
                synchronized (bVar.f11244a) {
                    try {
                        if (bVar.f11245b != 3) {
                            boolean z23 = true;
                            if (bVar.f11245b == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!TextUtils.isEmpty(null)) {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                u.b(bundle, bVar.f11246c, bVar.d, bVar.A.longValue());
                            } else {
                                bundle = null;
                            }
                            synchronized (bVar.f11244a) {
                                cVar = bVar.f11250i;
                            }
                            if (cVar == null) {
                                f5.b bVar2 = tVar.f11315e;
                                bVar2.k(0);
                                int i11 = tVar.d;
                                f fVar3 = z.h;
                                bVar2.j(107, i11, fVar3);
                                tVar.c(fVar3);
                            } else {
                                f5.b bVar3 = tVar.f11315e;
                                String packageName = bVar3.f11249g.getPackageName();
                                int i12 = 3;
                                int i13 = 25;
                                while (true) {
                                    if (i13 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel v12 = aVar2.v1();
                                                v12.writeInt(i13);
                                                v12.writeString(packageName);
                                                v12.writeString("subs");
                                                Parcel w12 = aVar2.w1(v12, 1);
                                                int readInt = w12.readInt();
                                                w12.recycle();
                                                i12 = readInt;
                                            } catch (Exception e10) {
                                                u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                                boolean z24 = e10 instanceof DeadObjectException;
                                                if (z24) {
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
                                                tVar.f11315e.k(0);
                                                if (z24) {
                                                    fVar = z.h;
                                                } else {
                                                    fVar = z.f11325f;
                                                }
                                                tVar.b(fVar, i7, str, z10);
                                                if (z24) {
                                                    fVar2 = z.h;
                                                } else {
                                                    fVar2 = z.f11325f;
                                                }
                                                tVar.c(fVar2);
                                            }
                                        } else {
                                            i12 = ((com.google.android.gms.internal.play_billing.a) cVar).x1(i13, packageName, "subs", bundle);
                                        }
                                        if (i12 == 0) {
                                            u.g("BillingClient", "highestLevelSupportedForSubs: " + i13);
                                        } else {
                                            i13--;
                                        }
                                    } else {
                                        i13 = 0;
                                    }
                                }
                                if (i13 >= 3) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                bVar3.f11252k = z11;
                                if (i13 < 3) {
                                    u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i10 = 9;
                                } else {
                                    i10 = 1;
                                }
                                int i14 = i12;
                                int i15 = 25;
                                while (true) {
                                    if (i15 >= 3) {
                                        if (bundle == null) {
                                            com.google.android.gms.internal.play_billing.a aVar3 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel v13 = aVar3.v1();
                                            v13.writeInt(i15);
                                            v13.writeString(packageName);
                                            v13.writeString("inapp");
                                            Parcel w13 = aVar3.w1(v13, 1);
                                            i14 = w13.readInt();
                                            w13.recycle();
                                        } else {
                                            i14 = ((com.google.android.gms.internal.play_billing.a) cVar).x1(i15, packageName, "inapp", bundle);
                                        }
                                        if (i14 == 0) {
                                            bVar3.f11253l = i15;
                                            u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i15);
                                        } else {
                                            i15--;
                                        }
                                    }
                                }
                                int i16 = bVar3.f11253l;
                                bVar3.f11253l = i16;
                                if (i16 >= 26) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                bVar3.f11263w = z12;
                                if (i16 >= 24) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar3.v = z13;
                                if (i16 >= 21) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                bVar3.f11262u = z14;
                                if (i16 >= 20) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                bVar3.f11261t = z15;
                                if (i16 >= 19) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                bVar3.f11260s = z16;
                                if (i16 >= 17) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                bVar3.f11259r = z17;
                                if (i16 >= 16) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                bVar3.f11258q = z18;
                                if (i16 >= 15) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                bVar3.f11257p = z19;
                                if (i16 >= 14) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                bVar3.f11256o = z20;
                                if (i16 >= 9) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                bVar3.f11255n = z21;
                                if (i16 >= 6) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                bVar3.f11254m = z22;
                                if (i16 < 3) {
                                    u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i10 = 36;
                                }
                                f5.b.p(bVar3, i14);
                                if (i14 != 0) {
                                    f fVar4 = z.f11321a;
                                    tVar.b(fVar4, i10, null, z10);
                                    tVar.c(fVar4);
                                } else {
                                    try {
                                        Long a10 = tVar.a(z10);
                                        if (z10) {
                                            h3 s5 = i3.s();
                                            s5.c();
                                            i3.r((i3) s5.f7134b, 6);
                                            c4 r10 = d4.r();
                                            int i17 = tVar.d;
                                            if (i17 <= 0) {
                                                z23 = false;
                                            }
                                            r10.d(z23);
                                            r10.e(i17);
                                            if (a10 != null) {
                                                long longValue = a10.longValue();
                                                r10.c();
                                                d4.p((d4) r10.f7134b, longValue);
                                            }
                                            f5.b bVar4 = tVar.f11315e;
                                            s5.c();
                                            i3.q((i3) s5.f7134b, (d4) r10.a());
                                            bVar4.i((i3) s5.a());
                                        } else {
                                            z3 p10 = a4.p();
                                            j3 s9 = k3.s();
                                            s9.c();
                                            k3.r((k3) s9.f7134b, 0);
                                            p10.c();
                                            a4.n((a4) p10.f7134b, (k3) s9.a());
                                            if (a10 != null) {
                                                long longValue2 = a10.longValue();
                                                p10.c();
                                                a4.o((a4) p10.f7134b, longValue2);
                                            }
                                            tVar.f11315e.h.b0((a4) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    tVar.c(z.f11326g);
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
                return j.f55924c.a(pVar.f59631a);
            case 6:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((e) ((ShortcutInfoCompatSaverImpl) this.f55b).f2798b.values()).iterator();
                while (true) {
                    a0.b bVar5 = (a0.b) it;
                    if (bVar5.hasNext()) {
                        g0.c cVar2 = ((x4.f) bVar5.next()).f60404c;
                        ?? obj = new Object();
                        obj.f13056a = cVar2.f13056a;
                        obj.f13057b = cVar2.f13057b;
                        Intent[] intentArr = cVar2.f13058c;
                        obj.f13058c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                        obj.d = cVar2.d;
                        obj.f13059e = cVar2.f13059e;
                        obj.f13060f = cVar2.f13060f;
                        obj.f13061g = cVar2.f13061g;
                        obj.h = cVar2.h;
                        obj.f13064k = cVar2.f13064k;
                        obj.f13065l = cVar2.f13065l;
                        obj.f13066m = cVar2.f13066m;
                        j0[] j0VarArr = cVar2.f13062i;
                        if (j0VarArr != null) {
                            obj.f13062i = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
                        }
                        if (cVar2.f13063j != null) {
                            obj.f13063j = new HashSet(cVar2.f13063j);
                        }
                        PersistableBundle persistableBundle = cVar2.f13067n;
                        if (persistableBundle != null) {
                            obj.f13067n = persistableBundle;
                        }
                        if (!TextUtils.isEmpty(obj.f13059e)) {
                            Intent[] intentArr2 = obj.f13058c;
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
                return BitmapFactory.decodeFile(((x4.f) this.f55b).f60403b);
            case 8:
                d9 d9Var = (d9) this.f55b;
                d9Var.getClass();
                return j.f55924c.a(d9Var.f60808g);
            default:
                ma maVar = (ma) this.f55b;
                maVar.getClass();
                return j.f55924c.a(maVar.f61681g);
        }
    }
}
