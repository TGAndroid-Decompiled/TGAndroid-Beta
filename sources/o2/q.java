package o2;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b2.q1;
import b2.u0;
import b2.w;
import b2.w0;
import b2.x;
import c3.i0;
import e2.m0;
import e9.n0;
import g2.b0;
import i2.v0;
import ig.t0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ji.w4;
import u2.b1;
import u2.f1;
import u2.r1;
import u2.u;
import v7.u6;
public final class q implements y2.g, y2.j, f1, c3.q, b1 {
    public static final Set f16239p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public x V;
    public x W;
    public boolean X;
    public r1 Y;
    public Set Z;
    public final String f16240a;
    public int[] f16241a0;
    public final int f16242b;
    public int f16243b0;
    public final w4 f16244c;
    public boolean f16245c0;
    public final i d;
    public boolean[] f16246d0;
    public final androidx.biometric.e e;
    public boolean[] f16247e0;
    public final x f16248f;
    public long f16249f0;
    public long f16250g0;
    public final n2.m h;
    public boolean f16251h0;
    public boolean f16252i0;
    public boolean f16253j0;
    public long f16254k0;
    public boolean f16255l0;
    public long m0;
    public final n2.j f16256n;
    public b2.t f16257n0;
    public j f16258o0;
    public final oa.d f16259r;
    public final y2.l f16260s;
    public final a5.a v;
    public final int f16261w;
    public final androidx.activity.o f16262x;
    public final ArrayList f16263y;

    public q(String str, int i10, w4 w4Var, i iVar, Map map, androidx.biometric.e eVar, long j10, x xVar, n2.m mVar, n2.j jVar, oa.d dVar, a5.a aVar, int i11, z2.a aVar2) {
        y2.l lVar;
        this.f16240a = str;
        this.f16242b = i10;
        this.f16244c = w4Var;
        this.d = iVar;
        this.J = map;
        this.e = eVar;
        this.f16248f = xVar;
        this.h = mVar;
        this.f16256n = jVar;
        this.f16259r = dVar;
        this.v = aVar;
        this.f16261w = i11;
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("Loader:HlsSampleStreamWrapper");
        }
        this.f16260s = lVar;
        ?? obj = new Object();
        obj.f1053b = null;
        obj.f1052a = false;
        obj.f1054c = null;
        this.f16262x = obj;
        this.M = new int[0];
        Set set = f16239p0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f16247e0 = new boolean[0];
        this.f16246d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f16263y = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f16233b;

            {
                this.f16233b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f16233b.B();
                        return;
                    default:
                        q qVar = this.f16233b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f16254k0);
                        }
                        qVar.S = true;
                        qVar.B();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f16233b;

            {
                this.f16233b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f16233b.B();
                        return;
                    default:
                        q qVar = this.f16233b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f16254k0);
                        }
                        qVar.S = true;
                        qVar.B();
                        return;
                }
            }
        };
        this.H = m0.q(null);
        this.f16249f0 = j10;
        this.f16250g0 = j10;
        this.f16254k0 = Long.MIN_VALUE;
    }

    public static c3.n j(int i10, int i11) {
        e2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static x t(x xVar, x xVar2, boolean z10) {
        String b10;
        int i10;
        int i11;
        if (xVar == null) {
            return xVar2;
        }
        String str = xVar.f2515k;
        String str2 = xVar2.f2523s;
        int h = w0.h(str2);
        if (m0.v(h, str) == 1) {
            b10 = m0.w(h, str);
            str2 = w0.d(b10);
        } else {
            b10 = w0.b(str, str2);
        }
        xVar2.f2518n = xVar.f2518n;
        xVar2.f2519o = xVar.f2519o;
        xVar2.f2520p = xVar.f2520p;
        xVar2.f2521q = xVar.f2521q;
        w a2 = xVar2.a();
        a2.f2456a = xVar.f2508a;
        a2.f2457b = xVar.f2509b;
        a2.f2458c = n0.u(xVar.f2510c);
        a2.d = xVar.d;
        a2.e = xVar.e;
        a2.f2459f = xVar.f2511f;
        if (z10) {
            i10 = xVar.h;
        } else {
            i10 = -1;
        }
        a2.h = i10;
        if (z10) {
            i11 = xVar.f2513i;
        } else {
            i11 = -1;
        }
        a2.f2461i = i11;
        a2.f2462j = b10;
        a2.f2468p = xVar.f2520p;
        a2.f2466n = xVar.f2519o;
        a2.f2465m = xVar.f2518n;
        a2.f2467o = xVar.f2521q;
        if (h == 2) {
            a2.f2476y = xVar.f2529z;
            a2.f2477z = xVar.A;
            a2.C = xVar.D;
        }
        if (str2 != null) {
            a2.f2470r = w0.n(str2);
        }
        int i12 = xVar.K;
        if (i12 != -1 && h == 1) {
            a2.J = i12;
        }
        u0 u0Var = xVar.f2516l;
        if (u0Var != null) {
            u0 u0Var2 = xVar2.f2516l;
            if (u0Var2 != null) {
                u0Var = u0Var2.b(u0Var);
            }
            a2.f2463k = u0Var;
        }
        return new x(a2);
    }

    public static int x(int i10) {
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

    @Override
    public final void A(y2.i iVar, long j10, long j11) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f16180s;
            i iVar2 = this.d;
            iVar2.f16195m = bArr;
            m.l lVar = iVar2.f16192j;
            Uri uri = eVar.f46499b.f9886a;
            byte[] bArr2 = eVar.f16181w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) lVar.f14889a).put(uri, bArr2);
        }
        long j12 = fVar.f46498a;
        g2.m mVar = fVar.f46499b;
        b0 b0Var = fVar.f46503r;
        u uVar = new u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        this.f16259r.getClass();
        this.v.r(uVar, fVar.f46500c, this.f16242b, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n);
        if (!this.T) {
            i2.u0 u0Var = new i2.u0();
            u0Var.f11202a = this.f16249f0;
            m(new v0(u0Var));
            return;
        }
        this.f16244c.F(this);
    }

    public final void B() {
        boolean z10;
        int i10;
        x t10;
        if (!this.X && this.f16241a0 == null && this.S) {
            int i11 = 0;
            for (p pVar : this.L) {
                if (pVar.y() == null) {
                    return;
                }
            }
            r1 r1Var = this.Y;
            if (r1Var != null) {
                int i12 = r1Var.f46033a;
                int[] iArr = new int[i12];
                this.f16241a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i14 < pVarArr.length) {
                            x y3 = pVarArr[i14].y();
                            y3.getClass();
                            x xVar = this.Y.a(i13).d[0];
                            String str = y3.f2523s;
                            String str2 = xVar.f2523s;
                            int h = w0.h(str);
                            if (h != 3) {
                                if (h == w0.h(str2)) {
                                    break;
                                }
                                i14++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y3.P == xVar.P) {
                                    break;
                                }
                                i14++;
                            }
                        }
                    }
                    this.f16241a0[i13] = i14;
                }
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((m) obj).a();
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
                x y10 = this.L[i15].y();
                y10.getClass();
                String str3 = y10.f2523s;
                if (w0.m(str3)) {
                    i18 = 2;
                } else if (!w0.i(str3)) {
                    if (w0.l(str3)) {
                        i18 = 3;
                    } else {
                        i18 = -2;
                    }
                }
                if (x(i18) > x(i17)) {
                    i16 = i15;
                    i17 = i18;
                } else if (i18 == i17 && i16 != -1) {
                    i16 = -1;
                }
                i15++;
            }
            q1 q1Var = this.d.h;
            int i19 = q1Var.f2295a;
            this.f16243b0 = -1;
            this.f16241a0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.f16241a0[i20] = i20;
            }
            q1[] q1VarArr = new q1[length];
            int i21 = 0;
            while (i21 < length) {
                x y11 = this.L[i21].y();
                y11.getClass();
                x xVar2 = this.f16248f;
                String str4 = this.f16240a;
                if (i21 == i16) {
                    x[] xVarArr = new x[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        x xVar3 = q1Var.d[i22];
                        if (i17 == 1 && xVar2 != null) {
                            xVar3 = xVar3.d(xVar2);
                        }
                        if (i19 == 1) {
                            t10 = y11.d(xVar3);
                        } else {
                            t10 = t(xVar3, y11, true);
                        }
                        xVarArr[i22] = t10;
                    }
                    q1VarArr[i21] = new q1(str4, xVarArr);
                    this.f16243b0 = i21;
                    i10 = 0;
                } else {
                    xVar2 = (i17 == 2 && w0.i(y11.f2523s)) ? null : null;
                    StringBuilder i23 = t8.b.i(str4, ":muxed:");
                    i23.append(i21 < i16 ? i21 : i21 - 1);
                    String sb2 = i23.toString();
                    i10 = 0;
                    w a2 = t(xVar2, y11, false).a();
                    a2.f2464l = str4;
                    q1VarArr[i21] = new q1(sb2, new x(a2));
                }
                i21++;
                i11 = i10;
            }
            int i24 = i11;
            this.Y = q(q1VarArr);
            if (this.Z == null) {
                z10 = 1;
            } else {
                z10 = i24;
            }
            u6.p(z10);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.f16244c.d1();
        }
    }

    public final void C() {
        this.f16260s.b();
        i iVar = this.d;
        u2.b bVar = iVar.f16196n;
        if (bVar == null) {
            Uri uri = iVar.f16197o;
            if (uri != null && uri.equals(iVar.f16198p)) {
                iVar.f16190g.h(iVar.f16197o);
                return;
            }
            return;
        }
        throw bVar;
    }

    @Override
    public final void D() {
        this.f16255l0 = true;
        this.H.post(this.G);
    }

    public final void E(q1[] q1VarArr, int... iArr) {
        this.Y = q(q1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.f16243b0 = 0;
        this.H.post(new t0(this.f16244c, 20));
        this.T = true;
    }

    public final void F() {
        for (p pVar : this.L) {
            pVar.G(this.f16251h0);
        }
        this.f16251h0 = false;
    }

    public final boolean G(long j10, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean J;
        this.f16249f0 = j10;
        if (z()) {
            this.f16250g0 = j10;
            return true;
        }
        boolean z13 = this.d.f16199q;
        ArrayList arrayList = this.f16263y;
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
                if (!J && (this.f16247e0[i11] || !this.f16245c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f16250g0 = j10;
        this.f16253j0 = false;
        arrayList.clear();
        y2.l lVar = this.f16260s;
        if (lVar.d()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.l();
                }
            }
            lVar.a();
            return true;
        }
        lVar.f48544c = null;
        F();
        return true;
    }

    @Override
    public final i0 W(int i10, int i11) {
        j jVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f16239p0;
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
            if (this.f16255l0) {
                return j(i10, i11);
            }
            int length = this.L.length;
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            }
            r52 = new p(this.e, this.h, this.f16256n, this.J);
            r52.f45898t = this.f16249f0;
            if (z10) {
                r52.K = this.f16257n0;
                r52.B = true;
            }
            long j10 = this.m0;
            if (r52.H != j10) {
                r52.H = j10;
                r52.B = true;
            }
            if (this.f16258o0 != null) {
                r52.E = jVar.v;
            }
            r52.f45885f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = m0.f8375a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f16247e0, i14);
            this.f16247e0 = copyOf3;
            copyOf3[length] = z10;
            this.f16245c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (x(i11) > x(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.f16246d0 = Arrays.copyOf(this.f16246d0, i14);
        }
        if (i11 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f16261w);
            }
            return this.P;
        }
        return r52;
    }

    @Override
    public final void X0(y2.i iVar, long j10, long j11, boolean z10) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        long j12 = fVar.f46498a;
        g2.m mVar = fVar.f46499b;
        b0 b0Var = fVar.f46503r;
        u uVar = new u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        this.f16259r.getClass();
        this.v.q(uVar, fVar.f46500c, this.f16242b, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n);
        if (!z10) {
            if (z() || this.U == 0) {
                F();
            }
            if (this.U > 0) {
                this.f16244c.F(this);
            }
        }
    }

    @Override
    public final void a() {
        p[] pVarArr;
        for (p pVar : this.L) {
            pVar.G(true);
            n2.g gVar = pVar.h;
            if (gVar != null) {
                gVar.a(pVar.e);
                pVar.h = null;
                pVar.f45886g = null;
            }
        }
    }

    @Override
    public final void b() {
        this.H.post(this.F);
    }

    @Override
    public final boolean c() {
        return this.f16260s.d();
    }

    @Override
    public final long d() {
        if (z()) {
            return this.f16250g0;
        }
        if (this.f16253j0) {
            return Long.MIN_VALUE;
        }
        return v().f46502n;
    }

    public final void e() {
        u6.p(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean f(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.f16263y;
            if (i11 < arrayList.size()) {
                if (((j) arrayList.get(i11)).f16204b0) {
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
    public final boolean m(i2.v0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.m(i2.v0):boolean");
    }

    @Override
    public final long p() {
        if (this.f16253j0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.f16250g0;
        }
        long j10 = this.f16249f0;
        j v = v();
        if (!v.X) {
            ArrayList arrayList = this.f16263y;
            if (arrayList.size() > 1) {
                v = (j) i2.d.h(2, arrayList);
            } else {
                v = null;
            }
        }
        if (v != null) {
            j10 = Math.max(j10, v.f46502n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j10 = Math.max(j10, pVar.s());
            }
        }
        return j10;
    }

    public final r1 q(q1[] q1VarArr) {
        for (int i10 = 0; i10 < q1VarArr.length; i10++) {
            q1 q1Var = q1VarArr[i10];
            x[] xVarArr = new x[q1Var.f2295a];
            for (int i11 = 0; i11 < q1Var.f2295a; i11++) {
                x xVar = q1Var.d[i11];
                int J0 = this.h.J0(xVar);
                w a2 = xVar.a();
                a2.S = J0;
                xVarArr[i11] = new x(a2);
            }
            q1VarArr[i10] = new q1(q1Var.f2296b, xVarArr);
        }
        return new r1(q1VarArr);
    }

    @Override
    public final void s(long j10) {
        int size;
        y2.l lVar = this.f16260s;
        if (!lVar.c() && !z()) {
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
                if (iVar.f16196n == null) {
                    z11 = iVar.f16200r.d(j10, fVar, list);
                }
                if (z11) {
                    lVar.a();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.c((j) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                u(size2);
            }
            if (iVar.f16196n == null && iVar.f16200r.length() >= 2) {
                size = iVar.f16200r.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.f16263y.size()) {
                u(size);
            }
            if (this.S && this.f16254k0 != Long.MIN_VALUE) {
                boolean z12 = true;
                while (true) {
                    p[] pVarArr = this.L;
                    if (i10 >= pVarArr.length) {
                        break;
                    }
                    if (this.f16246d0[i10] && (this.f16247e0[i10] || !this.f16245c0)) {
                        z12 &= pVarArr[i10].z();
                    }
                    i10++;
                }
                z10 = z12;
            }
            if (z10) {
                this.f16253j0 = true;
            }
        }
    }

    public final void u(int i10) {
        ArrayList arrayList;
        u6.p(!this.f16260s.d());
        while (true) {
            arrayList = this.f16263y;
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
        long j10 = v().f46502n;
        j jVar = (j) arrayList.get(i10);
        m0.X(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].o(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f16250g0 = this.f16249f0;
        } else {
            ((j) e9.s.m(arrayList)).Z = true;
        }
        this.f16253j0 = false;
        this.v.C(this.Q, jVar.h, j10);
    }

    public final j v() {
        return (j) i2.d.h(1, this.f16263y);
    }

    @Override
    public final k4.d w(y2.i r24, long r25, long r27, java.io.IOException r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.w(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void y(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        v2.f fVar = (v2.f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f46498a;
            uVar = new u(fVar.f46499b, j10);
        } else {
            long j13 = fVar.f46498a;
            g2.m mVar = fVar.f46499b;
            b0 b0Var = fVar.f46503r;
            uVar = new u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        }
        this.v.v(uVar, fVar.f46500c, this.f16242b, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n, i10);
    }

    public final boolean z() {
        if (this.f16250g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void K(c3.b0 b0Var) {
    }
}
