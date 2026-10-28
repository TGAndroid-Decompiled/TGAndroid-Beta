package n2;

import a8.te;
import a8.yb;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b2.w0;
import f9.g0;
import f9.g2;
import f9.i0;
import f9.s1;
import f9.t0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k2.e0;
import li.e3;
import li.h5;
import m4.x0;
public final class e implements m {
    public int E;
    public q F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public j2.j L;
    public volatile androidx.mediarouter.app.c M;
    public final UUID f18608a;
    public final x0 f18609b;
    public final c2.b f18610c;
    public final HashMap d;
    public final boolean e;
    public final int[] f18611f;
    public final boolean h;
    public final m4.c f18612n;
    public final u7.s f18613r;
    public final h5 f18614s;
    public final long v;
    public final ArrayList f18615w;
    public final Set f18616x;
    public final Set f18617y;

    public e(UUID uuid, c2.b bVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, u7.s sVar) {
        uuid.getClass();
        yb.f("Use C.CLEARKEY_UUID instead", !b2.n.f3285c.equals(uuid));
        this.f18608a = uuid;
        this.f18609b = t.d;
        this.f18610c = bVar;
        this.d = hashMap;
        this.e = z10;
        this.f18611f = iArr;
        this.h = z11;
        this.f18613r = sVar;
        this.f18612n = new m4.c(1);
        this.f18614s = new h5(this);
        this.f18615w = new ArrayList();
        this.f18616x = Collections.newSetFromMap(new IdentityHashMap());
        this.f18617y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.f18595p == 1) {
            f g7 = bVar.g();
            g7.getClass();
            Throwable cause = g7.getCause();
            if ((cause instanceof ResourceBusyException) || te.c(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList h(b2.t tVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(tVar.d);
        for (int i10 = 0; i10 < tVar.d; i10++) {
            b2.s sVar = tVar.f3437a[i10];
            if ((sVar.a(uuid) || (b2.n.d.equals(uuid) && sVar.a(b2.n.f3285c))) && (sVar.e != null || z10)) {
                arrayList.add(sVar);
            }
        }
        return arrayList;
    }

    @Override
    public final void a() {
        q sVar;
        j(true);
        int i10 = this.E;
        this.E = i10 + 1;
        if (i10 == 0) {
            if (this.F == null) {
                UUID uuid = this.f18608a;
                this.f18609b.getClass();
                try {
                    try {
                        sVar = new t(uuid);
                    } catch (x unused) {
                        e2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        sVar = new u7.s(13);
                    }
                    this.F = sVar;
                    sVar.T(new e3(this, 3));
                } catch (UnsupportedSchemeException e) {
                    throw new Exception(e);
                } catch (Exception e10) {
                    throw new Exception(e10);
                }
            } else if (this.v != -9223372036854775807L) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f18615w;
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

    public final g b(Looper looper, j jVar, b2.x xVar, boolean z10) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new androidx.mediarouter.app.c(this, looper, 6);
        }
        b2.t tVar = xVar.f3589w;
        int i10 = 0;
        b bVar = null;
        if (tVar == null) {
            int h = w0.h(xVar.f3586s);
            q qVar = this.F;
            qVar.getClass();
            if (qVar.i0() != 2 || !r.f18634c) {
                int[] iArr = this.f18611f;
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
                if (i10 != -1 && qVar.i0() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        g0 g0Var = i0.f10286b;
                        b e = e(s1.e, true, null, z10);
                        this.f18615w.add(e);
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
            arrayList = h(tVar, this.f18608a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f18608a);
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
            ArrayList arrayList2 = this.f18615w;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i11);
                i11++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.f18583a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        }
        if (bVar == null) {
            b e10 = e(arrayList, false, jVar, z10);
            if (!this.e) {
                this.H = e10;
            }
            this.f18615w.add(e10);
            return e10;
        }
        bVar.b(jVar);
        return bVar;
    }

    public final b d(List list, boolean z10, j jVar) {
        this.F.getClass();
        q qVar = this.F;
        byte[] bArr = this.K;
        Looper looper = this.I;
        looper.getClass();
        j2.j jVar2 = this.L;
        jVar2.getClass();
        b bVar = new b(this.f18608a, qVar, this.f18612n, this.f18614s, list, this.h | z10, z10, bArr, this.d, this.f18610c, looper, this.f18613r, jVar2);
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
        Set set = this.f18617y;
        if (c10 && !set.isEmpty()) {
            g2 it = t0.u(set).iterator();
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
            Set set2 = this.f18616x;
            if (!set2.isEmpty()) {
                g2 it2 = t0.u(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    g2 it3 = t0.u(set).iterator();
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

    @Override
    public final void f(Looper looper, j2.j jVar) {
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
                    yb.p(z10);
                    this.J.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = jVar;
    }

    @Override
    public final l g(j jVar, b2.x xVar) {
        boolean z10;
        if (this.E > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        this.I.getClass();
        d dVar = new d(this, jVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new e0(16, dVar, xVar));
        return dVar;
    }

    public final void i() {
        if (this.F != null && this.E == 0 && this.f18615w.isEmpty() && this.f18616x.isEmpty()) {
            q qVar = this.F;
            qVar.getClass();
            qVar.release();
            this.F = null;
        }
    }

    public final void j(boolean z10) {
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
    public final void release() {
        j(true);
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 != 0) {
            return;
        }
        if (this.v != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f18615w);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).a(null);
            }
        }
        g2 it = t0.u(this.f18616x).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        i();
    }

    @Override
    public final int w(b2.x xVar) {
        j(false);
        q qVar = this.F;
        qVar.getClass();
        int i02 = qVar.i0();
        b2.t tVar = xVar.f3589w;
        if (tVar == null) {
            int h = w0.h(xVar.f3586s);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f18611f;
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
            UUID uuid = this.f18608a;
            if (h(tVar, uuid, true).isEmpty()) {
                if (tVar.d == 1 && tVar.f3437a[0].a(b2.n.f3285c)) {
                    e2.a.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = tVar.f3439c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return i02;
    }

    @Override
    public final g z(j jVar, b2.x xVar) {
        boolean z10 = false;
        j(false);
        if (this.E > 0) {
            z10 = true;
        }
        yb.p(z10);
        this.I.getClass();
        return b(this.I, jVar, xVar, true);
    }
}
