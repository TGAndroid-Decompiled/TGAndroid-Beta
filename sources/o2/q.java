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
import ji.h5;
import ji.w4;
import u2.b1;
import u2.f1;
import u2.r1;
import u2.u;
import v7.u6;
public final class q implements y2.g, y2.j, f1, c3.q, b1 {
    public static final Set f16546p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public final String f16547a;
    public int[] f16548a0;
    public final int f16549b;
    public int f16550b0;
    public final h5 f16551c;
    public boolean f16552c0;
    public final i d;
    public boolean[] f16553d0;
    public final androidx.biometric.e e;
    public boolean[] f16554e0;
    public final x f16555f;
    public long f16556f0;
    public long f16557g0;
    public final n2.n h;
    public boolean f16558h0;
    public boolean f16559i0;
    public boolean f16560j0;
    public long f16561k0;
    public boolean f16562l0;
    public long m0;
    public final n2.k f16563n;
    public b2.t f16564n0;
    public j f16565o0;
    public final oa.d f16566r;
    public final y2.l f16567s;
    public final a5.a v;
    public final int f16568w;
    public final androidx.activity.o f16569x;
    public final ArrayList f16570y;

    public q(String str, int i10, h5 h5Var, i iVar, Map map, androidx.biometric.e eVar, long j10, x xVar, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, int i11, z2.a aVar2) {
        y2.l lVar;
        this.f16547a = str;
        this.f16549b = i10;
        this.f16551c = h5Var;
        this.d = iVar;
        this.J = map;
        this.e = eVar;
        this.f16555f = xVar;
        this.h = nVar;
        this.f16563n = kVar;
        this.f16566r = dVar;
        this.v = aVar;
        this.f16568w = i11;
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("Loader:HlsSampleStreamWrapper");
        }
        this.f16567s = lVar;
        ?? obj = new Object();
        obj.f1049b = null;
        obj.f1048a = false;
        obj.f1050c = null;
        this.f16569x = obj;
        this.M = new int[0];
        Set set = f16546p0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f16554e0 = new boolean[0];
        this.f16553d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f16570y = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f16540b;

            {
                this.f16540b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f16540b.C();
                        return;
                    default:
                        q qVar = this.f16540b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f16561k0);
                        }
                        qVar.S = true;
                        qVar.C();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f16540b;

            {
                this.f16540b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f16540b.C();
                        return;
                    default:
                        q qVar = this.f16540b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f16561k0);
                        }
                        qVar.S = true;
                        qVar.C();
                        return;
                }
            }
        };
        this.H = m0.q(null);
        this.f16556f0 = j10;
        this.f16557g0 = j10;
        this.f16561k0 = Long.MIN_VALUE;
    }

    public static c3.n m(int i10, int i11) {
        e2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new c3.n();
    }

    public static x w(x xVar, x xVar2, boolean z10) {
        String b10;
        int i10;
        int i11;
        if (xVar == null) {
            return xVar2;
        }
        String str = xVar.f2511k;
        String str2 = xVar2.f2519s;
        int h = w0.h(str2);
        if (m0.v(h, str) == 1) {
            b10 = m0.w(h, str);
            str2 = w0.d(b10);
        } else {
            b10 = w0.b(str, str2);
        }
        xVar2.f2514n = xVar.f2514n;
        xVar2.f2515o = xVar.f2515o;
        xVar2.f2516p = xVar.f2516p;
        xVar2.f2517q = xVar.f2517q;
        w a2 = xVar2.a();
        a2.f2452a = xVar.f2504a;
        a2.f2453b = xVar.f2505b;
        a2.f2454c = n0.u(xVar.f2506c);
        a2.d = xVar.d;
        a2.e = xVar.e;
        a2.f2455f = xVar.f2507f;
        if (z10) {
            i10 = xVar.h;
        } else {
            i10 = -1;
        }
        a2.h = i10;
        if (z10) {
            i11 = xVar.f2509i;
        } else {
            i11 = -1;
        }
        a2.f2457i = i11;
        a2.f2458j = b10;
        a2.f2464p = xVar.f2516p;
        a2.f2462n = xVar.f2515o;
        a2.f2461m = xVar.f2514n;
        a2.f2463o = xVar.f2517q;
        if (h == 2) {
            a2.f2472y = xVar.f2525z;
            a2.f2473z = xVar.A;
            a2.C = xVar.D;
        }
        if (str2 != null) {
            a2.f2466r = w0.n(str2);
        }
        int i12 = xVar.K;
        if (i12 != -1 && h == 1) {
            a2.J = i12;
        }
        u0 u0Var = xVar.f2512l;
        if (u0Var != null) {
            u0 u0Var2 = xVar2.f2512l;
            if (u0Var2 != null) {
                u0Var = u0Var2.b(u0Var);
            }
            a2.f2459k = u0Var;
        }
        return new x(a2);
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
        if (this.f16557g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void B(y2.i iVar, long j10, long j11, boolean z10) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        long j12 = fVar.f46498a;
        g2.m mVar = fVar.f46499b;
        b0 b0Var = fVar.f46503r;
        u uVar = new u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        this.f16566r.getClass();
        this.v.q(uVar, fVar.f46500c, this.f16549b, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n);
        if (!z10) {
            if (A() || this.U == 0) {
                G();
            }
            if (this.U > 0) {
                this.f16551c.G(this);
            }
        }
    }

    public final void C() {
        boolean z10;
        int i10;
        x w9;
        if (!this.X && this.f16548a0 == null && this.S) {
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
                this.f16548a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i14 < pVarArr.length) {
                            x y3 = pVarArr[i14].y();
                            y3.getClass();
                            x xVar = this.Y.a(i13).d[0];
                            String str = y3.f2519s;
                            String str2 = xVar.f2519s;
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
                    this.f16548a0[i13] = i14;
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
                String str3 = y10.f2519s;
                if (w0.m(str3)) {
                    i18 = 2;
                } else if (!w0.i(str3)) {
                    if (w0.l(str3)) {
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
            q1 q1Var = this.d.h;
            int i19 = q1Var.f2291a;
            this.f16550b0 = -1;
            this.f16548a0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.f16548a0[i20] = i20;
            }
            q1[] q1VarArr = new q1[length];
            int i21 = 0;
            while (i21 < length) {
                x y11 = this.L[i21].y();
                y11.getClass();
                x xVar2 = this.f16555f;
                String str4 = this.f16547a;
                if (i21 == i16) {
                    x[] xVarArr = new x[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        x xVar3 = q1Var.d[i22];
                        if (i17 == 1 && xVar2 != null) {
                            xVar3 = xVar3.d(xVar2);
                        }
                        if (i19 == 1) {
                            w9 = y11.d(xVar3);
                        } else {
                            w9 = w(xVar3, y11, true);
                        }
                        xVarArr[i22] = w9;
                    }
                    q1VarArr[i21] = new q1(str4, xVarArr);
                    this.f16550b0 = i21;
                    i10 = 0;
                } else {
                    xVar2 = (i17 == 2 && w0.i(y11.f2519s)) ? null : null;
                    StringBuilder i23 = t8.b.i(str4, ":muxed:");
                    i23.append(i21 < i16 ? i21 : i21 - 1);
                    String sb2 = i23.toString();
                    i10 = 0;
                    w a2 = w(xVar2, y11, false).a();
                    a2.f2460l = str4;
                    q1VarArr[i21] = new q1(sb2, new x(a2));
                }
                i21++;
                i11 = i10;
            }
            int i24 = i11;
            this.Y = v(q1VarArr);
            if (this.Z == null) {
                z10 = 1;
            } else {
                z10 = i24;
            }
            u6.p(z10);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.f16551c.U0();
        }
    }

    @Override
    public final void D() {
        this.f16562l0 = true;
        this.H.post(this.G);
    }

    public final void E() {
        this.f16567s.d();
        i iVar = this.d;
        u2.b bVar = iVar.f16503n;
        if (bVar == null) {
            Uri uri = iVar.f16504o;
            if (uri != null && uri.equals(iVar.f16505p)) {
                iVar.f16497g.h(iVar.f16504o);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void F(q1[] q1VarArr, int... iArr) {
        this.Y = v(q1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.f16550b0 = 0;
        this.H.post(new t0(this.f16551c, 21));
        this.T = true;
    }

    public final void G() {
        for (p pVar : this.L) {
            pVar.G(this.f16558h0);
        }
        this.f16558h0 = false;
    }

    public final boolean H(long j10, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean J;
        this.f16556f0 = j10;
        if (A()) {
            this.f16557g0 = j10;
            return true;
        }
        boolean z13 = this.d.f16506q;
        ArrayList arrayList = this.f16570y;
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
                    long b10 = b();
                    if (b10 != Long.MIN_VALUE && j10 >= b10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    J = pVar.J(j10, z12);
                }
                if (!J && (this.f16554e0[i11] || !this.f16552c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f16557g0 = j10;
        this.f16560j0 = false;
        arrayList.clear();
        y2.l lVar = this.f16567s;
        if (lVar.c()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.l();
                }
            }
            lVar.a();
            return true;
        }
        lVar.f48545c = null;
        G();
        return true;
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
    public final i0 a0(int i10, int i11) {
        j jVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f16546p0;
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
            if (this.f16562l0) {
                return m(i10, i11);
            }
            int length = this.L.length;
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            }
            r52 = new p(this.e, this.h, this.f16563n, this.J);
            r52.f45898t = this.f16556f0;
            if (z10) {
                r52.K = this.f16564n0;
                r52.B = true;
            }
            long j10 = this.m0;
            if (r52.H != j10) {
                r52.H = j10;
                r52.B = true;
            }
            if (this.f16565o0 != null) {
                r52.E = jVar.v;
            }
            r52.f45885f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = m0.f8372a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f16554e0, i14);
            this.f16554e0 = copyOf3;
            copyOf3[length] = z10;
            this.f16552c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (z(i11) > z(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.f16553d0 = Arrays.copyOf(this.f16553d0, i14);
        }
        if (i11 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f16568w);
            }
            return this.P;
        }
        return r52;
    }

    @Override
    public final long b() {
        if (A()) {
            return this.f16557g0;
        }
        if (this.f16560j0) {
            return Long.MIN_VALUE;
        }
        return y().f46502n;
    }

    @Override
    public final boolean c() {
        return this.f16567s.c();
    }

    @Override
    public final void d() {
        this.H.post(this.F);
    }

    public final void e() {
        u6.p(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean f(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.f16570y;
            if (i11 < arrayList.size()) {
                if (((j) arrayList.get(i11)).f16511b0) {
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
    public final void k(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        v2.f fVar = (v2.f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f46498a;
            uVar = new u(fVar.f46499b, j10);
        } else {
            long j13 = fVar.f46498a;
            g2.m mVar = fVar.f46499b;
            b0 b0Var = fVar.f46503r;
            uVar = new u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        }
        this.v.v(uVar, fVar.f46500c, this.f16549b, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n, i10);
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f16487s;
            i iVar2 = this.d;
            iVar2.f16502m = bArr;
            w4 w4Var = iVar2.f16499j;
            Uri uri = eVar.f46499b.f9883a;
            byte[] bArr2 = eVar.f16488w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) w4Var.f13592b).put(uri, bArr2);
        }
        long j12 = fVar.f46498a;
        g2.m mVar = fVar.f46499b;
        b0 b0Var = fVar.f46503r;
        u uVar = new u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        this.f16566r.getClass();
        this.v.r(uVar, fVar.f46500c, this.f16549b, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n);
        if (!this.T) {
            i2.u0 u0Var = new i2.u0();
            u0Var.f11198a = this.f16556f0;
            p(new v0(u0Var));
            return;
        }
        this.f16551c.G(this);
    }

    @Override
    public final boolean p(i2.v0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.p(i2.v0):boolean");
    }

    @Override
    public final long s() {
        if (this.f16560j0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f16557g0;
        }
        long j10 = this.f16556f0;
        j y3 = y();
        if (!y3.X) {
            ArrayList arrayList = this.f16570y;
            if (arrayList.size() > 1) {
                y3 = (j) i2.d.g(2, arrayList);
            } else {
                y3 = null;
            }
        }
        if (y3 != null) {
            j10 = Math.max(j10, y3.f46502n);
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
        y2.l lVar = this.f16567s;
        if (!lVar.b() && !A()) {
            boolean c10 = lVar.c();
            boolean z10 = false;
            boolean z11 = false;
            int i10 = 0;
            z10 = false;
            i iVar = this.d;
            List list = this.E;
            if (c10) {
                this.K.getClass();
                v2.f fVar = this.K;
                if (iVar.f16503n == null) {
                    z11 = iVar.f16507r.d(j10, fVar, list);
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
                x(size2);
            }
            if (iVar.f16503n == null && iVar.f16507r.length() >= 2) {
                size = iVar.f16507r.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.f16570y.size()) {
                x(size);
            }
            if (this.S && this.f16561k0 != Long.MIN_VALUE) {
                boolean z12 = true;
                while (true) {
                    p[] pVarArr = this.L;
                    if (i10 >= pVarArr.length) {
                        break;
                    }
                    if (this.f16553d0[i10] && (this.f16554e0[i10] || !this.f16552c0)) {
                        z12 &= pVarArr[i10].z();
                    }
                    i10++;
                }
                z10 = z12;
            }
            if (z10) {
                this.f16560j0 = true;
            }
        }
    }

    public final r1 v(q1[] q1VarArr) {
        for (int i10 = 0; i10 < q1VarArr.length; i10++) {
            q1 q1Var = q1VarArr[i10];
            x[] xVarArr = new x[q1Var.f2291a];
            for (int i11 = 0; i11 < q1Var.f2291a; i11++) {
                x xVar = q1Var.d[i11];
                int I0 = this.h.I0(xVar);
                w a2 = xVar.a();
                a2.S = I0;
                xVarArr[i11] = new x(a2);
            }
            q1VarArr[i10] = new q1(q1Var.f2292b, xVarArr);
        }
        return new r1(q1VarArr);
    }

    public final void x(int i10) {
        ArrayList arrayList;
        u6.p(!this.f16567s.c());
        while (true) {
            arrayList = this.f16570y;
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
        long j10 = y().f46502n;
        j jVar = (j) arrayList.get(i10);
        m0.X(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].o(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f16557g0 = this.f16556f0;
        } else {
            ((j) e9.s.m(arrayList)).Z = true;
        }
        this.f16560j0 = false;
        this.v.C(this.Q, jVar.h, j10);
    }

    public final j y() {
        return (j) i2.d.g(1, this.f16570y);
    }

    @Override
    public final void K(c3.b0 b0Var) {
    }
}
