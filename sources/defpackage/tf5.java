package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class tf5 implements h86, l86, q4a, l74, fp9 {
    public static final Set q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final qf5 G;
    public final qf5 H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public zg2 L;
    public sf5[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public rf5 Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public fm4 W;
    public fm4 X;
    public boolean Y;
    public txb Z;
    public final String a;
    public Set a0;
    public final byte b;
    public int[] b0;
    public final gi3 c;
    public int c0;
    public final re5 d;
    public boolean d0;
    public final mv6 e;
    public boolean[] e0;
    public final fm4 f;
    public boolean[] f0;
    public long g0;
    public final yq3 h;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final vq3 n;
    public long n0;
    public qq3 o0;
    public te5 p0;
    public final i2f r;
    public final mv6 s;
    public final kp w;
    public final boolean x;
    public final qx y;

    public tf5(String str, int i, gi3 gi3Var, re5 re5Var, Map map, mv6 mv6Var, long j, fm4 fm4Var, yq3 yq3Var, vq3 vq3Var, i2f i2fVar, kp kpVar, int i2, e69 e69Var) {
        mv6 mv6Var2;
        this.a = str;
        this.b = i;
        this.c = gi3Var;
        this.d = re5Var;
        this.K = map;
        this.e = mv6Var;
        this.f = fm4Var;
        this.h = yq3Var;
        this.n = vq3Var;
        this.r = i2fVar;
        this.w = kpVar;
        this.x = i2;
        if (e69Var != null) {
            mv6Var2 = new mv6(e69Var, (byte) 5);
        } else {
            mv6Var2 = new mv6("Loader:HlsSampleStreamWrapper");
        }
        this.s = mv6Var2;
        qx qxVar = new qx();
        qxVar.c = null;
        qxVar.b = false;
        qxVar.d = null;
        this.y = qxVar;
        this.N = new int[0];
        Set set = q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new sf5[0];
        this.f0 = new boolean[0];
        this.e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) {
            public final tf5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                tf5 tf5Var = this.b;
                switch (b) {
                    case 0:
                        tf5Var.B();
                        return;
                    default:
                        for (sf5 sf5Var : tf5Var.M) {
                            sf5Var.K(tf5Var.l0);
                        }
                        tf5Var.T = true;
                        tf5Var.B();
                        return;
                }
            }
        };
        this.H = new Runnable(this) {
            public final tf5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                tf5 tf5Var = this.b;
                switch (b) {
                    case 0:
                        tf5Var.B();
                        return;
                    default:
                        for (sf5 sf5Var : tf5Var.M) {
                            sf5Var.K(tf5Var.l0);
                        }
                        tf5Var.T = true;
                        tf5Var.B();
                        return;
                }
            }
        };
        this.I = g8c.q(null);
        this.g0 = j;
        this.h0 = j;
        this.l0 = Long.MIN_VALUE;
    }

    public static yn3 j(int i, int i2) {
        lad.f("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new yn3();
    }

    public static fm4 u(fm4 fm4Var, fm4 fm4Var2, boolean z) {
        String b;
        int i;
        int i2;
        if (fm4Var == null) {
            return fm4Var2;
        }
        String str = fm4Var.l;
        String str2 = fm4Var2.t;
        int h = ud7.h(str2);
        if (g8c.v(h, str) == 1) {
            b = g8c.w(h, str);
            str2 = ud7.d(b);
        } else {
            b = ud7.b(str, str2);
        }
        fm4Var2.o = fm4Var.o;
        fm4Var2.p = fm4Var.p;
        fm4Var2.q = fm4Var.q;
        fm4Var2.r = fm4Var.r;
        em4 a = fm4Var2.a();
        a.a = fm4Var.a;
        a.b = fm4Var.b;
        a.c = mm5.q(fm4Var.c);
        a.d = fm4Var.d;
        a.e = fm4Var.e;
        a.f = fm4Var.f;
        if (z) {
            i = fm4Var.i;
        } else {
            i = -1;
        }
        a.i = i;
        if (z) {
            i2 = fm4Var.j;
        } else {
            i2 = -1;
        }
        a.j = i2;
        a.k = b;
        a.q = fm4Var.q;
        a.o = fm4Var.p;
        a.n = fm4Var.o;
        a.p = fm4Var.r;
        if (h == 2) {
            a.z = fm4Var.A;
            a.A = fm4Var.B;
            a.a(fm4Var.F);
        }
        if (str2 != null) {
            a.s = ud7.n(str2);
        }
        int i3 = fm4Var.N;
        if (i3 != -1 && h == 1) {
            a.M = i3;
        }
        ld7 ld7Var = fm4Var.m;
        if (ld7Var != null) {
            ld7 ld7Var2 = fm4Var2.m;
            if (ld7Var2 != null) {
                ld7Var = ld7Var2.b(ld7Var);
            }
            a.l = ld7Var;
        }
        return new fm4(a);
    }

    public static int y(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        return 0;
    }

    public final boolean A() {
        if (this.h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void B() {
        boolean z;
        int i;
        fm4 u;
        if (!this.Y && this.b0 == null && this.T) {
            int i2 = 0;
            for (sf5 sf5Var : this.M) {
                if (sf5Var.y() == null) {
                    return;
                }
            }
            txb txbVar = this.Z;
            if (txbVar != null) {
                int i3 = txbVar.a;
                int[] iArr = new int[i3];
                this.b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        sf5[] sf5VarArr = this.M;
                        if (i5 < sf5VarArr.length) {
                            fm4 y = sf5VarArr[i5].y();
                            y.getClass();
                            fm4 fm4Var = this.Z.a(i4).d[0];
                            String str = y.t;
                            String str2 = fm4Var.t;
                            int h = ud7.h(str);
                            if (h != 3) {
                                if (h == ud7.h(str2)) {
                                    break;
                                }
                                i5++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y.T == fm4Var.T) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    this.b0[i4] = i5;
                }
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((pf5) obj).c();
                }
                return;
            }
            int length = this.M.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                fm4 y2 = this.M[i6].y();
                y2.getClass();
                String str3 = y2.t;
                if (ud7.m(str3)) {
                    i9 = 2;
                } else if (!ud7.i(str3)) {
                    if (ud7.l(str3)) {
                        i9 = 3;
                    } else {
                        i9 = -2;
                    }
                }
                if (y(i9) > y(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            sxb sxbVar = this.d.i;
            int i10 = sxbVar.a;
            this.c0 = -1;
            this.b0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.b0[i11] = i11;
            }
            sxb[] sxbVarArr = new sxb[length];
            int i12 = 0;
            while (i12 < length) {
                fm4 y3 = this.M[i12].y();
                y3.getClass();
                fm4 fm4Var2 = this.f;
                String str4 = this.a;
                if (i12 == i7) {
                    fm4[] fm4VarArr = new fm4[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        fm4 fm4Var3 = sxbVar.d[i13];
                        if (i8 == 1 && fm4Var2 != null) {
                            fm4Var3 = fm4Var3.d(fm4Var2);
                        }
                        if (i10 == 1) {
                            u = y3.d(fm4Var3);
                        } else {
                            u = u(fm4Var3, y3, true);
                        }
                        fm4VarArr[i13] = u;
                    }
                    sxbVarArr[i12] = new sxb(str4, fm4VarArr);
                    this.c0 = i12;
                    i = 0;
                } else {
                    fm4Var2 = (i8 == 2 && ud7.i(y3.t)) ? null : null;
                    StringBuilder k = b00.k(str4, ":muxed:");
                    k.append(i12 < i7 ? i12 : i12 - 1);
                    String sb = k.toString();
                    i = 0;
                    em4 a = u(fm4Var2, y3, false).a();
                    a.m = str4;
                    sxbVarArr[i12] = new sxb(sb, new fm4(a));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.Z = n(sxbVarArr);
            if (this.a0 == null) {
                z = 1;
            } else {
                z = i14;
            }
            gre.p(z);
            this.a0 = Collections.EMPTY_SET;
            this.U = true;
            this.c.x();
        }
    }

    public final void C() {
        this.s.b();
        re5 re5Var = this.d;
        jh0 jh0Var = re5Var.o;
        if (jh0Var == null) {
            Uri uri = re5Var.p;
            if (uri != null && uri.equals(re5Var.q)) {
                re5Var.g.i(re5Var.p);
                return;
            }
            return;
        }
        throw jh0Var;
    }

    @Override
    public final void C0(k86 k86Var, long j, long j2, int i) {
        zg2 zg2Var = (zg2) k86Var;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        if (i != 0) {
            zxa zxaVar = zg2Var.r;
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        this.w.u(new f86(e86Var), zg2Var.c, this.b, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n, i);
    }

    public final void D(sxb[] sxbVarArr, int... iArr) {
        this.Z = n(sxbVarArr);
        this.a0 = new HashSet();
        for (int i : iArr) {
            this.a0.add(this.Z.a(i));
        }
        this.c0 = 0;
        this.I.post(new iu4(this.c, (byte) 24));
        this.U = true;
    }

    public final void E() {
        for (sf5 sf5Var : this.M) {
            sf5Var.G(this.i0);
        }
        this.i0 = false;
    }

    public final boolean F(long j, boolean z) {
        te5 te5Var;
        boolean z2;
        boolean J;
        this.g0 = j;
        if (A()) {
            this.h0 = j;
            return true;
        }
        boolean z3 = this.d.r;
        ArrayList arrayList = this.E;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                te5Var = (te5) arrayList.get(i);
                if (te5Var.h == j) {
                    break;
                }
            }
        }
        te5Var = null;
        if (this.T && !z && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (int i2 = 0; i2 < length; i2++) {
                sf5 sf5Var = this.M[i2];
                if (te5Var != null) {
                    J = sf5Var.I(te5Var.g(i2));
                } else {
                    long g = g();
                    if (g != Long.MIN_VALUE && j >= g) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    J = sf5Var.J(j, z2);
                }
                if (J || (!this.f0[i2] && this.d0)) {
                }
            }
            return false;
        }
        this.h0 = j;
        this.k0 = false;
        arrayList.clear();
        mv6 mv6Var = this.s;
        if (mv6Var.W()) {
            if (this.T) {
                for (sf5 sf5Var2 : this.M) {
                    sf5Var2.l();
                }
            }
            mv6Var.p();
            return true;
        }
        mv6Var.d = null;
        E();
        return true;
    }

    @Override
    public final wxb S(int i, int i2) {
        te5 te5Var;
        Integer valueOf = Integer.valueOf(i2);
        Set set = q0;
        boolean contains = set.contains(valueOf);
        boolean z = false;
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            gre.f(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.N[i3] = i;
                }
                r5 = this.N[i3] == i ? this.M[i3] : j(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.M;
                if (i4 >= r1.length) {
                    break;
                } else if (this.N[i4] == i) {
                    r5 = r1[i4];
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (r5 == 0) {
            if (this.m0) {
                return j(i, i2);
            }
            int length = this.M.length;
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            r5 = new sf5(this.e, this.h, this.n, this.K);
            r5.t = this.g0;
            if (z) {
                r5.L = this.o0;
                r5.C = true;
            }
            long j = this.n0;
            if (r5.I != j) {
                r5.I = j;
                r5.C = true;
            }
            if (this.p0 != null) {
                r5.F = te5Var.w;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i5);
            this.N = copyOf;
            copyOf[length] = i;
            sf5[] sf5VarArr = this.M;
            String str = g8c.a;
            ?? copyOf2 = Arrays.copyOf(sf5VarArr, sf5VarArr.length + 1);
            copyOf2[sf5VarArr.length] = r5;
            this.M = (sf5[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f0, i5);
            this.f0 = copyOf3;
            copyOf3[length] = z;
            this.d0 |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (y(i2) > y(this.R)) {
                this.S = length;
                this.R = i2;
            }
            this.e0 = Arrays.copyOf(this.e0, i5);
        }
        if (i2 == 5) {
            rf5 rf5Var = this.Q;
            if (rf5Var == null) {
                rf5 rf5Var2 = new rf5(r5, this.x ? 1 : 0);
                this.Q = rf5Var2;
                return rf5Var2;
            }
            return rf5Var;
        }
        return r5;
    }

    @Override
    public final void U(k86 k86Var, long j, long j2) {
        zg2 zg2Var = (zg2) k86Var;
        this.L = null;
        if (zg2Var instanceof ne5) {
            ne5 ne5Var = (ne5) zg2Var;
            byte[] bArr = ne5Var.s;
            re5 re5Var = this.d;
            re5Var.n = bArr;
            pj4 pj4Var = re5Var.k;
            Uri uri = ne5Var.b.a;
            byte[] bArr2 = ne5Var.x;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((np4) pj4Var.b).put(uri, bArr2);
        }
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar = zg2Var.r;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.r.getClass();
        this.w.q(f86Var, zg2Var.c, this.b, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n);
        if (!this.U) {
            s86 s86Var = new s86();
            s86Var.a = this.g0;
            r(new t86(s86Var));
            return;
        }
        this.c.b(this);
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    public final void b() {
        gre.p(this.U);
        this.Z.getClass();
        this.a0.getClass();
    }

    @Override
    public final void c() {
        sf5[] sf5VarArr;
        for (sf5 sf5Var : this.M) {
            sf5Var.G(true);
            sq3 sq3Var = sf5Var.h;
            if (sq3Var != null) {
                sq3Var.c(sf5Var.e);
                sf5Var.h = null;
                sf5Var.g = null;
            }
        }
    }

    @Override
    public final boolean d() {
        return this.s.W();
    }

    @Override
    public final long g() {
        if (A()) {
            return this.h0;
        }
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        return x().n;
    }

    public final boolean h(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf5.h(int):boolean");
    }

    public final txb n(sxb[] sxbVarArr) {
        for (int i = 0; i < sxbVarArr.length; i++) {
            sxb sxbVar = sxbVarArr[i];
            fm4[] fm4VarArr = new fm4[sxbVar.a];
            for (int i2 = 0; i2 < sxbVar.a; i2++) {
                fm4 fm4Var = sxbVar.d[i2];
                int w = this.h.w(fm4Var);
                em4 a = fm4Var.a();
                a.W = w;
                fm4VarArr[i2] = new fm4(a);
            }
            sxbVarArr[i] = new sxb(sxbVar.b, fm4VarArr);
        }
        return new txb(sxbVarArr);
    }

    @Override
    public final boolean r(defpackage.t86 r69) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf5.r(t86):boolean");
    }

    @Override
    public final long s() {
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.h0;
        }
        long j = this.g0;
        te5 x = x();
        if (!x.Y) {
            ArrayList arrayList = this.E;
            if (arrayList.size() > 1) {
                x = (te5) b00.f(2, arrayList);
            } else {
                x = null;
            }
        }
        if (x != null) {
            j = Math.max(j, x.n);
        }
        if (this.T) {
            for (sf5 sf5Var : this.M) {
                j = Math.max(j, sf5Var.s());
            }
        }
        return j;
    }

    @Override
    public final void t(long j) {
        int size;
        mv6 mv6Var = this.s;
        if (!mv6Var.S() && !A()) {
            boolean W = mv6Var.W();
            boolean z = false;
            re5 re5Var = this.d;
            ArrayList arrayList = this.E;
            List list = this.F;
            if (W) {
                zg2 zg2Var = this.L;
                zg2Var.getClass();
                if (!(zg2Var instanceof te5) || h(arrayList.size() - 1)) {
                    long j2 = this.l0;
                    if (j2 == Long.MIN_VALUE || zg2Var.h < j2) {
                        if (re5Var.o == null) {
                            z = re5Var.s.g(j, zg2Var, list);
                        }
                        if (!z) {
                            return;
                        }
                    }
                    mv6Var.p();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && re5Var.c((te5) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                w(size2);
            }
            int size3 = arrayList.size();
            if (re5Var.o == null && re5Var.s.length() >= 2) {
                size = re5Var.s.l(j, list);
            } else {
                size = list.size();
            }
            int min = Math.min(size3, size);
            if (this.l0 != Long.MIN_VALUE) {
                while (min > 0 && ((te5) arrayList.get(min - 1)).h >= this.l0) {
                    min--;
                    z = true;
                }
            }
            if (min < arrayList.size()) {
                w(min);
            }
            if (z) {
                this.h0 = -9223372036854775807L;
                this.k0 = true;
            }
        }
    }

    @Override
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        zg2 zg2Var = (zg2) k86Var;
        this.L = null;
        e86 e86Var = new e86(zg2Var.a, zg2Var.b, j);
        zxa zxaVar = zg2Var.r;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.r.getClass();
        this.w.o(f86Var, zg2Var.c, this.b, zg2Var.d, zg2Var.e, zg2Var.f, zg2Var.h, zg2Var.n);
        if (!z) {
            if (A() || this.V == 0) {
                E();
            }
            if (this.V > 0) {
                this.c.b(this);
            }
        }
    }

    public final void w(int i) {
        ArrayList arrayList;
        gre.p(!this.s.W());
        while (true) {
            arrayList = this.E;
            if (i < arrayList.size()) {
                if (h(i)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        long j = x().n;
        te5 te5Var = (te5) arrayList.get(i);
        g8c.Y(i, arrayList.size(), arrayList);
        for (int i2 = 0; i2 < this.M.length; i2++) {
            this.M[i2].o(te5Var.g(i2));
        }
        if (arrayList.isEmpty()) {
            this.h0 = Math.max(this.g0, te5Var.h);
        } else {
            ((te5) jle.b(arrayList)).a0 = true;
        }
        this.k0 = false;
        this.w.A(te5Var.h, this.R, j);
    }

    @Override
    public final defpackage.i86 w1(defpackage.k86 r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf5.w1(k86, long, long, java.io.IOException, int):i86");
    }

    public final te5 x() {
        return (te5) b00.f(1, this.E);
    }

    @Override
    public final void z() {
        this.m0 = true;
        this.I.post(this.H);
    }

    @Override
    public final void g0(fv9 fv9Var) {
    }
}
