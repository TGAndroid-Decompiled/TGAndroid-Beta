package o2;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b2.p1;
import b2.t0;
import b2.v;
import b2.v0;
import b2.w;
import c3.c0;
import c3.j0;
import e2.m0;
import e9.n0;
import g2.b0;
import i2.u0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ki.t1;
import ki.u;
import u2.c1;
import u2.g1;
import u2.s1;
import v7.u6;
public final class q implements y2.g, y2.j, g1, c3.q, c1 {
    public static final Set f17636p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final List E;
    public final n F;
    public final n G;
    public final Handler H;
    public final ArrayList I;
    public final Map J;
    public v2.f K;
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
    public w V;
    public w W;
    public boolean X;
    public s1 Y;
    public Set Z;
    public final String f17637a;
    public int[] f17638a0;
    public final int f17639b;
    public int f17640b0;
    public final le.b f17641c;
    public boolean f17642c0;
    public final i d;
    public boolean[] f17643d0;
    public final androidx.biometric.e e;
    public boolean[] f17644e0;
    public final w f17645f;
    public long f17646f0;
    public long f17647g0;
    public final n2.n h;
    public boolean f17648h0;
    public boolean f17649i0;
    public boolean f17650j0;
    public long f17651k0;
    public boolean f17652l0;
    public long m0;
    public final n2.k f17653n;
    public b2.s f17654n0;
    public j f17655o0;
    public final oa.d f17656r;
    public final y2.l f17657s;
    public final a5.a v;
    public final int f17658w;
    public final androidx.activity.o f17659x;
    public final ArrayList f17660y;

    public q(String str, int i10, le.b bVar, i iVar, Map map, androidx.biometric.e eVar, long j10, w wVar, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, int i11, z2.a aVar2) {
        y2.l lVar;
        this.f17637a = str;
        this.f17639b = i10;
        this.f17641c = bVar;
        this.d = iVar;
        this.J = map;
        this.e = eVar;
        this.f17645f = wVar;
        this.h = nVar;
        this.f17653n = kVar;
        this.f17656r = dVar;
        this.v = aVar;
        this.f17658w = i11;
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("Loader:HlsSampleStreamWrapper");
        }
        this.f17657s = lVar;
        ?? obj = new Object();
        obj.f2672b = null;
        obj.f2671a = false;
        obj.f2673c = null;
        this.f17659x = obj;
        this.M = new int[0];
        Set set = f17636p0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f17644e0 = new boolean[0];
        this.f17643d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f17660y = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f17630b;

            {
                this.f17630b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f17630b.B();
                        return;
                    default:
                        q qVar = this.f17630b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f17651k0);
                        }
                        qVar.S = true;
                        qVar.B();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f17630b;

            {
                this.f17630b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f17630b.B();
                        return;
                    default:
                        q qVar = this.f17630b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f17651k0);
                        }
                        qVar.S = true;
                        qVar.B();
                        return;
                }
            }
        };
        this.H = m0.q(null);
        this.f17646f0 = j10;
        this.f17647g0 = j10;
        this.f17651k0 = Long.MIN_VALUE;
    }

    public static c3.n h(int i10, int i11) {
        e2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static w w(w wVar, w wVar2, boolean z10) {
        String b10;
        int i10;
        int i11;
        if (wVar == null) {
            return wVar2;
        }
        String str = wVar.f4124k;
        String str2 = wVar2.f4132s;
        int h = v0.h(str2);
        if (m0.v(h, str) == 1) {
            b10 = m0.w(h, str);
            str2 = v0.d(b10);
        } else {
            b10 = v0.b(str, str2);
        }
        wVar2.f4127n = wVar.f4127n;
        wVar2.f4128o = wVar.f4128o;
        wVar2.f4129p = wVar.f4129p;
        wVar2.f4130q = wVar.f4130q;
        v a2 = wVar2.a();
        a2.f4065a = wVar.f4117a;
        a2.f4066b = wVar.f4118b;
        a2.f4067c = n0.u(wVar.f4119c);
        a2.d = wVar.d;
        a2.e = wVar.e;
        a2.f4068f = wVar.f4120f;
        if (z10) {
            i10 = wVar.h;
        } else {
            i10 = -1;
        }
        a2.h = i10;
        if (z10) {
            i11 = wVar.f4122i;
        } else {
            i11 = -1;
        }
        a2.f4070i = i11;
        a2.f4071j = b10;
        a2.f4077p = wVar.f4129p;
        a2.f4075n = wVar.f4128o;
        a2.f4074m = wVar.f4127n;
        a2.f4076o = wVar.f4130q;
        if (h == 2) {
            a2.f4085y = wVar.f4138z;
            a2.f4086z = wVar.A;
            a2.C = wVar.D;
        }
        if (str2 != null) {
            a2.f4079r = v0.n(str2);
        }
        int i12 = wVar.K;
        if (i12 != -1 && h == 1) {
            a2.J = i12;
        }
        t0 t0Var = wVar.f4125l;
        if (t0Var != null) {
            t0 t0Var2 = wVar2.f4125l;
            if (t0Var2 != null) {
                t0Var = t0Var2.b(t0Var);
            }
            a2.f4072k = t0Var;
        }
        return new w(a2);
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
        if (this.f17647g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void B() {
        boolean z10;
        int i10;
        w w9;
        if (!this.X && this.f17638a0 == null && this.S) {
            int i11 = 0;
            for (p pVar : this.L) {
                if (pVar.y() == null) {
                    return;
                }
            }
            s1 s1Var = this.Y;
            if (s1Var != null) {
                int i12 = s1Var.f47421a;
                int[] iArr = new int[i12];
                this.f17638a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i14 < pVarArr.length) {
                            w y3 = pVarArr[i14].y();
                            y3.getClass();
                            w wVar = this.Y.a(i13).d[0];
                            String str = y3.f4132s;
                            String str2 = wVar.f4132s;
                            int h = v0.h(str);
                            if (h != 3) {
                                if (h == v0.h(str2)) {
                                    break;
                                }
                                i14++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y3.P == wVar.P) {
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                    this.f17638a0[i13] = i14;
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
                w y10 = this.L[i15].y();
                y10.getClass();
                String str3 = y10.f4132s;
                if (v0.m(str3)) {
                    i18 = 2;
                } else if (!v0.i(str3)) {
                    if (v0.l(str3)) {
                        i18 = 3;
                    } else {
                        i18 = -2;
                    }
                }
                if (z(i18) > z(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            p1 p1Var = this.d.h;
            int i19 = p1Var.f3904a;
            this.f17640b0 = -1;
            this.f17638a0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.f17638a0[i20] = i20;
            }
            p1[] p1VarArr = new p1[length];
            int i21 = 0;
            while (i21 < length) {
                w y11 = this.L[i21].y();
                y11.getClass();
                w wVar2 = this.f17645f;
                String str4 = this.f17637a;
                if (i21 == i16) {
                    w[] wVarArr = new w[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        w wVar3 = p1Var.d[i22];
                        if (i17 == 1 && wVar2 != null) {
                            wVar3 = wVar3.d(wVar2);
                        }
                        if (i19 == 1) {
                            w9 = y11.d(wVar3);
                        } else {
                            w9 = w(wVar3, y11, true);
                        }
                        wVarArr[i22] = w9;
                    }
                    p1VarArr[i21] = new p1(str4, wVarArr);
                    this.f17640b0 = i21;
                    i10 = 0;
                } else {
                    wVar2 = (i17 == 2 && v0.i(y11.f4132s)) ? null : null;
                    StringBuilder i23 = r4.c.i(str4, ":muxed:");
                    i23.append(i21 < i16 ? i21 : i21 - 1);
                    String sb2 = i23.toString();
                    i10 = 0;
                    v a2 = w(wVar2, y11, false).a();
                    a2.f4073l = str4;
                    p1VarArr[i21] = new p1(sb2, new w(a2));
                }
                i21++;
                i11 = i10;
            }
            int i24 = i11;
            this.Y = v(p1VarArr);
            if (this.Z == null) {
                z10 = 1;
            } else {
                z10 = i24;
            }
            u6.p(z10);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.f17641c.g0();
        }
    }

    public final void C() {
        this.f17657s.a();
        i iVar = this.d;
        u2.b bVar = iVar.f17593n;
        if (bVar == null) {
            Uri uri = iVar.f17594o;
            if (uri != null && uri.equals(iVar.f17595p)) {
                iVar.f17587g.h(iVar.f17594o);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void D(p1[] p1VarArr, int... iArr) {
        this.Y = v(p1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.f17640b0 = 0;
        this.H.post(new u(this.f17641c, 10));
        this.T = true;
    }

    public final void E() {
        for (p pVar : this.L) {
            pVar.G(this.f17648h0);
        }
        this.f17648h0 = false;
    }

    public final boolean F(long j10, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean J;
        this.f17646f0 = j10;
        if (A()) {
            this.f17647g0 = j10;
            return true;
        }
        boolean z13 = this.d.f17596q;
        ArrayList arrayList = this.f17660y;
        if (z13) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                jVar = (j) arrayList.get(i10);
                if (jVar.h == j10) {
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
                    J = pVar.I(jVar.f(i11));
                } else {
                    long d = d();
                    if (d != Long.MIN_VALUE && j10 >= d) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    J = pVar.J(j10, z12);
                }
                if (!J && (this.f17644e0[i11] || !this.f17642c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f17647g0 = j10;
        this.f17650j0 = false;
        arrayList.clear();
        y2.l lVar = this.f17657s;
        if (lVar.d()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.l();
                }
            }
            lVar.b();
            return true;
        }
        lVar.f49927c = null;
        E();
        return true;
    }

    @Override
    public final void H() {
        this.f17652l0 = true;
        this.H.post(this.G);
    }

    @Override
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        long j12 = fVar.f47884a;
        g2.m mVar = fVar.f47885b;
        b0 b0Var = fVar.f47889r;
        u2.u uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        this.f17656r.getClass();
        this.v.q(uVar, fVar.f47886c, this.f17639b, fVar.d, fVar.e, fVar.f47887f, fVar.h, fVar.f47888n);
        if (!z10) {
            if (A() || this.U == 0) {
                E();
            }
            if (this.U > 0) {
                this.f17641c.v(this);
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
            pVar.G(true);
            n2.h hVar = pVar.h;
            if (hVar != null) {
                hVar.a(pVar.e);
                pVar.h = null;
                pVar.f47274g = null;
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f17657s.d();
    }

    @Override
    public final long d() {
        if (A()) {
            return this.f17647g0;
        }
        if (this.f17650j0) {
            return Long.MIN_VALUE;
        }
        return y().f47888n;
    }

    public final void e() {
        u6.p(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean f(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.f17660y;
            if (i11 < arrayList.size()) {
                if (((j) arrayList.get(i11)).f17601b0) {
                    return false;
                }
                i11++;
            } else {
                j jVar = (j) arrayList.get(i10);
                for (int i12 = 0; i12 < this.L.length; i12++) {
                    if (this.L[i12].v() > jVar.f(i12)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @Override
    public final k4.d j(y2.i r24, long r25, long r27, java.io.IOException r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.j(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final j0 j0(int i10, int i11) {
        j jVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f17636p0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            u6.g(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.M[i12] = i10;
                }
                r52 = this.M[i12] == i10 ? this.L[i12] : h(i10, i11);
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
            if (this.f17652l0) {
                return h(i10, i11);
            }
            int length = this.L.length;
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            }
            r52 = new p(this.e, this.h, this.f17653n, this.J);
            r52.f47286t = this.f17646f0;
            if (z10) {
                r52.K = this.f17654n0;
                r52.B = true;
            }
            long j10 = this.m0;
            if (r52.H != j10) {
                r52.H = j10;
                r52.B = true;
            }
            if (this.f17655o0 != null) {
                r52.E = jVar.v;
            }
            r52.f47273f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = m0.f8253a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f17644e0, i14);
            this.f17644e0 = copyOf3;
            copyOf3[length] = z10;
            this.f17642c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (z(i11) > z(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.f17643d0 = Arrays.copyOf(this.f17643d0, i14);
        }
        if (i11 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f17658w);
            }
            return this.P;
        }
        return r52;
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        v2.f fVar = (v2.f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f47884a;
            uVar = new u2.u(fVar.f47885b, j10);
        } else {
            long j13 = fVar.f47884a;
            g2.m mVar = fVar.f47885b;
            b0 b0Var = fVar.f47889r;
            uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        }
        this.v.v(uVar, fVar.f47886c, this.f17639b, fVar.d, fVar.e, fVar.f47887f, fVar.h, fVar.f47888n, i10);
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f17577s;
            i iVar2 = this.d;
            iVar2.f17592m = bArr;
            t1 t1Var = iVar2.f17589j;
            Uri uri = eVar.f47885b.f10792a;
            byte[] bArr2 = eVar.f17578w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) t1Var.f15524b).put(uri, bArr2);
        }
        long j12 = fVar.f47884a;
        g2.m mVar = fVar.f47885b;
        b0 b0Var = fVar.f47889r;
        u2.u uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        this.f17656r.getClass();
        this.v.r(uVar, fVar.f47886c, this.f17639b, fVar.d, fVar.e, fVar.f47887f, fVar.h, fVar.f47888n);
        if (!this.T) {
            i2.t0 t0Var = new i2.t0();
            t0Var.f12588a = this.f17646f0;
            p(new u0(t0Var));
            return;
        }
        this.f17641c.v(this);
    }

    @Override
    public final boolean p(i2.u0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.p(i2.u0):boolean");
    }

    @Override
    public final long s() {
        if (this.f17650j0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f17647g0;
        }
        long j10 = this.f17646f0;
        j y3 = y();
        if (!y3.X) {
            ArrayList arrayList = this.f17660y;
            if (arrayList.size() > 1) {
                y3 = (j) i2.d.h(2, arrayList);
            } else {
                y3 = null;
            }
        }
        if (y3 != null) {
            j10 = Math.max(j10, y3.f47888n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j10 = Math.max(j10, pVar.s());
            }
        }
        return j10;
    }

    @Override
    public final void u(long j10) {
        int size;
        y2.l lVar = this.f17657s;
        if (!lVar.c() && !A()) {
            boolean d = lVar.d();
            boolean z10 = false;
            boolean z11 = false;
            int i10 = 0;
            z10 = false;
            i iVar = this.d;
            List list = this.E;
            if (d) {
                this.K.getClass();
                v2.f fVar = this.K;
                if (iVar.f17593n == null) {
                    z11 = iVar.f17597r.d(j10, fVar, list);
                }
                if (z11) {
                    lVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.c((j) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                x(size2);
            }
            if (iVar.f17593n == null && iVar.f17597r.length() >= 2) {
                size = iVar.f17597r.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.f17660y.size()) {
                x(size);
            }
            if (this.S && this.f17651k0 != Long.MIN_VALUE) {
                boolean z12 = true;
                while (true) {
                    p[] pVarArr = this.L;
                    if (i10 >= pVarArr.length) {
                        break;
                    }
                    if (this.f17643d0[i10] && (this.f17644e0[i10] || !this.f17642c0)) {
                        z12 &= pVarArr[i10].z();
                    }
                    i10++;
                }
                z10 = z12;
            }
            if (z10) {
                this.f17650j0 = true;
            }
        }
    }

    public final s1 v(p1[] p1VarArr) {
        for (int i10 = 0; i10 < p1VarArr.length; i10++) {
            p1 p1Var = p1VarArr[i10];
            w[] wVarArr = new w[p1Var.f3904a];
            for (int i11 = 0; i11 < p1Var.f3904a; i11++) {
                w wVar = p1Var.d[i11];
                int I0 = this.h.I0(wVar);
                v a2 = wVar.a();
                a2.S = I0;
                wVarArr[i11] = new w(a2);
            }
            p1VarArr[i10] = new p1(p1Var.f3905b, wVarArr);
        }
        return new s1(p1VarArr);
    }

    public final void x(int i10) {
        ArrayList arrayList;
        u6.p(!this.f17657s.d());
        while (true) {
            arrayList = this.f17660y;
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
        long j10 = y().f47888n;
        j jVar = (j) arrayList.get(i10);
        m0.X(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].o(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f17647g0 = this.f17646f0;
        } else {
            ((j) e9.s.m(arrayList)).Z = true;
        }
        this.f17650j0 = false;
        this.v.C(this.Q, jVar.h, j10);
    }

    public final j y() {
        return (j) i2.d.h(1, this.f17660y);
    }

    @Override
    public final void g0(c0 c0Var) {
    }
}
