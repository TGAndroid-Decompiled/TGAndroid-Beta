package o4;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import d5.f0;
import d5.z;
import g7.e0;
import h3.s0;
import h3.t0;
import j$.util.DesugarCollections;
import j4.d1;
import j4.g0;
import j4.i1;
import j4.j1;
import j4.x;
import j4.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m3.w;
import n2.b0;

public final class r implements l0, o0, d1, m3.m, z0 {

    public static final Set f19260k0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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

    public final String f19261a;

    public boolean[] f19262a0;

    public final int f19263b;

    public long f19264b0;

    public final o0.b f19265c;

    public long f19266c0;
    public final i d;

    public boolean f19267d0;

    public final com.google.android.exoplayer2.upstream.r f19268e;

    public boolean f19269e0;

    public final t0 f19270f;

    public boolean f19271f0;

    public boolean f19272g0;
    public final l3.j h;

    public long f19273h0;

    public l3.d f19274i0;

    public k f19275j0;

    public final b6.a f19276n;

    public final ab.a f19277r;

    public final q0 f19278s = new q0("Loader:HlsSampleStreamWrapper");
    public final g0 v;

    public final int f19279w;

    public final androidx.activity.n f19280x;

    public final ArrayList f19281y;

    public r(String str, int i10, o0.b bVar, i iVar, Map map, com.google.android.exoplayer2.upstream.r rVar, long j10, t0 t0Var, l3.j jVar, b6.a aVar, ab.a aVar2, g0 g0Var, int i11) {
        this.f19261a = str;
        this.f19263b = i10;
        this.f19265c = bVar;
        this.d = iVar;
        this.F = map;
        this.f19268e = rVar;
        this.f19270f = t0Var;
        this.h = jVar;
        this.f19276n = aVar;
        this.f19277r = aVar2;
        this.v = g0Var;
        this.f19279w = i11;
        androidx.activity.n nVar = new androidx.activity.n();
        nVar.f894b = null;
        final int i12 = 0;
        nVar.f893a = false;
        nVar.f895c = null;
        this.f19280x = nVar;
        this.I = new int[0];
        Set set = f19260k0;
        this.J = new HashSet(set.size());
        this.K = new SparseIntArray(set.size());
        this.H = new q[0];
        this.f19262a0 = new boolean[0];
        this.Z = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f19281y = arrayList;
        this.A = DesugarCollections.unmodifiableList(arrayList);
        this.E = new ArrayList();
        this.B = new Runnable(this) {

            public final r f19253b;

            {
                this.f19253b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f19253b.u();
                        break;
                    default:
                        r rVar2 = this.f19253b;
                        rVar2.O = true;
                        rVar2.u();
                        break;
                }
            }
        };
        final int i13 = 1;
        this.C = new Runnable(this) {

            public final r f19253b;

            {
                this.f19253b = this;
            }

            @Override
            public final void run() {
                switch (i13) {
                    case 0:
                        this.f19253b.u();
                        break;
                    default:
                        r rVar2 = this.f19253b;
                        rVar2.O = true;
                        rVar2.u();
                        break;
                }
            }
        };
        this.D = d5.g0.k(null);
        this.f19264b0 = j10;
        this.f19266c0 = j10;
    }

    public static m3.j f(int i10, int i11) {
        d5.a.K("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new m3.j();
    }

    public static t0 j(t0 t0Var, t0 t0Var2, boolean z10) {
        String strA;
        if (t0Var == null) {
            return t0Var2;
        }
        String str = t0Var.f8190r;
        String strC = t0Var2.B;
        int iG = d5.q.g(strC);
        if (d5.g0.n(iG, str) == 1) {
            strA = d5.g0.o(iG, str);
            strC = d5.q.c(strA);
        } else {
            strA = d5.q.a(str, strC);
        }
        t0Var2.v = t0Var.v;
        t0Var2.f8192w = t0Var.f8192w;
        t0Var2.f8193x = t0Var.f8193x;
        t0Var2.f8194y = t0Var.f8194y;
        s0 s0VarA = t0Var2.a();
        s0VarA.f8123a = t0Var.f8184a;
        s0VarA.f8124b = t0Var.f8185b;
        s0VarA.f8125c = t0Var.f8186c;
        s0VarA.d = t0Var.d;
        s0VarA.f8126e = t0Var.f8187e;
        s0VarA.f8127f = z10 ? t0Var.f8188f : -1;
        s0VarA.f8128g = z10 ? t0Var.h : -1;
        s0VarA.h = strA;
        s0VarA.f8133m = t0Var.f8193x;
        s0VarA.f8131k = t0Var.f8192w;
        s0VarA.f8130j = t0Var.v;
        s0VarA.f8132l = t0Var.f8194y;
        if (iG == 2) {
            s0VarA.f8140t = t0Var.G;
            s0VarA.f8141u = t0Var.H;
            s0VarA.v = t0Var.I;
        }
        if (strC != null) {
            s0VarA.f8135o = strC;
        }
        int i10 = t0Var.O;
        if (i10 != -1 && iG == 1) {
            s0VarA.B = i10;
        }
        z3.c cVarA = t0Var.f8191s;
        if (cVarA != null) {
            z3.c cVar = t0Var2.f8191s;
            if (cVar != null) {
                cVarA = cVar.a(cVarA);
            }
            s0VarA.f8129i = cVarA;
        }
        return new t0(s0VarA);
    }

    public static int s(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override
    public final void A() {
        this.f19272g0 = true;
        this.D.post(this.C);
    }

    @Override
    public final w C(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i11);
        Set set = f19260k0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.J;
        SparseIntArray sparseIntArray = this.K;
        ?? qVar = 0;
        qVar = 0;
        if (zContains) {
            d5.a.f(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.I[i12] = i10;
                }
                qVar = this.I[i12] == i10 ? this.H[i12] : f(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r10 = this.H;
                if (i13 >= r10.length) {
                    break;
                }
                if (this.I[i13] == i10) {
                    qVar = r10[i13];
                    break;
                }
                i13++;
            }
        }
        if (qVar == 0) {
            if (this.f19272g0) {
                return f(i10, i11);
            }
            int length = this.H.length;
            boolean z10 = i11 == 1 || i11 == 2;
            qVar = new q(this.f19268e, this.h, this.f19276n, this.F);
            qVar.f12524t = this.f19264b0;
            if (z10) {
                qVar.I = this.f19274i0;
                qVar.f12529z = true;
            }
            long j10 = this.f19273h0;
            if (qVar.F != j10) {
                qVar.F = j10;
                qVar.f12529z = true;
            }
            k kVar = this.f19275j0;
            if (kVar != null) {
                qVar.C = kVar.v;
            }
            qVar.f12511f = this;
            int i14 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.I, i14);
            this.I = iArrCopyOf;
            iArrCopyOf[length] = i10;
            q[] qVarArr = this.H;
            int i15 = d5.g0.f4795a;
            ?? CopyOf = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            CopyOf[qVarArr.length] = qVar;
            this.H = (q[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f19262a0, i14);
            this.f19262a0 = zArrCopyOf;
            zArrCopyOf[length] = z10;
            this.Y |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (s(i11) > s(this.M)) {
                this.N = length;
                this.M = i11;
            }
            this.Z = Arrays.copyOf(this.Z, i14);
        }
        if (i11 != 5) {
            return qVar;
        }
        if (this.L == null) {
            this.L = new p(qVar, this.f19279w);
        }
        return this.L;
    }

    @Override
    public final long D() {
        if (this.f19271f0) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.f19266c0;
        }
        long jMax = this.f19264b0;
        k kVarR = r();
        if (!kVarR.T) {
            ArrayList arrayList = this.f19281y;
            kVarR = arrayList.size() > 1 ? (k) i0.a.i(2, arrayList) : null;
        }
        if (kVarR != null) {
            jMax = Math.max(jMax, kVarR.f15422n);
        }
        if (this.O) {
            for (q qVar : this.H) {
                jMax = Math.max(jMax, qVar.n());
            }
        }
        return jMax;
    }

    public final boolean G(long j10, boolean z10) {
        this.f19264b0 = j10;
        if (t()) {
            this.f19266c0 = j10;
            return true;
        }
        if (this.O && !z10) {
            int length = this.H.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.H[i10].D(j10, false) || (!this.f19262a0[i10] && this.Y)) {
                }
            }
            return false;
        }
        this.f19266c0 = j10;
        this.f19271f0 = false;
        this.f19281y.clear();
        q0 q0Var = this.f19278s;
        if (!q0Var.d()) {
            q0Var.f3032c = null;
            y();
            return true;
        }
        if (this.O) {
            for (q qVar : this.H) {
                qVar.i();
            }
        }
        q0Var.b();
        return true;
    }

    @Override
    public final void I(long j10) {
        q0 q0Var = this.f19278s;
        if (q0Var.c() || t()) {
            return;
        }
        boolean zD = q0Var.d();
        i iVar = this.d;
        List list = this.A;
        if (zD) {
            this.G.getClass();
            if (iVar.f19216n != null ? false : iVar.f19219q.c(j10, this.G, list)) {
                q0Var.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((k) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            k(size);
        }
        int size2 = (iVar.f19216n != null || iVar.f19219q.length() < 2) ? list.size() : iVar.f19219q.k(j10, list);
        if (size2 < this.f19281y.size()) {
            k(size2);
        }
    }

    @Override
    public final void a() {
        this.D.post(this.B);
    }

    @Override
    public final boolean b() {
        return this.f19278s.d();
    }

    @Override
    public final void c() {
        for (q qVar : this.H) {
            qVar.A(true);
            l3.f fVar = qVar.h;
            if (fVar != null) {
                fVar.h(qVar.f12510e);
                qVar.h = null;
                qVar.f12512g = null;
            }
        }
    }

    @Override
    public final void d(n0 n0Var, long j10, long j11, boolean z10) {
        l4.e eVar = (l4.e) n0Var;
        this.G = null;
        long j12 = eVar.f15417a;
        Uri uri = eVar.f15423r.f3090c;
        j4.p pVar = new j4.p();
        this.f19277r.getClass();
        this.v.d(pVar, eVar.f15419c, this.f19263b, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
        if (z10) {
            return;
        }
        if (t() || this.Q == 0) {
            y();
        }
        if (this.Q > 0) {
            this.f19265c.a(this);
        }
    }

    public final void e() {
        d5.a.i(this.P);
        this.U.getClass();
        this.V.getClass();
    }

    @Override
    public final long g() {
        if (t()) {
            return this.f19266c0;
        }
        if (this.f19271f0) {
            return Long.MIN_VALUE;
        }
        return r().f15422n;
    }

    @Override
    public final k0 h(n0 n0Var, IOException iOException, int i10) {
        boolean zE;
        k0 k0Var;
        int i11;
        l4.e eVar = (l4.e) n0Var;
        boolean z10 = eVar instanceof k;
        if (z10 && !((k) eVar).W && (iOException instanceof h0) && ((i11 = ((h0) iOException).d) == 410 || i11 == 404)) {
            return q0.d;
        }
        long j10 = eVar.f15423r.f3089b;
        Uri uri = eVar.f15423r.f3090c;
        j4.p pVar = new j4.p();
        d5.g0.S(eVar.h);
        d5.g0.S(eVar.f15422n);
        n2.v vVar = new n2.v(iOException, i10, 1);
        i iVar = this.d;
        j0 j0VarA = e0.a(iVar.f19219q);
        this.f19277r.getClass();
        k0 k0VarX3 = ab.a.x3(j0VarA, vVar);
        if (k0VarX3 == null || k0VarX3.f2999a != 2) {
            zE = false;
        } else {
            long j11 = k0VarX3.f3000b;
            b5.s sVar = iVar.f19219q;
            zE = sVar.e(sVar.u(iVar.h.a(eVar.d)), j11);
        }
        if (zE) {
            if (z10 && j10 == 0) {
                ArrayList arrayList = this.f19281y;
                d5.a.i(((k) com.google.android.recaptcha.internal.a.k(1, arrayList)) == eVar);
                if (arrayList.isEmpty()) {
                    this.f19266c0 = this.f19264b0;
                } else {
                    ((k) p8.l.g(arrayList)).V = true;
                }
            }
            k0Var = q0.f3028e;
        } else {
            long jA3 = ab.a.A3(vVar);
            k0Var = jA3 != -9223372036854775807L ? new k0(0, jA3, false) : q0.f3029f;
        }
        k0 k0Var2 = k0Var;
        boolean zA = k0Var2.a();
        this.v.h(pVar, eVar.f15419c, this.f19263b, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n, iOException, !zA);
        if (!zA) {
            this.G = null;
        }
        if (zE) {
            if (!this.P) {
                q(this.f19264b0);
                return k0Var2;
            }
            this.f19265c.a(this);
        }
        return k0Var2;
    }

    public final j1 i(i1[] i1VarArr) {
        for (int i10 = 0; i10 < i1VarArr.length; i10++) {
            i1 i1Var = i1VarArr[i10];
            t0[] t0VarArr = new t0[i1Var.f12583a];
            for (int i11 = 0; i11 < i1Var.f12583a; i11++) {
                t0 t0Var = i1Var.d[i11];
                int iM = this.h.m(t0Var);
                s0 s0VarA = t0Var.a();
                s0VarA.J = iM;
                t0VarArr[i11] = new t0(s0VarA);
            }
            i1VarArr[i10] = new i1(i1Var.f12584b, t0VarArr);
        }
        return new j1(i1VarArr);
    }

    public final void k(int i10) {
        ArrayList arrayList;
        d5.a.i(!this.f19278s.d());
        int i11 = i10;
        loop0: while (true) {
            arrayList = this.f19281y;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                break;
            }
            int i12 = i11;
            while (true) {
                if (i12 >= arrayList.size()) {
                    k kVar = (k) arrayList.get(i11);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= this.H.length) {
                            break loop0;
                        }
                        if (this.H[i13].q() > kVar.f(i13)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                } else if (((k) arrayList.get(i12)).f19225y) {
                    break;
                } else {
                    i12++;
                }
            }
            i11++;
        }
        if (i11 == -1) {
            return;
        }
        long j10 = r().f15422n;
        k kVar2 = (k) arrayList.get(i11);
        d5.g0.N(i11, arrayList.size(), arrayList);
        for (int i14 = 0; i14 < this.H.length; i14++) {
            this.H[i14].k(kVar2.f(i14));
        }
        if (arrayList.isEmpty()) {
            this.f19266c0 = this.f19264b0;
        } else {
            ((k) p8.l.g(arrayList)).V = true;
        }
        this.f19271f0 = false;
        int i15 = this.M;
        long j11 = kVar2.h;
        g0 g0Var = this.v;
        g0Var.m(new x(1, i15, null, 3, null, g0Var.a(j11), g0Var.a(j10)));
    }

    @Override
    public final void l(n0 n0Var, long j10, long j11) {
        l4.e eVar = (l4.e) n0Var;
        this.G = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f19198s;
            i iVar = this.d;
            iVar.f19215m = bArr;
            b0 b0Var = iVar.f19212j;
            Uri uri = eVar2.f15418b.f3022a;
            byte[] bArr2 = eVar2.f19199w;
            bArr2.getClass();
            d dVar = (d) b0Var.f18130b;
            uri.getClass();
        }
        long j12 = eVar.f15417a;
        Uri uri2 = eVar.f15423r.f3090c;
        j4.p pVar = new j4.p();
        this.f19277r.getClass();
        this.v.f(pVar, eVar.f15419c, this.f19263b, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
        if (this.P) {
            this.f19265c.a(this);
        } else {
            q(this.f19264b0);
        }
    }

    @Override
    public final boolean q(long j10) {
        long jMax;
        List list;
        long j11;
        androidx.activity.n nVar;
        int i10;
        androidx.activity.n nVar2;
        i iVar;
        int i11;
        int iIntValue;
        Uri uri;
        h hVar;
        boolean z10;
        p4.h hVar2;
        p4.g gVar;
        long j12;
        Uri uriH;
        e eVarD;
        String str;
        Uri uriH2;
        e eVarD2;
        long j13;
        long j14;
        boolean z11;
        com.google.android.exoplayer2.upstream.m aVar;
        b0 b0Var;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i12;
        boolean z12;
        byte[] bArrE;
        com.google.android.exoplayer2.upstream.m aVar2;
        p4.g gVar2;
        com.google.android.exoplayer2.upstream.q qVar;
        com.google.android.exoplayer2.upstream.m mVar;
        boolean z13;
        int i13;
        e4.i iVar2;
        z zVar;
        b bVar;
        SparseArray sparseArray;
        f0 f0Var;
        com.google.android.exoplayer2.upstream.q qVar2;
        boolean z14;
        boolean z15;
        b bVar2;
        boolean z16;
        byte[] bArrE2;
        String str2;
        boolean z17;
        l4.e eVar;
        Uri uri2;
        k kVar;
        Object[] objArrCopyOf;
        q[] qVarArr;
        int length;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this.f19271f0) {
            return false;
        }
        q0 q0Var = this.f19278s;
        if (q0Var.d() || q0Var.c()) {
            return false;
        }
        if (t()) {
            list = Collections.EMPTY_LIST;
            jMax = this.f19266c0;
            for (q qVar3 : this.H) {
                qVar3.f12524t = this.f19266c0;
            }
        } else {
            k kVarR = r();
            jMax = kVarR.T ? kVarR.f15422n : Math.max(this.f19264b0, kVarR.h);
            list = this.A;
        }
        List list2 = list;
        androidx.activity.n nVar3 = this.f19280x;
        nVar3.f894b = null;
        nVar3.f893a = false;
        nVar3.f895c = null;
        boolean z18 = this.P || !list2.isEmpty();
        i iVar3 = this.d;
        b0 b0Var2 = iVar3.f19212j;
        Uri[] uriArr = iVar3.f19208e;
        p4.c cVar = iVar3.f19210g;
        k kVar2 = list2.isEmpty() ? null : (k) p8.l.g(list2);
        int iA = kVar2 == null ? -1 : iVar3.h.a(kVar2.d);
        long jMax2 = jMax - j10;
        long j15 = iVar3.f19220r;
        long jMax3 = j15 != -9223372036854775807L ? j15 - j10 : -9223372036854775807L;
        if (kVar2 == null) {
            j11 = jMax;
            nVar = nVar3;
            i10 = iA;
        } else if (iVar3.f19218p) {
            j11 = jMax;
            i10 = iA;
            nVar = nVar3;
        } else {
            i10 = iA;
            nVar = nVar3;
            long j16 = kVar2.f15422n - kVar2.h;
            j11 = jMax;
            jMax2 = Math.max(0L, jMax2 - j16);
            if (jMax3 != -9223372036854775807L) {
                jMax3 = Math.max(0L, jMax3 - j16);
            }
        }
        long j17 = j11;
        k kVar3 = kVar2;
        int i18 = i10;
        iVar3.f19219q.m(j10, jMax2, jMax3, list2, iVar3.a(kVar2, j17));
        int iN = iVar3.f19219q.n();
        boolean z19 = i18 != iN;
        Uri uri3 = uriArr[iN];
        if (cVar.c(uri3)) {
            nVar2 = nVar;
            p4.j jVarA = cVar.a(uri3, true);
            jVarA.getClass();
            long j18 = jVarA.h;
            iVar3.f19218p = jVarA.f45434c;
            iVar3.f19220r = jVarA.f45408o ? -9223372036854775807L : (jVarA.f45414u + j18) - cVar.f45379y;
            boolean z20 = z19;
            long j19 = j18 - cVar.f45379y;
            Pair pairC = iVar3.c(kVar3, z20, jVarA, j19, j17);
            long jLongValue = ((Long) pairC.first).longValue();
            int iIntValue2 = ((Integer) pairC.second).intValue();
            if (jLongValue >= jVarA.f45404k || kVar3 == null || !z20) {
                iVar = iVar3;
                i11 = iN;
                iIntValue = iIntValue2;
                uri = uri3;
            } else {
                uri = uriArr[i18];
                jVarA = cVar.a(uri, true);
                jVarA.getClass();
                j19 = jVarA.h - cVar.f45379y;
                iVar = iVar3;
                Pair pairC2 = iVar.c(kVar3, false, jVarA, j19, j17);
                jLongValue = ((Long) pairC2.first).longValue();
                iIntValue = ((Integer) pairC2.second).intValue();
                i11 = i18;
            }
            long j20 = j19;
            long j21 = jLongValue;
            String str3 = jVarA.f45432a;
            boolean z21 = jVarA.f45434c;
            long j22 = jVarA.f45404k;
            p8.z zVar2 = jVarA.f45411r;
            if (j21 >= j22) {
                p8.z zVar3 = jVarA.f45412s;
                boolean z22 = z21;
                int i19 = (int) (j21 - j22);
                if (i19 == zVar2.size()) {
                    if (iIntValue == -1) {
                        iIntValue = 0;
                    }
                    if (iIntValue < zVar3.size()) {
                        hVar = new h((p4.h) zVar3.get(iIntValue), j21, iIntValue);
                    } else {
                        hVar = null;
                    }
                } else {
                    p4.g gVar3 = (p4.g) zVar2.get(i19);
                    if (iIntValue == -1) {
                        hVar = new h(gVar3, j21, -1);
                    } else if (iIntValue < gVar3.f45386x.size()) {
                        hVar = new h((p4.h) gVar3.f45386x.get(iIntValue), j21, iIntValue);
                    } else {
                        int i20 = i19 + 1;
                        if (i20 < zVar2.size()) {
                            hVar = new h((p4.h) zVar2.get(i20), j21 + 1, -1);
                        } else if (zVar3.isEmpty()) {
                            hVar = null;
                        } else {
                            hVar = new h((p4.h) zVar3.get(0), j21 + 1, 0);
                        }
                    }
                }
                if (hVar != null) {
                    z10 = hVar.d;
                    hVar2 = hVar.f19202a;
                    iVar.f19221s = false;
                    iVar.f19217o = null;
                    gVar = hVar2.f45388b;
                    j12 = hVar2.f45390e;
                    if (gVar != null || (str2 = gVar.h) == null) {
                        uriH = null;
                    } else {
                        uriH = d5.a.H(str3, str2);
                    }
                    eVarD = iVar.d(uriH, i11);
                    nVar2.f894b = eVarD;
                    if (eVarD == null) {
                        str = hVar2.h;
                        if (str == null) {
                            uriH2 = null;
                        } else {
                            uriH2 = d5.a.H(str3, str);
                        }
                        eVarD2 = iVar.d(uriH2, i11);
                        nVar2.f894b = eVarD2;
                        if (eVarD2 == null) {
                            if (kVar3 == null) {
                                AtomicInteger atomicInteger = k.X;
                            } else {
                                if (uri.equals(kVar3.f19224x) || !kVar3.T) {
                                    j13 = j20 + j12;
                                    if (hVar2 instanceof p4.e) {
                                        if (!((p4.e) hVar2).f45380w || (hVar.f19204c == 0 && z22)) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                    }
                                    if (z22) {
                                        j14 = j12;
                                        if (j13 >= kVar3.f15422n) {
                                        }
                                        if (z11 || !z10) {
                                            j jVar = iVar.f19205a;
                                            aVar = iVar.f19206b;
                                            t0 t0Var = iVar.f19209f[i11];
                                            List list3 = iVar.f19211i;
                                            int iP = iVar.f19219q.p();
                                            Object objR = iVar.f19219q.r();
                                            boolean z23 = iVar.f19214l;
                                            n1.d dVar = iVar.d;
                                            if (uriH2 == null) {
                                                b0Var2.getClass();
                                                b0Var = b0Var2;
                                                bArr = null;
                                            } else {
                                                b0Var = b0Var2;
                                                bArr = (byte[]) ((d) b0Var.f18130b).get(uriH2);
                                            }
                                            if (uriH == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((d) b0Var.f18130b).get(uriH);
                                            }
                                            i3.k kVar4 = iVar.f19213k;
                                            AtomicInteger atomicInteger2 = k.X;
                                            map = Collections.EMPTY_MAP;
                                            Uri uriH3 = d5.a.H(str3, hVar2.f45387a);
                                            long j23 = hVar2.f45393r;
                                            long j24 = hVar2.f45394s;
                                            if (z10) {
                                                i12 = 8;
                                            } else {
                                                i12 = 0;
                                            }
                                            d5.a.k(uriH3, "The uri must be set.");
                                            com.google.android.exoplayer2.upstream.q qVar4 = new com.google.android.exoplayer2.upstream.q(uriH3, 1, null, map, j23, j24, null, i12);
                                            if (bArr != null) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (z12) {
                                                String str4 = hVar2.f45392n;
                                                str4.getClass();
                                                bArrE = k.e(str4);
                                            } else {
                                                bArrE = null;
                                            }
                                            if (bArr != null) {
                                                bArrE.getClass();
                                                aVar2 = new a(aVar, bArr, bArrE);
                                            } else {
                                                aVar2 = aVar;
                                            }
                                            gVar2 = hVar2.f45388b;
                                            if (gVar2 != null) {
                                                if (bArr2 != null) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                if (z16) {
                                                    String str5 = gVar2.f45392n;
                                                    str5.getClass();
                                                    bArrE2 = k.e(str5);
                                                } else {
                                                    bArrE2 = null;
                                                }
                                                boolean z24 = z16;
                                                com.google.android.exoplayer2.upstream.q qVar5 = new com.google.android.exoplayer2.upstream.q(d5.a.H(str3, gVar2.f45387a), 1, null, map, gVar2.f45393r, gVar2.f45394s, null, 0);
                                                if (bArr2 != null) {
                                                    bArrE2.getClass();
                                                    aVar = new a(aVar, bArr2, bArrE2);
                                                }
                                                z13 = z24;
                                                mVar = aVar;
                                                qVar = qVar5;
                                            } else {
                                                qVar = null;
                                                mVar = null;
                                                z13 = false;
                                            }
                                            long j25 = j20 + j14;
                                            long j26 = j25 + hVar2.f45389c;
                                            i13 = jVarA.f45403j + hVar2.d;
                                            if (kVar3 != null) {
                                                qVar2 = kVar3.C;
                                                if (qVar != qVar2 || (qVar != null && qVar2 != null && qVar.f3022a.equals(qVar2.f3022a) && qVar.f3025e == qVar2.f3025e)) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (uri.equals(kVar3.f19224x) || !kVar3.T) {
                                                    z15 = false;
                                                } else {
                                                    z15 = true;
                                                }
                                                iVar2 = kVar3.K;
                                                zVar = kVar3.L;
                                                if (z14 || !z15 || kVar3.V || kVar3.f19223w != i13) {
                                                    bVar2 = null;
                                                } else {
                                                    bVar2 = kVar3.O;
                                                }
                                                bVar = bVar2;
                                            } else {
                                                iVar2 = new e4.i(null);
                                                zVar = new z(10);
                                                bVar = null;
                                            }
                                            e4.i iVar4 = iVar2;
                                            z zVar4 = zVar;
                                            long j27 = hVar.f19203b;
                                            int i21 = hVar.f19204c;
                                            boolean z25 = !z10;
                                            boolean z26 = hVar2.v;
                                            sparseArray = (SparseArray) dVar.f18088b;
                                            f0Var = (f0) sparseArray.get(i13);
                                            if (f0Var == null) {
                                                f0Var = new f0(9223372036854775806L);
                                                sparseArray.put(i13, f0Var);
                                            }
                                            nVar2 = nVar2;
                                            nVar2.f894b = new k(jVar, aVar2, qVar4, t0Var, z12, mVar, qVar, z13, uri, list3, iP, objR, j25, j26, j27, i21, z25, i13, z26, z23, f0Var, hVar2.f45391f, bVar, iVar4, zVar4, z11, kVar4);
                                        }
                                    } else {
                                        j14 = j12;
                                    }
                                    z11 = true;
                                    if (z11) {
                                    }
                                    j jVar2 = iVar.f19205a;
                                    aVar = iVar.f19206b;
                                    t0 t0Var2 = iVar.f19209f[i11];
                                    List list4 = iVar.f19211i;
                                    int iP2 = iVar.f19219q.p();
                                    Object objR2 = iVar.f19219q.r();
                                    boolean z27 = iVar.f19214l;
                                    n1.d dVar2 = iVar.d;
                                    if (uriH2 == null) {
                                        b0Var2.getClass();
                                        b0Var = b0Var2;
                                        bArr = null;
                                    } else {
                                        b0Var = b0Var2;
                                        bArr = (byte[]) ((d) b0Var.f18130b).get(uriH2);
                                    }
                                    if (uriH == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((d) b0Var.f18130b).get(uriH);
                                    }
                                    i3.k kVar5 = iVar.f19213k;
                                    AtomicInteger atomicInteger3 = k.X;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriH4 = d5.a.H(str3, hVar2.f45387a);
                                    long j28 = hVar2.f45393r;
                                    long j29 = hVar2.f45394s;
                                    if (z10) {
                                        i12 = 8;
                                    } else {
                                        i12 = 0;
                                    }
                                    d5.a.k(uriH4, "The uri must be set.");
                                    com.google.android.exoplayer2.upstream.q qVar6 = new com.google.android.exoplayer2.upstream.q(uriH4, 1, null, map, j28, j29, null, i12);
                                    if (bArr != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        String str6 = hVar2.f45392n;
                                        str6.getClass();
                                        bArrE = k.e(str6);
                                    } else {
                                        bArrE = null;
                                    }
                                    if (bArr != null) {
                                        bArrE.getClass();
                                        aVar2 = new a(aVar, bArr, bArrE);
                                    } else {
                                        aVar2 = aVar;
                                    }
                                    gVar2 = hVar2.f45388b;
                                    if (gVar2 != null) {
                                        if (bArr2 != null) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16) {
                                            String str7 = gVar2.f45392n;
                                            str7.getClass();
                                            bArrE2 = k.e(str7);
                                        } else {
                                            bArrE2 = null;
                                        }
                                        boolean z28 = z16;
                                        com.google.android.exoplayer2.upstream.q qVar7 = new com.google.android.exoplayer2.upstream.q(d5.a.H(str3, gVar2.f45387a), 1, null, map, gVar2.f45393r, gVar2.f45394s, null, 0);
                                        if (bArr2 != null) {
                                            bArrE2.getClass();
                                            aVar = new a(aVar, bArr2, bArrE2);
                                        }
                                        z13 = z28;
                                        mVar = aVar;
                                        qVar = qVar7;
                                    } else {
                                        qVar = null;
                                        mVar = null;
                                        z13 = false;
                                    }
                                    long j210 = j20 + j14;
                                    long j211 = j210 + hVar2.f45389c;
                                    i13 = jVarA.f45403j + hVar2.d;
                                    if (kVar3 != null) {
                                        qVar2 = kVar3.C;
                                        if (qVar != qVar2) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        if (uri.equals(kVar3.f19224x)) {
                                            z15 = false;
                                        } else {
                                            z15 = false;
                                        }
                                        iVar2 = kVar3.K;
                                        zVar = kVar3.L;
                                        if (z14) {
                                            bVar2 = null;
                                        } else {
                                            bVar2 = null;
                                        }
                                        bVar = bVar2;
                                    } else {
                                        iVar2 = new e4.i(null);
                                        zVar = new z(10);
                                        bVar = null;
                                    }
                                    e4.i iVar5 = iVar2;
                                    z zVar5 = zVar;
                                    long j212 = hVar.f19203b;
                                    int i22 = hVar.f19204c;
                                    boolean z29 = !z10;
                                    boolean z210 = hVar2.v;
                                    sparseArray = (SparseArray) dVar2.f18088b;
                                    f0Var = (f0) sparseArray.get(i13);
                                    if (f0Var == null) {
                                        f0Var = new f0(9223372036854775806L);
                                        sparseArray.put(i13, f0Var);
                                    }
                                    nVar2 = nVar2;
                                    nVar2.f894b = new k(jVar2, aVar2, qVar6, t0Var2, z12, mVar, qVar, z13, uri, list4, iP2, objR2, j210, j211, j212, i22, z29, i13, z210, z27, f0Var, hVar2.f45391f, bVar, iVar5, zVar5, z11, kVar5);
                                }
                                z11 = false;
                                if (z11) {
                                }
                                j jVar3 = iVar.f19205a;
                                aVar = iVar.f19206b;
                                t0 t0Var3 = iVar.f19209f[i11];
                                List list5 = iVar.f19211i;
                                int iP3 = iVar.f19219q.p();
                                Object objR3 = iVar.f19219q.r();
                                boolean z211 = iVar.f19214l;
                                n1.d dVar3 = iVar.d;
                                if (uriH2 == null) {
                                    b0Var2.getClass();
                                    b0Var = b0Var2;
                                    bArr = null;
                                } else {
                                    b0Var = b0Var2;
                                    bArr = (byte[]) ((d) b0Var.f18130b).get(uriH2);
                                }
                                if (uriH == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((d) b0Var.f18130b).get(uriH);
                                }
                                i3.k kVar6 = iVar.f19213k;
                                AtomicInteger atomicInteger4 = k.X;
                                map = Collections.EMPTY_MAP;
                                Uri uriH5 = d5.a.H(str3, hVar2.f45387a);
                                long j213 = hVar2.f45393r;
                                long j214 = hVar2.f45394s;
                                if (z10) {
                                    i12 = 8;
                                } else {
                                    i12 = 0;
                                }
                                d5.a.k(uriH5, "The uri must be set.");
                                com.google.android.exoplayer2.upstream.q qVar8 = new com.google.android.exoplayer2.upstream.q(uriH5, 1, null, map, j213, j214, null, i12);
                                if (bArr != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    String str8 = hVar2.f45392n;
                                    str8.getClass();
                                    bArrE = k.e(str8);
                                } else {
                                    bArrE = null;
                                }
                                if (bArr != null) {
                                    bArrE.getClass();
                                    aVar2 = new a(aVar, bArr, bArrE);
                                } else {
                                    aVar2 = aVar;
                                }
                                gVar2 = hVar2.f45388b;
                                if (gVar2 != null) {
                                    if (bArr2 != null) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        String str9 = gVar2.f45392n;
                                        str9.getClass();
                                        bArrE2 = k.e(str9);
                                    } else {
                                        bArrE2 = null;
                                    }
                                    boolean z212 = z16;
                                    com.google.android.exoplayer2.upstream.q qVar9 = new com.google.android.exoplayer2.upstream.q(d5.a.H(str3, gVar2.f45387a), 1, null, map, gVar2.f45393r, gVar2.f45394s, null, 0);
                                    if (bArr2 != null) {
                                        bArrE2.getClass();
                                        aVar = new a(aVar, bArr2, bArrE2);
                                    }
                                    z13 = z212;
                                    mVar = aVar;
                                    qVar = qVar9;
                                } else {
                                    qVar = null;
                                    mVar = null;
                                    z13 = false;
                                }
                                long j215 = j20 + j14;
                                long j216 = j215 + hVar2.f45389c;
                                i13 = jVarA.f45403j + hVar2.d;
                                if (kVar3 != null) {
                                    qVar2 = kVar3.C;
                                    if (qVar != qVar2) {
                                        z14 = true;
                                    } else {
                                        z14 = true;
                                    }
                                    if (uri.equals(kVar3.f19224x)) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    iVar2 = kVar3.K;
                                    zVar = kVar3.L;
                                    if (z14) {
                                        bVar2 = null;
                                    } else {
                                        bVar2 = null;
                                    }
                                    bVar = bVar2;
                                } else {
                                    iVar2 = new e4.i(null);
                                    zVar = new z(10);
                                    bVar = null;
                                }
                                e4.i iVar6 = iVar2;
                                z zVar6 = zVar;
                                long j217 = hVar.f19203b;
                                int i23 = hVar.f19204c;
                                boolean z213 = !z10;
                                boolean z214 = hVar2.v;
                                sparseArray = (SparseArray) dVar3.f18088b;
                                f0Var = (f0) sparseArray.get(i13);
                                if (f0Var == null) {
                                    f0Var = new f0(9223372036854775806L);
                                    sparseArray.put(i13, f0Var);
                                }
                                nVar2 = nVar2;
                                nVar2.f894b = new k(jVar3, aVar2, qVar8, t0Var3, z12, mVar, qVar, z13, uri, list5, iP3, objR3, j215, j216, j217, i23, z213, i13, z214, z211, f0Var, hVar2.f45391f, bVar, iVar6, zVar6, z11, kVar6);
                            }
                            j14 = j12;
                            z11 = false;
                            if (z11) {
                            }
                            j jVar4 = iVar.f19205a;
                            aVar = iVar.f19206b;
                            t0 t0Var4 = iVar.f19209f[i11];
                            List list6 = iVar.f19211i;
                            int iP4 = iVar.f19219q.p();
                            Object objR4 = iVar.f19219q.r();
                            boolean z215 = iVar.f19214l;
                            n1.d dVar4 = iVar.d;
                            if (uriH2 == null) {
                                b0Var2.getClass();
                                b0Var = b0Var2;
                                bArr = null;
                            } else {
                                b0Var = b0Var2;
                                bArr = (byte[]) ((d) b0Var.f18130b).get(uriH2);
                            }
                            if (uriH == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = (byte[]) ((d) b0Var.f18130b).get(uriH);
                            }
                            i3.k kVar7 = iVar.f19213k;
                            AtomicInteger atomicInteger5 = k.X;
                            map = Collections.EMPTY_MAP;
                            Uri uriH6 = d5.a.H(str3, hVar2.f45387a);
                            long j218 = hVar2.f45393r;
                            long j219 = hVar2.f45394s;
                            if (z10) {
                                i12 = 8;
                            } else {
                                i12 = 0;
                            }
                            d5.a.k(uriH6, "The uri must be set.");
                            com.google.android.exoplayer2.upstream.q qVar10 = new com.google.android.exoplayer2.upstream.q(uriH6, 1, null, map, j218, j219, null, i12);
                            if (bArr != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                String str10 = hVar2.f45392n;
                                str10.getClass();
                                bArrE = k.e(str10);
                            } else {
                                bArrE = null;
                            }
                            if (bArr != null) {
                                bArrE.getClass();
                                aVar2 = new a(aVar, bArr, bArrE);
                            } else {
                                aVar2 = aVar;
                            }
                            gVar2 = hVar2.f45388b;
                            if (gVar2 != null) {
                                if (bArr2 != null) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    String str11 = gVar2.f45392n;
                                    str11.getClass();
                                    bArrE2 = k.e(str11);
                                } else {
                                    bArrE2 = null;
                                }
                                boolean z216 = z16;
                                com.google.android.exoplayer2.upstream.q qVar11 = new com.google.android.exoplayer2.upstream.q(d5.a.H(str3, gVar2.f45387a), 1, null, map, gVar2.f45393r, gVar2.f45394s, null, 0);
                                if (bArr2 != null) {
                                    bArrE2.getClass();
                                    aVar = new a(aVar, bArr2, bArrE2);
                                }
                                z13 = z216;
                                mVar = aVar;
                                qVar = qVar11;
                            } else {
                                qVar = null;
                                mVar = null;
                                z13 = false;
                            }
                            long j2110 = j20 + j14;
                            long j2111 = j2110 + hVar2.f45389c;
                            i13 = jVarA.f45403j + hVar2.d;
                            if (kVar3 != null) {
                                qVar2 = kVar3.C;
                                if (qVar != qVar2) {
                                    z14 = true;
                                } else {
                                    z14 = true;
                                }
                                if (uri.equals(kVar3.f19224x)) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                iVar2 = kVar3.K;
                                zVar = kVar3.L;
                                if (z14) {
                                    bVar2 = null;
                                } else {
                                    bVar2 = null;
                                }
                                bVar = bVar2;
                            } else {
                                iVar2 = new e4.i(null);
                                zVar = new z(10);
                                bVar = null;
                            }
                            e4.i iVar7 = iVar2;
                            z zVar7 = zVar;
                            long j2112 = hVar.f19203b;
                            int i24 = hVar.f19204c;
                            boolean z217 = !z10;
                            boolean z218 = hVar2.v;
                            sparseArray = (SparseArray) dVar4.f18088b;
                            f0Var = (f0) sparseArray.get(i13);
                            if (f0Var == null) {
                                f0Var = new f0(9223372036854775806L);
                                sparseArray.put(i13, f0Var);
                            }
                            nVar2 = nVar2;
                            nVar2.f894b = new k(jVar4, aVar2, qVar10, t0Var4, z12, mVar, qVar, z13, uri, list6, iP4, objR4, j2110, j2111, j2112, i24, z217, i13, z218, z215, f0Var, hVar2.f45391f, bVar, iVar7, zVar7, z11, kVar7);
                        }
                    }
                } else if (!jVarA.f45408o) {
                    nVar2.f895c = uri;
                    iVar.f19221s &= uri.equals(iVar.f19217o);
                    iVar.f19217o = uri;
                } else if (z18 || zVar2.isEmpty()) {
                    nVar2.f893a = true;
                } else {
                    hVar = new h((p4.h) p8.l.g(zVar2), (j22 + ((long) zVar2.size())) - 1, -1);
                    z10 = hVar.d;
                    hVar2 = hVar.f19202a;
                    iVar.f19221s = false;
                    iVar.f19217o = null;
                    gVar = hVar2.f45388b;
                    j12 = hVar2.f45390e;
                    if (gVar != null) {
                        uriH = null;
                    } else {
                        uriH = null;
                    }
                    eVarD = iVar.d(uriH, i11);
                    nVar2.f894b = eVarD;
                    if (eVarD == null) {
                        str = hVar2.h;
                        if (str == null) {
                            uriH2 = null;
                        } else {
                            uriH2 = d5.a.H(str3, str);
                        }
                        eVarD2 = iVar.d(uriH2, i11);
                        nVar2.f894b = eVarD2;
                        if (eVarD2 == null) {
                            if (kVar3 == null) {
                                AtomicInteger atomicInteger6 = k.X;
                            } else {
                                if (uri.equals(kVar3.f19224x)) {
                                }
                                j13 = j20 + j12;
                                if (hVar2 instanceof p4.e) {
                                    if (((p4.e) hVar2).f45380w) {
                                        z22 = true;
                                    } else {
                                        z22 = true;
                                    }
                                }
                                if (z22) {
                                    j14 = j12;
                                    if (j13 >= kVar3.f15422n) {
                                        z11 = false;
                                    }
                                    if (z11) {
                                    }
                                    j jVar5 = iVar.f19205a;
                                    aVar = iVar.f19206b;
                                    t0 t0Var5 = iVar.f19209f[i11];
                                    List list7 = iVar.f19211i;
                                    int iP5 = iVar.f19219q.p();
                                    Object objR5 = iVar.f19219q.r();
                                    boolean z219 = iVar.f19214l;
                                    n1.d dVar5 = iVar.d;
                                    if (uriH2 == null) {
                                        b0Var2.getClass();
                                        b0Var = b0Var2;
                                        bArr = null;
                                    } else {
                                        b0Var = b0Var2;
                                        bArr = (byte[]) ((d) b0Var.f18130b).get(uriH2);
                                    }
                                    if (uriH == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((d) b0Var.f18130b).get(uriH);
                                    }
                                    i3.k kVar8 = iVar.f19213k;
                                    AtomicInteger atomicInteger7 = k.X;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriH7 = d5.a.H(str3, hVar2.f45387a);
                                    long j2113 = hVar2.f45393r;
                                    long j2114 = hVar2.f45394s;
                                    if (z10) {
                                        i12 = 8;
                                    } else {
                                        i12 = 0;
                                    }
                                    d5.a.k(uriH7, "The uri must be set.");
                                    com.google.android.exoplayer2.upstream.q qVar12 = new com.google.android.exoplayer2.upstream.q(uriH7, 1, null, map, j2113, j2114, null, i12);
                                    if (bArr != null) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        String str12 = hVar2.f45392n;
                                        str12.getClass();
                                        bArrE = k.e(str12);
                                    } else {
                                        bArrE = null;
                                    }
                                    if (bArr != null) {
                                        bArrE.getClass();
                                        aVar2 = new a(aVar, bArr, bArrE);
                                    } else {
                                        aVar2 = aVar;
                                    }
                                    gVar2 = hVar2.f45388b;
                                    if (gVar2 != null) {
                                        if (bArr2 != null) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16) {
                                            String str13 = gVar2.f45392n;
                                            str13.getClass();
                                            bArrE2 = k.e(str13);
                                        } else {
                                            bArrE2 = null;
                                        }
                                        boolean z2110 = z16;
                                        com.google.android.exoplayer2.upstream.q qVar13 = new com.google.android.exoplayer2.upstream.q(d5.a.H(str3, gVar2.f45387a), 1, null, map, gVar2.f45393r, gVar2.f45394s, null, 0);
                                        if (bArr2 != null) {
                                            bArrE2.getClass();
                                            aVar = new a(aVar, bArr2, bArrE2);
                                        }
                                        z13 = z2110;
                                        mVar = aVar;
                                        qVar = qVar13;
                                    } else {
                                        qVar = null;
                                        mVar = null;
                                        z13 = false;
                                    }
                                    long j2115 = j20 + j14;
                                    long j2116 = j2115 + hVar2.f45389c;
                                    i13 = jVarA.f45403j + hVar2.d;
                                    if (kVar3 != null) {
                                        qVar2 = kVar3.C;
                                        if (qVar != qVar2) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        if (uri.equals(kVar3.f19224x)) {
                                            z15 = false;
                                        } else {
                                            z15 = false;
                                        }
                                        iVar2 = kVar3.K;
                                        zVar = kVar3.L;
                                        if (z14) {
                                            bVar2 = null;
                                        } else {
                                            bVar2 = null;
                                        }
                                        bVar = bVar2;
                                    } else {
                                        iVar2 = new e4.i(null);
                                        zVar = new z(10);
                                        bVar = null;
                                    }
                                    e4.i iVar8 = iVar2;
                                    z zVar8 = zVar;
                                    long j2117 = hVar.f19203b;
                                    int i25 = hVar.f19204c;
                                    boolean z2111 = !z10;
                                    boolean z2112 = hVar2.v;
                                    sparseArray = (SparseArray) dVar5.f18088b;
                                    f0Var = (f0) sparseArray.get(i13);
                                    if (f0Var == null) {
                                        f0Var = new f0(9223372036854775806L);
                                        sparseArray.put(i13, f0Var);
                                    }
                                    nVar2 = nVar2;
                                    nVar2.f894b = new k(jVar5, aVar2, qVar12, t0Var5, z12, mVar, qVar, z13, uri, list7, iP5, objR5, j2115, j2116, j2117, i25, z2111, i13, z2112, z219, f0Var, hVar2.f45391f, bVar, iVar8, zVar8, z11, kVar8);
                                } else {
                                    j14 = j12;
                                }
                                z11 = true;
                                if (z11) {
                                }
                                j jVar6 = iVar.f19205a;
                                aVar = iVar.f19206b;
                                t0 t0Var6 = iVar.f19209f[i11];
                                List list8 = iVar.f19211i;
                                int iP6 = iVar.f19219q.p();
                                Object objR6 = iVar.f19219q.r();
                                boolean z2113 = iVar.f19214l;
                                n1.d dVar6 = iVar.d;
                                if (uriH2 == null) {
                                    b0Var2.getClass();
                                    b0Var = b0Var2;
                                    bArr = null;
                                } else {
                                    b0Var = b0Var2;
                                    bArr = (byte[]) ((d) b0Var.f18130b).get(uriH2);
                                }
                                if (uriH == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((d) b0Var.f18130b).get(uriH);
                                }
                                i3.k kVar9 = iVar.f19213k;
                                AtomicInteger atomicInteger8 = k.X;
                                map = Collections.EMPTY_MAP;
                                Uri uriH8 = d5.a.H(str3, hVar2.f45387a);
                                long j2118 = hVar2.f45393r;
                                long j2119 = hVar2.f45394s;
                                if (z10) {
                                    i12 = 8;
                                } else {
                                    i12 = 0;
                                }
                                d5.a.k(uriH8, "The uri must be set.");
                                com.google.android.exoplayer2.upstream.q qVar14 = new com.google.android.exoplayer2.upstream.q(uriH8, 1, null, map, j2118, j2119, null, i12);
                                if (bArr != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    String str14 = hVar2.f45392n;
                                    str14.getClass();
                                    bArrE = k.e(str14);
                                } else {
                                    bArrE = null;
                                }
                                if (bArr != null) {
                                    bArrE.getClass();
                                    aVar2 = new a(aVar, bArr, bArrE);
                                } else {
                                    aVar2 = aVar;
                                }
                                gVar2 = hVar2.f45388b;
                                if (gVar2 != null) {
                                    if (bArr2 != null) {
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    if (z16) {
                                        String str15 = gVar2.f45392n;
                                        str15.getClass();
                                        bArrE2 = k.e(str15);
                                    } else {
                                        bArrE2 = null;
                                    }
                                    boolean z2114 = z16;
                                    com.google.android.exoplayer2.upstream.q qVar15 = new com.google.android.exoplayer2.upstream.q(d5.a.H(str3, gVar2.f45387a), 1, null, map, gVar2.f45393r, gVar2.f45394s, null, 0);
                                    if (bArr2 != null) {
                                        bArrE2.getClass();
                                        aVar = new a(aVar, bArr2, bArrE2);
                                    }
                                    z13 = z2114;
                                    mVar = aVar;
                                    qVar = qVar15;
                                } else {
                                    qVar = null;
                                    mVar = null;
                                    z13 = false;
                                }
                                long j21110 = j20 + j14;
                                long j21111 = j21110 + hVar2.f45389c;
                                i13 = jVarA.f45403j + hVar2.d;
                                if (kVar3 != null) {
                                    qVar2 = kVar3.C;
                                    if (qVar != qVar2) {
                                        z14 = true;
                                    } else {
                                        z14 = true;
                                    }
                                    if (uri.equals(kVar3.f19224x)) {
                                        z15 = false;
                                    } else {
                                        z15 = false;
                                    }
                                    iVar2 = kVar3.K;
                                    zVar = kVar3.L;
                                    if (z14) {
                                        bVar2 = null;
                                    } else {
                                        bVar2 = null;
                                    }
                                    bVar = bVar2;
                                } else {
                                    iVar2 = new e4.i(null);
                                    zVar = new z(10);
                                    bVar = null;
                                }
                                e4.i iVar9 = iVar2;
                                z zVar9 = zVar;
                                long j21112 = hVar.f19203b;
                                int i26 = hVar.f19204c;
                                boolean z2115 = !z10;
                                boolean z2116 = hVar2.v;
                                sparseArray = (SparseArray) dVar6.f18088b;
                                f0Var = (f0) sparseArray.get(i13);
                                if (f0Var == null) {
                                    f0Var = new f0(9223372036854775806L);
                                    sparseArray.put(i13, f0Var);
                                }
                                nVar2 = nVar2;
                                nVar2.f894b = new k(jVar6, aVar2, qVar14, t0Var6, z12, mVar, qVar, z13, uri, list8, iP6, objR6, j21110, j21111, j21112, i26, z2115, i13, z2116, z2113, f0Var, hVar2.f45391f, bVar, iVar9, zVar9, z11, kVar9);
                            }
                            j14 = j12;
                            z11 = false;
                            if (z11) {
                            }
                            j jVar7 = iVar.f19205a;
                            aVar = iVar.f19206b;
                            t0 t0Var7 = iVar.f19209f[i11];
                            List list9 = iVar.f19211i;
                            int iP7 = iVar.f19219q.p();
                            Object objR7 = iVar.f19219q.r();
                            boolean z2117 = iVar.f19214l;
                            n1.d dVar7 = iVar.d;
                            if (uriH2 == null) {
                                b0Var2.getClass();
                                b0Var = b0Var2;
                                bArr = null;
                            } else {
                                b0Var = b0Var2;
                                bArr = (byte[]) ((d) b0Var.f18130b).get(uriH2);
                            }
                            if (uriH == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = (byte[]) ((d) b0Var.f18130b).get(uriH);
                            }
                            i3.k kVar10 = iVar.f19213k;
                            AtomicInteger atomicInteger9 = k.X;
                            map = Collections.EMPTY_MAP;
                            Uri uriH9 = d5.a.H(str3, hVar2.f45387a);
                            long j21113 = hVar2.f45393r;
                            long j21114 = hVar2.f45394s;
                            if (z10) {
                                i12 = 8;
                            } else {
                                i12 = 0;
                            }
                            d5.a.k(uriH9, "The uri must be set.");
                            com.google.android.exoplayer2.upstream.q qVar16 = new com.google.android.exoplayer2.upstream.q(uriH9, 1, null, map, j21113, j21114, null, i12);
                            if (bArr != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                String str16 = hVar2.f45392n;
                                str16.getClass();
                                bArrE = k.e(str16);
                            } else {
                                bArrE = null;
                            }
                            if (bArr != null) {
                                bArrE.getClass();
                                aVar2 = new a(aVar, bArr, bArrE);
                            } else {
                                aVar2 = aVar;
                            }
                            gVar2 = hVar2.f45388b;
                            if (gVar2 != null) {
                                if (bArr2 != null) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if (z16) {
                                    String str17 = gVar2.f45392n;
                                    str17.getClass();
                                    bArrE2 = k.e(str17);
                                } else {
                                    bArrE2 = null;
                                }
                                boolean z2118 = z16;
                                com.google.android.exoplayer2.upstream.q qVar17 = new com.google.android.exoplayer2.upstream.q(d5.a.H(str3, gVar2.f45387a), 1, null, map, gVar2.f45393r, gVar2.f45394s, null, 0);
                                if (bArr2 != null) {
                                    bArrE2.getClass();
                                    aVar = new a(aVar, bArr2, bArrE2);
                                }
                                z13 = z2118;
                                mVar = aVar;
                                qVar = qVar17;
                            } else {
                                qVar = null;
                                mVar = null;
                                z13 = false;
                            }
                            long j21115 = j20 + j14;
                            long j21116 = j21115 + hVar2.f45389c;
                            i13 = jVarA.f45403j + hVar2.d;
                            if (kVar3 != null) {
                                qVar2 = kVar3.C;
                                if (qVar != qVar2) {
                                    z14 = true;
                                } else {
                                    z14 = true;
                                }
                                if (uri.equals(kVar3.f19224x)) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                iVar2 = kVar3.K;
                                zVar = kVar3.L;
                                if (z14) {
                                    bVar2 = null;
                                } else {
                                    bVar2 = null;
                                }
                                bVar = bVar2;
                            } else {
                                iVar2 = new e4.i(null);
                                zVar = new z(10);
                                bVar = null;
                            }
                            e4.i iVar10 = iVar2;
                            z zVar10 = zVar;
                            long j21117 = hVar.f19203b;
                            int i27 = hVar.f19204c;
                            boolean z2119 = !z10;
                            boolean z21110 = hVar2.v;
                            sparseArray = (SparseArray) dVar7.f18088b;
                            f0Var = (f0) sparseArray.get(i13);
                            if (f0Var == null) {
                                f0Var = new f0(9223372036854775806L);
                                sparseArray.put(i13, f0Var);
                            }
                            nVar2 = nVar2;
                            nVar2.f894b = new k(jVar7, aVar2, qVar16, t0Var7, z12, mVar, qVar, z13, uri, list9, iP7, objR7, j21115, j21116, j21117, i27, z2119, i13, z21110, z2117, f0Var, hVar2.f45391f, bVar, iVar10, zVar10, z11, kVar10);
                        }
                    }
                }
                z17 = nVar2.f893a;
                eVar = (l4.e) nVar2.f894b;
                uri2 = (Uri) nVar2.f895c;
                if (z17) {
                    this.f19266c0 = -9223372036854775807L;
                    this.f19271f0 = true;
                    return true;
                }
                if (eVar == null) {
                    if (uri2 != null) {
                        return false;
                    }
                    p4.b bVar3 = (p4.b) ((l) this.f19265c.f19088b).f19227b.d.get(uri2);
                    bVar3.c(bVar3.f45361a);
                    return false;
                }
                if (eVar instanceof k) {
                    kVar = (k) eVar;
                    this.f19275j0 = kVar;
                    this.R = kVar.d;
                    this.f19266c0 = -9223372036854775807L;
                    this.f19281y.add(kVar);
                    p8.x xVar = p8.z.f45604b;
                    p8.l.a(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    qVarArr = this.H;
                    length = qVarArr.length;
                    i14 = 0;
                    i15 = 0;
                    while (i15 < length) {
                        q qVar18 = qVarArr[i15];
                        Integer numValueOf = Integer.valueOf(qVar18.f12521q + qVar18.f12520p);
                        i17 = i14 + 1;
                        if (objArrCopyOf.length < i17) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, p8.w.d(objArrCopyOf.length, i17));
                        }
                        objArrCopyOf[i14] = numValueOf;
                        i15++;
                        i14 = i17;
                    }
                    p8.l0 l0VarS = p8.z.s(i14, objArrCopyOf);
                    kVar.P = this;
                    kVar.U = l0VarS;
                    for (q qVar19 : this.H) {
                        qVar19.getClass();
                        qVar19.C = kVar.v;
                        if (kVar.f19225y) {
                            qVar19.G = true;
                        }
                    }
                }
                this.G = eVar;
                q0Var.f(eVar, this, this.f19277r.z3(eVar.f15419c));
                this.v.k(new j4.p(eVar.f15418b), eVar.f15419c, this.f19263b, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
                return true;
            }
            iVar.f19216n = new j4.b();
        } else {
            nVar2 = nVar;
            nVar2.f895c = uri3;
            iVar3.f19221s &= uri3.equals(iVar3.f19217o);
            iVar3.f19217o = uri3;
        }
        z17 = nVar2.f893a;
        eVar = (l4.e) nVar2.f894b;
        uri2 = (Uri) nVar2.f895c;
        if (z17) {
            this.f19266c0 = -9223372036854775807L;
            this.f19271f0 = true;
            return true;
        }
        if (eVar == null) {
            if (uri2 != null) {
                return false;
            }
            p4.b bVar4 = (p4.b) ((l) this.f19265c.f19088b).f19227b.d.get(uri2);
            bVar4.c(bVar4.f45361a);
            return false;
        }
        if (eVar instanceof k) {
            kVar = (k) eVar;
            this.f19275j0 = kVar;
            this.R = kVar.d;
            this.f19266c0 = -9223372036854775807L;
            this.f19281y.add(kVar);
            p8.x xVar2 = p8.z.f45604b;
            p8.l.a(4, "initialCapacity");
            objArrCopyOf = new Object[4];
            qVarArr = this.H;
            length = qVarArr.length;
            i14 = 0;
            i15 = 0;
            while (i15 < length) {
                q qVar110 = qVarArr[i15];
                Integer numValueOf2 = Integer.valueOf(qVar110.f12521q + qVar110.f12520p);
                i17 = i14 + 1;
                if (objArrCopyOf.length < i17) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, p8.w.d(objArrCopyOf.length, i17));
                }
                objArrCopyOf[i14] = numValueOf2;
                i15++;
                i14 = i17;
            }
            p8.l0 l0VarS2 = p8.z.s(i14, objArrCopyOf);
            kVar.P = this;
            kVar.U = l0VarS2;
            while (i16 < r4) {
                qVar19.getClass();
                qVar19.C = kVar.v;
                if (kVar.f19225y) {
                    qVar19.G = true;
                }
            }
        }
        this.G = eVar;
        q0Var.f(eVar, this, this.f19277r.z3(eVar.f15419c));
        this.v.k(new j4.p(eVar.f15418b), eVar.f15419c, this.f19263b, eVar.d, eVar.f15420e, eVar.f15421f, eVar.h, eVar.f15422n);
        return true;
    }

    public final k r() {
        return (k) i0.a.i(1, this.f19281y);
    }

    public final boolean t() {
        return this.f19266c0 != -9223372036854775807L;
    }

    public final void u() {
        if (!this.T && this.W == null && this.O) {
            int i10 = 0;
            for (q qVar : this.H) {
                if (qVar.t() == null) {
                    return;
                }
            }
            j1 j1Var = this.U;
            if (j1Var != null) {
                int i11 = j1Var.f12593a;
                int[] iArr = new int[i11];
                this.W = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        q[] qVarArr = this.H;
                        if (i13 >= qVarArr.length) {
                            break;
                        }
                        t0 t0VarT = qVarArr[i13].t();
                        d5.a.j(t0VarT);
                        t0 t0Var = this.U.a(i12).d[0];
                        String str = t0VarT.B;
                        String str2 = t0Var.B;
                        int iG = d5.q.g(str);
                        if (iG != 3) {
                            if (iG == d5.q.g(str2)) {
                                this.W[i12] = i13;
                                break;
                            }
                            i13++;
                        } else {
                            if (d5.g0.a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || t0VarT.T == t0Var.T)) {
                                this.W[i12] = i13;
                                break;
                                break;
                            }
                            i13++;
                        }
                    }
                }
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((n) obj).b();
                }
                return;
            }
            int length = this.H.length;
            int i14 = 0;
            int i15 = -2;
            int i16 = -1;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                t0 t0VarT2 = this.H[i14].t();
                d5.a.j(t0VarT2);
                String str3 = t0VarT2.B;
                if (d5.q.j(str3)) {
                    i17 = 2;
                } else if (!d5.q.h(str3)) {
                    i17 = d5.q.i(str3) ? 3 : -2;
                }
                if (s(i17) > s(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            i1 i1Var = this.d.h;
            int i18 = i1Var.f12583a;
            this.X = -1;
            this.W = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.W[i19] = i19;
            }
            i1[] i1VarArr = new i1[length];
            int i20 = 0;
            while (i20 < length) {
                t0 t0VarT3 = this.H[i20].t();
                d5.a.j(t0VarT3);
                String str4 = this.f19261a;
                t0 t0Var2 = this.f19270f;
                if (i20 == i16) {
                    t0[] t0VarArr = new t0[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        t0 t0VarC = i1Var.d[i21];
                        if (i15 == 1 && t0Var2 != null) {
                            t0VarC = t0VarC.c(t0Var2);
                        }
                        t0VarArr[i21] = i18 == 1 ? t0VarT3.c(t0VarC) : j(t0VarC, t0VarT3, true);
                    }
                    i1VarArr[i20] = new i1(str4, t0VarArr);
                    this.X = i20;
                } else {
                    if (i15 != 2 || !d5.q.h(t0VarT3.B)) {
                        t0Var2 = null;
                    }
                    StringBuilder sbF = s3.c.f(str4, ":muxed:");
                    sbF.append(i20 < i16 ? i20 : i20 - 1);
                    i1VarArr[i20] = new i1(sbF.toString(), j(t0Var2, t0VarT3, false));
                }
                i20++;
            }
            this.U = i(i1VarArr);
            d5.a.i(this.V == null);
            this.V = Collections.EMPTY_SET;
            this.P = true;
            this.f19265c.j();
        }
    }

    public final void v() throws IOException {
        this.f19278s.a();
        i iVar = this.d;
        j4.b bVar = iVar.f19216n;
        if (bVar != null) {
            throw bVar;
        }
        Uri uri = iVar.f19217o;
        if (uri == null || !iVar.f19221s) {
            return;
        }
        p4.b bVar2 = (p4.b) iVar.f19210g.d.get(uri);
        bVar2.f45362b.a();
        IOException iOException = bVar2.f45368s;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void x(i1[] i1VarArr, int... iArr) {
        this.U = i(i1VarArr);
        this.V = new HashSet();
        for (int i10 : iArr) {
            this.V.add(this.U.a(i10));
        }
        this.X = 0;
        this.D.post(new nh.f0(this.f19265c, 9));
        this.P = true;
    }

    public final void y() {
        for (q qVar : this.H) {
            qVar.A(this.f19267d0);
        }
        this.f19267d0 = false;
    }

    @Override
    public final void n(m3.t tVar) {
    }
}
