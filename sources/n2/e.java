package n2;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.m0;
import e9.o1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m.y0;
import m4.r0;
import n4.y;
public final class e implements m {
    public int E;
    public q F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public j2.k L;
    public volatile androidx.mediarouter.app.c M;
    public final UUID f16250a;
    public final r0 f16251b;
    public final com.google.firebase.messaging.m f16252c;
    public final HashMap d;
    public final boolean f16253e;
    public final int[] f16254f;
    public final boolean h;
    public final y f16255n;
    public final t7.t f16256r;
    public final l2.g f16257s;
    public final long v;
    public final ArrayList f16258w;
    public final Set f16259x;
    public final Set f16260y;

    public e(UUID uuid, com.google.firebase.messaging.m mVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, t7.t tVar) {
        uuid.getClass();
        e2.d.a("Use C.CLEARKEY_UUID instead", !b2.i.f3332b.equals(uuid));
        this.f16250a = uuid;
        this.f16251b = t.d;
        this.f16252c = mVar;
        this.d = hashMap;
        this.f16253e = z10;
        this.f16254f = iArr;
        this.h = z11;
        this.f16256r = tVar;
        this.f16255n = new y(28);
        this.f16257s = new l2.g(this, 4);
        this.f16258w = new ArrayList();
        this.f16259x = Collections.newSetFromMap(new IdentityHashMap());
        this.f16260y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.f16238o == 1) {
            f g10 = bVar.g();
            g10.getClass();
            Throwable cause = g10.getCause();
            if ((cause instanceof ResourceBusyException) || w7.y.c(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList f(b2.o oVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(oVar.d);
        for (int i10 = 0; i10 < oVar.d; i10++) {
            b2.n nVar = oVar.f3493a[i10];
            if ((nVar.a(uuid) || (b2.i.f3333c.equals(uuid) && nVar.a(b2.i.f3332b))) && (nVar.f3447e != null || z10)) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    @Override
    public final void D(Looper looper, j2.k kVar) {
        boolean z10;
        synchronized (this) {
            try {
                Looper looper2 = this.I;
                if (looper2 == null) {
                    this.I = looper;
                    this.J = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    this.J.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = kVar;
    }

    @Override
    public final int Q0(b2.s sVar) {
        h(false);
        q qVar = this.F;
        qVar.getClass();
        int Z = qVar.Z();
        b2.o oVar = sVar.v;
        if (oVar == null) {
            int h = b2.r0.h(sVar.f3641r);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f16254f;
                if (i10 < iArr.length) {
                    if (iArr[i10] == h) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                return 0;
            }
        } else if (this.K == null) {
            UUID uuid = this.f16250a;
            if (f(oVar, uuid, true).isEmpty()) {
                if (oVar.d == 1 && oVar.f3493a[0].a(b2.i.f3332b)) {
                    e2.a.n("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = oVar.f3495c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return Z;
    }

    public final g a(Looper looper, j jVar, b2.s sVar, boolean z10) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new androidx.mediarouter.app.c(this, looper, 5);
        }
        b2.o oVar = sVar.v;
        int i10 = 0;
        b bVar = null;
        if (oVar == null) {
            int h = b2.r0.h(sVar.f3641r);
            q qVar = this.F;
            qVar.getClass();
            if (qVar.Z() != 2 || !r.f16277c) {
                int[] iArr = this.f16254f;
                while (true) {
                    if (i10 < iArr.length) {
                        if (iArr[i10] == h) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 != -1 && qVar.Z() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        g0 g0Var = i0.f8749b;
                        b e7 = e(a1.f8712e, true, null, z10);
                        this.f16258w.add(e7);
                        this.G = e7;
                    } else {
                        bVar2.b(null);
                    }
                    return this.G;
                }
            }
            return null;
        }
        if (this.K == null) {
            arrayList = f(oVar, this.f16250a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f16250a);
                e2.a.f("DefaultDrmSessionMgr", "DRM error", exc);
                if (jVar != null) {
                    jVar.d(exc);
                }
                return new n(new f(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (!this.f16253e) {
            bVar = this.H;
        } else {
            ArrayList arrayList2 = this.f16258w;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i11);
                i11++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.f16226a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        }
        if (bVar == null) {
            b e10 = e(arrayList, false, jVar, z10);
            if (!this.f16253e) {
                this.H = e10;
            }
            this.f16258w.add(e10);
            return e10;
        }
        bVar.b(jVar);
        return bVar;
    }

    @Override
    public final void b() {
        q bVar;
        h(true);
        int i10 = this.E;
        this.E = i10 + 1;
        if (i10 == 0) {
            if (this.F == null) {
                UUID uuid = this.f16250a;
                this.f16251b.getClass();
                try {
                    try {
                        bVar = new t(uuid);
                    } catch (w unused) {
                        e2.a.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        bVar = new qb.b(13);
                    }
                    this.F = bVar;
                    bVar.z(new y0(this, 2));
                } catch (UnsupportedSchemeException e7) {
                    throw new Exception(e7);
                } catch (Exception e10) {
                    throw new Exception(e10);
                }
            } else if (this.v != -9223372036854775807L) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f16258w;
                    if (i11 < arrayList.size()) {
                        ((b) arrayList.get(i11)).b(null);
                        i11++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final b d(List list, boolean z10, j jVar) {
        this.F.getClass();
        q qVar = this.F;
        byte[] bArr = this.K;
        Looper looper = this.I;
        looper.getClass();
        j2.k kVar = this.L;
        kVar.getClass();
        b bVar = new b(this.f16250a, qVar, this.f16255n, this.f16257s, list, this.h | z10, z10, bArr, this.d, this.f16252c, looper, this.f16256r, kVar);
        bVar.b(jVar);
        if (this.v != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    @Override
    public final g d1(j jVar, b2.s sVar) {
        boolean z10 = false;
        h(false);
        if (this.E > 0) {
            z10 = true;
        }
        e2.d.g(z10);
        e2.d.h(this.I);
        return a(this.I, jVar, sVar, true);
    }

    public final b e(List list, boolean z10, j jVar, boolean z11) {
        b d = d(list, z10, jVar);
        boolean c10 = c(d);
        long j3 = this.v;
        Set set = this.f16260y;
        if (c10 && !set.isEmpty()) {
            o1 it = m0.v(set).iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(null);
            }
            d.a(jVar);
            if (j3 != -9223372036854775807L) {
                d.a(null);
            }
            d = d(list, z10, jVar);
        }
        if (c(d) && z11) {
            Set set2 = this.f16259x;
            if (!set2.isEmpty()) {
                o1 it2 = m0.v(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    o1 it3 = m0.v(set).iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).a(null);
                    }
                }
                d.a(jVar);
                if (j3 != -9223372036854775807L) {
                    d.a(null);
                }
                return d(list, z10, jVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.F != null && this.E == 0 && this.f16258w.isEmpty() && this.f16259x.isEmpty()) {
            q qVar = this.F;
            qVar.getClass();
            qVar.release();
            this.F = null;
        }
    }

    public final void h(boolean z10) {
        if (z10 && this.I == null) {
            e2.a.o("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.I;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            e2.a.o("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.I.getThread().getName(), new IllegalStateException());
        }
    }

    @Override
    public final l m0(j jVar, b2.s sVar) {
        boolean z10;
        if (this.E > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        e2.d.h(this.I);
        d dVar = new d(this, jVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new m4.w(5, dVar, sVar));
        return dVar;
    }

    @Override
    public final void release() {
        h(true);
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 != 0) {
            return;
        }
        if (this.v != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f16258w);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).a(null);
            }
        }
        o1 it = m0.v(this.f16259x).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        g();
    }
}
