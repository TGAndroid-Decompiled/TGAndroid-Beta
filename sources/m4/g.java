package m4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.upstream.r0;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.exoplayer2.upstream.y0;
import com.google.android.gms.internal.cast.x4;
import com.google.firebase.messaging.t;
import h3.a1;
import h3.b1;
import h3.c1;
import h3.f1;
import j4.c0;
import j4.g0;
import j4.p;
import j4.z;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class g extends j4.a {
    public q0 A;
    public y0 B;
    public x4 C;
    public Handler D;
    public b1 E;
    public Uri F;
    public final Uri G;
    public n4.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final f1 h;

    public final boolean f17675i;

    public final com.google.android.exoplayer2.upstream.l f17676j;

    public final k5.i f17677k;

    public final za.b f17678l;

    public final l3.j f17679m;

    public final ab.a f17680n;

    public final t f17681o;

    public final long f17682p;

    public final g0 f17683q;

    public final s0 f17684r;

    public final a9.i f17685s;

    public final Object f17686t;

    public final SparseArray f17687u;
    public final c v;

    public final c f17688w;

    public final k5.i f17689x;

    public final r0 f17690y;

    public com.google.android.exoplayer2.upstream.m f17691z;

    static {
        h3.r0.a("goog.exo.dash");
    }

    public g(f1 f1Var, com.google.android.exoplayer2.upstream.l lVar, s0 s0Var, k5.i iVar, za.b bVar, l3.j jVar, ab.a aVar, long j10) {
        this.h = f1Var;
        this.E = f1Var.f7831c;
        c1 c1Var = f1Var.f7830b;
        c1Var.getClass();
        Uri uri = c1Var.f7795a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f17676j = lVar;
        this.f17684r = s0Var;
        this.f17677k = iVar;
        this.f17679m = jVar;
        this.f17680n = aVar;
        this.f17682p = j10;
        this.f17678l = bVar;
        this.f17681o = new t(19);
        this.f17675i = false;
        this.f17683q = a(null);
        this.f17686t = new Object();
        this.f17687u = new SparseArray();
        this.f17689x = new k5.i(this, 27);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f17685s = new a9.i(this, 29);
        this.f17690y = new ae.b(this, 27);
        final int i10 = 0;
        this.v = new Runnable(this) {

            public final g f17665b;

            {
                this.f17665b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f17665b.v();
                        break;
                    default:
                        this.f17665b.u(false);
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f17688w = new Runnable(this) {

            public final g f17665b;

            {
                this.f17665b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f17665b.v();
                        break;
                    default:
                        this.f17665b.u(false);
                        break;
                }
            }
        };
    }

    public static boolean s(n4.h hVar) {
        List list = hVar.f18246c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = ((n4.a) list.get(i10)).f18210b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final z b(c0 c0Var, r rVar, long j10) {
        int iIntValue = ((Integer) c0Var.f12503a).intValue() - this.O;
        g0 g0Var = new g0(this.f12499c.f12563c, 0, c0Var, this.H.b(iIntValue).f18245b);
        b6.a aVar = new b6.a((CopyOnWriteArrayList) this.d.d, 0, c0Var, 14);
        int i10 = this.O + iIntValue;
        n4.c cVar = this.H;
        y0 y0Var = this.B;
        long j11 = this.L;
        i3.k kVar = this.f12502g;
        d5.a.j(kVar);
        b bVar = new b(i10, cVar, this.f17681o, iIntValue, this.f17677k, y0Var, this.f17679m, aVar, this.f17680n, g0Var, j11, this.f17690y, rVar, this.f17678l, this.f17689x, kVar);
        this.f17687u.put(i10, bVar);
        return bVar;
    }

    @Override
    public final f1 h() {
        return this.h;
    }

    @Override
    public final void j() {
        this.f17690y.a();
    }

    @Override
    public final void l(y0 y0Var) {
        this.B = y0Var;
        l3.j jVar = this.f17679m;
        jVar.a();
        Looper looperMyLooper = Looper.myLooper();
        i3.k kVar = this.f12502g;
        d5.a.j(kVar);
        jVar.w(looperMyLooper, kVar);
        if (this.f17675i) {
            u(false);
            return;
        }
        this.f17691z = this.f17676j.createDataSource();
        this.A = new q0("DashMediaSource");
        this.D = d5.g0.k(null);
        v();
    }

    @Override
    public final void n(z zVar) {
        b bVar = (b) zVar;
        o oVar = bVar.f17662x;
        oVar.f17726r = true;
        oVar.d.removeCallbacksAndMessages(null);
        for (l4.h hVar : bVar.D) {
            hVar.u(bVar);
        }
        bVar.C = null;
        this.f17687u.remove(bVar.f17653a);
    }

    @Override
    public final void p() {
        this.I = false;
        this.f17691z = null;
        q0 q0Var = this.A;
        if (q0Var != null) {
            q0Var.e(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.f17675i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.f17687u.clear();
        t tVar = this.f17681o;
        ((HashMap) tVar.f4619b).clear();
        ((HashMap) tVar.f4620c).clear();
        ((HashMap) tVar.d).clear();
        this.f17679m.release();
    }

    public final void t() {
        boolean z10;
        q0 q0Var = this.A;
        d dVar = new d(this);
        synchronized (d5.a.f4769i) {
            z10 = d5.a.f4770j;
        }
        if (z10) {
            dVar.a();
            return;
        }
        if (q0Var == null) {
            q0Var = new q0("SntpClient");
        }
        q0Var.f(new w9.d(4), new ae.b(dVar, 10), 1);
    }

    public final void u(boolean z10) {
        long j10;
        long jMax;
        long j11;
        boolean z11;
        long j12;
        long j13;
        long j14;
        h hVarC;
        long jMin;
        long j15;
        float f10;
        float f11;
        long jH;
        long jMin2;
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f17687u;
            if (i10 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i10);
            if (iKeyAt >= this.O) {
                b bVar = (b) sparseArray.valueAt(i10);
                n4.c cVar = this.H;
                int i11 = iKeyAt - this.O;
                bVar.G = cVar;
                bVar.H = i11;
                o oVar = bVar.f17662x;
                oVar.f17725n = z12;
                oVar.f17724f = cVar;
                Iterator it = oVar.f17723e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < oVar.f17724f.h) {
                        it.remove();
                    }
                }
                l4.h[] hVarArr = bVar.D;
                if (hVarArr != null) {
                    for (l4.h hVar : hVarArr) {
                        k kVar = hVar.f15431e;
                        i[] iVarArr = kVar.h;
                        try {
                            kVar.f17704j = cVar;
                            kVar.f17705k = i11;
                            long jD = cVar.d(i11);
                            ArrayList arrayListA = kVar.a();
                            for (int i12 = 0; i12 < iVarArr.length; i12++) {
                                try {
                                    iVarArr[i12] = iVarArr[i12].a(jD, (n4.m) arrayListA.get(kVar.f17703i.j(i12)));
                                } catch (j4.b e9) {
                                    e = e9;
                                    kVar.f17706l = e;
                                }
                            }
                        } catch (j4.b e10) {
                            e = e10;
                        }
                    }
                    bVar.C.a(bVar);
                }
                bVar.I = cVar.b(i11).d;
                for (l lVar : bVar.E) {
                    for (n4.g gVar : bVar.I) {
                        if (gVar.a().equals(lVar.f17711e.a())) {
                            lVar.b(gVar, cVar.d && i11 == cVar.f18227m.size() + (-1));
                            break;
                        }
                    }
                }
            }
            i10++;
            z12 = false;
        }
        n4.h hVarB = this.H.b(0);
        int size = this.H.f18227m.size() - 1;
        n4.h hVarB2 = this.H.b(size);
        long jD2 = this.H.d(size);
        long jH2 = d5.g0.H(d5.g0.t(this.L));
        long jD3 = this.H.d(0);
        long j16 = hVarB.f18245b;
        List list = hVarB.f18246c;
        long jH3 = d5.g0.H(j16);
        boolean zS = s(hVarB);
        long jMax2 = jH3;
        int i13 = 0;
        while (true) {
            long j17 = jH3;
            if (i13 >= list.size()) {
                j10 = 0;
                jMax = jMax2;
                break;
            }
            n4.a aVar = (n4.a) list.get(i13);
            j10 = 0;
            List list2 = aVar.f18211c;
            int i14 = aVar.f18210b;
            boolean z13 = (i14 == 1 || i14 == 2) ? false : true;
            if ((!zS || !z13) && !list2.isEmpty()) {
                h hVarC2 = ((n4.m) list2.get(0)).c();
                if (hVarC2 == null || hVarC2.G(jD3, jH2) == 0) {
                    jMax = j17;
                    break;
                }
                jMax2 = Math.max(jMax2, hVarC2.a(hVarC2.r(jD3, jH2)) + j17);
            }
            i13++;
            jH3 = j17;
        }
        long j18 = hVarB2.f18245b;
        List list3 = hVarB2.f18246c;
        long jH4 = d5.g0.H(j18);
        boolean zS2 = s(hVarB2);
        long jMin3 = Long.MAX_VALUE;
        int i15 = 0;
        while (true) {
            if (i15 >= list3.size()) {
                j11 = jMin3;
                break;
            }
            n4.a aVar2 = (n4.a) list3.get(i15);
            boolean z14 = zS2;
            List list4 = aVar2.f18211c;
            int i16 = aVar2.f18210b;
            long j19 = jH4;
            boolean z15 = (i16 == 1 || i16 == 2) ? false : true;
            if ((!z14 || !z15) && !list4.isEmpty()) {
                h hVarC3 = ((n4.m) list4.get(0)).c();
                if (hVarC3 == null) {
                    j11 = j19 + jD2;
                    break;
                }
                long jG = hVarC3.G(jD2, jH2);
                if (jG == j10) {
                    j11 = j19;
                    break;
                } else {
                    long jR = (hVarC3.r(jD2, jH2) + jG) - 1;
                    jMin3 = Math.min(jMin3, hVarC3.l(jR, jD2) + hVarC3.a(jR) + j19);
                }
            }
            i15++;
            zS2 = z14;
            jH4 = j19;
        }
        if (!this.H.d) {
            z11 = false;
            break;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= list3.size()) {
                z11 = true;
                break;
            }
            h hVarC4 = ((n4.m) ((n4.a) list3.get(i17)).f18211c.get(0)).c();
            if (hVarC4 == null || hVarC4.B()) {
                z11 = false;
                break;
            }
            i17++;
        }
        if (z11) {
            long j20 = this.H.f18221f;
            if (j20 != -9223372036854775807L) {
                jMax = Math.max(jMax, j11 - d5.g0.H(j20));
            }
        }
        long j21 = j11 - jMax;
        n4.c cVar2 = this.H;
        if (cVar2.d) {
            d5.a.i(cVar2.f18217a != -9223372036854775807L);
            long jH5 = (jH2 - d5.g0.H(this.H.f18217a)) - jMax;
            long jS = d5.g0.S(jH5);
            b1 b1Var = this.h.f7831c;
            long j22 = b1Var.f7784c;
            if (j22 != -9223372036854775807L) {
                jMin = Math.min(jS, j22);
            } else {
                a1 a1Var = this.H.f18224j;
                if (a1Var != null) {
                    long j23 = a1Var.f7769c;
                    if (j23 != -9223372036854775807L) {
                        jMin = Math.min(jS, j23);
                    } else {
                        jMin = jS;
                    }
                } else {
                    jMin = jS;
                }
            }
            long jS2 = d5.g0.S(jH5 - j21);
            if (jS2 < j10 && jMin > j10) {
                jS2 = j10;
            }
            j12 = -9223372036854775807L;
            long j24 = this.H.f18219c;
            if (j24 != -9223372036854775807L) {
                jS2 = Math.min(jS2 + j24, jS);
            }
            long jI = jS2;
            long j25 = b1Var.f7783b;
            if (j25 != -9223372036854775807L) {
                jI = d5.g0.i(j25, jI, jS);
            } else {
                a1 a1Var2 = this.H.f18224j;
                if (a1Var2 != null) {
                    long j26 = a1Var2.f7768b;
                    if (j26 != -9223372036854775807L) {
                        jI = d5.g0.i(j26, jI, jS);
                    }
                }
            }
            long j27 = jI;
            long j28 = j27 > jMin ? j27 : jMin;
            long jI2 = this.E.f7782a;
            if (jI2 == -9223372036854775807L) {
                n4.c cVar3 = this.H;
                a1 a1Var3 = cVar3.f18224j;
                if (a1Var3 != null) {
                    long j29 = a1Var3.f7767a;
                    if (j29 != -9223372036854775807L) {
                        jI2 = j29;
                    } else {
                        jI2 = cVar3.f18222g;
                        if (jI2 == -9223372036854775807L) {
                            jI2 = this.f17682p;
                        }
                    }
                } else {
                    jI2 = cVar3.f18222g;
                    if (jI2 == -9223372036854775807L) {
                        jI2 = this.f17682p;
                    }
                }
            }
            if (jI2 < j27) {
                jI2 = j27;
            }
            if (jI2 > j28) {
                jI2 = d5.g0.i(d5.g0.S(jH5 - Math.min(5000000L, j21 / 2)), j27, j28);
            }
            long j30 = jI2;
            float f12 = b1Var.d;
            if (f12 == -3.4028235E38f) {
                a1 a1Var4 = this.H.f18224j;
                f12 = a1Var4 != null ? a1Var4.d : -3.4028235E38f;
            }
            float f13 = b1Var.f7785e;
            if (f13 == -3.4028235E38f) {
                a1 a1Var5 = this.H.f18224j;
                f13 = a1Var5 != null ? a1Var5.f7770e : -3.4028235E38f;
            }
            if (f12 == -3.4028235E38f && f13 == -3.4028235E38f) {
                a1 a1Var6 = this.H.f18224j;
                j15 = 2;
                if (a1Var6 == null || a1Var6.f7767a == -9223372036854775807L) {
                    f11 = 1.0f;
                    f10 = 1.0f;
                }
                this.E = new b1(j30, j27, j28, f11, f10);
                long jS3 = d5.g0.S(jMax) + this.H.f18217a;
                jH = jH5 - d5.g0.H(this.E.f7782a);
                jMin2 = Math.min(5000000L, j21 / j15);
                if (jH < jMin2) {
                    j14 = jMin2;
                } else {
                    j14 = jH;
                }
                j13 = jS3;
            } else {
                j15 = 2;
            }
            f11 = f12;
            f10 = f13;
            this.E = new b1(j30, j27, j28, f11, f10);
            long jS4 = d5.g0.S(jMax) + this.H.f18217a;
            jH = jH5 - d5.g0.H(this.E.f7782a);
            jMin2 = Math.min(5000000L, j21 / j15);
            if (jH < jMin2) {
                j14 = jMin2;
            } else {
                j14 = jH;
            }
            j13 = jS4;
        } else {
            j12 = -9223372036854775807L;
            j13 = -9223372036854775807L;
            j14 = j10;
        }
        long jH6 = jMax - d5.g0.H(hVarB.f18245b);
        n4.c cVar4 = this.H;
        m(new e(cVar4.f18217a, j13, this.L, this.O, jH6, j21, j14, cVar4, this.h, cVar4.d ? this.E : null));
        if (this.f17675i) {
            return;
        }
        Handler handler = this.D;
        c cVar5 = this.f17688w;
        handler.removeCallbacks(cVar5);
        if (z11) {
            Handler handler2 = this.D;
            n4.c cVar6 = this.H;
            long jT = d5.g0.t(this.L);
            int size2 = cVar6.f18227m.size() - 1;
            n4.h hVarB3 = cVar6.b(size2);
            long j31 = hVarB3.f18245b;
            List list5 = hVarB3.f18246c;
            long jH7 = d5.g0.H(j31);
            long jD4 = cVar6.d(size2);
            long jH8 = d5.g0.H(jT);
            long jH9 = d5.g0.H(cVar6.f18217a);
            long jH10 = d5.g0.H(5000L);
            for (int i18 = 0; i18 < list5.size(); i18++) {
                List list6 = ((n4.a) list5.get(i18)).f18211c;
                if (!list6.isEmpty() && (hVarC = ((n4.m) list6.get(0)).c()) != null) {
                    long jS5 = (hVarC.s(jD4, jH8) + (jH9 + jH7)) - jH8;
                    if (jS5 < jH10 - 100000 || (jS5 > jH10 && jS5 < jH10 + 100000)) {
                        jH10 = jS5;
                    }
                }
            }
            RoundingMode roundingMode = RoundingMode.CEILING;
            roundingMode.getClass();
            long j32 = jH10 / 1000;
            long j33 = jH10 - (1000 * j32);
            if (j33 != j10) {
                int i19 = ((int) ((jH10 ^ 1000) >> 63)) | 1;
                switch (q8.c.f46176a[roundingMode.ordinal()]) {
                    case 1:
                        if (j33 != j10) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        if (i19 < 0) {
                            j32 += (long) i19;
                        }
                        break;
                    case 4:
                        j32 += (long) i19;
                        break;
                    case 5:
                        if (i19 > 0) {
                            j32 += (long) i19;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        long jAbs = Math.abs(j33);
                        long jAbs2 = jAbs - (Math.abs(1000L) - jAbs);
                        if (jAbs2 == j10) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                        } else if (jAbs2 > j10) {
                            j32 += (long) i19;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            handler2.postDelayed(cVar5, j32);
        }
        if (this.I) {
            v();
            return;
        }
        if (z10) {
            n4.c cVar7 = this.H;
            if (cVar7.d) {
                long j34 = cVar7.f18220e;
                if (j34 != j12) {
                    this.D.postDelayed(this.v, Math.max(j10, (this.J + (j34 == j10 ? 5000L : j34)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void v() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.I = true;
            return;
        }
        synchronized (this.f17686t) {
            uri = this.F;
        }
        this.I = false;
        t0 t0Var = new t0(this.f17691z, uri, 4, this.f17684r);
        a9.i iVar = this.f17685s;
        this.f17680n.getClass();
        this.A.f(t0Var, iVar, 3);
        this.f17683q.k(new p(t0Var.f3044b), t0Var.f3045c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
