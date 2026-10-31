package o2;

import android.net.Uri;
import android.os.Handler;
import android.support.v4.media.session.a0;
import android.util.SparseIntArray;
import b2.p1;
import b2.u0;
import b2.v0;
import b2.w;
import b2.x;
import c3.b0;
import c3.k0;
import e2.l0;
import e9.n0;
import g2.c0;
import i2.w0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.m0;
import u2.b1;
import u2.f1;
import u2.r1;
import u2.u;
import v7.t6;
public final class q implements y2.g, y2.j, f1, c3.q, b1 {
    public static final Set f14037p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList D;
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
    public final String f14038a;
    public int[] f14039a0;
    public final int f14040b;
    public int f14041b0;
    public final m0 f14042c;
    public boolean f14043c0;
    public final i d;
    public boolean[] f14044d0;
    public final a0 e;
    public boolean[] f14045e0;
    public final x f14046f;
    public long f14047f0;
    public long f14048g0;
    public final n2.m h;
    public boolean f14049h0;
    public boolean f14050i0;
    public boolean f14051j0;
    public long f14052k0;
    public boolean f14053l0;
    public long m0;
    public final n2.j f14054n;
    public b2.t f14055n0;
    public j f14056o0;
    public final hb.a f14057r;
    public final y2.l f14058s;
    public final a5.a f14059w;
    public final int f14060x;
    public final androidx.activity.o f14061y;

    public q(String str, int i10, m0 m0Var, i iVar, Map map, a0 a0Var, long j10, x xVar, n2.m mVar, n2.j jVar, hb.a aVar, a5.a aVar2, int i11, z2.a aVar3) {
        y2.l lVar;
        this.f14038a = str;
        this.f14040b = i10;
        this.f14042c = m0Var;
        this.d = iVar;
        this.J = map;
        this.e = a0Var;
        this.f14046f = xVar;
        this.h = mVar;
        this.f14054n = jVar;
        this.f14057r = aVar;
        this.f14059w = aVar2;
        this.f14060x = i11;
        if (aVar3 != null) {
            lVar = new y2.l(aVar3);
        } else {
            lVar = new y2.l("Loader:HlsSampleStreamWrapper");
        }
        this.f14058s = lVar;
        androidx.activity.o oVar = new androidx.activity.o(6);
        oVar.f954c = null;
        oVar.f953b = false;
        oVar.d = null;
        this.f14061y = oVar;
        this.M = new int[0];
        Set set = f14037p0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f14045e0 = new boolean[0];
        this.f14044d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f14031b;

            {
                this.f14031b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14031b.B();
                        return;
                    default:
                        q qVar = this.f14031b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f14052k0);
                        }
                        qVar.S = true;
                        qVar.B();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f14031b;

            {
                this.f14031b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f14031b.B();
                        return;
                    default:
                        q qVar = this.f14031b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f14052k0);
                        }
                        qVar.S = true;
                        qVar.B();
                        return;
                }
            }
        };
        this.H = l0.q(null);
        this.f14047f0 = j10;
        this.f14048g0 = j10;
        this.f14052k0 = Long.MIN_VALUE;
    }

    public static c3.n r(int i10, int i11) {
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
        String str = xVar.f2415k;
        String str2 = xVar2.f2423s;
        int h = v0.h(str2);
        if (l0.v(h, str) == 1) {
            b10 = l0.w(h, str);
            str2 = v0.d(b10);
        } else {
            b10 = v0.b(str, str2);
        }
        xVar2.f2418n = xVar.f2418n;
        xVar2.f2419o = xVar.f2419o;
        xVar2.f2420p = xVar.f2420p;
        xVar2.f2421q = xVar.f2421q;
        w a2 = xVar2.a();
        a2.f2356a = xVar.f2408a;
        a2.f2357b = xVar.f2409b;
        a2.f2358c = n0.u(xVar.f2410c);
        a2.d = xVar.d;
        a2.e = xVar.e;
        a2.f2359f = xVar.f2411f;
        if (z10) {
            i10 = xVar.h;
        } else {
            i10 = -1;
        }
        a2.h = i10;
        if (z10) {
            i11 = xVar.f2413i;
        } else {
            i11 = -1;
        }
        a2.f2361i = i11;
        a2.f2362j = b10;
        a2.f2368p = xVar.f2420p;
        a2.f2366n = xVar.f2419o;
        a2.f2365m = xVar.f2418n;
        a2.f2367o = xVar.f2421q;
        if (h == 2) {
            a2.f2376y = xVar.f2429z;
            a2.f2377z = xVar.A;
            a2.C = xVar.D;
        }
        if (str2 != null) {
            a2.f2370r = v0.n(str2);
        }
        int i12 = xVar.K;
        if (i12 != -1 && h == 1) {
            a2.J = i12;
        }
        u0 u0Var = xVar.f2416l;
        if (u0Var != null) {
            u0 u0Var2 = xVar2.f2416l;
            if (u0Var2 != null) {
                u0Var = u0Var2.b(u0Var);
            }
            a2.f2363k = u0Var;
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
        if (this.f14048g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void B() {
        boolean z10;
        int i10;
        x w9;
        if (!this.X && this.f14039a0 == null && this.S) {
            int i11 = 0;
            for (p pVar : this.L) {
                if (pVar.y() == null) {
                    return;
                }
            }
            r1 r1Var = this.Y;
            if (r1Var != null) {
                int i12 = r1Var.f49993a;
                int[] iArr = new int[i12];
                this.f14039a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i14 < pVarArr.length) {
                            x y3 = pVarArr[i14].y();
                            y3.getClass();
                            x xVar = this.Y.a(i13).d[0];
                            String str = y3.f2423s;
                            String str2 = xVar.f2423s;
                            int h = v0.h(str);
                            if (h != 3) {
                                if (h == v0.h(str2)) {
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
                    this.f14039a0[i13] = i14;
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
                x y10 = this.L[i15].y();
                y10.getClass();
                String str3 = y10.f2423s;
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
            int i19 = p1Var.f2187a;
            this.f14041b0 = -1;
            this.f14039a0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.f14039a0[i20] = i20;
            }
            p1[] p1VarArr = new p1[length];
            int i21 = 0;
            while (i21 < length) {
                x y11 = this.L[i21].y();
                y11.getClass();
                x xVar2 = this.f14046f;
                String str4 = this.f14038a;
                if (i21 == i16) {
                    x[] xVarArr = new x[i19];
                    for (int i22 = i11; i22 < i19; i22++) {
                        x xVar3 = p1Var.d[i22];
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
                    p1VarArr[i21] = new p1(str4, xVarArr);
                    this.f14041b0 = i21;
                    i10 = 0;
                } else {
                    xVar2 = (i17 == 2 && v0.i(y11.f2423s)) ? null : null;
                    StringBuilder i23 = sc.e.i(str4, ":muxed:");
                    i23.append(i21 < i16 ? i21 : i21 - 1);
                    String sb2 = i23.toString();
                    i10 = 0;
                    w a2 = w(xVar2, y11, false).a();
                    a2.f2364l = str4;
                    p1VarArr[i21] = new p1(sb2, new x(a2));
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
            t6.p(z10);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.f14042c.n0();
        }
    }

    public final void C() {
        this.f14058s.a();
        i iVar = this.d;
        u2.b bVar = iVar.f13994n;
        if (bVar == null) {
            Uri uri = iVar.f13995o;
            if (uri != null && uri.equals(iVar.f13996p)) {
                iVar.f13988g.h(iVar.f13995o);
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
        this.f14041b0 = 0;
        this.H.post(new lg.s(this.f14042c, 12));
        this.T = true;
    }

    public final void E() {
        for (p pVar : this.L) {
            pVar.G(this.f14049h0);
        }
        this.f14049h0 = false;
    }

    public final boolean F(long j10, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean J;
        this.f14047f0 = j10;
        if (A()) {
            this.f14048g0 = j10;
            return true;
        }
        boolean z13 = this.d.f13997q;
        ArrayList arrayList = this.D;
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
                    long c10 = c();
                    if (c10 != Long.MIN_VALUE && j10 >= c10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    J = pVar.J(j10, z12);
                }
                if (!J && (this.f14045e0[i11] || !this.f14043c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f14048g0 = j10;
        this.f14051j0 = false;
        arrayList.clear();
        y2.l lVar = this.f14058s;
        if (lVar.d()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.l();
                }
            }
            lVar.b();
            return true;
        }
        lVar.f54166c = null;
        E();
        return true;
    }

    @Override
    public final k0 I1(int i10, int i11) {
        j jVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f14037p0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            t6.f(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.M[i12] = i10;
                }
                r52 = this.M[i12] == i10 ? this.L[i12] : r(i10, i11);
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
            if (this.f14053l0) {
                return r(i10, i11);
            }
            int length = this.L.length;
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            }
            r52 = new p(this.e, this.h, this.f14054n, this.J);
            r52.f49856t = this.f14047f0;
            if (z10) {
                r52.K = this.f14055n0;
                r52.B = true;
            }
            long j10 = this.m0;
            if (r52.H != j10) {
                r52.H = j10;
                r52.B = true;
            }
            if (this.f14056o0 != null) {
                r52.E = jVar.f14003w;
            }
            r52.f49843f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = l0.f6165a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f14045e0, i14);
            this.f14045e0 = copyOf3;
            copyOf3[length] = z10;
            this.f14043c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (z(i11) > z(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.f14044d0 = Arrays.copyOf(this.f14044d0, i14);
        }
        if (i11 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f14060x);
            }
            return this.P;
        }
        return r52;
    }

    @Override
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        long j12 = fVar.f50305a;
        g2.n nVar = fVar.f50306b;
        c0 c0Var = fVar.f50310r;
        u uVar = new u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        this.f14057r.getClass();
        this.f14059w.p(uVar, fVar.f50307c, this.f14040b, fVar.d, fVar.e, fVar.f50308f, fVar.h, fVar.f50309n);
        if (!z10) {
            if (A() || this.U == 0) {
                E();
            }
            if (this.U > 0) {
                this.f14042c.r(this);
            }
        }
    }

    @Override
    public final void Q0() {
        this.f14053l0 = true;
        this.H.post(this.G);
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
            n2.g gVar = pVar.h;
            if (gVar != null) {
                gVar.a(pVar.e);
                pVar.h = null;
                pVar.f49844g = null;
            }
        }
    }

    @Override
    public final long c() {
        if (A()) {
            return this.f14048g0;
        }
        if (this.f14051j0) {
            return Long.MIN_VALUE;
        }
        return y().f50309n;
    }

    @Override
    public final boolean d() {
        return this.f14058s.d();
    }

    public final void e() {
        t6.p(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean i(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.D;
            if (i11 < arrayList.size()) {
                if (((j) arrayList.get(i11)).f14002b0) {
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
    public final k4.d l(y2.i r24, long r25, long r27, java.io.IOException r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.l(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final boolean m(i2.w0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.m(i2.w0):boolean");
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        v2.f fVar = (v2.f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f50305a;
            uVar = new u(fVar.f50306b, j10);
        } else {
            long j13 = fVar.f50305a;
            g2.n nVar = fVar.f50306b;
            c0 c0Var = fVar.f50310r;
            uVar = new u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        }
        this.f14059w.u(uVar, fVar.f50307c, this.f14040b, fVar.d, fVar.e, fVar.f50308f, fVar.h, fVar.f50309n, i10);
    }

    @Override
    public final void o(y2.i iVar, long j10, long j11) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f13977s;
            i iVar2 = this.d;
            iVar2.f13993m = bArr;
            n2.u uVar = iVar2.f13990j;
            Uri uri = eVar.f50306b.f7314a;
            byte[] bArr2 = eVar.f13979x;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) uVar.f13480b).put(uri, bArr2);
        }
        long j12 = fVar.f50305a;
        g2.n nVar = fVar.f50306b;
        c0 c0Var = fVar.f50310r;
        u uVar2 = new u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        this.f14057r.getClass();
        this.f14059w.q(uVar2, fVar.f50307c, this.f14040b, fVar.d, fVar.e, fVar.f50308f, fVar.h, fVar.f50309n);
        if (!this.T) {
            i2.v0 v0Var = new i2.v0();
            v0Var.f8098a = this.f14047f0;
            m(new w0(v0Var));
            return;
        }
        this.f14042c.r(this);
    }

    @Override
    public final long s() {
        if (this.f14051j0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f14048g0;
        }
        long j10 = this.f14047f0;
        j y3 = y();
        if (!y3.X) {
            ArrayList arrayList = this.D;
            if (arrayList.size() > 1) {
                y3 = (j) i0.a.g(2, arrayList);
            } else {
                y3 = null;
            }
        }
        if (y3 != null) {
            j10 = Math.max(j10, y3.f50309n);
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
        y2.l lVar = this.f14058s;
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
                if (iVar.f13994n == null) {
                    z11 = iVar.f13998r.d(j10, fVar, list);
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
            if (iVar.f13994n == null && iVar.f13998r.length() >= 2) {
                size = iVar.f13998r.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.D.size()) {
                x(size);
            }
            if (this.S && this.f14052k0 != Long.MIN_VALUE) {
                boolean z12 = true;
                while (true) {
                    p[] pVarArr = this.L;
                    if (i10 >= pVarArr.length) {
                        break;
                    }
                    if (this.f14044d0[i10] && (this.f14045e0[i10] || !this.f14043c0)) {
                        z12 &= pVarArr[i10].z();
                    }
                    i10++;
                }
                z10 = z12;
            }
            if (z10) {
                this.f14051j0 = true;
            }
        }
    }

    public final r1 v(p1[] p1VarArr) {
        for (int i10 = 0; i10 < p1VarArr.length; i10++) {
            p1 p1Var = p1VarArr[i10];
            x[] xVarArr = new x[p1Var.f2187a];
            for (int i11 = 0; i11 < p1Var.f2187a; i11++) {
                x xVar = p1Var.d[i11];
                int t02 = this.h.t0(xVar);
                w a2 = xVar.a();
                a2.S = t02;
                xVarArr[i11] = new x(a2);
            }
            p1VarArr[i10] = new p1(p1Var.f2188b, xVarArr);
        }
        return new r1(p1VarArr);
    }

    public final void x(int i10) {
        ArrayList arrayList;
        t6.p(!this.f14058s.d());
        while (true) {
            arrayList = this.D;
            if (i10 < arrayList.size()) {
                if (i(i10)) {
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
        long j10 = y().f50309n;
        j jVar = (j) arrayList.get(i10);
        l0.X(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].o(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f14048g0 = this.f14047f0;
        } else {
            ((j) e9.s.m(arrayList)).Z = true;
        }
        this.f14051j0 = false;
        this.f14059w.B(jVar.h, this.Q, j10);
    }

    public final j y() {
        return (j) i0.a.g(1, this.D);
    }

    @Override
    public final void G1(b0 b0Var) {
    }
}
