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
import f5.a0;
import f5.f;
import f5.t;
import f5.y;
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
                return j.f55340c.a(uaVar.f673g);
            case 2:
                uf ufVar = (uf) this.f55b;
                ufVar.getClass();
                return j.f55340c.a(ufVar.f4724g);
            case 3:
                t tVar = (t) this.f55b;
                f5.b bVar = tVar.d;
                synchronized (bVar.f10941a) {
                    try {
                        if (bVar.f10942b != 3) {
                            boolean z22 = true;
                            if (bVar.f10942b == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!TextUtils.isEmpty(null)) {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                u.b(bundle, bVar.f10943c, bVar.d, bVar.A.longValue());
                            } else {
                                bundle = null;
                            }
                            synchronized (bVar.f10941a) {
                                cVar = bVar.f10947i;
                            }
                            if (cVar == null) {
                                f5.b bVar2 = tVar.d;
                                bVar2.k(0);
                                f fVar3 = a0.h;
                                bVar2.j(107, fVar3);
                                tVar.c(fVar3);
                            } else {
                                f5.b bVar3 = tVar.d;
                                String packageName = bVar3.f10946g.getPackageName();
                                int i11 = 3;
                                int i12 = 25;
                                while (true) {
                                    if (i12 >= 3) {
                                        if (bundle == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar2 = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel v12 = aVar2.v1();
                                                v12.writeInt(i12);
                                                v12.writeString(packageName);
                                                v12.writeString("subs");
                                                Parcel w12 = aVar2.w1(v12, 1);
                                                int readInt = w12.readInt();
                                                w12.recycle();
                                                i11 = readInt;
                                            } catch (Exception e10) {
                                                u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                                boolean z23 = e10 instanceof DeadObjectException;
                                                if (z23) {
                                                    i7 = 91;
                                                } else if (e10 instanceof RemoteException) {
                                                    i7 = 90;
                                                } else if (e10 instanceof SecurityException) {
                                                    i7 = 92;
                                                } else {
                                                    i7 = 42;
                                                }
                                                if (g.b(i7, 42)) {
                                                    str = y.a(e10);
                                                } else {
                                                    str = null;
                                                }
                                                tVar.d.k(0);
                                                if (z23) {
                                                    fVar = a0.h;
                                                } else {
                                                    fVar = a0.f10931f;
                                                }
                                                tVar.b(fVar, i7, str, z10);
                                                if (z23) {
                                                    fVar2 = a0.h;
                                                } else {
                                                    fVar2 = a0.f10931f;
                                                }
                                                tVar.c(fVar2);
                                            }
                                        } else {
                                            i11 = ((com.google.android.gms.internal.play_billing.a) cVar).x1(i12, packageName, "subs", bundle);
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
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                bVar3.f10949k = z11;
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
                                            Parcel v13 = aVar3.v1();
                                            v13.writeInt(i14);
                                            v13.writeString(packageName);
                                            v13.writeString("inapp");
                                            Parcel w13 = aVar3.w1(v13, 1);
                                            i13 = w13.readInt();
                                            w13.recycle();
                                        } else {
                                            i13 = ((com.google.android.gms.internal.play_billing.a) cVar).x1(i14, packageName, "inapp", bundle);
                                        }
                                        if (i13 == 0) {
                                            bVar3.f10950l = i14;
                                            u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i14);
                                        } else {
                                            i14--;
                                        }
                                    }
                                }
                                int i15 = bVar3.f10950l;
                                bVar3.f10950l = i15;
                                if (i15 >= 26) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                bVar3.f10960w = z12;
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
                                bVar3.f10959u = z14;
                                if (i15 >= 20) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                bVar3.f10958t = z15;
                                if (i15 >= 19) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                bVar3.f10957s = z16;
                                if (i15 >= 17) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                bVar3.f10956r = z17;
                                if (i15 >= 16) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                bVar3.f10955q = z18;
                                if (i15 >= 15) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                bVar3.f10954p = z19;
                                if (i15 >= 14) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                bVar3.f10953o = z20;
                                if (i15 >= 9) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                bVar3.f10952n = z21;
                                if (i15 < 6) {
                                    z22 = false;
                                }
                                bVar3.f10951m = z22;
                                if (i15 < 3) {
                                    u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i10 = 36;
                                }
                                f5.b.p(bVar3, i13);
                                if (i13 != 0) {
                                    f fVar4 = a0.f10927a;
                                    tVar.b(fVar4, i10, null, z10);
                                    tVar.c(fVar4);
                                } else {
                                    try {
                                        Long a10 = tVar.a(z10);
                                        if (z10) {
                                            h3 s5 = i3.s();
                                            s5.c();
                                            i3.r((i3) s5.f6859b, 6);
                                            c4 r10 = d4.r();
                                            r10.d(false);
                                            r10.e();
                                            if (a10 != null) {
                                                long longValue = a10.longValue();
                                                r10.c();
                                                d4.p((d4) r10.f6859b, longValue);
                                            }
                                            f5.b bVar4 = tVar.d;
                                            s5.c();
                                            i3.q((i3) s5.f6859b, (d4) r10.a());
                                            bVar4.i((i3) s5.a());
                                        } else {
                                            z3 p10 = a4.p();
                                            j3 s9 = k3.s();
                                            s9.c();
                                            k3.r((k3) s9.f6859b, 0);
                                            p10.c();
                                            a4.n((a4) p10.f6859b, (k3) s9.a());
                                            if (a10 != null) {
                                                long longValue2 = a10.longValue();
                                                p10.c();
                                                a4.o((a4) p10.f6859b, longValue2);
                                            }
                                            tVar.d.h.b0((a4) p10.a());
                                        }
                                    } catch (Throwable th2) {
                                        u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    tVar.c(a0.f10932g);
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
                return j.f55340c.a(pVar.f59058a);
            case 6:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((e) ((ShortcutInfoCompatSaverImpl) this.f55b).f2836b.values()).iterator();
                while (true) {
                    a0.b bVar5 = (a0.b) it;
                    if (bVar5.hasNext()) {
                        g0.b bVar6 = ((x4.f) bVar5.next()).f59823c;
                        ?? obj = new Object();
                        obj.f12747a = bVar6.f12747a;
                        obj.f12748b = bVar6.f12748b;
                        Intent[] intentArr = bVar6.f12749c;
                        obj.f12749c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                        obj.d = bVar6.d;
                        obj.f12750e = bVar6.f12750e;
                        obj.f12751f = bVar6.f12751f;
                        obj.f12752g = bVar6.f12752g;
                        obj.h = bVar6.h;
                        obj.f12755k = bVar6.f12755k;
                        obj.f12756l = bVar6.f12756l;
                        obj.f12757m = bVar6.f12757m;
                        j0[] j0VarArr = bVar6.f12753i;
                        if (j0VarArr != null) {
                            obj.f12753i = (j0[]) Arrays.copyOf(j0VarArr, j0VarArr.length);
                        }
                        if (bVar6.f12754j != null) {
                            obj.f12754j = new HashSet(bVar6.f12754j);
                        }
                        PersistableBundle persistableBundle = bVar6.f12758n;
                        if (persistableBundle != null) {
                            obj.f12758n = persistableBundle;
                        }
                        if (!TextUtils.isEmpty(obj.f12750e)) {
                            Intent[] intentArr2 = obj.f12749c;
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
                return BitmapFactory.decodeFile(((x4.f) this.f55b).f59822b);
            case 8:
                d9 d9Var = (d9) this.f55b;
                d9Var.getClass();
                return j.f55340c.a(d9Var.f60232g);
            default:
                ma maVar = (ma) this.f55b;
                maVar.getClass();
                return j.f55340c.a(maVar.f61106g);
        }
    }
}
