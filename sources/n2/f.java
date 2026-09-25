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
import ki.h0;
import m4.o0;
import w7.b0;
public final class f implements n {
    public int E;
    public r F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public j2.k L;
    public volatile androidx.mediarouter.app.c M;
    public final UUID f15117a;
    public final o0 f15118b;
    public final com.google.firebase.messaging.m f15119c;
    public final HashMap d;
    public final boolean e;
    public final int[] f15120f;
    public final boolean h;
    public final of.b f15121n;
    public final qb.b f15122r;
    public final e f15123s;
    public final long v;
    public final ArrayList f15124w;
    public final Set f15125x;
    public final Set f15126y;

    public f(UUID uuid, com.google.firebase.messaging.m mVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, qb.b bVar) {
        uuid.getClass();
        e2.d.a("Use C.CLEARKEY_UUID instead", !b2.i.f3010b.equals(uuid));
        this.f15117a = uuid;
        this.f15118b = u.d;
        this.f15119c = mVar;
        this.d = hashMap;
        this.e = z10;
        this.f15120f = iArr;
        this.h = z11;
        this.f15122r = bVar;
        this.f15121n = new of.b(28);
        this.f15123s = new e(this, 0);
        this.f15124w = new ArrayList();
        this.f15125x = Collections.newSetFromMap(new IdentityHashMap());
        this.f15126y = Collections.newSetFromMap(new IdentityHashMap());
        this.v = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.f15103o == 1) {
            g g10 = bVar.g();
            g10.getClass();
            Throwable cause = g10.getCause();
            if ((cause instanceof ResourceBusyException) || b0.c(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList f(b2.o oVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(oVar.d);
        for (int i10 = 0; i10 < oVar.d; i10++) {
            b2.n nVar = oVar.f3159a[i10];
            if ((nVar.a(uuid) || (b2.i.f3011c.equals(uuid) && nVar.a(b2.i.f3010b))) && (nVar.e != null || z10)) {
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
        r rVar = this.F;
        rVar.getClass();
        int m0 = rVar.m0();
        b2.o oVar = sVar.v;
        if (oVar == null) {
            int h = r0.h(sVar.f3301r);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f15120f;
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
            UUID uuid = this.f15117a;
            if (f(oVar, uuid, true).isEmpty()) {
                if (oVar.d == 1 && oVar.f3159a[0].a(b2.i.f3010b)) {
                    e2.a.n("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = oVar.f3161c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return m0;
    }

    @Override
    public final h Y0(k kVar, b2.s sVar) {
        boolean z10 = false;
        h(false);
        if (this.E > 0) {
            z10 = true;
        }
        e2.d.g(z10);
        e2.d.h(this.I);
        return a(this.I, kVar, sVar, true);
    }

    public final h a(Looper looper, k kVar, b2.s sVar, boolean z10) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new androidx.mediarouter.app.c(this, looper, 5);
        }
        b2.o oVar = sVar.v;
        int i10 = 0;
        b bVar = null;
        if (oVar == null) {
            int h = r0.h(sVar.f3301r);
            r rVar = this.F;
            rVar.getClass();
            if (rVar.m0() != 2 || !s.f15143c) {
                int[] iArr = this.f15120f;
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
                if (i10 != -1 && rVar.m0() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        g0 g0Var = i0.f8066b;
                        b e = e(a1.e, true, null, z10);
                        this.f15124w.add(e);
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
            arrayList = f(oVar, this.f15117a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f15117a);
                e2.a.f("DefaultDrmSessionMgr", "DRM error", exc);
                if (kVar != null) {
                    kVar.d(exc);
                }
                return new o(new g(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (!this.e) {
            bVar = this.H;
        } else {
            ArrayList arrayList2 = this.f15124w;
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i11);
                i11++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.f15092a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        }
        if (bVar == null) {
            b e7 = e(arrayList, false, kVar, z10);
            if (!this.e) {
                this.H = e7;
            }
            this.f15124w.add(e7);
            return e7;
        }
        bVar.b(kVar);
        return bVar;
    }

    @Override
    public final void b() {
        r bVar;
        h(true);
        int i10 = this.E;
        this.E = i10 + 1;
        if (i10 == 0) {
            if (this.F == null) {
                UUID uuid = this.f15117a;
                this.f15118b.getClass();
                try {
                    try {
                        bVar = new u(uuid);
                    } catch (x unused) {
                        e2.a.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        bVar = new qb.b(13);
                    }
                    this.F = bVar;
                    bVar.d(new l.d(this));
                } catch (UnsupportedSchemeException e) {
                    throw new Exception(e);
                } catch (Exception e7) {
                    throw new Exception(e7);
                }
            } else if (this.v != -9223372036854775807L) {
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f15124w;
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

    public final b d(List list, boolean z10, k kVar) {
        this.F.getClass();
        r rVar = this.F;
        byte[] bArr = this.K;
        Looper looper = this.I;
        looper.getClass();
        j2.k kVar2 = this.L;
        kVar2.getClass();
        b bVar = new b(this.f15117a, rVar, this.f15121n, this.f15123s, list, this.h | z10, z10, bArr, this.d, this.f15119c, looper, this.f15122r, kVar2);
        bVar.b(kVar);
        if (this.v != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, k kVar, boolean z11) {
        b d = d(list, z10, kVar);
        boolean c10 = c(d);
        long j3 = this.v;
        Set set = this.f15126y;
        if (c10 && !set.isEmpty()) {
            o1 it = m0.v(set).iterator();
            while (it.hasNext()) {
                ((h) it.next()).a(null);
            }
            d.a(kVar);
            if (j3 != -9223372036854775807L) {
                d.a(null);
            }
            d = d(list, z10, kVar);
        }
        if (c(d) && z11) {
            Set set2 = this.f15125x;
            if (!set2.isEmpty()) {
                o1 it2 = m0.v(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    o1 it3 = m0.v(set).iterator();
                    while (it3.hasNext()) {
                        ((h) it3.next()).a(null);
                    }
                }
                d.a(kVar);
                if (j3 != -9223372036854775807L) {
                    d.a(null);
                }
                return d(list, z10, kVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.F != null && this.E == 0 && this.f15124w.isEmpty() && this.f15125x.isEmpty()) {
            r rVar = this.F;
            rVar.getClass();
            rVar.release();
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
    public final m j0(k kVar, b2.s sVar) {
        boolean z10;
        if (this.E > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        e2.d.h(this.I);
        d dVar = new d(this, kVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new h0(9, dVar, sVar));
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
            ArrayList arrayList = new ArrayList(this.f15124w);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((b) arrayList.get(i11)).a(null);
            }
        }
        o1 it = m0.v(this.f15125x).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        g();
    }
}
