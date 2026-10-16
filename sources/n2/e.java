package n2;

import ab.o0;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b2.w0;
import e9.l0;
import e9.m2;
import e9.n0;
import e9.x1;
import e9.y0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import ji.v2;
import ji.w4;
import m4.v0;
import v7.u6;
import w7.a0;
import z7.xf;
public final class e implements m {
    public int E;
    public q F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public j2.k L;
    public volatile o0 M;
    public final UUID f15658a;
    public final v0 f15659b;
    public final c2.b f15660c;
    public final HashMap d;
    public final boolean e;
    public final int[] f15661f;
    public final boolean h;
    public final xf f15662n;
    public final oa.d f15663r;
    public final w4 f15664s;
    public final long v;
    public final ArrayList f15665w;
    public final Set f15666x;
    public final Set f15667y;

    public e(UUID uuid, c2.b bVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, oa.d dVar) {
        uuid.getClass();
        u6.f("Use C.CLEARKEY_UUID instead", !b2.n.f2222c.equals(uuid));
        this.f15658a = uuid;
        this.f15659b = t.d;
        this.f15660c = bVar;
        this.d = hashMap;
        this.e = z10;
        this.f15661f = iArr;
        this.h = z11;
        this.f15663r = dVar;
        this.f15662n = new xf();
        this.f15664s = new w4(this, 7);
        this.f15665w = new ArrayList();
        this.f15666x = Collections.newSetFromMap(new IdentityHashMap());
        this.f15667y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.f15645p == 1) {
            f g10 = bVar.g();
            g10.getClass();
            Throwable cause = g10.getCause();
            if ((cause instanceof ResourceBusyException) || a0.c(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList f(b2.t tVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(tVar.d);
        for (int i10 = 0; i10 < tVar.d; i10++) {
            b2.s sVar = tVar.f2374a[i10];
            if ((sVar.a(uuid) || (b2.n.d.equals(uuid) && sVar.a(b2.n.f2222c))) && (sVar.e != null || z10)) {
                arrayList.add(sVar);
            }
        }
        return arrayList;
    }

    @Override
    public final void F(Looper looper, j2.k kVar) {
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
                    u6.p(z10);
                    this.J.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = kVar;
    }

    @Override
    public final int J0(b2.x xVar) {
        h(false);
        q qVar = this.F;
        qVar.getClass();
        int p02 = qVar.p0();
        b2.t tVar = xVar.f2526w;
        if (tVar == null) {
            int h = w0.h(xVar.f2523s);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f15661f;
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
            UUID uuid = this.f15658a;
            if (f(tVar, uuid, true).isEmpty()) {
                if (tVar.d == 1 && tVar.f2374a[0].a(b2.n.f2222c)) {
                    e2.a.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = tVar.f2376c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return p02;
    }

    @Override
    public final g V0(j jVar, b2.x xVar) {
        boolean z10 = false;
        h(false);
        if (this.E > 0) {
            z10 = true;
        }
        u6.p(z10);
        this.I.getClass();
        return a(this.I, jVar, xVar, true);
    }

    public final g a(Looper looper, j jVar, b2.x xVar, boolean z10) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new o0(this, looper, 6);
        }
        b2.t tVar = xVar.f2526w;
        int i10 = 0;
        b bVar = null;
        if (tVar == null) {
            int h = w0.h(xVar.f2523s);
            q qVar = this.F;
            qVar.getClass();
            if (qVar.p0() != 2 || !r.f15684c) {
                int[] iArr = this.f15661f;
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
                if (i10 != -1 && qVar.p0() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        l0 l0Var = n0.f8595b;
                        b e = e(x1.e, true, null, z10);
                        this.f15665w.add(e);
                        this.G = e;
                    } else {
                        bVar2.b(null);
                    }
                    return this.G;
                }
            }
            return null;
        }
        if (this.K == null) {
            arrayList = f(tVar, this.f15658a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f15658a);
                e2.a.d("DefaultDrmSessionMgr", "DRM error", exc);
                if (jVar != null) {
                    jVar.d(exc);
                }
                return new n(new f(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (!this.e) {
            bVar = this.H;
        } else {
            ArrayList arrayList2 = this.f15665w;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i11);
                i11++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.f15633a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        }
        if (bVar == null) {
            b e7 = e(arrayList, false, jVar, z10);
            if (!this.e) {
                this.H = e7;
            }
            this.f15665w.add(e7);
            return e7;
        }
        bVar.b(jVar);
        return bVar;
    }

    @Override
    public final void b() {
        q uVar;
        h(true);
        int i10 = this.E;
        this.E = i10 + 1;
        if (i10 == 0) {
            if (this.F == null) {
                UUID uuid = this.f15658a;
                this.f15659b.getClass();
                try {
                    try {
                        uVar = new t(uuid);
                    } catch (x unused) {
                        e2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        uVar = new t7.u(13);
                    }
                    this.F = uVar;
                    uVar.m0(new m.l(this));
                } catch (UnsupportedSchemeException e) {
                    throw new Exception(e);
                } catch (Exception e7) {
                    throw new Exception(e7);
                }
            } else if (this.v != -9223372036854775807L) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f15665w;
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
        b bVar = new b(this.f15658a, qVar, this.f15662n, this.f15664s, list, this.h | z10, z10, bArr, this.d, this.f15660c, looper, this.f15663r, kVar);
        bVar.b(jVar);
        if (this.v != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, j jVar, boolean z11) {
        b d = d(list, z10, jVar);
        boolean c10 = c(d);
        long j10 = this.v;
        Set set = this.f15667y;
        if (c10 && !set.isEmpty()) {
            m2 it = y0.u(set).iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(null);
            }
            d.a(jVar);
            if (j10 != -9223372036854775807L) {
                d.a(null);
            }
            d = d(list, z10, jVar);
        }
        if (c(d) && z11) {
            Set set2 = this.f15666x;
            if (!set2.isEmpty()) {
                m2 it2 = y0.u(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    m2 it3 = y0.u(set).iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).a(null);
                    }
                }
                d.a(jVar);
                if (j10 != -9223372036854775807L) {
                    d.a(null);
                }
                return d(list, z10, jVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.F != null && this.E == 0 && this.f15665w.isEmpty() && this.f15666x.isEmpty()) {
            q qVar = this.F;
            qVar.getClass();
            qVar.release();
            this.F = null;
        }
    }

    public final void h(boolean z10) {
        if (z10 && this.I == null) {
            e2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.I;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            e2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.I.getThread().getName(), new IllegalStateException());
        }
    }

    @Override
    public final l j0(j jVar, b2.x xVar) {
        boolean z10;
        if (this.E > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.p(z10);
        this.I.getClass();
        d dVar = new d(this, jVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new v2(17, dVar, xVar));
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
            ArrayList arrayList = new ArrayList(this.f15665w);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).a(null);
            }
        }
        m2 it = y0.u(this.f15666x).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        g();
    }
}
