package o2;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b2.l1;
import b2.p0;
import b2.r0;
import c3.b0;
import c3.h0;
import c5.a0;
import e2.d0;
import e9.i0;
import g2.x;
import hg.k0;
import i2.g0;
import i2.q0;
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
import u2.a1;
import u2.e1;
import u2.p1;
import v7.j0;
import w7.g8;
public final class q implements y2.h, y2.k, e1, c3.q, a1 {
    public static final Set f15614o0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public p1 Y;
    public Set Z;
    public final String f15615a;
    public int[] f15616a0;
    public final int f15617b;
    public int f15618b0;
    public final k2.e f15619c;
    public boolean f15620c0;
    public final i d;
    public boolean[] f15621d0;
    public final y2.d e;
    public boolean[] f15622e0;
    public final b2.s f15623f;
    public long f15624f0;
    public long f15625g0;
    public final n2.m h;
    public boolean f15626h0;
    public boolean f15627i0;
    public boolean f15628j0;
    public boolean f15629k0;
    public long f15630l0;
    public b2.o m0;
    public final n2.j f15631n;
    public j f15632n0;
    public final qb.b f15633r;
    public final y2.m f15634s = new y2.m("Loader:HlsSampleStreamWrapper");
    public final a5.a v;
    public final int f15635w;
    public final androidx.activity.n f15636x;
    public final ArrayList f15637y;

    public q(String str, int i10, k2.e eVar, i iVar, Map map, y2.d dVar, long j3, b2.s sVar, n2.m mVar, n2.j jVar, qb.b bVar, a5.a aVar, int i11) {
        this.f15615a = str;
        this.f15617b = i10;
        this.f15619c = eVar;
        this.d = iVar;
        this.J = map;
        this.e = dVar;
        this.f15623f = sVar;
        this.h = mVar;
        this.f15631n = jVar;
        this.f15633r = bVar;
        this.v = aVar;
        this.f15635w = i11;
        androidx.activity.n nVar = new androidx.activity.n();
        nVar.f1908c = null;
        nVar.f1907b = false;
        nVar.d = null;
        this.f15636x = nVar;
        this.M = new int[0];
        Set set = f15614o0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f15622e0 = new boolean[0];
        this.f15621d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f15637y = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f15608b;

            {
                this.f15608b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15608b.B();
                        return;
                    default:
                        q qVar = this.f15608b;
                        qVar.S = true;
                        qVar.B();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f15608b;

            {
                this.f15608b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15608b.B();
                        return;
                    default:
                        q qVar = this.f15608b;
                        qVar.S = true;
                        qVar.B();
                        return;
                }
            }
        };
        this.H = d0.o(null);
        this.f15624f0 = j3;
        this.f15625g0 = j3;
    }

    public static c3.n j(int i10, int i11) {
        e2.a.n("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static b2.s w(b2.s sVar, b2.s sVar2, boolean z10) {
        String b10;
        int i10;
        int i11;
        if (sVar == null) {
            return sVar2;
        }
        String str = sVar.f3301k;
        String str2 = sVar2.f3308r;
        int h = r0.h(str2);
        if (d0.u(h, str) == 1) {
            b10 = d0.v(h, str);
            str2 = r0.d(b10);
        } else {
            b10 = r0.b(str, str2);
        }
        sVar2.f3303m = sVar.f3303m;
        sVar2.f3304n = sVar.f3304n;
        sVar2.f3305o = sVar.f3305o;
        sVar2.f3306p = sVar.f3306p;
        b2.r a2 = sVar2.a();
        a2.f3239a = sVar.f3294a;
        a2.f3240b = sVar.f3295b;
        a2.f3241c = i0.v(sVar.f3296c);
        a2.d = sVar.d;
        a2.e = sVar.e;
        a2.f3242f = sVar.f3297f;
        if (z10) {
            i10 = sVar.h;
        } else {
            i10 = -1;
        }
        a2.h = i10;
        if (z10) {
            i11 = sVar.f3299i;
        } else {
            i11 = -1;
        }
        a2.f3244i = i11;
        a2.f3245j = b10;
        a2.f3250o = sVar.f3305o;
        a2.f3248m = sVar.f3304n;
        a2.f3247l = sVar.f3303m;
        a2.f3249n = sVar.f3306p;
        if (h == 2) {
            a2.f3258x = sVar.f3314y;
            a2.f3259y = sVar.f3315z;
            a2.B = sVar.C;
        }
        if (str2 != null) {
            a2.f3252q = r0.n(str2);
        }
        int i12 = sVar.J;
        if (i12 != -1 && h == 1) {
            a2.I = i12;
        }
        p0 p0Var = sVar.f3302l;
        if (p0Var != null) {
            p0 p0Var2 = sVar2.f3302l;
            if (p0Var2 != null) {
                p0Var = p0Var2.b(p0Var);
            }
            a2.f3246k = p0Var;
        }
        return new b2.s(a2);
    }

    public static int z(int i10) {
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

    public final boolean A() {
        if (this.f15625g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void B() {
        boolean z10;
        b2.s w10;
        if (!this.X && this.f15616a0 == null && this.S) {
            int i10 = 0;
            for (p pVar : this.L) {
                if (pVar.w() == null) {
                    return;
                }
            }
            p1 p1Var = this.Y;
            if (p1Var != null) {
                int i11 = p1Var.f43786a;
                int[] iArr = new int[i11];
                this.f15616a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i13 < pVarArr.length) {
                            b2.s w11 = pVarArr[i13].w();
                            e2.d.h(w11);
                            b2.s sVar = this.Y.a(i12).d[0];
                            String str = w11.f3308r;
                            String str2 = sVar.f3308r;
                            int h = r0.h(str);
                            if (h != 3) {
                                if (h == r0.h(str2)) {
                                    break;
                                }
                                i13++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || w11.O == sVar.O) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    this.f15616a0[i12] = i13;
                }
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((m) obj).b();
                }
                return;
            }
            int length = this.L.length;
            int i14 = 0;
            int i15 = -2;
            int i16 = -1;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                b2.s w12 = this.L[i14].w();
                e2.d.h(w12);
                String str3 = w12.f3308r;
                if (r0.m(str3)) {
                    i17 = 2;
                } else if (!r0.i(str3)) {
                    if (r0.l(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (z(i17) > z(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            l1 l1Var = this.d.h;
            int i18 = l1Var.f3090a;
            this.f15618b0 = -1;
            this.f15616a0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f15616a0[i19] = i19;
            }
            l1[] l1VarArr = new l1[length];
            for (int i20 = 0; i20 < length; i20++) {
                b2.s w13 = this.L[i20].w();
                e2.d.h(w13);
                String str4 = this.f15615a;
                b2.s sVar2 = this.f15623f;
                if (i20 == i16) {
                    b2.s[] sVarArr = new b2.s[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        b2.s sVar3 = l1Var.d[i21];
                        if (i15 == 1 && sVar2 != null) {
                            sVar3 = sVar3.d(sVar2);
                        }
                        if (i18 == 1) {
                            w10 = w13.d(sVar3);
                        } else {
                            w10 = w(sVar3, w13, true);
                        }
                        sVarArr[i21] = w10;
                    }
                    l1VarArr[i20] = new l1(str4, sVarArr);
                    this.f15618b0 = i20;
                } else {
                    sVar2 = (i15 == 2 && r0.i(w13.f3308r)) ? null : null;
                    StringBuilder h10 = j0.h(str4, ":muxed:");
                    h10.append(i20 < i16 ? i20 : i20 - 1);
                    l1VarArr[i20] = new l1(h10.toString(), w(sVar2, w13, false));
                }
            }
            this.Y = l(l1VarArr);
            if (this.Z == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.f15619c.H();
        }
    }

    public final void C() {
        this.f15634s.a();
        i iVar = this.d;
        u2.b bVar = iVar.f15571n;
        if (bVar == null) {
            Uri uri = iVar.f15572o;
            if (uri != null && uri.equals(iVar.f15573p)) {
                p2.c cVar = iVar.f15565g;
                p2.b bVar2 = (p2.b) cVar.d.get(iVar.f15572o);
                bVar2.f40715b.a();
                IOException iOException = bVar2.f40720s;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void D(l1[] l1VarArr, int... iArr) {
        this.Y = l(l1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.f15618b0 = 0;
        this.H.post(new g0(this.f15619c, 16));
        this.T = true;
    }

    public final void E() {
        for (p pVar : this.L) {
            pVar.D(this.f15626h0);
        }
        this.f15626h0 = false;
    }

    public final boolean F(long j3, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean G;
        this.f15624f0 = j3;
        if (A()) {
            this.f15625g0 = j3;
            return true;
        }
        boolean z13 = this.d.f15574q;
        ArrayList arrayList = this.f15637y;
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
                if (!G && (this.f15622e0[i11] || !this.f15620c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f15625g0 = j3;
        this.f15628j0 = false;
        arrayList.clear();
        y2.m mVar = this.f15634s;
        if (mVar.d()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.k();
                }
            }
            mVar.b();
            return true;
        }
        mVar.f46620c = null;
        E();
        return true;
    }

    @Override
    public final void S(y2.j jVar, long j3, long j10, boolean z10) {
        v2.e eVar = (v2.e) jVar;
        this.K = null;
        long j11 = eVar.f44162a;
        Uri uri = eVar.f44167r.f9352c;
        u2.t tVar = new u2.t(j10);
        this.f15633r.getClass();
        this.v.o(tVar, eVar.f44164c, this.f15617b, eVar.d, eVar.e, eVar.f44165f, eVar.h, eVar.f44166n);
        if (!z10) {
            if (A() || this.U == 0) {
                E();
            }
            if (this.U > 0) {
                this.f15619c.l(this);
            }
        }
    }

    @Override
    public final h0 Z1(int i10, int i11) {
        j jVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f15614o0;
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
            if (this.f15629k0) {
                return j(i10, i11);
            }
            int length = this.L.length;
            z10 = (i11 == 1 || i11 == 2) ? true : true;
            r52 = new p(this.e, this.h, this.f15631n, this.J);
            r52.f43653t = this.f15624f0;
            if (z10) {
                r52.I = this.m0;
                r52.f43658z = true;
            }
            long j3 = this.f15630l0;
            if (r52.F != j3) {
                r52.F = j3;
                r52.f43658z = true;
            }
            if (this.f15632n0 != null) {
                r52.C = jVar.v;
            }
            r52.f43640f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = d0.f7887a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f15622e0, i14);
            this.f15622e0 = copyOf3;
            copyOf3[length] = z10;
            this.f15620c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (z(i11) > z(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.f15621d0 = Arrays.copyOf(this.f15621d0, i14);
        }
        if (i11 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f15635w);
            }
            return this.P;
        }
        return r52;
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
                gVar.a(pVar.e);
                pVar.h = null;
                pVar.f43641g = null;
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f15634s.d();
    }

    @Override
    public final long d() {
        if (A()) {
            return this.f15625g0;
        }
        if (this.f15628j0) {
            return Long.MIN_VALUE;
        }
        return y().f44166n;
    }

    public final void e() {
        e2.d.g(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean f(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.f15637y;
            if (i11 < arrayList.size()) {
                if (((j) arrayList.get(i11)).f15579b0) {
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
    public final void f1() {
        this.f15629k0 = true;
        this.H.post(this.G);
    }

    public final p1 l(l1[] l1VarArr) {
        for (int i10 = 0; i10 < l1VarArr.length; i10++) {
            l1 l1Var = l1VarArr[i10];
            b2.s[] sVarArr = new b2.s[l1Var.f3090a];
            for (int i11 = 0; i11 < l1Var.f3090a; i11++) {
                b2.s sVar = l1Var.d[i11];
                int M0 = this.h.M0(sVar);
                b2.r a2 = sVar.a();
                a2.R = M0;
                sVarArr[i11] = new b2.s(a2);
            }
            l1VarArr[i10] = new l1(l1Var.f3091b, sVarArr);
        }
        return new p1(l1VarArr);
    }

    @Override
    public final k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        k4.d dVar;
        int i11;
        v2.e eVar = (v2.e) jVar;
        boolean z11 = eVar instanceof j;
        if (z11 && !((j) eVar).g() && (iOException instanceof x) && ((i11 = ((x) iOException).d) == 410 || i11 == 404)) {
            return y2.m.d;
        }
        long j11 = eVar.f44167r.f9351b;
        Uri uri = eVar.f44167r.f9352c;
        u2.t tVar = new u2.t(j10);
        d0.e0(eVar.h);
        d0.e0(eVar.f44166n);
        a0 a0Var = new a0(iOException, i10, 11);
        i iVar = this.d;
        y2.g a2 = g8.a(iVar.f15575r);
        this.f15633r.getClass();
        k4.d K3 = qb.b.K3(a2, a0Var);
        boolean z12 = false;
        if (K3 != null && K3.f13434a == 2) {
            long j12 = K3.f13435b;
            x2.s sVar = iVar.f15575r;
            z10 = sVar.o(sVar.u(iVar.h.a(eVar.d)), j12);
        } else {
            z10 = false;
        }
        if (z10) {
            if (z11 && j11 == 0) {
                ArrayList arrayList = this.f15637y;
                if (((j) k0.x(1, arrayList)) == eVar) {
                    z12 = true;
                }
                e2.d.g(z12);
                if (arrayList.isEmpty()) {
                    this.f15625g0 = this.f15624f0;
                } else {
                    ((j) e9.q.l(arrayList)).Z = true;
                }
            }
            dVar = y2.m.e;
        } else {
            long M3 = qb.b.M3(a0Var);
            if (M3 != -9223372036854775807L) {
                dVar = new k4.d(0, M3, false);
            } else {
                dVar = y2.m.f46617f;
            }
        }
        k4.d dVar2 = dVar;
        boolean a10 = dVar2.a();
        this.v.q(tVar, eVar.f44164c, this.f15617b, eVar.d, eVar.e, eVar.f44165f, eVar.h, eVar.f44166n, iOException, !a10);
        if (!a10) {
            this.K = null;
        }
        if (z10) {
            if (!this.T) {
                q0 q0Var = new q0();
                q0Var.f10864a = this.f15624f0;
                q(new i2.r0(q0Var));
                return dVar2;
            }
            this.f15619c.l(this);
        }
        return dVar2;
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        v2.e eVar = (v2.e) jVar;
        if (i10 == 0) {
            long j11 = eVar.f44162a;
            tVar = new u2.t(eVar.f44163b);
        } else {
            long j12 = eVar.f44162a;
            Uri uri = eVar.f44167r.f9352c;
            tVar = new u2.t(j10);
        }
        u2.t tVar2 = tVar;
        this.v.s(tVar2, eVar.f44164c, this.f15617b, eVar.d, eVar.e, eVar.f44165f, eVar.h, eVar.f44166n, i10);
    }

    @Override
    public final void p(y2.j jVar, long j3, long j10) {
        v2.e eVar = (v2.e) jVar;
        this.K = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f15555s;
            i iVar = this.d;
            iVar.f15570m = bArr;
            o0.b bVar = iVar.f15567j;
            Uri uri = eVar2.f44163b.f9380a;
            byte[] bArr2 = eVar2.f15556w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) bVar.f15487b).put(uri, bArr2);
        }
        long j11 = eVar.f44162a;
        Uri uri2 = eVar.f44167r.f9352c;
        u2.t tVar = new u2.t(j10);
        this.f15633r.getClass();
        this.v.p(tVar, eVar.f44164c, this.f15617b, eVar.d, eVar.e, eVar.f44165f, eVar.h, eVar.f44166n);
        if (!this.T) {
            q0 q0Var = new q0();
            q0Var.f10864a = this.f15624f0;
            q(new i2.r0(q0Var));
            return;
        }
        this.f15619c.l(this);
    }

    @Override
    public final boolean q(i2.r0 r73) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.q(i2.r0):boolean");
    }

    @Override
    public final long t() {
        if (this.f15628j0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f15625g0;
        }
        long j3 = this.f15624f0;
        j y3 = y();
        if (!y3.X) {
            ArrayList arrayList = this.f15637y;
            if (arrayList.size() > 1) {
                y3 = (j) k0.g(2, arrayList);
            } else {
                y3 = null;
            }
        }
        if (y3 != null) {
            j3 = Math.max(j3, y3.f44166n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j3 = Math.max(j3, pVar.q());
            }
        }
        return j3;
    }

    @Override
    public final void v(long j3) {
        int size;
        boolean d;
        y2.m mVar = this.f15634s;
        if (!mVar.c() && !A()) {
            boolean d10 = mVar.d();
            i iVar = this.d;
            List list = this.E;
            if (d10) {
                this.K.getClass();
                v2.e eVar = this.K;
                if (iVar.f15571n != null) {
                    d = false;
                } else {
                    d = iVar.f15575r.d(j3, eVar, list);
                }
                if (d) {
                    mVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.b((j) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                x(size2);
            }
            if (iVar.f15571n == null && iVar.f15575r.length() >= 2) {
                size = iVar.f15575r.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < this.f15637y.size()) {
                x(size);
            }
        }
    }

    public final void x(int i10) {
        ArrayList arrayList;
        e2.d.g(!this.f15634s.d());
        while (true) {
            arrayList = this.f15637y;
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
        long j3 = y().f44166n;
        j jVar = (j) arrayList.get(i10);
        d0.V(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].n(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f15625g0 = this.f15624f0;
        } else {
            ((j) e9.q.l(arrayList)).Z = true;
        }
        this.f15628j0 = false;
        this.v.y(this.Q, jVar.h, j3);
    }

    public final j y() {
        return (j) k0.g(1, this.f15637y);
    }

    @Override
    public final void X1(b0 b0Var) {
    }
}
