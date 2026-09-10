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
import gg.v1;
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
import m.g3;
import u2.b1;
import u2.f1;
import u2.q1;
import u2.u;
import w7.f8;
public final class q implements y2.i, y2.l, f1, c3.q, b1 {
    public static final Set f14211o0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public q1 Y;
    public Set Z;
    public final String f14212a;
    public int[] f14213a0;
    public final int f14214b;
    public int f14215b0;
    public final o0.b f14216c;
    public boolean f14217c0;
    public final i d;
    public boolean[] f14218d0;
    public final y2.d e;
    public boolean[] f14219e0;
    public final b2.s f14220f;
    public long f14221f0;
    public long f14222g0;
    public final n2.n h;
    public boolean f14223h0;
    public boolean f14224i0;
    public boolean f14225j0;
    public boolean f14226k0;
    public long f14227l0;
    public b2.o m0;
    public final n2.j f14228n;
    public j f14229n0;
    public final rb.a f14230r;
    public final y2.n f14231s = new y2.n("Loader:HlsSampleStreamWrapper");
    public final a5.a v;
    public final int f14232w;
    public final androidx.activity.o f14233x;
    public final ArrayList f14234y;

    public q(String str, int i10, o0.b bVar, i iVar, Map map, y2.d dVar, long j3, b2.s sVar, n2.n nVar, n2.j jVar, rb.a aVar, a5.a aVar2, int i11) {
        this.f14212a = str;
        this.f14214b = i10;
        this.f14216c = bVar;
        this.d = iVar;
        this.J = map;
        this.e = dVar;
        this.f14220f = sVar;
        this.h = nVar;
        this.f14228n = jVar;
        this.f14230r = aVar;
        this.v = aVar2;
        this.f14232w = i11;
        androidx.activity.o oVar = new androidx.activity.o();
        oVar.f592c = null;
        oVar.f591b = false;
        oVar.d = null;
        this.f14233x = oVar;
        this.M = new int[0];
        Set set = f14211o0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f14219e0 = new boolean[0];
        this.f14218d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f14234y = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f14205b;

            {
                this.f14205b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14205b.D();
                        return;
                    default:
                        q qVar = this.f14205b;
                        qVar.S = true;
                        qVar.D();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f14205b;

            {
                this.f14205b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14205b.D();
                        return;
                    default:
                        q qVar = this.f14205b;
                        qVar.S = true;
                        qVar.D();
                        return;
                }
            }
        };
        this.H = d0.o(null);
        this.f14221f0 = j3;
        this.f14222g0 = j3;
    }

    public static c3.n t(int i10, int i11) {
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
        String str = sVar.f1995k;
        String str2 = sVar2.f2002r;
        int h = r0.h(str2);
        if (d0.u(h, str) == 1) {
            b10 = d0.v(h, str);
            str2 = r0.d(b10);
        } else {
            b10 = r0.b(str, str2);
        }
        sVar2.f1997m = sVar.f1997m;
        sVar2.f1998n = sVar.f1998n;
        sVar2.f1999o = sVar.f1999o;
        sVar2.f2000p = sVar.f2000p;
        b2.r a2 = sVar2.a();
        a2.f1933a = sVar.f1988a;
        a2.f1934b = sVar.f1989b;
        a2.f1935c = i0.v(sVar.f1990c);
        a2.d = sVar.d;
        a2.e = sVar.e;
        a2.f1936f = sVar.f1991f;
        if (z10) {
            i10 = sVar.h;
        } else {
            i10 = -1;
        }
        a2.h = i10;
        if (z10) {
            i11 = sVar.f1993i;
        } else {
            i11 = -1;
        }
        a2.f1938i = i11;
        a2.f1939j = b10;
        a2.f1944o = sVar.f1999o;
        a2.f1942m = sVar.f1998n;
        a2.f1941l = sVar.f1997m;
        a2.f1943n = sVar.f2000p;
        if (h == 2) {
            a2.f1952x = sVar.f2008y;
            a2.f1953y = sVar.f2009z;
            a2.B = sVar.C;
        }
        if (str2 != null) {
            a2.f1946q = r0.n(str2);
        }
        int i12 = sVar.J;
        if (i12 != -1 && h == 1) {
            a2.I = i12;
        }
        p0 p0Var = sVar.f1996l;
        if (p0Var != null) {
            p0 p0Var2 = sVar2.f1996l;
            if (p0Var2 != null) {
                p0Var = p0Var2.b(p0Var);
            }
            a2.f1940k = p0Var;
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
        if (this.f14222g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void B() {
        this.f14226k0 = true;
        this.H.post(this.G);
    }

    @Override
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        v2.e eVar = (v2.e) kVar;
        this.K = null;
        long j11 = eVar.f42862a;
        Uri uri = eVar.f42867r.f8480c;
        u uVar = new u(j10);
        this.f14230r.getClass();
        this.v.m(uVar, eVar.f42864c, this.f14214b, eVar.d, eVar.e, eVar.f42865f, eVar.h, eVar.f42866n);
        if (!z10) {
            if (A() || this.U == 0) {
                H();
            }
            if (this.U > 0) {
                this.f14216c.g(this);
            }
        }
    }

    public final void D() {
        boolean z10;
        b2.s w10;
        if (!this.X && this.f14213a0 == null && this.S) {
            int i10 = 0;
            for (p pVar : this.L) {
                if (pVar.w() == null) {
                    return;
                }
            }
            q1 q1Var = this.Y;
            if (q1Var != null) {
                int i11 = q1Var.f42436a;
                int[] iArr = new int[i11];
                this.f14213a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i13 < pVarArr.length) {
                            b2.s w11 = pVarArr[i13].w();
                            e2.d.h(w11);
                            b2.s sVar = this.Y.a(i12).d[0];
                            String str = w11.f2002r;
                            String str2 = sVar.f2002r;
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
                    this.f14213a0[i12] = i13;
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
                String str3 = w12.f2002r;
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
            int i18 = l1Var.f1784a;
            this.f14215b0 = -1;
            this.f14213a0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f14213a0[i19] = i19;
            }
            l1[] l1VarArr = new l1[length];
            for (int i20 = 0; i20 < length; i20++) {
                b2.s w13 = this.L[i20].w();
                e2.d.h(w13);
                String str4 = this.f14212a;
                b2.s sVar2 = this.f14220f;
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
                    this.f14215b0 = i20;
                } else {
                    sVar2 = (i15 == 2 && r0.i(w13.f2002r)) ? null : null;
                    StringBuilder g10 = w.f.g(str4, ":muxed:");
                    g10.append(i20 < i16 ? i20 : i20 - 1);
                    l1VarArr[i20] = new l1(g10.toString(), w(sVar2, w13, false));
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
            this.f14216c.A();
        }
    }

    public final void E() {
        this.f14231s.a();
        i iVar = this.d;
        u2.b bVar = iVar.f14168n;
        if (bVar == null) {
            Uri uri = iVar.f14169o;
            if (uri != null && uri.equals(iVar.f14170p)) {
                p2.c cVar = iVar.f14162g;
                p2.b bVar2 = (p2.b) cVar.d.get(iVar.f14169o);
                bVar2.f39525b.a();
                IOException iOException = bVar2.f39530s;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void F(l1[] l1VarArr, int... iArr) {
        this.Y = v(l1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.f14215b0 = 0;
        this.H.post(new v1(this.f14216c, 23));
        this.T = true;
    }

    public final void H() {
        for (p pVar : this.L) {
            pVar.D(this.f14223h0);
        }
        this.f14223h0 = false;
    }

    @Override
    public final h0 I(int i10, int i11) {
        j jVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f14211o0;
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
                r52 = this.M[i12] == i10 ? this.L[i12] : t(i10, i11);
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
            if (this.f14226k0) {
                return t(i10, i11);
            }
            int length = this.L.length;
            z10 = (i11 == 1 || i11 == 2) ? true : true;
            r52 = new p(this.e, this.h, this.f14228n, this.J);
            r52.f42303t = this.f14221f0;
            if (z10) {
                r52.I = this.m0;
                r52.f42308z = true;
            }
            long j3 = this.f14227l0;
            if (r52.F != j3) {
                r52.F = j3;
                r52.f42308z = true;
            }
            if (this.f14229n0 != null) {
                r52.C = jVar.v;
            }
            r52.f42290f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = d0.f7188a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f14219e0, i14);
            this.f14219e0 = copyOf3;
            copyOf3[length] = z10;
            this.f14217c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (z(i11) > z(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.f14218d0 = Arrays.copyOf(this.f14218d0, i14);
        }
        if (i11 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f14232w);
            }
            return this.P;
        }
        return r52;
    }

    public final boolean J(long j3, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean G;
        this.f14221f0 = j3;
        if (A()) {
            this.f14222g0 = j3;
            return true;
        }
        boolean z13 = this.d.f14171q;
        ArrayList arrayList = this.f14234y;
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
                if (!G && (this.f14219e0[i11] || !this.f14217c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f14222g0 = j3;
        this.f14225j0 = false;
        arrayList.clear();
        y2.n nVar = this.f14231s;
        if (nVar.d()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.k();
                }
            }
            nVar.b();
            return true;
        }
        nVar.f46447c = null;
        H();
        return true;
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
                pVar.f42291g = null;
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f14231s.d();
    }

    @Override
    public final long d() {
        if (A()) {
            return this.f14222g0;
        }
        if (this.f14225j0) {
            return Long.MIN_VALUE;
        }
        return y().f42866n;
    }

    public final void e() {
        e2.d.g(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean g(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.f14234y;
            if (i11 < arrayList.size()) {
                if (((j) arrayList.get(i11)).f14176b0) {
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
    public final k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        k4.d dVar;
        int i11;
        v2.e eVar = (v2.e) kVar;
        boolean z11 = eVar instanceof j;
        if (z11 && !((j) eVar).g() && (iOException instanceof x) && ((i11 = ((x) iOException).d) == 410 || i11 == 404)) {
            return y2.n.d;
        }
        long j11 = eVar.f42867r.f8479b;
        Uri uri = eVar.f42867r.f8480c;
        u uVar = new u(j10);
        d0.e0(eVar.h);
        d0.e0(eVar.f42866n);
        b0 b0Var = new b0(iOException, i10, 11);
        i iVar = this.d;
        y2.g a2 = f8.a(iVar.f14172r);
        this.f14230r.getClass();
        k4.d n32 = rb.a.n3(a2, b0Var);
        boolean z12 = false;
        if (n32 != null && n32.f12278a == 2) {
            long j12 = n32.f12279b;
            x2.r rVar = iVar.f14172r;
            z10 = rVar.o(rVar.u(iVar.h.a(eVar.d)), j12);
        } else {
            z10 = false;
        }
        if (z10) {
            if (z11 && j11 == 0) {
                ArrayList arrayList = this.f14234y;
                if (((j) hc.b.z(1, arrayList)) == eVar) {
                    z12 = true;
                }
                e2.d.g(z12);
                if (arrayList.isEmpty()) {
                    this.f14222g0 = this.f14221f0;
                } else {
                    ((j) e9.q.l(arrayList)).Z = true;
                }
            }
            dVar = y2.n.e;
        } else {
            long p32 = rb.a.p3(b0Var);
            if (p32 != -9223372036854775807L) {
                dVar = new k4.d(0, p32, false);
            } else {
                dVar = y2.n.f46444f;
            }
        }
        k4.d dVar2 = dVar;
        boolean a10 = dVar2.a();
        this.v.p(uVar, eVar.f42864c, this.f14214b, eVar.d, eVar.e, eVar.f42865f, eVar.h, eVar.f42866n, iOException, !a10);
        if (!a10) {
            this.K = null;
        }
        if (z10) {
            if (!this.T) {
                i2.p0 p0Var = new i2.p0();
                p0Var.f10340a = this.f14221f0;
                n(new q0(p0Var));
                return dVar2;
            }
            this.f14216c.g(this);
        }
        return dVar2;
    }

    @Override
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        v2.e eVar = (v2.e) kVar;
        if (i10 == 0) {
            long j11 = eVar.f42862a;
            uVar = new u(eVar.f42863b);
        } else {
            long j12 = eVar.f42862a;
            Uri uri = eVar.f42867r.f8480c;
            uVar = new u(j10);
        }
        u uVar2 = uVar;
        this.v.r(uVar2, eVar.f42864c, this.f14214b, eVar.d, eVar.e, eVar.f42865f, eVar.h, eVar.f42866n, i10);
    }

    @Override
    public final boolean n(i2.q0 r73) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.n(i2.q0):boolean");
    }

    @Override
    public final void p(y2.k kVar, long j3, long j10) {
        v2.e eVar = (v2.e) kVar;
        this.K = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f14152s;
            i iVar = this.d;
            iVar.f14167m = bArr;
            g3 g3Var = iVar.f14164j;
            Uri uri = eVar2.f42863b.f8508a;
            byte[] bArr2 = eVar2.f14153w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) g3Var.f13018b).put(uri, bArr2);
        }
        long j11 = eVar.f42862a;
        Uri uri2 = eVar.f42867r.f8480c;
        u uVar = new u(j10);
        this.f14230r.getClass();
        this.v.o(uVar, eVar.f42864c, this.f14214b, eVar.d, eVar.e, eVar.f42865f, eVar.h, eVar.f42866n);
        if (!this.T) {
            i2.p0 p0Var = new i2.p0();
            p0Var.f10340a = this.f14221f0;
            n(new q0(p0Var));
            return;
        }
        this.f14216c.g(this);
    }

    @Override
    public final long r() {
        if (this.f14225j0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f14222g0;
        }
        long j3 = this.f14221f0;
        j y3 = y();
        if (!y3.X) {
            ArrayList arrayList = this.f14234y;
            if (arrayList.size() > 1) {
                y3 = (j) hc.b.i(2, arrayList);
            } else {
                y3 = null;
            }
        }
        if (y3 != null) {
            j3 = Math.max(j3, y3.f42866n);
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
        y2.n nVar = this.f14231s;
        if (!nVar.c() && !A()) {
            boolean d10 = nVar.d();
            i iVar = this.d;
            List list = this.E;
            if (d10) {
                this.K.getClass();
                v2.e eVar = this.K;
                if (iVar.f14168n != null) {
                    d = false;
                } else {
                    d = iVar.f14172r.d(j3, eVar, list);
                }
                if (d) {
                    nVar.b();
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
            if (iVar.f14168n == null && iVar.f14172r.length() >= 2) {
                size = iVar.f14172r.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < this.f14234y.size()) {
                x(size);
            }
        }
    }

    public final q1 v(l1[] l1VarArr) {
        for (int i10 = 0; i10 < l1VarArr.length; i10++) {
            l1 l1Var = l1VarArr[i10];
            b2.s[] sVarArr = new b2.s[l1Var.f1784a];
            for (int i11 = 0; i11 < l1Var.f1784a; i11++) {
                b2.s sVar = l1Var.d[i11];
                int L0 = this.h.L0(sVar);
                b2.r a2 = sVar.a();
                a2.R = L0;
                sVarArr[i11] = new b2.s(a2);
            }
            l1VarArr[i10] = new l1(l1Var.f1785b, sVarArr);
        }
        return new q1(l1VarArr);
    }

    public final void x(int i10) {
        ArrayList arrayList;
        e2.d.g(!this.f14231s.d());
        while (true) {
            arrayList = this.f14234y;
            if (i10 < arrayList.size()) {
                if (g(i10)) {
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
        long j3 = y().f42866n;
        j jVar = (j) arrayList.get(i10);
        d0.V(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].n(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f14222g0 = this.f14221f0;
        } else {
            ((j) e9.q.l(arrayList)).Z = true;
        }
        this.f14225j0 = false;
        this.v.x(this.Q, jVar.h, j3);
    }

    public final j y() {
        return (j) hc.b.i(1, this.f14234y);
    }

    @Override
    public final void G(c3.b0 b0Var) {
    }
}
