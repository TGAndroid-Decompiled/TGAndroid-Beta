package o2;

import a8.h0;
import a8.ng;
import a8.yb;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b2.q1;
import b2.u0;
import b2.w;
import b2.w0;
import b2.x;
import c3.j0;
import e2.n0;
import f9.i0;
import g2.b0;
import i2.v0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import li.h5;
import org.telegram.ui.Components.b10;
import u2.b1;
import u2.f1;
import u2.r1;
import u2.u;
public final class q implements y2.g, y2.j, f1, c3.q, b1 {
    public static final Set f19047p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public final String f19048a;
    public int[] f19049a0;
    public final int f19050b;
    public int f19051b0;
    public final jg.i f19052c;
    public boolean f19053c0;
    public final i d;
    public boolean[] f19054d0;
    public final h0 e;
    public boolean[] f19055e0;
    public final x f19056f;
    public long f19057f0;
    public long f19058g0;
    public final n2.m h;
    public boolean f19059h0;
    public boolean f19060i0;
    public boolean f19061j0;
    public long f19062k0;
    public boolean f19063l0;
    public long m0;
    public final n2.j f19064n;
    public b2.t f19065n0;
    public j f19066o0;
    public final u7.s f19067r;
    public final y2.l f19068s;
    public final ng v;
    public final int f19069w;
    public final androidx.activity.n f19070x;
    public final ArrayList f19071y;

    public q(String str, int i10, jg.i iVar, i iVar2, Map map, h0 h0Var, long j10, x xVar, n2.m mVar, n2.j jVar, u7.s sVar, ng ngVar, int i11, z2.a aVar) {
        y2.l lVar;
        this.f19048a = str;
        this.f19050b = i10;
        this.f19052c = iVar;
        this.d = iVar2;
        this.J = map;
        this.e = h0Var;
        this.f19056f = xVar;
        this.h = mVar;
        this.f19064n = jVar;
        this.f19067r = sVar;
        this.v = ngVar;
        this.f19069w = i11;
        if (aVar != null) {
            lVar = new y2.l(aVar);
        } else {
            lVar = new y2.l("Loader:HlsSampleStreamWrapper");
        }
        this.f19068s = lVar;
        ?? obj = new Object();
        obj.f2121b = null;
        obj.f2120a = false;
        obj.f2122c = null;
        this.f19070x = obj;
        this.M = new int[0];
        Set set = f19047p0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f19055e0 = new boolean[0];
        this.f19054d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f19071y = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f19041b;

            {
                this.f19041b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f19041b.A();
                        return;
                    default:
                        q qVar = this.f19041b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f19062k0);
                        }
                        qVar.S = true;
                        qVar.A();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f19041b;

            {
                this.f19041b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f19041b.A();
                        return;
                    default:
                        q qVar = this.f19041b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f19062k0);
                        }
                        qVar.S = true;
                        qVar.A();
                        return;
                }
            }
        };
        this.H = n0.q(null);
        this.f19057f0 = j10;
        this.f19058g0 = j10;
        this.f19062k0 = Long.MIN_VALUE;
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
        String str = xVar.f3578k;
        String str2 = xVar2.f3586s;
        int h = w0.h(str2);
        if (n0.v(h, str) == 1) {
            b10 = n0.w(h, str);
            str2 = w0.d(b10);
        } else {
            b10 = w0.b(str, str2);
        }
        xVar2.f3581n = xVar.f3581n;
        xVar2.f3582o = xVar.f3582o;
        xVar2.f3583p = xVar.f3583p;
        xVar2.f3584q = xVar.f3584q;
        w a2 = xVar2.a();
        a2.f3519a = xVar.f3571a;
        a2.f3520b = xVar.f3572b;
        a2.f3521c = i0.u(xVar.f3573c);
        a2.d = xVar.d;
        a2.e = xVar.e;
        a2.f3522f = xVar.f3574f;
        if (z10) {
            i10 = xVar.h;
        } else {
            i10 = -1;
        }
        a2.h = i10;
        if (z10) {
            i11 = xVar.f3576i;
        } else {
            i11 = -1;
        }
        a2.f3524i = i11;
        a2.f3525j = b10;
        a2.f3531p = xVar.f3583p;
        a2.f3529n = xVar.f3582o;
        a2.f3528m = xVar.f3581n;
        a2.f3530o = xVar.f3584q;
        if (h == 2) {
            a2.f3539y = xVar.f3592z;
            a2.f3540z = xVar.A;
            a2.C = xVar.D;
        }
        if (str2 != null) {
            a2.f3533r = w0.n(str2);
        }
        int i12 = xVar.K;
        if (i12 != -1 && h == 1) {
            a2.J = i12;
        }
        u0 u0Var = xVar.f3579l;
        if (u0Var != null) {
            u0 u0Var2 = xVar2.f3579l;
            if (u0Var2 != null) {
                u0Var = u0Var2.b(u0Var);
            }
            a2.f3526k = u0Var;
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

    public final void A() {
        boolean z10;
        int i10;
        x t10;
        if (!this.X && this.f19049a0 == null && this.S) {
            int i11 = 0;
            for (p pVar : this.L) {
                if (pVar.y() == null) {
                    return;
                }
            }
            r1 r1Var = this.Y;
            if (r1Var != null) {
                int i12 = r1Var.f49415a;
                int[] iArr = new int[i12];
                this.f19049a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i14 < pVarArr.length) {
                            x y3 = pVarArr[i14].y();
                            y3.getClass();
                            x xVar = this.Y.a(i13).d[0];
                            String str = y3.f3586s;
                            String str2 = xVar.f3586s;
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
                    this.f19049a0[i13] = i14;
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
                String str3 = y10.f3586s;
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
            int i19 = q1Var.f3358a;
            this.f19051b0 = -1;
            this.f19049a0 = new int[length];
            for (int i20 = 0; i20 < length; i20++) {
                this.f19049a0[i20] = i20;
            }
            q1[] q1VarArr = new q1[length];
            int i21 = 0;
            while (i21 < length) {
                x y11 = this.L[i21].y();
                y11.getClass();
                x xVar2 = this.f19056f;
                String str4 = this.f19048a;
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
                    this.f19051b0 = i21;
                    i10 = 0;
                } else {
                    xVar2 = (i17 == 2 && w0.i(y11.f3586s)) ? null : null;
                    StringBuilder l4 = b10.l(str4, ":muxed:");
                    l4.append(i21 < i16 ? i21 : i21 - 1);
                    String sb2 = l4.toString();
                    i10 = 0;
                    w a2 = t(xVar2, y11, false).a();
                    a2.f3527l = str4;
                    q1VarArr[i21] = new q1(sb2, new x(a2));
                }
                i21++;
                i11 = i10;
            }
            int i23 = i11;
            this.Y = n(q1VarArr);
            if (this.Z == null) {
                z10 = 1;
            } else {
                z10 = i23;
            }
            yb.p(z10);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.f19052c.f0();
        }
    }

    @Override
    public final void B(y2.i iVar, long j10, long j11) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f18988s;
            i iVar2 = this.d;
            iVar2.f19003m = bArr;
            h5 h5Var = iVar2.f19000j;
            Uri uri = eVar.f50007b.f12258a;
            byte[] bArr2 = eVar.f18989w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) h5Var.f17285a).put(uri, bArr2);
        }
        long j12 = fVar.f50006a;
        g2.m mVar = fVar.f50007b;
        b0 b0Var = fVar.f50011r;
        u uVar = new u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        this.f19067r.getClass();
        this.v.q(uVar, fVar.f50008c, this.f19050b, fVar.d, fVar.e, fVar.f50009f, fVar.h, fVar.f50010n);
        if (!this.T) {
            v0 v0Var = new v0();
            v0Var.f13778a = this.f19057f0;
            m(new i2.w0(v0Var));
            return;
        }
        this.f19052c.u(this);
    }

    public final void C() {
        this.f19068s.d();
        i iVar = this.d;
        u2.b bVar = iVar.f19004n;
        if (bVar == null) {
            Uri uri = iVar.f19005o;
            if (uri != null && uri.equals(iVar.f19006p)) {
                iVar.f18998g.h(iVar.f19005o);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void D(q1[] q1VarArr, int... iArr) {
        this.Y = n(q1VarArr);
        this.Z = new HashSet();
        for (int i10 : iArr) {
            this.Z.add(this.Y.a(i10));
        }
        this.f19051b0 = 0;
        this.H.post(new k2.c(this.f19052c, 13));
        this.T = true;
    }

    public final void E() {
        for (p pVar : this.L) {
            pVar.G(this.f19059h0);
        }
        this.f19059h0 = false;
    }

    public final boolean F(long j10, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean J;
        this.f19057f0 = j10;
        if (y()) {
            this.f19058g0 = j10;
            return true;
        }
        boolean z13 = this.d.f19007q;
        ArrayList arrayList = this.f19071y;
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
                if (!J && (this.f19055e0[i11] || !this.f19053c0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f19058g0 = j10;
        this.f19061j0 = false;
        arrayList.clear();
        y2.l lVar = this.f19068s;
        if (lVar.c()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.l();
                }
            }
            lVar.a();
            return true;
        }
        lVar.f51966c = null;
        E();
        return true;
    }

    @Override
    public final j0 F1(int i10, int i11) {
        j jVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f19047p0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            yb.g(set.contains(Integer.valueOf(i11)));
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
            if (this.f19063l0) {
                return j(i10, i11);
            }
            int length = this.L.length;
            if (i11 == 1 || i11 == 2) {
                z10 = true;
            }
            r52 = new p(this.e, this.h, this.f19064n, this.J);
            r52.f49278t = this.f19057f0;
            if (z10) {
                r52.K = this.f19065n0;
                r52.B = true;
            }
            long j10 = this.m0;
            if (r52.H != j10) {
                r52.H = j10;
                r52.B = true;
            }
            if (this.f19066o0 != null) {
                r52.E = jVar.v;
            }
            r52.f49265f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i14);
            this.M = copyOf;
            copyOf[length] = i10;
            p[] pVarArr = this.L;
            String str = n0.f9692a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f19055e0, i14);
            this.f19055e0 = copyOf3;
            copyOf3[length] = z10;
            this.f19053c0 |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (x(i11) > x(this.Q)) {
                this.R = length;
                this.Q = i11;
            }
            this.f19054d0 = Arrays.copyOf(this.f19054d0, i14);
        }
        if (i11 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f19069w);
            }
            return this.P;
        }
        return r52;
    }

    @Override
    public final void Q0() {
        this.f19063l0 = true;
        this.H.post(this.G);
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
                pVar.f49266g = null;
            }
        }
    }

    @Override
    public final long b() {
        if (y()) {
            return this.f19058g0;
        }
        if (this.f19061j0) {
            return Long.MIN_VALUE;
        }
        return v().f50010n;
    }

    @Override
    public final boolean c() {
        return this.f19068s.c();
    }

    @Override
    public final void d() {
        this.H.post(this.F);
    }

    public final void e() {
        yb.p(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean f(int i10) {
        int i11 = i10;
        while (true) {
            ArrayList arrayList = this.f19071y;
            if (i11 < arrayList.size()) {
                if (((j) arrayList.get(i11)).f19012b0) {
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
    public final void l0(y2.i iVar, long j10, long j11, boolean z10) {
        v2.f fVar = (v2.f) iVar;
        this.K = null;
        long j12 = fVar.f50006a;
        g2.m mVar = fVar.f50007b;
        b0 b0Var = fVar.f50011r;
        u uVar = new u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        this.f19067r.getClass();
        this.v.p(uVar, fVar.f50008c, this.f19050b, fVar.d, fVar.e, fVar.f50009f, fVar.h, fVar.f50010n);
        if (!z10) {
            if (y() || this.U == 0) {
                E();
            }
            if (this.U > 0) {
                this.f19052c.u(this);
            }
        }
    }

    @Override
    public final boolean m(i2.w0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.m(i2.w0):boolean");
    }

    public final r1 n(q1[] q1VarArr) {
        for (int i10 = 0; i10 < q1VarArr.length; i10++) {
            q1 q1Var = q1VarArr[i10];
            x[] xVarArr = new x[q1Var.f3358a];
            for (int i11 = 0; i11 < q1Var.f3358a; i11++) {
                x xVar = q1Var.d[i11];
                int w10 = this.h.w(xVar);
                w a2 = xVar.a();
                a2.S = w10;
                xVarArr[i11] = new x(a2);
            }
            q1VarArr[i10] = new q1(q1Var.f3359b, xVarArr);
        }
        return new r1(q1VarArr);
    }

    @Override
    public final long q() {
        if (this.f19061j0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f19058g0;
        }
        long j10 = this.f19057f0;
        j v = v();
        if (!v.X) {
            ArrayList arrayList = this.f19071y;
            if (arrayList.size() > 1) {
                v = (j) ic.a.g(2, arrayList);
            } else {
                v = null;
            }
        }
        if (v != null) {
            j10 = Math.max(j10, v.f50010n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j10 = Math.max(j10, pVar.s());
            }
        }
        return j10;
    }

    @Override
    public final void s(long j10) {
        int size;
        y2.l lVar = this.f19068s;
        if (!lVar.b() && !y()) {
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
                if (iVar.f19004n == null) {
                    z11 = iVar.f19008r.d(j10, fVar, list);
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
            if (iVar.f19004n == null && iVar.f19008r.length() >= 2) {
                size = iVar.f19008r.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.f19071y.size()) {
                u(size);
            }
            if (this.S && this.f19062k0 != Long.MIN_VALUE) {
                boolean z12 = true;
                while (true) {
                    p[] pVarArr = this.L;
                    if (i10 >= pVarArr.length) {
                        break;
                    }
                    if (this.f19054d0[i10] && (this.f19055e0[i10] || !this.f19053c0)) {
                        z12 &= pVarArr[i10].z();
                    }
                    i10++;
                }
                z10 = z12;
            }
            if (z10) {
                this.f19061j0 = true;
            }
        }
    }

    public final void u(int i10) {
        ArrayList arrayList;
        yb.p(!this.f19068s.c());
        while (true) {
            arrayList = this.f19071y;
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
        long j10 = v().f50010n;
        j jVar = (j) arrayList.get(i10);
        n0.X(i10, arrayList.size(), arrayList);
        for (int i11 = 0; i11 < this.L.length; i11++) {
            this.L[i11].o(jVar.f(i11));
        }
        if (arrayList.isEmpty()) {
            this.f19058g0 = this.f19057f0;
        } else {
            ((j) f9.o.m(arrayList)).Z = true;
        }
        this.f19061j0 = false;
        this.v.C(this.Q, jVar.h, j10);
    }

    public final j v() {
        return (j) ic.a.g(1, this.f19071y);
    }

    @Override
    public final k4.d w(y2.i r24, long r25, long r27, java.io.IOException r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: o2.q.w(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    public final boolean y() {
        if (this.f19058g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        v2.f fVar = (v2.f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f50006a;
            uVar = new u(fVar.f50007b, j10);
        } else {
            long j13 = fVar.f50006a;
            g2.m mVar = fVar.f50007b;
            b0 b0Var = fVar.f50011r;
            uVar = new u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        }
        this.v.u(uVar, fVar.f50008c, this.f19050b, fVar.d, fVar.e, fVar.f50009f, fVar.h, fVar.f50010n, i10);
    }

    @Override
    public final void D1(c3.b0 b0Var) {
    }
}
