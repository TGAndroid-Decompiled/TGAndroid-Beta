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
public final class sh5 implements ga6, ka6, s6a, u84, gr9 {
    public static final Set q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final ph5 G;
    public final ph5 H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public ni2 L;
    public rh5[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public qh5 Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public go4 W;
    public go4 X;
    public boolean Y;
    public vzb Z;
    public final String a;
    public Set a0;
    public final byte b;
    public int[] b0;
    public final lj4 c;
    public int c0;
    public final qg5 d;
    public boolean d0;
    public final mx6 e;
    public boolean[] e0;
    public final go4 f;
    public boolean[] f0;
    public long g0;
    public final is3 h;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final fs3 n;
    public long n0;
    public as3 o0;
    public sg5 p0;
    public final k4f r;
    public final mx6 s;
    public final kq w;
    public final boolean x;
    public final ry y;

    public sh5(String str, int i, lj4 lj4Var, qg5 qg5Var, Map map, mx6 mx6Var, long j, go4 go4Var, is3 is3Var, fs3 fs3Var, k4f k4fVar, kq kqVar, int i2, g89 g89Var) {
        mx6 mx6Var2;
        this.a = str;
        this.b = i;
        this.c = lj4Var;
        this.d = qg5Var;
        this.K = map;
        this.e = mx6Var;
        this.f = go4Var;
        this.h = is3Var;
        this.n = fs3Var;
        this.r = k4fVar;
        this.w = kqVar;
        this.x = i2;
        if (g89Var != null) {
            mx6Var2 = new mx6(g89Var, (byte) 5);
        } else {
            mx6Var2 = new mx6("Loader:HlsSampleStreamWrapper");
        }
        this.s = mx6Var2;
        ry ryVar = new ry();
        ryVar.c = null;
        ryVar.b = false;
        ryVar.d = null;
        this.y = ryVar;
        this.N = new int[0];
        Set set = q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new rh5[0];
        this.f0 = new boolean[0];
        this.e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) {
            public final sh5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                sh5 sh5Var = this.b;
                switch (b) {
                    case 0:
                        sh5Var.A();
                        return;
                    default:
                        for (rh5 rh5Var : sh5Var.M) {
                            rh5Var.K(sh5Var.l0);
                        }
                        sh5Var.T = true;
                        sh5Var.A();
                        return;
                }
            }
        };
        this.H = new Runnable(this) {
            public final sh5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                sh5 sh5Var = this.b;
                switch (b) {
                    case 0:
                        sh5Var.A();
                        return;
                    default:
                        for (rh5 rh5Var : sh5Var.M) {
                            rh5Var.K(sh5Var.l0);
                        }
                        sh5Var.T = true;
                        sh5Var.A();
                        return;
                }
            }
        };
        this.I = hac.q(null);
        this.g0 = j;
        this.h0 = j;
        this.l0 = Long.MIN_VALUE;
    }

    public static ip3 m(int i, int i2) {
        ncd.f("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new ip3();
    }

    public static go4 u(go4 go4Var, go4 go4Var2, boolean z) {
        String b;
        int i;
        int i2;
        if (go4Var == null) {
            return go4Var2;
        }
        String str = go4Var.l;
        String str2 = go4Var2.t;
        int h = wf7.h(str2);
        if (hac.v(h, str) == 1) {
            b = hac.w(h, str);
            str2 = wf7.d(b);
        } else {
            b = wf7.b(str, str2);
        }
        go4Var2.o = go4Var.o;
        go4Var2.p = go4Var.p;
        go4Var2.q = go4Var.q;
        go4Var2.r = go4Var.r;
        fo4 a = go4Var2.a();
        a.a = go4Var.a;
        a.b = go4Var.b;
        a.c = mo5.q(go4Var.c);
        a.d = go4Var.d;
        a.e = go4Var.e;
        a.f = go4Var.f;
        if (z) {
            i = go4Var.i;
        } else {
            i = -1;
        }
        a.i = i;
        if (z) {
            i2 = go4Var.j;
        } else {
            i2 = -1;
        }
        a.j = i2;
        a.k = b;
        a.q = go4Var.q;
        a.o = go4Var.p;
        a.n = go4Var.o;
        a.p = go4Var.r;
        if (h == 2) {
            a.z = go4Var.A;
            a.A = go4Var.B;
            a.a(go4Var.F);
        }
        if (str2 != null) {
            a.s = wf7.n(str2);
        }
        int i3 = go4Var.N;
        if (i3 != -1 && h == 1) {
            a.M = i3;
        }
        nf7 nf7Var = go4Var.m;
        if (nf7Var != null) {
            nf7 nf7Var2 = go4Var2.m;
            if (nf7Var2 != null) {
                nf7Var = nf7Var2.b(nf7Var);
            }
            a.l = nf7Var;
        }
        return new go4(a);
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

    public final void A() {
        boolean z;
        int i;
        go4 u;
        if (!this.Y && this.b0 == null && this.T) {
            int i2 = 0;
            for (rh5 rh5Var : this.M) {
                if (rh5Var.y() == null) {
                    return;
                }
            }
            vzb vzbVar = this.Z;
            if (vzbVar != null) {
                int i3 = vzbVar.a;
                int[] iArr = new int[i3];
                this.b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        rh5[] rh5VarArr = this.M;
                        if (i5 < rh5VarArr.length) {
                            go4 y = rh5VarArr[i5].y();
                            y.getClass();
                            go4 go4Var = this.Z.a(i4).d[0];
                            String str = y.t;
                            String str2 = go4Var.t;
                            int h = wf7.h(str);
                            if (h != 3) {
                                if (h == wf7.h(str2)) {
                                    break;
                                }
                                i5++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y.T == go4Var.T) {
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
                    ((oh5) obj).b();
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
                go4 y2 = this.M[i6].y();
                y2.getClass();
                String str3 = y2.t;
                if (wf7.m(str3)) {
                    i9 = 2;
                } else if (!wf7.i(str3)) {
                    if (wf7.l(str3)) {
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
            uzb uzbVar = this.d.i;
            int i10 = uzbVar.a;
            this.c0 = -1;
            this.b0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.b0[i11] = i11;
            }
            uzb[] uzbVarArr = new uzb[length];
            int i12 = 0;
            while (i12 < length) {
                go4 y3 = this.M[i12].y();
                y3.getClass();
                go4 go4Var2 = this.f;
                String str4 = this.a;
                if (i12 == i7) {
                    go4[] go4VarArr = new go4[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        go4 go4Var3 = uzbVar.d[i13];
                        if (i8 == 1 && go4Var2 != null) {
                            go4Var3 = go4Var3.d(go4Var2);
                        }
                        if (i10 == 1) {
                            u = y3.d(go4Var3);
                        } else {
                            u = u(go4Var3, y3, true);
                        }
                        go4VarArr[i13] = u;
                    }
                    uzbVarArr[i12] = new uzb(str4, go4VarArr);
                    this.c0 = i12;
                    i = 0;
                } else {
                    go4Var2 = (i8 == 2 && wf7.i(y3.t)) ? null : null;
                    StringBuilder k = b10.k(str4, ":muxed:");
                    k.append(i12 < i7 ? i12 : i12 - 1);
                    String sb = k.toString();
                    i = 0;
                    fo4 a = u(go4Var2, y3, false).a();
                    a.m = str4;
                    uzbVarArr[i12] = new uzb(sb, new go4(a));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.Z = p(uzbVarArr);
            if (this.a0 == null) {
                z = 1;
            } else {
                z = i14;
            }
            jte.p(z);
            this.a0 = Collections.EMPTY_SET;
            this.U = true;
            this.c.A();
        }
    }

    @Override
    public final void B() {
        this.m0 = true;
        this.I.post(this.H);
    }

    public final void C() {
        this.s.d();
        qg5 qg5Var = this.d;
        ji0 ji0Var = qg5Var.o;
        if (ji0Var == null) {
            Uri uri = qg5Var.p;
            if (uri != null && uri.equals(qg5Var.q)) {
                qg5Var.g.i(qg5Var.p);
                return;
            }
            return;
        }
        throw ji0Var;
    }

    public final void D(uzb[] uzbVarArr, int... iArr) {
        this.Z = p(uzbVarArr);
        this.a0 = new HashSet();
        for (int i : iArr) {
            this.a0.add(this.Z.a(i));
        }
        this.c0 = 0;
        this.I.post(new kg5(this.c, (byte) 1));
        this.U = true;
    }

    public final void E() {
        for (rh5 rh5Var : this.M) {
            rh5Var.G(this.i0);
        }
        this.i0 = false;
    }

    public final boolean F(long j, boolean z) {
        sg5 sg5Var;
        boolean z2;
        boolean J;
        this.g0 = j;
        if (z()) {
            this.h0 = j;
            return true;
        }
        boolean z3 = this.d.r;
        ArrayList arrayList = this.E;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                sg5Var = (sg5) arrayList.get(i);
                if (sg5Var.h == j) {
                    break;
                }
            }
        }
        sg5Var = null;
        if (this.T && !z && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (int i2 = 0; i2 < length; i2++) {
                rh5 rh5Var = this.M[i2];
                if (sg5Var != null) {
                    J = rh5Var.I(sg5Var.g(i2));
                } else {
                    long g = g();
                    if (g != Long.MIN_VALUE && j >= g) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    J = rh5Var.J(j, z2);
                }
                if (J || (!this.f0[i2] && this.d0)) {
                }
            }
            return false;
        }
        this.h0 = j;
        this.k0 = false;
        arrayList.clear();
        mx6 mx6Var = this.s;
        if (mx6Var.Y()) {
            if (this.T) {
                for (rh5 rh5Var2 : this.M) {
                    rh5Var2.l();
                }
            }
            mx6Var.v();
            return true;
        }
        mx6Var.d = null;
        E();
        return true;
    }

    @Override
    public final void W0(ja6 ja6Var, long j, long j2, int i) {
        ni2 ni2Var = (ni2) ja6Var;
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        if (i != 0) {
            c0b c0bVar = ni2Var.r;
            da6Var.d = c0bVar.c;
            da6Var.e = c0bVar.d;
            da6Var.f = j2;
            da6Var.g = c0bVar.b;
        }
        this.w.u(new ea6(da6Var), ni2Var.c, this.b, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n, i);
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    @Override
    public final void b() {
        rh5[] rh5VarArr;
        for (rh5 rh5Var : this.M) {
            rh5Var.G(true);
            cs3 cs3Var = rh5Var.h;
            if (cs3Var != null) {
                cs3Var.c(rh5Var.e);
                rh5Var.h = null;
                rh5Var.g = null;
            }
        }
    }

    @Override
    public final yzb c0(int i, int i2) {
        sg5 sg5Var;
        Integer valueOf = Integer.valueOf(i2);
        Set set = q0;
        boolean contains = set.contains(valueOf);
        boolean z = false;
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            jte.f(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.N[i3] = i;
                }
                r5 = this.N[i3] == i ? this.M[i3] : m(i, i2);
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
                return m(i, i2);
            }
            int length = this.M.length;
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            r5 = new rh5(this.e, this.h, this.n, this.K);
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
                r5.F = sg5Var.w;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i5);
            this.N = copyOf;
            copyOf[length] = i;
            rh5[] rh5VarArr = this.M;
            String str = hac.a;
            ?? copyOf2 = Arrays.copyOf(rh5VarArr, rh5VarArr.length + 1);
            copyOf2[rh5VarArr.length] = r5;
            this.M = (rh5[]) copyOf2;
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
            qh5 qh5Var = this.Q;
            if (qh5Var == null) {
                qh5 qh5Var2 = new qh5(r5, this.x ? 1 : 0);
                this.Q = qh5Var2;
                return qh5Var2;
            }
            return qh5Var;
        }
        return r5;
    }

    public final void d() {
        jte.p(this.U);
        this.Z.getClass();
        this.a0.getClass();
    }

    @Override
    public final boolean f() {
        return this.s.Y();
    }

    @Override
    public final defpackage.ha6 f2(defpackage.ja6 r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh5.f2(ja6, long, long, java.io.IOException, int):ha6");
    }

    @Override
    public final long g() {
        if (z()) {
            return this.h0;
        }
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        return x().n;
    }

    @Override
    public final void g0(ja6 ja6Var, long j, long j2) {
        ni2 ni2Var = (ni2) ja6Var;
        this.L = null;
        if (ni2Var instanceof mg5) {
            mg5 mg5Var = (mg5) ni2Var;
            byte[] bArr = mg5Var.s;
            qg5 qg5Var = this.d;
            qg5Var.n = bArr;
            k44 k44Var = qg5Var.k;
            Uri uri = mg5Var.b.a;
            byte[] bArr2 = mg5Var.x;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((or4) k44Var.b).put(uri, bArr2);
        }
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar = ni2Var.r;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.r.getClass();
        this.w.q(ea6Var, ni2Var.c, this.b, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n);
        if (!this.U) {
            ra6 ra6Var = new ra6();
            ra6Var.a = this.g0;
            r(new sa6(ra6Var));
            return;
        }
        this.c.b(this);
    }

    public final boolean i(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh5.i(int):boolean");
    }

    public final vzb p(uzb[] uzbVarArr) {
        for (int i = 0; i < uzbVarArr.length; i++) {
            uzb uzbVar = uzbVarArr[i];
            go4[] go4VarArr = new go4[uzbVar.a];
            for (int i2 = 0; i2 < uzbVar.a; i2++) {
                go4 go4Var = uzbVar.d[i2];
                int x = this.h.x(go4Var);
                fo4 a = go4Var.a();
                a.W = x;
                go4VarArr[i2] = new go4(a);
            }
            uzbVarArr[i] = new uzb(uzbVar.b, go4VarArr);
        }
        return new vzb(uzbVarArr);
    }

    @Override
    public final boolean r(defpackage.sa6 r69) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh5.r(sa6):boolean");
    }

    @Override
    public final long s() {
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.h0;
        }
        long j = this.g0;
        sg5 x = x();
        if (!x.Y) {
            ArrayList arrayList = this.E;
            if (arrayList.size() > 1) {
                x = (sg5) b10.f(2, arrayList);
            } else {
                x = null;
            }
        }
        if (x != null) {
            j = Math.max(j, x.n);
        }
        if (this.T) {
            for (rh5 rh5Var : this.M) {
                j = Math.max(j, rh5Var.s());
            }
        }
        return j;
    }

    @Override
    public final void t(long j) {
        int size;
        mx6 mx6Var = this.s;
        if (!mx6Var.U() && !z()) {
            boolean Y = mx6Var.Y();
            boolean z = false;
            qg5 qg5Var = this.d;
            ArrayList arrayList = this.E;
            List list = this.F;
            if (Y) {
                ni2 ni2Var = this.L;
                ni2Var.getClass();
                if (!(ni2Var instanceof sg5) || i(arrayList.size() - 1)) {
                    long j2 = this.l0;
                    if (j2 == Long.MIN_VALUE || ni2Var.h < j2) {
                        if (qg5Var.o == null) {
                            z = qg5Var.s.g(j, ni2Var, list);
                        }
                        if (!z) {
                            return;
                        }
                    }
                    mx6Var.v();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && qg5Var.c((sg5) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                v(size2);
            }
            int size3 = arrayList.size();
            if (qg5Var.o == null && qg5Var.s.length() >= 2) {
                size = qg5Var.s.l(j, list);
            } else {
                size = list.size();
            }
            int min = Math.min(size3, size);
            if (this.l0 != Long.MIN_VALUE) {
                while (min > 0 && ((sg5) arrayList.get(min - 1)).h >= this.l0) {
                    min--;
                    z = true;
                }
            }
            if (min < arrayList.size()) {
                v(min);
            }
            if (z) {
                this.h0 = -9223372036854775807L;
                this.k0 = true;
            }
        }
    }

    public final void v(int i) {
        ArrayList arrayList;
        jte.p(!this.s.Y());
        while (true) {
            arrayList = this.E;
            if (i < arrayList.size()) {
                if (i(i)) {
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
        sg5 sg5Var = (sg5) arrayList.get(i);
        hac.Y(i, arrayList.size(), arrayList);
        for (int i2 = 0; i2 < this.M.length; i2++) {
            this.M[i2].o(sg5Var.g(i2));
        }
        if (arrayList.isEmpty()) {
            this.h0 = Math.max(this.g0, sg5Var.h);
        } else {
            ((sg5) lne.b(arrayList)).a0 = true;
        }
        this.k0 = false;
        this.w.A(sg5Var.h, this.R, j);
    }

    @Override
    public final void w(ja6 ja6Var, long j, long j2, boolean z) {
        ni2 ni2Var = (ni2) ja6Var;
        this.L = null;
        da6 da6Var = new da6(ni2Var.a, ni2Var.b, j);
        c0b c0bVar = ni2Var.r;
        da6Var.d = c0bVar.c;
        da6Var.e = c0bVar.d;
        da6Var.f = j2;
        da6Var.g = c0bVar.b;
        ea6 ea6Var = new ea6(da6Var);
        this.r.getClass();
        this.w.o(ea6Var, ni2Var.c, this.b, ni2Var.d, ni2Var.e, ni2Var.f, ni2Var.h, ni2Var.n);
        if (!z) {
            if (z() || this.V == 0) {
                E();
            }
            if (this.V > 0) {
                this.c.b(this);
            }
        }
    }

    public final sg5 x() {
        return (sg5) b10.f(1, this.E);
    }

    public final boolean z() {
        if (this.h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void f0(ix9 ix9Var) {
    }
}
