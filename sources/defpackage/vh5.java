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
public final class vh5 implements la6, pa6, i8a, g84, xs9 {
    public static final Set q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final sh5 G;
    public final sh5 H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public rh2 L;
    public uh5[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public th5 Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public ko4 W;
    public ko4 X;
    public boolean Y;
    public u1c Z;
    public final String a;
    public Set a0;
    public final byte b;
    public int[] b0;
    public final kj4 c;
    public int c0;
    public final sg5 d;
    public boolean d0;
    public final rx6 e;
    public boolean[] e0;
    public final ko4 f;
    public boolean[] f0;
    public long g0;
    public final pr3 h;
    public long h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final mr3 n;
    public long n0;
    public hr3 o0;
    public vg5 p0;
    public final z6f r;
    public final rx6 s;
    public final lp w;
    public final boolean x;
    public final rx y;

    public vh5(String str, int i, kj4 kj4Var, sg5 sg5Var, Map map, rx6 rx6Var, long j, ko4 ko4Var, pr3 pr3Var, mr3 mr3Var, z6f z6fVar, lp lpVar, int i2, r99 r99Var) {
        rx6 rx6Var2;
        this.a = str;
        this.b = i;
        this.c = kj4Var;
        this.d = sg5Var;
        this.K = map;
        this.e = rx6Var;
        this.f = ko4Var;
        this.h = pr3Var;
        this.n = mr3Var;
        this.r = z6fVar;
        this.w = lpVar;
        this.x = i2;
        if (r99Var != null) {
            rx6Var2 = new rx6(r99Var, (byte) 5);
        } else {
            rx6Var2 = new rx6("Loader:HlsSampleStreamWrapper");
        }
        this.s = rx6Var2;
        rx rxVar = new rx();
        rxVar.c = null;
        rxVar.b = false;
        rxVar.d = null;
        this.y = rxVar;
        this.N = new int[0];
        Set set = q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new uh5[0];
        this.f0 = new boolean[0];
        this.e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) {
            public final vh5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                vh5 vh5Var = this.b;
                switch (b) {
                    case 0:
                        vh5Var.A();
                        return;
                    default:
                        for (uh5 uh5Var : vh5Var.M) {
                            uh5Var.K(vh5Var.l0);
                        }
                        vh5Var.T = true;
                        vh5Var.A();
                        return;
                }
            }
        };
        this.H = new Runnable(this) {
            public final vh5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                vh5 vh5Var = this.b;
                switch (b) {
                    case 0:
                        vh5Var.A();
                        return;
                    default:
                        for (uh5 uh5Var : vh5Var.M) {
                            uh5Var.K(vh5Var.l0);
                        }
                        vh5Var.T = true;
                        vh5Var.A();
                        return;
                }
            }
        };
        this.I = gcc.q(null);
        this.g0 = j;
        this.h0 = j;
        this.l0 = Long.MIN_VALUE;
    }

    public static po3 k(int i, int i2) {
        efd.f("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new po3();
    }

    public static ko4 v(ko4 ko4Var, ko4 ko4Var2, boolean z) {
        String b;
        int i;
        int i2;
        if (ko4Var == null) {
            return ko4Var2;
        }
        String str = ko4Var.l;
        String str2 = ko4Var2.t;
        int h = dg7.h(str2);
        if (gcc.v(h, str) == 1) {
            b = gcc.w(h, str);
            str2 = dg7.d(b);
        } else {
            b = dg7.b(str, str2);
        }
        ko4Var2.o = ko4Var.o;
        ko4Var2.p = ko4Var.p;
        ko4Var2.q = ko4Var.q;
        ko4Var2.r = ko4Var.r;
        jo4 a = ko4Var2.a();
        a.a = ko4Var.a;
        a.b = ko4Var.b;
        a.c = po5.q(ko4Var.c);
        a.d = ko4Var.d;
        a.e = ko4Var.e;
        a.f = ko4Var.f;
        if (z) {
            i = ko4Var.i;
        } else {
            i = -1;
        }
        a.i = i;
        if (z) {
            i2 = ko4Var.j;
        } else {
            i2 = -1;
        }
        a.j = i2;
        a.k = b;
        a.q = ko4Var.q;
        a.o = ko4Var.p;
        a.n = ko4Var.o;
        a.p = ko4Var.r;
        if (h == 2) {
            a.z = ko4Var.A;
            a.A = ko4Var.B;
            a.a(ko4Var.F);
        }
        if (str2 != null) {
            a.s = dg7.n(str2);
        }
        int i3 = ko4Var.N;
        if (i3 != -1 && h == 1) {
            a.M = i3;
        }
        uf7 uf7Var = ko4Var.m;
        if (uf7Var != null) {
            uf7 uf7Var2 = ko4Var2.m;
            if (uf7Var2 != null) {
                uf7Var = uf7Var2.b(uf7Var);
            }
            a.l = uf7Var;
        }
        return new ko4(a);
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
        ko4 v;
        if (!this.Y && this.b0 == null && this.T) {
            int i2 = 0;
            for (uh5 uh5Var : this.M) {
                if (uh5Var.y() == null) {
                    return;
                }
            }
            u1c u1cVar = this.Z;
            if (u1cVar != null) {
                int i3 = u1cVar.a;
                int[] iArr = new int[i3];
                this.b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        uh5[] uh5VarArr = this.M;
                        if (i5 < uh5VarArr.length) {
                            ko4 y = uh5VarArr[i5].y();
                            y.getClass();
                            ko4 ko4Var = this.Z.a(i4).d[0];
                            String str = y.t;
                            String str2 = ko4Var.t;
                            int h = dg7.h(str);
                            if (h != 3) {
                                if (h == dg7.h(str2)) {
                                    break;
                                }
                                i5++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y.T == ko4Var.T) {
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
                    ((rh5) obj).b();
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
                ko4 y2 = this.M[i6].y();
                y2.getClass();
                String str3 = y2.t;
                if (dg7.m(str3)) {
                    i9 = 2;
                } else if (!dg7.i(str3)) {
                    if (dg7.l(str3)) {
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
            t1c t1cVar = this.d.i;
            int i10 = t1cVar.a;
            this.c0 = -1;
            this.b0 = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.b0[i11] = i11;
            }
            t1c[] t1cVarArr = new t1c[length];
            int i12 = 0;
            while (i12 < length) {
                ko4 y3 = this.M[i12].y();
                y3.getClass();
                ko4 ko4Var2 = this.f;
                String str4 = this.a;
                if (i12 == i7) {
                    ko4[] ko4VarArr = new ko4[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        ko4 ko4Var3 = t1cVar.d[i13];
                        if (i8 == 1 && ko4Var2 != null) {
                            ko4Var3 = ko4Var3.d(ko4Var2);
                        }
                        if (i10 == 1) {
                            v = y3.d(ko4Var3);
                        } else {
                            v = v(ko4Var3, y3, true);
                        }
                        ko4VarArr[i13] = v;
                    }
                    t1cVarArr[i12] = new t1c(str4, ko4VarArr);
                    this.c0 = i12;
                    i = 0;
                } else {
                    ko4Var2 = (i8 == 2 && dg7.i(y3.t)) ? null : null;
                    StringBuilder l = c00.l(str4, ":muxed:");
                    l.append(i12 < i7 ? i12 : i12 - 1);
                    String sb = l.toString();
                    i = 0;
                    jo4 a = v(ko4Var2, y3, false).a();
                    a.m = str4;
                    t1cVarArr[i12] = new t1c(sb, new ko4(a));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.Z = o(t1cVarArr);
            if (this.a0 == null) {
                z = 1;
            } else {
                z = i14;
            }
            yve.p(z);
            this.a0 = Collections.EMPTY_SET;
            this.U = true;
            this.c.Y();
        }
    }

    public final void B() {
        this.s.g();
        sg5 sg5Var = this.d;
        kh0 kh0Var = sg5Var.o;
        if (kh0Var == null) {
            Uri uri = sg5Var.p;
            if (uri != null && uri.equals(sg5Var.q)) {
                sg5Var.g.j(sg5Var.p);
                return;
            }
            return;
        }
        throw kh0Var;
    }

    public final void C(t1c[] t1cVarArr, int... iArr) {
        this.Z = o(t1cVarArr);
        this.a0 = new HashSet();
        for (int i : iArr) {
            this.a0.add(this.Z.a(i));
        }
        this.c0 = 0;
        this.I.post(new ea5(this.c, (byte) 9));
        this.U = true;
    }

    @Override
    public final void D() {
        this.m0 = true;
        this.I.post(this.H);
    }

    public final void E() {
        for (uh5 uh5Var : this.M) {
            uh5Var.G(this.i0);
        }
        this.i0 = false;
    }

    public final boolean F(long j, boolean z) {
        vg5 vg5Var;
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
                vg5Var = (vg5) arrayList.get(i);
                if (vg5Var.h == j) {
                    break;
                }
            }
        }
        vg5Var = null;
        if (this.T && !z && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (int i2 = 0; i2 < length; i2++) {
                uh5 uh5Var = this.M[i2];
                if (vg5Var != null) {
                    J = uh5Var.I(vg5Var.g(i2));
                } else {
                    long h = h();
                    if (h != Long.MIN_VALUE && j >= h) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    J = uh5Var.J(j, z2);
                }
                if (J || (!this.f0[i2] && this.d0)) {
                }
            }
            return false;
        }
        this.h0 = j;
        this.k0 = false;
        arrayList.clear();
        rx6 rx6Var = this.s;
        if (rx6Var.Z()) {
            if (this.T) {
                for (uh5 uh5Var2 : this.M) {
                    uh5Var2.l();
                }
            }
            rx6Var.u();
            return true;
        }
        rx6Var.d = null;
        E();
        return true;
    }

    @Override
    public final void R0(oa6 oa6Var, long j, long j2, int i) {
        rh2 rh2Var = (rh2) oa6Var;
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        if (i != 0) {
            b2b b2bVar = rh2Var.r;
            ia6Var.d = b2bVar.c;
            ia6Var.e = b2bVar.d;
            ia6Var.f = j2;
            ia6Var.g = b2bVar.b;
        }
        this.w.v(new ja6(ia6Var), rh2Var.c, this.b, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n, i);
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    @Override
    public final void b() {
        uh5[] uh5VarArr;
        for (uh5 uh5Var : this.M) {
            uh5Var.G(true);
            jr3 jr3Var = uh5Var.h;
            if (jr3Var != null) {
                jr3Var.c(uh5Var.e);
                uh5Var.h = null;
                uh5Var.g = null;
            }
        }
    }

    @Override
    public final defpackage.ma6 c2(defpackage.oa6 r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh5.c2(oa6, long, long, java.io.IOException, int):ma6");
    }

    @Override
    public final boolean e() {
        return this.s.Z();
    }

    @Override
    public final x1c e0(int i, int i2) {
        vg5 vg5Var;
        Integer valueOf = Integer.valueOf(i2);
        Set set = q0;
        boolean contains = set.contains(valueOf);
        boolean z = false;
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            yve.f(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.N[i3] = i;
                }
                r5 = this.N[i3] == i ? this.M[i3] : k(i, i2);
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
                return k(i, i2);
            }
            int length = this.M.length;
            if (i2 == 1 || i2 == 2) {
                z = true;
            }
            r5 = new uh5(this.e, this.h, this.n, this.K);
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
                r5.F = vg5Var.w;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i5);
            this.N = copyOf;
            copyOf[length] = i;
            uh5[] uh5VarArr = this.M;
            String str = gcc.a;
            ?? copyOf2 = Arrays.copyOf(uh5VarArr, uh5VarArr.length + 1);
            copyOf2[uh5VarArr.length] = r5;
            this.M = (uh5[]) copyOf2;
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
            th5 th5Var = this.Q;
            if (th5Var == null) {
                th5 th5Var2 = new th5(r5, this.x ? 1 : 0);
                this.Q = th5Var2;
                return th5Var2;
            }
            return th5Var;
        }
        return r5;
    }

    @Override
    public final void f(oa6 oa6Var, long j, long j2, boolean z) {
        rh2 rh2Var = (rh2) oa6Var;
        this.L = null;
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar = rh2Var.r;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.r.getClass();
        this.w.o(ja6Var, rh2Var.c, this.b, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n);
        if (!z) {
            if (z() || this.V == 0) {
                E();
            }
            if (this.V > 0) {
                this.c.f(this);
            }
        }
    }

    @Override
    public final void f0(oa6 oa6Var, long j, long j2) {
        rh2 rh2Var = (rh2) oa6Var;
        this.L = null;
        if (rh2Var instanceof og5) {
            og5 og5Var = (og5) rh2Var;
            byte[] bArr = og5Var.s;
            sg5 sg5Var = this.d;
            sg5Var.n = bArr;
            v34 v34Var = sg5Var.k;
            Uri uri = og5Var.b.a;
            byte[] bArr2 = og5Var.x;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((rr4) v34Var.b).put(uri, bArr2);
        }
        ia6 ia6Var = new ia6(rh2Var.a, rh2Var.b, j);
        b2b b2bVar = rh2Var.r;
        ia6Var.d = b2bVar.c;
        ia6Var.e = b2bVar.d;
        ia6Var.f = j2;
        ia6Var.g = b2bVar.b;
        ja6 ja6Var = new ja6(ia6Var);
        this.r.getClass();
        this.w.q(ja6Var, rh2Var.c, this.b, rh2Var.d, rh2Var.e, rh2Var.f, rh2Var.h, rh2Var.n);
        if (!this.U) {
            wa6 wa6Var = new wa6();
            wa6Var.a = this.g0;
            s(new xa6(wa6Var));
            return;
        }
        this.c.f(this);
    }

    public final void g() {
        yve.p(this.U);
        this.Z.getClass();
        this.a0.getClass();
    }

    @Override
    public final long h() {
        if (z()) {
            return this.h0;
        }
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        return x().n;
    }

    public final boolean i(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh5.i(int):boolean");
    }

    public final u1c o(t1c[] t1cVarArr) {
        for (int i = 0; i < t1cVarArr.length; i++) {
            t1c t1cVar = t1cVarArr[i];
            ko4[] ko4VarArr = new ko4[t1cVar.a];
            for (int i2 = 0; i2 < t1cVar.a; i2++) {
                ko4 ko4Var = t1cVar.d[i2];
                int x = this.h.x(ko4Var);
                jo4 a = ko4Var.a();
                a.W = x;
                ko4VarArr[i2] = new ko4(a);
            }
            t1cVarArr[i] = new t1c(t1cVar.b, ko4VarArr);
        }
        return new u1c(t1cVarArr);
    }

    @Override
    public final boolean s(defpackage.xa6 r69) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh5.s(xa6):boolean");
    }

    @Override
    public final long t() {
        if (this.k0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.h0;
        }
        long j = this.g0;
        vg5 x = x();
        if (!x.Y) {
            ArrayList arrayList = this.E;
            if (arrayList.size() > 1) {
                x = (vg5) c00.g(2, arrayList);
            } else {
                x = null;
            }
        }
        if (x != null) {
            j = Math.max(j, x.n);
        }
        if (this.T) {
            for (uh5 uh5Var : this.M) {
                j = Math.max(j, uh5Var.s());
            }
        }
        return j;
    }

    @Override
    public final void u(long j) {
        int size;
        rx6 rx6Var = this.s;
        if (!rx6Var.U() && !z()) {
            boolean Z = rx6Var.Z();
            boolean z = false;
            sg5 sg5Var = this.d;
            ArrayList arrayList = this.E;
            List list = this.F;
            if (Z) {
                rh2 rh2Var = this.L;
                rh2Var.getClass();
                if (!(rh2Var instanceof vg5) || i(arrayList.size() - 1)) {
                    long j2 = this.l0;
                    if (j2 == Long.MIN_VALUE || rh2Var.h < j2) {
                        if (sg5Var.o == null) {
                            z = sg5Var.s.g(j, rh2Var, list);
                        }
                        if (!z) {
                            return;
                        }
                    }
                    rx6Var.u();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && sg5Var.c((vg5) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                w(size2);
            }
            int size3 = arrayList.size();
            if (sg5Var.o == null && sg5Var.s.length() >= 2) {
                size = sg5Var.s.k(j, list);
            } else {
                size = list.size();
            }
            int min = Math.min(size3, size);
            if (this.l0 != Long.MIN_VALUE) {
                while (min > 0 && ((vg5) arrayList.get(min - 1)).h >= this.l0) {
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

    public final void w(int i) {
        ArrayList arrayList;
        yve.p(!this.s.Z());
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
        vg5 vg5Var = (vg5) arrayList.get(i);
        gcc.Y(i, arrayList.size(), arrayList);
        for (int i2 = 0; i2 < this.M.length; i2++) {
            this.M[i2].o(vg5Var.g(i2));
        }
        if (arrayList.isEmpty()) {
            this.h0 = Math.max(this.g0, vg5Var.h);
        } else {
            ((vg5) dqe.b(arrayList)).a0 = true;
        }
        this.k0 = false;
        this.w.B(vg5Var.h, this.R, j);
    }

    public final vg5 x() {
        return (vg5) c00.g(1, this.E);
    }

    public final boolean z() {
        if (this.h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void m0(zy9 zy9Var) {
    }
}
