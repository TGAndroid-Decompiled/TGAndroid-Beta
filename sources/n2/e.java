package n2;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b2.r0;
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
import k2.c0;
import m4.u0;
import w7.a0;
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
    public final UUID f14889a;
    public final u0 f14890b;
    public final com.google.firebase.messaging.m f14891c;
    public final HashMap d;
    public final boolean e;
    public final int[] f14892f;
    public final boolean h;
    public final of.b f14893n;
    public final qb.b f14894r;
    public final a4.m f14895s;
    public final long v;
    public final ArrayList f14896w;
    public final Set f14897x;
    public final Set f14898y;

    public e(UUID uuid, com.google.firebase.messaging.m mVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, qb.b bVar) {
        uuid.getClass();
        e2.d.a("Use C.CLEARKEY_UUID instead", !b2.i.f3013b.equals(uuid));
        this.f14889a = uuid;
        this.f14890b = t.d;
        this.f14891c = mVar;
        this.d = hashMap;
        this.e = z10;
        this.f14892f = iArr;
        this.h = z11;
        this.f14894r = bVar;
        this.f14893n = new of.b(28);
        this.f14895s = new a4.m(this, 27);
        this.f14896w = new ArrayList();
        this.f14897x = Collections.newSetFromMap(new IdentityHashMap());
        this.f14898y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.f14877o == 1) {
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

    public static ArrayList f(b2.o oVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(oVar.d);
        for (int i10 = 0; i10 < oVar.d; i10++) {
            b2.n nVar = oVar.f3162a[i10];
            if ((nVar.a(uuid) || (b2.i.f3014c.equals(uuid) && nVar.a(b2.i.f3013b))) && (nVar.e != null || z10)) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    @Override
    public final void C(Looper looper, j2.k kVar) {
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
    public final int L0(b2.s sVar) {
        h(false);
        q qVar = this.F;
        qVar.getClass();
        int m0 = qVar.m0();
        b2.o oVar = sVar.v;
        if (oVar == null) {
            int h = r0.h(sVar.f3304r);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f14892f;
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
            UUID uuid = this.f14889a;
            if (f(oVar, uuid, true).isEmpty()) {
                if (oVar.d == 1 && oVar.f3162a[0].a(b2.i.f3013b)) {
                    e2.a.n("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = oVar.f3164c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return m0;
    }

    @Override
    public final g Y0(j jVar, b2.s sVar) {
        boolean z10 = false;
        h(false);
        if (this.E > 0) {
            z10 = true;
        }
        e2.d.g(z10);
        e2.d.h(this.I);
        return a(this.I, jVar, sVar, true);
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
            int h = r0.h(sVar.f3304r);
            q qVar = this.F;
            qVar.getClass();
            if (qVar.m0() != 2 || !r.f14915c) {
                int[] iArr = this.f14892f;
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
                if (i10 != -1 && qVar.m0() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        g0 g0Var = i0.f8079b;
                        b e = e(a1.e, true, null, z10);
                        this.f14896w.add(e);
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
            arrayList = f(oVar, this.f14889a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f14889a);
                e2.a.f("DefaultDrmSessionMgr", "DRM error", exc);
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
            ArrayList arrayList2 = this.f14896w;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i11);
                i11++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.f14866a, arrayList)) {
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
            this.f14896w.add(e7);
            return e7;
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
                UUID uuid = this.f14889a;
                this.f14890b.getClass();
                try {
                    try {
                        bVar = new t(uuid);
                    } catch (w unused) {
                        e2.a.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        bVar = new qb.b(13);
                    }
                    this.F = bVar;
                    bVar.a(new c0(this, 6));
                } catch (UnsupportedSchemeException e) {
                    throw new Exception(e);
                } catch (Exception e7) {
                    throw new Exception(e7);
                }
            } else if (this.v != -9223372036854775807L) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f14896w;
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
        b bVar = new b(this.f14889a, qVar, this.f14893n, this.f14895s, list, this.h | z10, z10, bArr, this.d, this.f14891c, looper, this.f14894r, kVar);
        bVar.b(jVar);
        if (this.v != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, j jVar, boolean z11) {
        b d = d(list, z10, jVar);
        boolean c10 = c(d);
        long j3 = this.v;
        Set set = this.f14898y;
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
            Set set2 = this.f14897x;
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
        if (this.F != null && this.E == 0 && this.f14896w.isEmpty() && this.f14897x.isEmpty()) {
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
    public final l j0(j jVar, b2.s sVar) {
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
        handler.post(new m4.g0(4, dVar, sVar));
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
            ArrayList arrayList = new ArrayList(this.f14896w);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).a(null);
            }
        }
        o1 it = m0.v(this.f14897x).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        g();
    }
}
