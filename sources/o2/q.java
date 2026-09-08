package o2;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b2.l1;
import b2.p0;
import b2.r0;
import c3.h0;
import c5.b0;
import e2.d0;
import e9.i0;
import g2.x;
import i2.q0;
import ig.t0;
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
import u2.d1;
import u2.o1;
import u2.z0;
import w7.f8;
public final class q implements y2.h, y2.k, d1, c3.q, z0 {
    public static final Set f16935o0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public o1 Y;
    public Set Z;
    public final String f16936a;
    public int[] f16937a0;
    public final int f16938b;
    public int f16939b0;
    public final mg.n f16940c;
    public boolean f16941c0;
    public final i d;
    public boolean[] f16942d0;
    public final y2.d f16943e;
    public boolean[] f16944e0;
    public final b2.s f16945f;
    public long f16946f0;
    public long f16947g0;
    public final n2.m h;
    public boolean f16948h0;
    public boolean f16949i0;
    public boolean f16950j0;
    public boolean f16951k0;
    public long f16952l0;
    public b2.o m0;
    public final n2.j f16953n;
    public j f16954n0;
    public final rb.a f16955r;
    public final y2.m f16956s = new y2.m("Loader:HlsSampleStreamWrapper");
    public final a5.a v;
    public final int f16957w;
    public final androidx.activity.o f16958x;
    public final ArrayList f16959y;

    public q(String str, int i10, mg.n nVar, i iVar, Map map, y2.d dVar, long j3, b2.s sVar, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, int i11) {
        this.f16936a = str;
        this.f16938b = i10;
        this.f16940c = nVar;
        this.d = iVar;
        this.J = map;
        this.f16943e = dVar;
        this.f16945f = sVar;
        this.h = mVar;
        this.f16953n = jVar;
        this.f16955r = aVar;
        this.v = aVar2;
        this.f16957w = i11;
        androidx.activity.o oVar = new androidx.activity.o();
        oVar.f896c = null;
        oVar.f895b = false;
        oVar.d = null;
        this.f16958x = oVar;
        this.M = new int[0];
        Set set = f16935o0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f16944e0 = new boolean[0];
        this.f16942d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f16959y = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f16928b;

            {
                this.f16928b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f16928b.C();
                        return;
                    default:
                        q qVar = this.f16928b;
                        qVar.S = true;
                        qVar.C();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f16928b;

            {
                this.f16928b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f16928b.C();
                        return;
                    default:
                        q qVar = this.f16928b;
                        qVar.S = true;
                        qVar.C();
                        return;
                }
            }
        };
        this.H = d0.o(null);
        this.f16946f0 = j3;
        this.f16947g0 = j3;
    }

    public static int A(int i10) {
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

    public static c3.n m(int i10, int i11) {
        e2.a.n("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static b2.s x(b2.s sVar, b2.s sVar2, boolean z10) {
        String b10;
        int i10;
        int i11;
        if (sVar == null) {
            return sVar2;
        }
        String str = sVar.f2390k;
        String str2 = sVar2.f2397r;
        int h = r0.h(str2);
        if (d0.u(h, str) == 1) {
            b10 = d0.v(h, str);
            str2 = r0.d(b10);
        } else {
            b10 = r0.b(str, str2);
        }
        sVar2.f2392m = sVar.f2392m;
        sVar2.f2393n = sVar.f2393n;
        sVar2.f2394o = sVar.f2394o;
        sVar2.f2395p = sVar.f2395p;
        b2.r a2 = sVar2.a();
        a2.f2325a = sVar.f2382a;
        a2.f2326b = sVar.f2383b;
        a2.f2327c = i0.v(sVar.f2384c);
        a2.d = sVar.d;
        a2.f2328e = sVar.f2385e;
        a2.f2329f = sVar.f2386f;
        if (z10) {
            i10 = sVar.h;
        } else {
            i10 = -1;
        }
        a2.h = i10;
        if (z10) {
            i11 = sVar.f2388i;
        } else {
            i11 = -1;
        }
        a2.f2331i = i11;
        a2.f2332j = b10;
        a2.f2337o = sVar.f2394o;
        a2.f2335m = sVar.f2393n;
        a2.f2334l = sVar.f2392m;
        a2.f2336n = sVar.f2395p;
        if (h == 2) {
            a2.f2345x = sVar.f2403y;
            a2.f2346y = sVar.f2404z;
            a2.B = sVar.C;
        }
        if (str2 != null) {
            a2.f2339q = r0.n(str2);
        }
        int i12 = sVar.J;
        if (i12 != -1 && h == 1) {
            a2.I = i12;
        }
        p0 p0Var = sVar.f2391l;
        if (p0Var != null) {
            p0 p0Var2 = sVar2.f2391l;
            if (p0Var2 != null) {
                p0Var = p0Var2.b(p0Var);
            }
            a2.f2333k = p0Var;
        }
        return new b2.s(a2);
    }

    public final boolean B() {
        if (this.f16947g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void C() {
        boolean z10;
        b2.s x10;
        if (!this.X && this.f16937a0 == null && this.S) {
            int i10 = 0;
            for (p pVar : this.L) {
                if (pVar.w() == null) {
                    return;
                }
            }
            o1 o1Var = this.Y;
            if (o1Var != null) {
                int i11 = o1Var.f46801a;
                int[] iArr = new int[i11];
                this.f16937a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i13 < pVarArr.length) {
                            b2.s w10 = pVarArr[i13].w();
                            e2.d.h(w10);
                            b2.s sVar = this.Y.a(i12).d[0];
                            String str = w10.f2397r;
                            String str2 = sVar.f2397r;
                            int h = r0.h(str);
                            if (h != 3) {
                                if (h == r0.h(str2)) {
                                    break;
                                }
                                i13++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || w10.O == sVar.O) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    this.f16937a0[i12] = i13;
                }
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((m) obj).a();
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
                b2.s w11 = this.L[i14].w();
                e2.d.h(w11);
                String str3 = w11.f2397r;
                if (r0.m(str3)) {
                    i17 = 2;
                } else if (!r0.i(str3)) {
                    if (r0.l(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (A(i17) > A(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            l1 l1Var = this.d.h;
            int i18 = l1Var.f2169a;
            this.f16939b0 = -1;
            this.f16937a0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f16937a0[i19] = i19;
            }
            l1[] l1VarArr = new l1[length];
            for (int i20 = 0; i20 < length; i20++) {
                b2.s w12 = this.L[i20].w();
                e2.d.h(w12);
                String str4 = this.f16936a;
                b2.s sVar2 = this.f16945f;
                if (i20 == i16) {
                    b2.s[] sVarArr = new b2.s[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        b2.s sVar3 = l1Var.d[i21];
                        if (i15 == 1 && sVar2 != null) {
                            sVar3 = sVar3.d(sVar2);
                        }
                        if (i18 == 1) {
                            x10 = w12.d(sVar3);
                        } else {
                            x10 = x(sVar3, w12, true);
                        }
                        sVarArr[i21] = x10;
                    }
                    l1VarArr[i20] = new l1(str4, sVarArr);
                    this.f16939b0 = i20;
                } else {
                    sVar2 = (i15 == 2 && r0.i(w12.f2397r)) ? null : null;
                    StringBuilder g10 = w.f.g(str4, ":muxed:");
                    g10.append(i20 < i16 ? i20 : i20 - 1);
                    l1VarArr[i20] = new l1(g10.toString(), x(sVar2, w12, false));
                }
            }
            this.Y = v(l1VarArr);
            if (this.Z == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.f16940c.e();
        }
    }

    public final void D() {
        this.f16956s.b();
        i iVar = this.d;
        u2.b bVar = iVar.f16890n;
        if (bVar == null) {
            Uri uri = iVar.f16891o;
            if (uri != null && uri.equals(iVar.f16892p)) {
                p2.c cVar = iVar.f16884g;
                p2.b bVar2 = (p2.b) cVar.d.get(iVar.f16891o);
                bVar2.f43669b.b();
                IOException iOException = bVar2.f43675s;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void E(l1[] l1VarArr, int... iArr) {
        this.Y = v(l1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.f16939b0 = 0;
        this.H.post(new t0(this.f16940c, 18));
        this.T = true;
    }

    public final void F() {
        for (p pVar : this.L) {
            pVar.D(this.f16948h0);
        }
        this.f16948h0 = false;
    }

    public final boolean G(long j3, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean G;
        this.f16946f0 = j3;
        if (B()) {
            this.f16947g0 = j3;
            return true;
        }
        boolean z13 = this.d.f16893q;
        ArrayList arrayList = this.f16959y;
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
                if (!G && (this.f16944e0[i11] || !this.f16941c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f16947g0 = j3;
        this.f16950j0 = false;
        arrayList.clear();
        y2.m mVar = this.f16956s;
        if (mVar.d()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.k();
                }
            }
            mVar.a();
            return true;
        }
        mVar.f49549c = null;
        F();
        return true;
    }

    @Override
    public final h0 R1(int i10, int i11) {
        j jVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f16935o0;
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
                r52 = this.M[i12] == i10 ? this.L[i12] : m(i10, i11);
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
            if (this.f16951k0) {
                return m(i10, i11);
            }
            int length = this.L.length;
            z10 = (i11 == 1 || i11 == 2) ? true : true;
            r52 = new p(this.f16943e, this.h, this.f16953n, this.J);
            r52.f46663t = this.f16946f0;
            if (z10) {
                r52.I = this.m0;
                r52.f46668z = true;
            }
            long j3 = this.f16952l0;
            if (r52.F != j3) {
                r52.F = j3;
                r52.f46668z = true;
            }
            if (this.f16954n0 != null) {
                r52.C = jVar.v;
            }
            r52.f46650f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = d0.f8765a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f16944e0, i14);
            this.f16944e0 = copyOf3;
            copyOf3[length] = z10;
            this.f16941c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (A(i11) > A(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.f16942d0 = Arrays.copyOf(this.f16942d0, i14);
        }
        if (i11 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f16957w);
            }
            return this.P;
        }
        return r52;
    }

    @Override
    public final void Z0() {
        this.f16951k0 = true;
        this.H.post(this.G);
    }

    @Override
    public final void a() {
        p[] pVarArr;
        for (p pVar : this.L) {
            pVar.D(true);
            n2.g gVar = pVar.h;
            if (gVar != null) {
                gVar.a(pVar.f46649e);
                pVar.h = null;
                pVar.f46651g = null;
            }
        }
    }

    @Override
    public final void b() {
        this.H.post(this.F);
    }

    @Override
    public final boolean c() {
        return this.f16956s.d();
    }

    @Override
    public final long d() {
        if (B()) {
            return this.f16947g0;
        }
        if (this.f16950j0) {
            return Long.MIN_VALUE;
        }
        return z().f47331n;
    }

    public final void e() {
        e2.d.g(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean f(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.f16959y;
            if (i11 < arrayList.size()) {
                if (((j) arrayList.get(i11)).f16898b0) {
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
    public final k4.d g(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        k4.d dVar;
        int i11;
        v2.e eVar = (v2.e) jVar;
        boolean z11 = eVar instanceof j;
        if (z11 && !((j) eVar).g() && (iOException instanceof x) && ((i11 = ((x) iOException).d) == 410 || i11 == 404)) {
            return y2.m.d;
        }
        long j11 = eVar.f47332r.f10325b;
        Uri uri = eVar.f47332r.f10326c;
        u2.t tVar = new u2.t(j10);
        d0.e0(eVar.h);
        d0.e0(eVar.f47331n);
        b0 b0Var = new b0(iOException, i10, 11);
        i iVar = this.d;
        y2.g a2 = f8.a(iVar.f16894r);
        this.f16955r.getClass();
        k4.d K3 = rb.a.K3(a2, b0Var);
        boolean z12 = false;
        if (K3 != null && K3.f14757a == 2) {
            long j12 = K3.f14758b;
            x2.r rVar = iVar.f16894r;
            z10 = rVar.o(rVar.u(iVar.h.a(eVar.d)), j12);
        } else {
            z10 = false;
        }
        if (z10) {
            if (z11 && j11 == 0) {
                ArrayList arrayList = this.f16959y;
                if (((j) i2.g.z(1, arrayList)) == eVar) {
                    z12 = true;
                }
                e2.d.g(z12);
                if (arrayList.isEmpty()) {
                    this.f16947g0 = this.f16946f0;
                } else {
                    ((j) e9.q.l(arrayList)).Z = true;
                }
            }
            dVar = y2.m.f49545e;
        } else {
            long M3 = rb.a.M3(b0Var);
            if (M3 != -9223372036854775807L) {
                dVar = new k4.d(0, M3, false);
            } else {
                dVar = y2.m.f49546f;
            }
        }
        k4.d dVar2 = dVar;
        boolean a10 = dVar2.a();
        this.v.p(tVar, eVar.f47328c, this.f16938b, eVar.d, eVar.f47329e, eVar.f47330f, eVar.h, eVar.f47331n, iOException, !a10);
        if (!a10) {
            this.K = null;
        }
        if (z10) {
            if (!this.T) {
                q0 q0Var = new q0();
                q0Var.f11745a = this.f16946f0;
                p(new i2.r0(q0Var));
                return dVar2;
            }
            this.f16940c.b(this);
        }
        return dVar2;
    }

    @Override
    public final void h(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        v2.e eVar = (v2.e) jVar;
        if (i10 == 0) {
            long j11 = eVar.f47326a;
            tVar = new u2.t(eVar.f47327b);
        } else {
            long j12 = eVar.f47326a;
            Uri uri = eVar.f47332r.f10326c;
            tVar = new u2.t(j10);
        }
        u2.t tVar2 = tVar;
        this.v.r(tVar2, eVar.f47328c, this.f16938b, eVar.d, eVar.f47329e, eVar.f47330f, eVar.h, eVar.f47331n, i10);
    }

    @Override
    public final void i(y2.j jVar, long j3, long j10) {
        v2.e eVar = (v2.e) jVar;
        this.K = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f16872s;
            i iVar = this.d;
            iVar.f16889m = bArr;
            l.d dVar = iVar.f16886j;
            Uri uri = eVar2.f47327b.f10358a;
            byte[] bArr2 = eVar2.f16873w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) dVar.f15098b).put(uri, bArr2);
        }
        long j11 = eVar.f47326a;
        Uri uri2 = eVar.f47332r.f10326c;
        u2.t tVar = new u2.t(j10);
        this.f16955r.getClass();
        this.v.o(tVar, eVar.f47328c, this.f16938b, eVar.d, eVar.f47329e, eVar.f47330f, eVar.h, eVar.f47331n);
        if (!this.T) {
            q0 q0Var = new q0();
            q0Var.f11745a = this.f16946f0;
            p(new i2.r0(q0Var));
            return;
        }
        this.f16940c.b(this);
    }

    @Override
    public final boolean p(i2.r0 r73) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.p(i2.r0):boolean");
    }

    @Override
    public final long s() {
        if (this.f16950j0) {
            return Long.MIN_VALUE;
        }
        if (B()) {
            return this.f16947g0;
        }
        long j3 = this.f16946f0;
        j z10 = z();
        if (!z10.X) {
            ArrayList arrayList = this.f16959y;
            if (arrayList.size() > 1) {
                z10 = (j) i2.g.h(2, arrayList);
            } else {
                z10 = null;
            }
        }
        if (z10 != null) {
            j3 = Math.max(j3, z10.f47331n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j3 = Math.max(j3, pVar.q());
            }
        }
        return j3;
    }

    @Override
    public final void u(long j3) {
        int size;
        boolean d;
        y2.m mVar = this.f16956s;
        if (!mVar.c() && !B()) {
            boolean d10 = mVar.d();
            i iVar = this.d;
            List list = this.E;
            if (d10) {
                this.K.getClass();
                v2.e eVar = this.K;
                if (iVar.f16890n != null) {
                    d = false;
                } else {
                    d = iVar.f16894r.d(j3, eVar, list);
                }
                if (d) {
                    mVar.a();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.b((j) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                y(size2);
            }
            if (iVar.f16890n == null && iVar.f16894r.length() >= 2) {
                size = iVar.f16894r.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < this.f16959y.size()) {
                y(size);
            }
        }
    }

    public final o1 v(l1[] l1VarArr) {
        for (int i10 = 0; i10 < l1VarArr.length; i10++) {
            l1 l1Var = l1VarArr[i10];
            b2.s[] sVarArr = new b2.s[l1Var.f2169a];
            for (int i11 = 0; i11 < l1Var.f2169a; i11++) {
                b2.s sVar = l1Var.d[i11];
                int H0 = this.h.H0(sVar);
                b2.r a2 = sVar.a();
                a2.R = H0;
                sVarArr[i11] = new b2.s(a2);
            }
            l1VarArr[i10] = new l1(l1Var.f2170b, sVarArr);
        }
        return new o1(l1VarArr);
    }

    @Override
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        v2.e eVar = (v2.e) jVar;
        this.K = null;
        long j11 = eVar.f47326a;
        Uri uri = eVar.f47332r.f10326c;
        u2.t tVar = new u2.t(j10);
        this.f16955r.getClass();
        this.v.n(tVar, eVar.f47328c, this.f16938b, eVar.d, eVar.f47329e, eVar.f47330f, eVar.h, eVar.f47331n);
        if (!z10) {
            if (B() || this.U == 0) {
                F();
            }
            if (this.U > 0) {
                this.f16940c.b(this);
            }
        }
    }

    public final void y(int i10) {
        ArrayList arrayList;
        e2.d.g(!this.f16956s.d());
        while (true) {
            arrayList = this.f16959y;
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
        long j3 = z().f47331n;
        j jVar = (j) arrayList.get(i10);
        d0.V(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].n(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f16947g0 = this.f16946f0;
        } else {
            ((j) e9.q.l(arrayList)).Z = true;
        }
        this.f16950j0 = false;
        this.v.y(this.Q, jVar.h, j3);
    }

    public final j z() {
        return (j) i2.g.h(1, this.f16959y);
    }

    @Override
    public final void P1(c3.b0 b0Var) {
    }
}
