package o2;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b2.l1;
import b2.p0;
import b2.r0;
import c5.b0;
import e2.d0;
import e9.i0;
import g2.x;
import i2.h0;
import i2.s0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.g0;
import sc.v;
import u2.c1;
import u2.n1;
import u2.y0;
import w7.f8;
public final class q implements y2.g, y2.j, c1, c3.q, y0 {
    public static final Set f17071o0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final List E;
    public final n F;
    public final n G;
    public final Handler H;
    public final ArrayList I;
    public final Map J;
    public v2.e K;
    public p[] L;
    public int[] M;
    public final HashSet N;
    public final SparseIntArray O;
    public o P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public b2.s V;
    public b2.s W;
    public boolean X;
    public n1 Y;
    public Set Z;
    public final String f17072a;
    public int[] f17073a0;
    public final int f17074b;
    public int f17075b0;
    public final g0 f17076c;
    public boolean f17077c0;
    public final i d;
    public boolean[] f17078d0;
    public final y2.d f17079e;
    public boolean[] f17080e0;
    public final b2.s f17081f;
    public long f17082f0;
    public long f17083g0;
    public final n2.m h;
    public boolean f17084h0;
    public boolean f17085i0;
    public boolean f17086j0;
    public boolean f17087k0;
    public long f17088l0;
    public b2.o m0;
    public final n2.j f17089n;
    public j f17090n0;
    public final rb.a f17091r;
    public final y2.l f17092s = new y2.l("Loader:HlsSampleStreamWrapper");
    public final a5.a v;
    public final int f17093w;
    public final androidx.activity.n f17094x;
    public final ArrayList f17095y;

    public q(String str, int i10, g0 g0Var, i iVar, Map map, y2.d dVar, long j3, b2.s sVar, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, int i11) {
        this.f17072a = str;
        this.f17074b = i10;
        this.f17076c = g0Var;
        this.d = iVar;
        this.J = map;
        this.f17079e = dVar;
        this.f17081f = sVar;
        this.h = mVar;
        this.f17089n = jVar;
        this.f17091r = aVar;
        this.v = aVar2;
        this.f17093w = i11;
        androidx.activity.n nVar = new androidx.activity.n();
        nVar.f2148c = null;
        nVar.f2147b = false;
        nVar.d = null;
        this.f17094x = nVar;
        this.M = new int[0];
        Set set = f17071o0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f17080e0 = new boolean[0];
        this.f17078d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f17095y = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f17064b;

            {
                this.f17064b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f17064b.z();
                        return;
                    default:
                        q qVar = this.f17064b;
                        qVar.S = true;
                        qVar.z();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f17064b;

            {
                this.f17064b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f17064b.z();
                        return;
                    default:
                        q qVar = this.f17064b;
                        qVar.S = true;
                        qVar.z();
                        return;
                }
            }
        };
        this.H = d0.o(null);
        this.f17082f0 = j3;
        this.f17083g0 = j3;
    }

    public static c3.n j(int i10, int i11) {
        e2.a.n("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static b2.s t(b2.s sVar, b2.s sVar2, boolean z10) {
        String b10;
        int i10;
        int i11;
        if (sVar == null) {
            return sVar2;
        }
        String str = sVar.f3636k;
        String str2 = sVar2.f3643r;
        int h = r0.h(str2);
        if (d0.t(h, str) == 1) {
            b10 = d0.u(h, str);
            str2 = r0.d(b10);
        } else {
            b10 = r0.b(str, str2);
        }
        sVar2.f3638m = sVar.f3638m;
        sVar2.f3639n = sVar.f3639n;
        sVar2.f3640o = sVar.f3640o;
        sVar2.f3641p = sVar.f3641p;
        b2.r a2 = sVar2.a();
        a2.f3571a = sVar.f3628a;
        a2.f3572b = sVar.f3629b;
        a2.f3573c = i0.v(sVar.f3630c);
        a2.d = sVar.d;
        a2.f3574e = sVar.f3631e;
        a2.f3575f = sVar.f3632f;
        if (z10) {
            i10 = sVar.h;
        } else {
            i10 = -1;
        }
        a2.h = i10;
        if (z10) {
            i11 = sVar.f3634i;
        } else {
            i11 = -1;
        }
        a2.f3577i = i11;
        a2.f3578j = b10;
        a2.f3583o = sVar.f3640o;
        a2.f3581m = sVar.f3639n;
        a2.f3580l = sVar.f3638m;
        a2.f3582n = sVar.f3641p;
        if (h == 2) {
            a2.f3591x = sVar.f3649y;
            a2.f3592y = sVar.f3650z;
            a2.B = sVar.C;
        }
        if (str2 != null) {
            a2.f3585q = r0.n(str2);
        }
        int i12 = sVar.J;
        if (i12 != -1 && h == 1) {
            a2.I = i12;
        }
        p0 p0Var = sVar.f3637l;
        if (p0Var != null) {
            p0 p0Var2 = sVar2.f3637l;
            if (p0Var2 != null) {
                p0Var = p0Var2.b(p0Var);
            }
            a2.f3579k = p0Var;
        }
        return new b2.s(a2);
    }

    public static int w(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 1;
        }
        return 0;
    }

    public final void A() {
        this.f17092s.a();
        i iVar = this.d;
        u2.b bVar = iVar.f17026n;
        if (bVar == null) {
            Uri uri = iVar.f17027o;
            if (uri != null && uri.equals(iVar.f17028p)) {
                p2.c cVar = iVar.f17020g;
                p2.b bVar2 = (p2.b) cVar.d.get(iVar.f17027o);
                bVar2.f45198b.a();
                IOException iOException = bVar2.f45204s;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void B(l1[] l1VarArr, int... iArr) {
        this.Y = m(l1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.f17075b0 = 0;
        this.H.post(new h0(this.f17076c, 16));
        this.T = true;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        v2.e eVar = (v2.e) iVar;
        if (i10 == 0) {
            long j11 = eVar.f49137a;
            tVar = new u2.t(eVar.f49138b);
        } else {
            long j12 = eVar.f49137a;
            Uri uri = eVar.f49143r.f10234c;
            tVar = new u2.t(j10);
        }
        u2.t tVar2 = tVar;
        this.v.u(tVar2, eVar.f49139c, this.f17074b, eVar.d, eVar.f49140e, eVar.f49141f, eVar.h, eVar.f49142n, i10);
    }

    public final void D() {
        for (p pVar : this.L) {
            pVar.D(this.f17084h0);
        }
        this.f17084h0 = false;
    }

    public final boolean E(long j3, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean G;
        this.f17082f0 = j3;
        if (x()) {
            this.f17083g0 = j3;
            return true;
        }
        boolean z13 = this.d.f17029q;
        ArrayList arrayList = this.f17095y;
        if (z13) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                jVar = (j) arrayList.get(i10);
                if (jVar.h == j3) {
                    break;
                }
            }
        }
        jVar = null;
        if (this.S && !z10 && !arrayList.isEmpty()) {
            int length = this.L.length;
            for (int i11 = 0; i11 < length; i11++) {
                p pVar = this.L[i11];
                if (jVar != null) {
                    G = pVar.F(jVar.f(i11));
                } else {
                    long d = d();
                    if (d != Long.MIN_VALUE && j3 >= d) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    G = pVar.G(j3, z12);
                }
                if (!G && (this.f17080e0[i11] || !this.f17077c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f17083g0 = j3;
        this.f17086j0 = false;
        arrayList.clear();
        y2.l lVar = this.f17092s;
        if (lVar.d()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.k();
                }
            }
            lVar.b();
            return true;
        }
        lVar.f51785c = null;
        D();
        return true;
    }

    @Override
    public final void F(y2.i iVar, long j3, long j10) {
        v2.e eVar = (v2.e) iVar;
        this.K = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f17008s;
            i iVar2 = this.d;
            iVar2.f17025m = bArr;
            l2.f fVar = iVar2.f17022j;
            Uri uri = eVar2.f49138b.f10266a;
            byte[] bArr2 = eVar2.f17009w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) fVar.f15334b).put(uri, bArr2);
        }
        long j11 = eVar.f49137a;
        Uri uri2 = eVar.f49143r.f10234c;
        u2.t tVar = new u2.t(j10);
        this.f17091r.getClass();
        this.v.q(tVar, eVar.f49139c, this.f17074b, eVar.d, eVar.f49140e, eVar.f49141f, eVar.h, eVar.f49142n);
        if (!this.T) {
            i2.r0 r0Var = new i2.r0();
            r0Var.f11875a = this.f17082f0;
            n(new s0(r0Var));
            return;
        }
        this.f17076c.D(this);
    }

    @Override
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        v2.e eVar = (v2.e) iVar;
        this.K = null;
        long j11 = eVar.f49137a;
        Uri uri = eVar.f49143r.f10234c;
        u2.t tVar = new u2.t(j10);
        this.f17091r.getClass();
        this.v.p(tVar, eVar.f49139c, this.f17074b, eVar.d, eVar.f49140e, eVar.f49141f, eVar.h, eVar.f49142n);
        if (!z10) {
            if (x() || this.U == 0) {
                D();
            }
            if (this.U > 0) {
                this.f17076c.D(this);
            }
        }
    }

    @Override
    public final void a() {
        this.H.post(this.F);
    }

    @Override
    public final void b() {
        p[] pVarArr;
        for (p pVar : this.L) {
            pVar.D(true);
            n2.g gVar = pVar.h;
            if (gVar != null) {
                gVar.a(pVar.f48833e);
                pVar.h = null;
                pVar.f48835g = null;
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f17092s.d();
    }

    @Override
    public final long d() {
        if (x()) {
            return this.f17083g0;
        }
        if (this.f17086j0) {
            return Long.MIN_VALUE;
        }
        return v().f49142n;
    }

    public final void e() {
        e2.d.g(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean f(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.f17095y;
            if (i11 < arrayList.size()) {
                if (((j) arrayList.get(i11)).f17034b0) {
                    return false;
                }
                i11++;
            } else {
                j jVar = (j) arrayList.get(i10);
                for (int i12 = 0; i12 < this.L.length; i12++) {
                    if (this.L[i12].t() > jVar.f(i12)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @Override
    public final c3.h0 f2(int i10, int i11) {
        j jVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f17071o0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            e2.d.b(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.M[i12] = i10;
                }
                r52 = this.M[i12] == i10 ? this.L[i12] : j(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.L;
                if (i13 >= r12.length) {
                    break;
                } else if (this.M[i13] == i10) {
                    r52 = r12[i13];
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (r52 == 0) {
            if (this.f17087k0) {
                return j(i10, i11);
            }
            int length = this.L.length;
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            }
            r52 = new p(this.f17079e, this.h, this.f17089n, this.J);
            r52.f48847t = this.f17082f0;
            if (z10) {
                r52.I = this.m0;
                r52.f48852z = true;
            }
            long j3 = this.f17088l0;
            if (r52.F != j3) {
                r52.F = j3;
                r52.f48852z = true;
            }
            if (this.f17090n0 != null) {
                r52.C = jVar.v;
            }
            r52.f48834f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = d0.f8531a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f17080e0, i14);
            this.f17080e0 = copyOf3;
            copyOf3[length] = z10;
            this.f17077c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (w(i11) > w(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.f17078d0 = Arrays.copyOf(this.f17078d0, i14);
        }
        if (i11 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f17093w);
            }
            return this.P;
        }
        return r52;
    }

    @Override
    public final void k1() {
        this.f17087k0 = true;
        this.H.post(this.G);
    }

    public final n1 m(l1[] l1VarArr) {
        for (int i10 = 0; i10 < l1VarArr.length; i10++) {
            l1 l1Var = l1VarArr[i10];
            b2.s[] sVarArr = new b2.s[l1Var.f3415a];
            for (int i11 = 0; i11 < l1Var.f3415a; i11++) {
                b2.s sVar = l1Var.d[i11];
                int Q0 = this.h.Q0(sVar);
                b2.r a2 = sVar.a();
                a2.R = Q0;
                sVarArr[i11] = new b2.s(a2);
            }
            l1VarArr[i10] = new l1(l1Var.f3416b, sVarArr);
        }
        return new n1(l1VarArr);
    }

    @Override
    public final boolean n(i2.s0 r73) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.n(i2.s0):boolean");
    }

    @Override
    public final long q() {
        if (this.f17086j0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f17083g0;
        }
        long j3 = this.f17082f0;
        j v = v();
        if (!v.X) {
            ArrayList arrayList = this.f17095y;
            if (arrayList.size() > 1) {
                v = (j) hg.c.g(2, arrayList);
            } else {
                v = null;
            }
        }
        if (v != null) {
            j3 = Math.max(j3, v.f49142n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j3 = Math.max(j3, pVar.q());
            }
        }
        return j3;
    }

    @Override
    public final void s(long j3) {
        int size;
        boolean d;
        y2.l lVar = this.f17092s;
        if (!lVar.c() && !x()) {
            boolean d10 = lVar.d();
            i iVar = this.d;
            List list = this.E;
            if (d10) {
                this.K.getClass();
                v2.e eVar = this.K;
                if (iVar.f17026n != null) {
                    d = false;
                } else {
                    d = iVar.f17030r.d(j3, eVar, list);
                }
                if (d) {
                    lVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.b((j) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                u(size2);
            }
            if (iVar.f17026n == null && iVar.f17030r.length() >= 2) {
                size = iVar.f17030r.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < this.f17095y.size()) {
                u(size);
            }
        }
    }

    public final void u(int i10) {
        ArrayList arrayList;
        e2.d.g(!this.f17092s.d());
        while (true) {
            arrayList = this.f17095y;
            if (i10 < arrayList.size()) {
                if (f(i10)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j3 = v().f49142n;
        j jVar = (j) arrayList.get(i10);
        d0.U(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].n(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f17083g0 = this.f17082f0;
        } else {
            ((j) e9.q.l(arrayList)).Z = true;
        }
        this.f17086j0 = false;
        this.v.A(this.Q, jVar.h, j3);
    }

    public final j v() {
        return (j) hg.c.g(1, this.f17095y);
    }

    public final boolean x() {
        if (this.f17083g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final k4.d y(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        k4.d dVar;
        int i11;
        v2.e eVar = (v2.e) iVar;
        boolean z11 = eVar instanceof j;
        if (z11 && !((j) eVar).g() && (iOException instanceof x) && ((i11 = ((x) iOException).d) == 410 || i11 == 404)) {
            return y2.l.d;
        }
        long j11 = eVar.f49143r.f10233b;
        Uri uri = eVar.f49143r.f10234c;
        u2.t tVar = new u2.t(j10);
        d0.d0(eVar.h);
        d0.d0(eVar.f49142n);
        b0 b0Var = new b0(iOException, i10, 14);
        i iVar2 = this.d;
        ki.x a2 = f8.a(iVar2.f17030r);
        this.f17091r.getClass();
        k4.d l32 = rb.a.l3(a2, b0Var);
        boolean z12 = false;
        if (l32 != null && l32.f14621a == 2) {
            long j12 = l32.f14622b;
            x2.r rVar = iVar2.f17030r;
            z10 = rVar.o(rVar.u(iVar2.h.a(eVar.d)), j12);
        } else {
            z10 = false;
        }
        if (z10) {
            if (z11 && j11 == 0) {
                ArrayList arrayList = this.f17095y;
                if (((j) hg.c.x(1, arrayList)) == eVar) {
                    z12 = true;
                }
                e2.d.g(z12);
                if (arrayList.isEmpty()) {
                    this.f17083g0 = this.f17082f0;
                } else {
                    ((j) e9.q.l(arrayList)).Z = true;
                }
            }
            dVar = y2.l.f51781e;
        } else {
            long n32 = rb.a.n3(b0Var);
            if (n32 != -9223372036854775807L) {
                dVar = new k4.d(0, n32, false);
            } else {
                dVar = y2.l.f51782f;
            }
        }
        k4.d dVar2 = dVar;
        boolean a10 = dVar2.a();
        this.v.r(tVar, eVar.f49139c, this.f17074b, eVar.d, eVar.f49140e, eVar.f49141f, eVar.h, eVar.f49142n, iOException, !a10);
        if (!a10) {
            this.K = null;
        }
        if (z10) {
            if (!this.T) {
                i2.r0 r0Var = new i2.r0();
                r0Var.f11875a = this.f17082f0;
                n(new s0(r0Var));
                return dVar2;
            }
            this.f17076c.D(this);
        }
        return dVar2;
    }

    public final void z() {
        boolean z10;
        int i10;
        b2.s t10;
        if (!this.X && this.f17073a0 == null && this.S) {
            int i11 = 0;
            for (p pVar : this.L) {
                if (pVar.w() == null) {
                    return;
                }
            }
            n1 n1Var = this.Y;
            if (n1Var != null) {
                int i12 = n1Var.f48738a;
                int[] iArr = new int[i12];
                this.f17073a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i14 < pVarArr.length) {
                            b2.s w10 = pVarArr[i14].w();
                            e2.d.h(w10);
                            b2.s sVar = this.Y.a(i13).d[0];
                            String str = w10.f3643r;
                            String str2 = sVar.f3643r;
                            int h = r0.h(str);
                            if (h != 3) {
                                if (h == r0.h(str2)) {
                                    break;
                                }
                                i14++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || w10.O == sVar.O) {
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                    this.f17073a0[i13] = i14;
                }
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((m) obj).b();
                }
                return;
            }
            int length = this.L.length;
            int i15 = 0;
            int i16 = -1;
            int i17 = -2;
            while (true) {
                int i18 = 1;
                if (i15 >= length) {
                    break;
                }
                b2.s w11 = this.L[i15].w();
                e2.d.h(w11);
                String str3 = w11.f3643r;
                if (r0.m(str3)) {
                    i18 = 2;
                } else if (!r0.i(str3)) {
                    if (r0.l(str3)) {
                        i18 = 3;
                    } else {
                        i18 = -2;
                    }
                }
                if (w(i18) > w(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            l1 l1Var = this.d.h;
            int i19 = l1Var.f3415a;
            this.f17075b0 = -1;
            this.f17073a0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.f17073a0[i20] = i20;
            }
            l1[] l1VarArr = new l1[length];
            int i21 = 0;
            while (i21 < length) {
                b2.s w12 = this.L[i21].w();
                e2.d.h(w12);
                String str4 = this.f17072a;
                b2.s sVar2 = this.f17081f;
                if (i21 == i16) {
                    b2.s[] sVarArr = new b2.s[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        b2.s sVar3 = l1Var.d[i22];
                        if (i17 == 1 && sVar2 != null) {
                            sVar3 = sVar3.d(sVar2);
                        }
                        if (i19 == 1) {
                            t10 = w12.d(sVar3);
                        } else {
                            t10 = t(sVar3, w12, true);
                        }
                        sVarArr[i22] = t10;
                    }
                    l1VarArr[i21] = new l1(str4, sVarArr);
                    this.f17075b0 = i21;
                    i10 = 0;
                } else {
                    sVar2 = (i17 == 2 && r0.i(w12.f3643r)) ? null : null;
                    StringBuilder j3 = v.j(str4, ":muxed:");
                    j3.append(i21 < i16 ? i21 : i21 - 1);
                    i10 = 0;
                    l1VarArr[i21] = new l1(j3.toString(), t(sVar2, w12, false));
                }
                i21++;
                i11 = i10;
            }
            int i23 = i11;
            this.Y = m(l1VarArr);
            if (this.Z == null) {
                z10 = 1;
            } else {
                z10 = i23;
            }
            e2.d.g(z10);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.f17076c.M0();
        }
    }

    @Override
    public final void d2(c3.b0 b0Var) {
    }
}
