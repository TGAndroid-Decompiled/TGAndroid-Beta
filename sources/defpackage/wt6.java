package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class wt6 {
    public final xa3 c;
    public final dfb d;
    public final yu3 e;
    public long f;
    public int g;
    public boolean h;
    public ut6 i;
    public final ut6[] j;
    public final ut6[] k;
    public ut6 l;
    public ut6 m;
    public int n;
    public Object o;
    public long p;
    public final ypb a = new ypb();
    public final aqb b = new aqb();
    public ArrayList q = new ArrayList();

    public wt6(xa3 xa3Var, dfb dfbVar, yu3 yu3Var, int i) {
        this.c = xa3Var;
        this.d = dfbVar;
        this.e = yu3Var;
        this.j = new ut6[i];
        this.k = new ut6[i];
    }

    public static boolean m(ut6[] ut6VarArr, long[] jArr, ut6 ut6Var, long j) {
        for (int i = 0; i < ut6VarArr.length; i++) {
            ut6 ut6Var2 = ut6VarArr[i];
            if (ut6Var2 != null) {
                ut6 ut6Var3 = ut6Var;
                while (true) {
                    ut6Var3 = ut6Var3.m;
                    if (ut6Var3 != null) {
                        if (ut6Var3 == ut6Var2) {
                            return true;
                        }
                    } else if (ut6Var2 == ut6Var) {
                        long j2 = jArr[i];
                        if (j2 == Long.MIN_VALUE || j2 >= j) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public static rz6 t(bqb bqbVar, Object obj, long j, long j2, aqb aqbVar, ypb ypbVar) {
        bqbVar.g(obj, ypbVar);
        bqbVar.n(ypbVar.c, aqbVar);
        bqbVar.b(obj);
        int i = da.c.a;
        if (i != 0) {
            if (i == 1) {
                ypbVar.f(0);
            }
            ypbVar.g(0);
        }
        bqbVar.g(obj, ypbVar);
        int c = ypbVar.c(j);
        if (c == -1) {
            return new rz6(obj, j2, ypbVar.b(j));
        }
        return new rz6(obj, c, ypbVar.e(c), j2, -1);
    }

    public final ut6 a() {
        ut6 ut6Var;
        if (this.i == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            ut6[] ut6VarArr = this.j;
            if (i2 >= ut6VarArr.length) {
                break;
            }
            if (this.i.equals(ut6VarArr[i2])) {
                ut6VarArr[i2] = this.i.m;
            }
            i2++;
        }
        this.i.getClass();
        while (true) {
            ut6[] ut6VarArr2 = this.k;
            int length = ut6VarArr2.length;
            ut6Var = this.i;
            if (i >= length) {
                break;
            }
            if (ut6Var.equals(ut6VarArr2[i])) {
                ut6VarArr2[i] = this.i.m;
            }
            i++;
        }
        ut6Var.getClass();
        this.i.i();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            ut6 ut6Var2 = this.i;
            this.o = ut6Var2.b;
            this.p = ut6Var2.g.a.d;
        }
        this.i = this.i.m;
        q();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        ut6 ut6Var = this.i;
        ut6Var.getClass();
        this.o = ut6Var.b;
        this.p = ut6Var.g.a.d;
        while (ut6Var != null) {
            ut6Var.i();
            ut6Var = ut6Var.m;
        }
        this.i = null;
        this.l = null;
        Arrays.fill(this.j, (Object) null);
        Arrays.fill(this.k, (Object) null);
        this.n = 0;
        q();
    }

    public final ut6 c() {
        ut6 ut6Var = this.i;
        while (ut6Var != null) {
            for (ut6 ut6Var2 : this.k) {
                if (ut6Var == ut6Var2) {
                    return ut6Var;
                }
            }
            ut6Var = ut6Var.m;
        }
        return ut6Var;
    }

    public final ut6 d() {
        ut6 ut6Var = this.i;
        while (ut6Var != null) {
            for (ut6 ut6Var2 : this.j) {
                if (ut6Var == ut6Var2) {
                    return ut6Var;
                }
            }
            ut6Var = ut6Var.m;
        }
        return ut6Var;
    }

    public final defpackage.vt6 e(defpackage.bqb r22, defpackage.ut6 r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt6.e(bqb, ut6, long):vt6");
    }

    public final ut6 f() {
        ut6[] ut6VarArr = this.j;
        if (ut6VarArr.length == 0) {
            return null;
        }
        ut6 ut6Var = ut6VarArr[0];
        for (ut6 ut6Var2 = this.i; ut6Var2 != null; ut6Var2 = ut6Var2.m) {
            int length = ut6VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (ut6Var2 != ut6VarArr[i]) {
                    i++;
                } else {
                    ut6Var = ut6Var2;
                    break;
                }
            }
        }
        return ut6Var;
    }

    public final long g(bqb bqbVar, rz6 rz6Var) {
        Object obj = rz6Var.a;
        ypb ypbVar = this.a;
        bqbVar.g(obj, ypbVar);
        if (rz6Var.c()) {
            return ypbVar.a(rz6Var.b, rz6Var.c);
        }
        int i = rz6Var.e;
        if (i != -1) {
            ypbVar.d(i);
            return 0L;
        }
        return ypbVar.d;
    }

    public final vt6 h(bqb bqbVar, rz6 rz6Var, long j, long j2, long j3) {
        bqbVar.g(rz6Var.a, this.a);
        boolean c = rz6Var.c();
        Object obj = rz6Var.a;
        if (c) {
            return i(bqbVar, obj, rz6Var.b, rz6Var.c, j, rz6Var.d);
        }
        return j(bqbVar, obj, j2, j3, j, rz6Var.d);
    }

    public final vt6 i(bqb bqbVar, Object obj, int i, int i2, long j, long j2) {
        rz6 rz6Var = new rz6(obj, i, i2, j2, -1);
        ypb ypbVar = this.a;
        long a = bqbVar.g(obj, ypbVar).a(i, i2);
        if (i2 == ypbVar.e(i)) {
            da daVar = da.c;
        }
        ypbVar.g(i);
        long j3 = 0;
        if (a != -9223372036854775807L && 0 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new vt6(rz6Var, j3, -9223372036854775807L, j, a, false, false, false, false);
    }

    public final vt6 j(bqb bqbVar, Object obj, long j, long j2, long j3, long j4) {
        boolean z;
        long j5;
        ypb ypbVar = this.a;
        bqbVar.g(obj, ypbVar);
        int b = ypbVar.b(j);
        if (b != -1) {
            ypbVar.g(b);
            ypbVar.g(b);
        }
        rz6 rz6Var = new rz6(obj, j4, b);
        if (!rz6Var.c() && b == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean o = o(bqbVar, rz6Var);
        boolean n = n(bqbVar, rz6Var, z);
        long g = g(bqbVar, rz6Var);
        if (g != -9223372036854775807L && j >= g) {
            j5 = Math.max(0L, g - 1);
        } else {
            j5 = j;
        }
        return new vt6(rz6Var, j5, j2, j3, g, false, z, o, n);
    }

    public final ut6 k(int i) {
        return this.k[i];
    }

    public final vt6 l(bqb bqbVar, vt6 vt6Var) {
        boolean z;
        rz6 rz6Var = vt6Var.a;
        int i = rz6Var.e;
        if (!rz6Var.c() && i == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean o = o(bqbVar, rz6Var);
        boolean n = n(bqbVar, rz6Var, z2);
        long g = g(bqbVar, rz6Var);
        Object obj = rz6Var.a;
        ypb ypbVar = this.a;
        bqbVar.g(obj, ypbVar);
        if (rz6Var.c()) {
            ypbVar.g(rz6Var.b);
        } else if (i != -1) {
            ypbVar.g(i);
        }
        return new vt6(rz6Var, vt6Var.b, vt6Var.c, vt6Var.d, g, false, z2, o, n);
    }

    public final boolean n(bqb bqbVar, rz6 rz6Var, boolean z) {
        int b = bqbVar.b(rz6Var.a);
        ypb ypbVar = this.a;
        int i = bqbVar.f(b, ypbVar, false).c;
        aqb aqbVar = this.b;
        if (bqbVar.m(i, aqbVar, 0L).h || bqbVar.d(b, ypbVar, aqbVar, this.g, this.h) != -1 || !z) {
            return false;
        }
        return true;
    }

    public final boolean o(bqb bqbVar, rz6 rz6Var) {
        boolean z;
        if (!rz6Var.c() && rz6Var.e == -1) {
            z = true;
        } else {
            z = false;
        }
        Object obj = rz6Var.a;
        if (z) {
            if (bqbVar.m(bqbVar.g(obj, this.a).c, this.b, 0L).n == bqbVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        ut6 ut6Var = this.m;
        if (ut6Var == null || ut6Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                ut6 ut6Var2 = (ut6) this.q.get(i);
                if (!ut6Var2.h()) {
                    this.m = ut6Var2;
                    return;
                }
            }
        }
    }

    public final void q() {
        rz6 rz6Var;
        ut6 ut6Var;
        jo5 p = mo5.p();
        for (ut6 ut6Var2 = this.i; ut6Var2 != null; ut6Var2 = ut6Var2.m) {
            p.c(ut6Var2.g.a);
        }
        ut6[] ut6VarArr = this.j;
        if (ut6VarArr.length != 0 && (ut6Var = ut6VarArr[0]) != null) {
            rz6Var = ut6Var.g.a;
        } else {
            rz6Var = null;
        }
        this.d.e(new fp6(this, p, rz6Var, (byte) 6));
    }

    public final void r(long j) {
        boolean z;
        ut6 ut6Var = this.l;
        if (ut6Var != null) {
            if (ut6Var.m == null) {
                z = true;
            } else {
                z = false;
            }
            jte.p(z);
            if (ut6Var.e) {
                ut6Var.a.t(j - ut6Var.p);
            }
        }
    }

    public final int s(ut6 ut6Var) {
        ut6[] ut6VarArr;
        ut6[] ut6VarArr2;
        ut6Var.getClass();
        if (ut6Var == this.l) {
            return 0;
        }
        this.l = ut6Var;
        int i = 0;
        while (true) {
            ut6Var = ut6Var.m;
            if (ut6Var == null) {
                break;
            }
            int i2 = 0;
            while (true) {
                ut6VarArr = this.j;
                int length = ut6VarArr.length;
                ut6VarArr2 = this.k;
                if (i2 >= length) {
                    break;
                }
                if (ut6Var == ut6VarArr[i2]) {
                    ut6 ut6Var2 = this.i;
                    ut6VarArr[i2] = ut6Var2;
                    ut6VarArr2[i2] = ut6Var2;
                    i = 3;
                }
                i2++;
            }
            for (int i3 = 0; i3 < ut6VarArr2.length; i3++) {
                if (ut6Var == ut6VarArr2[i3]) {
                    ut6VarArr2[i3] = ut6VarArr[i3];
                    i |= 2;
                }
            }
            ut6Var.i();
            this.n--;
        }
        ut6 ut6Var3 = this.l;
        ut6Var3.getClass();
        if (ut6Var3.m != null) {
            ut6Var3.b();
            ut6Var3.m = null;
            ut6Var3.c();
        }
        q();
        return i;
    }

    public final rz6 u(be8 be8Var, bqb bqbVar, Object obj, long j, boolean z, boolean z2) {
        long v;
        int b;
        ypb ypbVar = this.a;
        int i = bqbVar.g(obj, ypbVar).c;
        Object obj2 = this.o;
        boolean z3 = false;
        if (obj2 != null && (b = bqbVar.b(obj2)) != -1 && bqbVar.f(b, ypbVar, false).c == i) {
            v = this.p;
        } else {
            ut6 ut6Var = this.i;
            while (true) {
                if (ut6Var != null) {
                    if (ut6Var.b.equals(obj)) {
                        v = ut6Var.g.a.d;
                        break;
                    }
                    ut6Var = ut6Var.m;
                } else {
                    ut6 ut6Var2 = this.i;
                    while (true) {
                        if (ut6Var2 != null) {
                            int b2 = bqbVar.b(ut6Var2.b);
                            if (b2 != -1 && bqbVar.f(b2, ypbVar, false).c == i) {
                                v = ut6Var2.g.a.d;
                                break;
                            }
                            ut6Var2 = ut6Var2.m;
                        } else {
                            v = v(obj);
                            if (v == -1) {
                                v = this.f;
                                this.f = 1 + v;
                                if (this.i == null) {
                                    this.o = obj;
                                    this.p = v;
                                }
                            }
                        }
                    }
                }
            }
        }
        aqb aqbVar = this.b;
        if (!z && !z2) {
            rz6 rz6Var = be8Var.b;
            long j2 = v;
            rz6 t = t(bqbVar, obj, j, j2, aqbVar, ypbVar);
            if (rz6Var.c() && rz6Var.equals(t)) {
                return rz6Var;
            }
            bqbVar.g(obj, ypbVar);
            return new rz6(obj, j2, ypbVar.b(j));
        }
        Object obj3 = obj;
        long j3 = v;
        bqbVar.g(obj3, ypbVar);
        bqbVar.n(ypbVar.c, aqbVar);
        int b3 = bqbVar.b(obj);
        boolean z4 = false;
        while (b3 >= aqbVar.m) {
            boolean z5 = true;
            bqbVar.f(b3, ypbVar, true);
            if (da.c.a <= 0) {
                z5 = z3;
            }
            z4 |= z5;
            aqb aqbVar2 = aqbVar;
            if (ypbVar.c(ypbVar.d) != -1) {
                obj3 = ypbVar.b;
                obj3.getClass();
            }
            if (z4 && (!z5 || ypbVar.d != 0)) {
                aqbVar = aqbVar2;
                break;
            }
            b3--;
            z3 = false;
            aqbVar = aqbVar2;
        }
        rz6 t2 = t(bqbVar, obj3, j, j3, aqbVar, ypbVar);
        Object obj4 = t2.a;
        int i2 = t2.b;
        if (i2 != -1 && !z) {
            bqbVar.g(obj4, ypbVar);
            da.c.a(i2).getClass();
            if (0 != j) {
                return new rz6(obj4, t2.d, ypbVar.b(j));
            }
        }
        return t2;
    }

    public final long v(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            ut6 ut6Var = (ut6) this.q.get(i);
            if (ut6Var.b.equals(obj)) {
                return ut6Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int w(bqb bqbVar) {
        bqb bqbVar2;
        ut6 ut6Var;
        ut6 ut6Var2 = this.i;
        if (ut6Var2 == null) {
            return 0;
        }
        int b = bqbVar.b(ut6Var2.b);
        while (true) {
            bqbVar2 = bqbVar;
            b = bqbVar2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                ut6Var = ut6Var2.m;
                if (ut6Var == null || ut6Var2.g.g) {
                    break;
                }
                ut6Var2 = ut6Var;
            }
            if (b == -1 || ut6Var == null || bqbVar2.b(ut6Var.b) != b) {
                break;
            }
            ut6Var2 = ut6Var;
            bqbVar = bqbVar2;
        }
        int s = s(ut6Var2);
        ut6Var2.g = l(bqbVar2, ut6Var2.g);
        return s;
    }

    public final int x(bqb bqbVar, long j, long[] jArr, long[] jArr2) {
        long j2;
        int i;
        vt6 b;
        long j3;
        int i2;
        int i3;
        ut6 ut6Var = null;
        for (ut6 ut6Var2 = this.i; ut6Var2 != null; ut6Var2 = ut6Var2.m) {
            vt6 vt6Var = ut6Var2.g;
            rz6 rz6Var = vt6Var.a;
            if (ut6Var == null) {
                b = l(bqbVar, vt6Var);
                j2 = -9223372036854775807L;
                i = 0;
            } else {
                vt6 e = e(bqbVar, ut6Var, j);
                if (e != null) {
                    long j4 = e.b;
                    long j5 = vt6Var.c;
                    j2 = -9223372036854775807L;
                    long j6 = vt6Var.b;
                    i = 0;
                    if (rz6Var.equals(e.a)) {
                        if (j6 == j4) {
                            b = e;
                        } else if (j5 != -9223372036854775807L) {
                            long j7 = e.c;
                            if (j7 != -9223372036854775807L) {
                                if (Math.abs((j4 - j7) - (j6 - j5)) < 5000000) {
                                    b = e.b(j6, j5);
                                }
                            }
                        }
                    }
                }
                return s(ut6Var);
            }
            long j8 = vt6Var.d;
            long j9 = vt6Var.e;
            vt6 a = b.a(j8);
            ut6Var2.g = a;
            long j10 = b.e;
            if (j9 != j10) {
                if (j10 == j2) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j10 + ut6Var2.p;
                }
                if (!a.f && m(this.j, jArr, ut6Var2, j3)) {
                    i2 = 1;
                } else {
                    i2 = i;
                }
                boolean m = m(this.k, jArr2, ut6Var2, j3);
                int s = s(ut6Var2);
                if (s != 0) {
                    return s;
                }
                if (i2 != 0 && (j9 != j2 || rz6Var.e != -1)) {
                    i3 = 1;
                } else {
                    i3 = i;
                }
                if (m) {
                    return i3 | 2;
                }
                return i3;
            }
            ut6Var = ut6Var2;
        }
        return 0;
    }
}
