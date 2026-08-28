package o4;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import d5.f0;
import f7.g0;
import h3.s0;
import h3.t0;
import j$.util.DesugarCollections;
import j3.r0;
import j4.d1;
import j4.h0;
import j4.i1;
import j4.j1;
import j4.y;
import j4.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m3.w;
import mh.m2;
import n5.a0;
public final class r implements l0, o0, d1, m3.m, z0 {
    public static final Set f18913k0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final List A;
    public final o B;
    public final o C;
    public final Handler D;
    public final ArrayList E;
    public final Map F;
    public l4.e G;
    public q[] H;
    public int[] I;
    public final HashSet J;
    public final SparseIntArray K;
    public p L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public int Q;
    public t0 R;
    public t0 S;
    public boolean T;
    public j1 U;
    public Set V;
    public int[] W;
    public int X;
    public boolean Y;
    public boolean[] Z;
    public final String f18914a;
    public boolean[] f18915a0;
    public final int f18916b;
    public long f18917b0;
    public final a0 f18918c;
    public long f18919c0;
    public final i d;
    public boolean f18920d0;
    public final com.google.android.exoplayer2.upstream.r f18921e;
    public boolean f18922e0;
    public final t0 f18923f;
    public boolean f18924f0;
    public boolean f18925g0;
    public final l3.i h;
    public long f18926h0;
    public l3.c f18927i0;
    public k f18928j0;
    public final a6.a f18929n;
    public final v9.d f18930r;
    public final q0 f18931s = new q0("Loader:HlsSampleStreamWrapper");
    public final h0 v;
    public final int f18932w;
    public final androidx.activity.o f18933x;
    public final ArrayList f18934y;

    public r(String str, int i9, a0 a0Var, i iVar, Map map, com.google.android.exoplayer2.upstream.r rVar, long j10, t0 t0Var, l3.i iVar2, a6.a aVar, v9.d dVar, h0 h0Var, int i10) {
        this.f18914a = str;
        this.f18916b = i9;
        this.f18918c = a0Var;
        this.d = iVar;
        this.F = map;
        this.f18921e = rVar;
        this.f18923f = t0Var;
        this.h = iVar2;
        this.f18929n = aVar;
        this.f18930r = dVar;
        this.v = h0Var;
        this.f18932w = i10;
        ?? obj = new Object();
        obj.f388b = null;
        obj.f387a = false;
        obj.f389c = null;
        this.f18933x = obj;
        this.I = new int[0];
        Set set = f18913k0;
        this.J = new HashSet(set.size());
        this.K = new SparseIntArray(set.size());
        this.H = new q[0];
        this.f18915a0 = new boolean[0];
        this.Z = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f18934y = arrayList;
        this.A = DesugarCollections.unmodifiableList(arrayList);
        this.E = new ArrayList();
        this.B = new Runnable(this) {
            public final r f18906b;

            {
                this.f18906b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f18906b.C();
                        return;
                    default:
                        r rVar2 = this.f18906b;
                        rVar2.O = true;
                        rVar2.C();
                        return;
                }
            }
        };
        this.C = new Runnable(this) {
            public final r f18906b;

            {
                this.f18906b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f18906b.C();
                        return;
                    default:
                        r rVar2 = this.f18906b;
                        rVar2.O = true;
                        rVar2.C();
                        return;
                }
            }
        };
        this.D = f0.k(null);
        this.f18917b0 = j10;
        this.f18919c0 = j10;
    }

    public static m3.j j(int i9, int i10) {
        d5.a.K("HlsSampleStreamWrapper", "Unmapped track with id " + i9 + " of type " + i10);
        return new m3.j();
    }

    public static t0 p(t0 t0Var, t0 t0Var2, boolean z10) {
        String a2;
        int i9;
        int i10;
        if (t0Var == null) {
            return t0Var2;
        }
        String str = t0Var.f9766r;
        String str2 = t0Var2.B;
        int g10 = d5.q.g(str2);
        if (f0.n(g10, str) == 1) {
            a2 = f0.o(g10, str);
            str2 = d5.q.c(a2);
        } else {
            a2 = d5.q.a(str, str2);
        }
        t0Var2.v = t0Var.v;
        t0Var2.f9768w = t0Var.f9768w;
        t0Var2.f9769x = t0Var.f9769x;
        t0Var2.f9770y = t0Var.f9770y;
        s0 a3 = t0Var2.a();
        a3.f9693a = t0Var.f9760a;
        a3.f9694b = t0Var.f9761b;
        a3.f9695c = t0Var.f9762c;
        a3.d = t0Var.d;
        a3.f9696e = t0Var.f9763e;
        if (z10) {
            i9 = t0Var.f9764f;
        } else {
            i9 = -1;
        }
        a3.f9697f = i9;
        if (z10) {
            i10 = t0Var.h;
        } else {
            i10 = -1;
        }
        a3.f9698g = i10;
        a3.h = a2;
        a3.f9703m = t0Var.f9769x;
        a3.f9701k = t0Var.f9768w;
        a3.f9700j = t0Var.v;
        a3.f9702l = t0Var.f9770y;
        if (g10 == 2) {
            a3.f9710t = t0Var.G;
            a3.f9711u = t0Var.H;
            a3.v = t0Var.I;
        }
        if (str2 != null) {
            a3.f9705o = str2;
        }
        int i11 = t0Var.O;
        if (i11 != -1 && g10 == 1) {
            a3.B = i11;
        }
        z3.c cVar = t0Var.f9767s;
        if (cVar != null) {
            z3.c cVar2 = t0Var2.f9767s;
            if (cVar2 != null) {
                cVar = cVar2.a(cVar);
            }
            a3.f9699i = cVar;
        }
        return new t0(a3);
    }

    public static int t(int i9) {
        if (i9 == 1) {
            return 2;
        }
        if (i9 == 2) {
            return 3;
        }
        if (i9 == 3) {
            return 1;
        }
        return 0;
    }

    public final boolean A() {
        if (this.f18919c0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void B() {
        this.f18925g0 = true;
        this.D.post(this.C);
    }

    public final void C() {
        boolean z10;
        t0 p6;
        if (!this.T && this.W == null && this.O) {
            int i9 = 0;
            for (q qVar : this.H) {
                if (qVar.t() == null) {
                    return;
                }
            }
            j1 j1Var = this.U;
            if (j1Var != null) {
                int i10 = j1Var.f13491a;
                int[] iArr = new int[i10];
                this.W = iArr;
                Arrays.fill(iArr, -1);
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = 0;
                    while (true) {
                        q[] qVarArr = this.H;
                        if (i12 < qVarArr.length) {
                            t0 t10 = qVarArr[i12].t();
                            d5.a.j(t10);
                            t0 t0Var = this.U.a(i11).d[0];
                            String str = t10.B;
                            String str2 = t0Var.B;
                            int g10 = d5.q.g(str);
                            if (g10 != 3) {
                                if (g10 == d5.q.g(str2)) {
                                    break;
                                }
                                i12++;
                            } else {
                                if (!f0.a(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || t10.T == t0Var.T) {
                                    break;
                                }
                                i12++;
                            }
                        }
                    }
                    this.W[i11] = i12;
                }
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((n) obj).b();
                }
                return;
            }
            int length = this.H.length;
            int i13 = 0;
            int i14 = -2;
            int i15 = -1;
            while (true) {
                int i16 = 1;
                if (i13 >= length) {
                    break;
                }
                t0 t11 = this.H[i13].t();
                d5.a.j(t11);
                String str3 = t11.B;
                if (d5.q.j(str3)) {
                    i16 = 2;
                } else if (!d5.q.h(str3)) {
                    if (d5.q.i(str3)) {
                        i16 = 3;
                    } else {
                        i16 = -2;
                    }
                }
                if (t(i16) > t(i14)) {
                    i15 = i13;
                    i14 = i16;
                } else if (i16 == i14 && i15 != -1) {
                    i15 = -1;
                }
                i13++;
            }
            i1 i1Var = this.d.h;
            int i17 = i1Var.f13481a;
            this.X = -1;
            this.W = new int[length];
            for (int i18 = 0; i18 < length; i18++) {
                this.W[i18] = i18;
            }
            i1[] i1VarArr = new i1[length];
            for (int i19 = 0; i19 < length; i19++) {
                t0 t12 = this.H[i19].t();
                d5.a.j(t12);
                String str4 = this.f18914a;
                t0 t0Var2 = this.f18923f;
                if (i19 == i15) {
                    t0[] t0VarArr = new t0[i17];
                    for (int i20 = 0; i20 < i17; i20++) {
                        t0 t0Var3 = i1Var.d[i20];
                        if (i14 == 1 && t0Var2 != null) {
                            t0Var3 = t0Var3.c(t0Var2);
                        }
                        if (i17 == 1) {
                            p6 = t12.c(t0Var3);
                        } else {
                            p6 = p(t0Var3, t12, true);
                        }
                        t0VarArr[i20] = p6;
                    }
                    i1VarArr[i19] = new i1(str4, t0VarArr);
                    this.X = i19;
                } else {
                    t0Var2 = (i14 == 2 && d5.q.h(t12.B)) ? null : null;
                    StringBuilder e10 = ta.b.e(str4, ":muxed:");
                    e10.append(i19 < i15 ? i19 : i19 - 1);
                    i1VarArr[i19] = new i1(e10.toString(), p(t0Var2, t12, false));
                }
            }
            this.U = l(i1VarArr);
            if (this.V == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            d5.a.i(z10);
            this.V = Collections.EMPTY_SET;
            this.P = true;
            this.f18918c.g();
        }
    }

    public final void D() {
        this.f18931s.a();
        i iVar = this.d;
        j4.b bVar = iVar.f18869n;
        if (bVar == null) {
            Uri uri = iVar.f18870o;
            if (uri != null && iVar.f18874s) {
                p4.b bVar2 = (p4.b) iVar.f18863g.d.get(uri);
                bVar2.f45356b.a();
                IOException iOException = bVar2.f45362s;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void E(i1[] i1VarArr, int... iArr) {
        this.U = l(i1VarArr);
        this.V = new HashSet();
        for (int i9 : iArr) {
            this.V.add(this.U.a(i9));
        }
        this.X = 0;
        this.D.post(new m2(this.f18918c, 2));
        this.P = true;
    }

    public final void F() {
        for (q qVar : this.H) {
            qVar.A(this.f18920d0);
        }
        this.f18920d0 = false;
    }

    public final boolean G(long j10, boolean z10) {
        this.f18917b0 = j10;
        if (A()) {
            this.f18919c0 = j10;
            return true;
        }
        if (this.O && !z10) {
            int length = this.H.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (this.H[i9].D(j10, false) || (!this.f18915a0[i9] && this.Y)) {
                }
            }
            return false;
        }
        this.f18919c0 = j10;
        this.f18924f0 = false;
        this.f18934y.clear();
        q0 q0Var = this.f18931s;
        if (q0Var.d()) {
            if (this.O) {
                for (q qVar : this.H) {
                    qVar.i();
                }
            }
            q0Var.b();
            return true;
        }
        q0Var.f2595c = null;
        F();
        return true;
    }

    @Override
    public final w I(int i9, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        Set set = f18913k0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.J;
        SparseIntArray sparseIntArray = this.K;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            d5.a.f(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.I[i11] = i9;
                }
                r52 = this.I[i11] == i9 ? this.H[i11] : j(i9, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.H;
                if (i12 >= r12.length) {
                    break;
                } else if (this.I[i12] == i9) {
                    r52 = r12[i12];
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (r52 == 0) {
            if (this.f18925g0) {
                return j(i9, i10);
            }
            int length = this.H.length;
            z10 = (i10 == 1 || i10 == 2) ? true : true;
            r52 = new q(this.f18921e, this.h, this.f18929n, this.F);
            r52.f13420t = this.f18917b0;
            if (z10) {
                r52.I = this.f18927i0;
                r52.f13425z = true;
            }
            long j10 = this.f18926h0;
            if (r52.F != j10) {
                r52.F = j10;
                r52.f13425z = true;
            }
            k kVar = this.f18928j0;
            if (kVar != null) {
                r52.C = kVar.v;
            }
            r52.f13407f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.I, i13);
            this.I = copyOf;
            copyOf[length] = i9;
            q[] qVarArr = this.H;
            int i14 = f0.f4349a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r52;
            this.H = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f18915a0, i13);
            this.f18915a0 = copyOf3;
            copyOf3[length] = z10;
            this.Y |= z10;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (t(i10) > t(this.M)) {
                this.N = length;
                this.M = i10;
            }
            this.Z = Arrays.copyOf(this.Z, i13);
        }
        if (i10 == 5) {
            if (this.L == null) {
                this.L = new p(r52, this.f18932w);
            }
            return this.L;
        }
        return r52;
    }

    @Override
    public final void a() {
        this.D.post(this.B);
    }

    @Override
    public final boolean b() {
        return this.f18931s.d();
    }

    @Override
    public final void c() {
        q[] qVarArr;
        for (q qVar : this.H) {
            qVar.A(true);
            l3.e eVar = qVar.h;
            if (eVar != null) {
                eVar.k(qVar.f13406e);
                qVar.h = null;
                qVar.f13408g = null;
            }
        }
    }

    @Override
    public final long d() {
        if (A()) {
            return this.f18919c0;
        }
        if (this.f18924f0) {
            return Long.MIN_VALUE;
        }
        return s().f16665n;
    }

    @Override
    public final void e(n0 n0Var, long j10, long j11, boolean z10) {
        l4.e eVar = (l4.e) n0Var;
        this.G = null;
        long j12 = eVar.f16660a;
        Uri uri = eVar.f16666r.f2653c;
        ?? obj = new Object();
        this.f18930r.getClass();
        this.v.d(obj, eVar.f16662c, this.f18916b, eVar.d, eVar.f16663e, eVar.f16664f, eVar.h, eVar.f16665n);
        if (!z10) {
            if (A() || this.Q == 0) {
                F();
            }
            if (this.Q > 0) {
                this.f18918c.c(this);
            }
        }
    }

    public final void f() {
        d5.a.i(this.P);
        this.U.getClass();
        this.V.getClass();
    }

    @Override
    public final k0 h(n0 n0Var, IOException iOException, int i9) {
        boolean z10;
        k0 k0Var;
        int i10;
        l4.e eVar = (l4.e) n0Var;
        boolean z11 = eVar instanceof k;
        if (z11 && !((k) eVar).W && (iOException instanceof com.google.android.exoplayer2.upstream.h0) && ((i10 = ((com.google.android.exoplayer2.upstream.h0) iOException).d) == 410 || i10 == 404)) {
            return q0.d;
        }
        long j10 = eVar.f16666r.f2652b;
        Uri uri = eVar.f16666r.f2653c;
        ?? obj = new Object();
        f0.S(eVar.h);
        f0.S(eVar.f16665n);
        n2.w wVar = new n2.w(iOException, i9, 1);
        i iVar = this.d;
        j0 a2 = g0.a(iVar.f18872q);
        this.f18930r.getClass();
        k0 k32 = v9.d.k3(a2, wVar);
        boolean z12 = false;
        if (k32 != null && k32.f2562a == 2) {
            long j11 = k32.f2563b;
            b5.t tVar = iVar.f18872q;
            z10 = tVar.e(tVar.u(iVar.h.a(eVar.d)), j11);
        } else {
            z10 = false;
        }
        if (z10) {
            if (z11 && j10 == 0) {
                ArrayList arrayList = this.f18934y;
                if (((k) e2.c.k(1, arrayList)) == eVar) {
                    z12 = true;
                }
                d5.a.i(z12);
                if (arrayList.isEmpty()) {
                    this.f18919c0 = this.f18917b0;
                } else {
                    ((k) o8.l.g(arrayList)).V = true;
                }
            }
            k0Var = q0.f2591e;
        } else {
            long m32 = v9.d.m3(wVar);
            if (m32 != -9223372036854775807L) {
                k0Var = new k0(0, m32, false);
            } else {
                k0Var = q0.f2592f;
            }
        }
        k0 k0Var2 = k0Var;
        boolean a3 = k0Var2.a();
        this.v.h(obj, eVar.f16662c, this.f18916b, eVar.d, eVar.f16663e, eVar.f16664f, eVar.h, eVar.f16665n, iOException, !a3);
        if (!a3) {
            this.G = null;
        }
        if (z10) {
            if (!this.P) {
                n(this.f18917b0);
                return k0Var2;
            }
            this.f18918c.c(this);
        }
        return k0Var2;
    }

    public final j1 l(i1[] i1VarArr) {
        for (int i9 = 0; i9 < i1VarArr.length; i9++) {
            i1 i1Var = i1VarArr[i9];
            t0[] t0VarArr = new t0[i1Var.f13481a];
            for (int i10 = 0; i10 < i1Var.f13481a; i10++) {
                t0 t0Var = i1Var.d[i10];
                int G = this.h.G(t0Var);
                s0 a2 = t0Var.a();
                a2.J = G;
                t0VarArr[i10] = new t0(a2);
            }
            i1VarArr[i9] = new i1(i1Var.f13482b, t0VarArr);
        }
        return new j1(i1VarArr);
    }

    @Override
    public final void m(n0 n0Var, long j10, long j11) {
        l4.e eVar = (l4.e) n0Var;
        this.G = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f18851s;
            i iVar = this.d;
            iVar.f18868m = bArr;
            n2.p pVar = iVar.f18865j;
            Uri uri = eVar2.f16661b.f2585a;
            byte[] bArr2 = eVar2.f18852w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) pVar.f18343b).put(uri, bArr2);
        }
        long j12 = eVar.f16660a;
        Uri uri2 = eVar.f16666r.f2653c;
        ?? obj = new Object();
        this.f18930r.getClass();
        this.v.f(obj, eVar.f16662c, this.f18916b, eVar.d, eVar.f16663e, eVar.f16664f, eVar.h, eVar.f16665n);
        if (!this.P) {
            n(this.f18917b0);
        } else {
            this.f18918c.c(this);
        }
    }

    @Override
    public final boolean n(long r69) {
        throw new UnsupportedOperationException("Method not decompiled: o4.r.n(long):boolean");
    }

    public final void r(int i9) {
        ArrayList arrayList;
        d5.a.i(!this.f18931s.d());
        int i10 = i9;
        loop0: while (true) {
            arrayList = this.f18934y;
            if (i10 < arrayList.size()) {
                int i11 = i10;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((k) arrayList.get(i11)).f18878y) {
                            break;
                        }
                        i11++;
                    } else {
                        k kVar = (k) arrayList.get(i10);
                        for (int i12 = 0; i12 < this.H.length; i12++) {
                            if (this.H[i12].q() > kVar.f(i12)) {
                                break;
                            }
                        }
                        break loop0;
                    }
                }
            } else {
                i10 = -1;
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return;
        }
        long j10 = s().f16665n;
        k kVar2 = (k) arrayList.get(i10);
        f0.N(i10, arrayList.size(), arrayList);
        for (int i13 = 0; i13 < this.H.length; i13++) {
            this.H[i13].k(kVar2.f(i13));
        }
        if (arrayList.isEmpty()) {
            this.f18919c0 = this.f18917b0;
        } else {
            ((k) o8.l.g(arrayList)).V = true;
        }
        this.f18924f0 = false;
        int i14 = this.M;
        long j11 = kVar2.h;
        h0 h0Var = this.v;
        h0Var.m(new y(1, i14, null, 3, null, h0Var.a(j11), h0Var.a(j10)));
    }

    public final k s() {
        return (k) r0.j(1, this.f18934y);
    }

    @Override
    public final long v() {
        if (this.f18924f0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f18919c0;
        }
        long j10 = this.f18917b0;
        k s10 = s();
        if (!s10.T) {
            ArrayList arrayList = this.f18934y;
            if (arrayList.size() > 1) {
                s10 = (k) r0.j(2, arrayList);
            } else {
                s10 = null;
            }
        }
        if (s10 != null) {
            j10 = Math.max(j10, s10.f16665n);
        }
        if (this.O) {
            for (q qVar : this.H) {
                j10 = Math.max(j10, qVar.n());
            }
        }
        return j10;
    }

    @Override
    public final void z(long j10) {
        int size;
        boolean c10;
        q0 q0Var = this.f18931s;
        if (!q0Var.c() && !A()) {
            boolean d = q0Var.d();
            i iVar = this.d;
            List list = this.A;
            if (d) {
                this.G.getClass();
                l4.e eVar = this.G;
                if (iVar.f18869n != null) {
                    c10 = false;
                } else {
                    c10 = iVar.f18872q.c(j10, eVar, list);
                }
                if (c10) {
                    q0Var.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.b((k) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                r(size2);
            }
            if (iVar.f18869n == null && iVar.f18872q.length() >= 2) {
                size = iVar.f18872q.k(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.f18934y.size()) {
                r(size);
            }
        }
    }

    @Override
    public final void y(m3.t tVar) {
    }
}
