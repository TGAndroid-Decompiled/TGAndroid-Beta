package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class vr6 {
    public final l93 c;
    public final cdb d;
    public final kx3 e;
    public long f;
    public int g;
    public boolean h;
    public tr6 i;
    public final tr6[] j;
    public final tr6[] k;
    public tr6 l;
    public tr6 m;
    public int n;
    public Object o;
    public long p;
    public final xnb a = new xnb();
    public final znb b = new znb();
    public ArrayList q = new ArrayList();

    public vr6(l93 l93Var, cdb cdbVar, kx3 kx3Var, int i) {
        this.c = l93Var;
        this.d = cdbVar;
        this.e = kx3Var;
        this.j = new tr6[i];
        this.k = new tr6[i];
    }

    public static boolean m(tr6[] tr6VarArr, long[] jArr, tr6 tr6Var, long j) {
        for (int i = 0; i < tr6VarArr.length; i++) {
            tr6 tr6Var2 = tr6VarArr[i];
            if (tr6Var2 != null) {
                tr6 tr6Var3 = tr6Var;
                while (true) {
                    tr6Var3 = tr6Var3.m;
                    if (tr6Var3 != null) {
                        if (tr6Var3 == tr6Var2) {
                            return true;
                        }
                    } else if (tr6Var2 == tr6Var) {
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

    public static rx6 t(aob aobVar, Object obj, long j, long j2, znb znbVar, xnb xnbVar) {
        aobVar.g(obj, xnbVar);
        aobVar.n(xnbVar.c, znbVar);
        aobVar.b(obj);
        int i = da.c.a;
        if (i != 0) {
            if (i == 1) {
                xnbVar.f(0);
            }
            xnbVar.g(0);
        }
        aobVar.g(obj, xnbVar);
        int c = xnbVar.c(j);
        if (c == -1) {
            return new rx6(obj, j2, xnbVar.b(j));
        }
        return new rx6(obj, c, xnbVar.e(c), j2, -1);
    }

    public final tr6 a() {
        tr6 tr6Var;
        if (this.i == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            tr6[] tr6VarArr = this.j;
            if (i2 >= tr6VarArr.length) {
                break;
            }
            if (this.i.equals(tr6VarArr[i2])) {
                tr6VarArr[i2] = this.i.m;
            }
            i2++;
        }
        this.i.getClass();
        while (true) {
            tr6[] tr6VarArr2 = this.k;
            int length = tr6VarArr2.length;
            tr6Var = this.i;
            if (i >= length) {
                break;
            }
            if (tr6Var.equals(tr6VarArr2[i])) {
                tr6VarArr2[i] = this.i.m;
            }
            i++;
        }
        tr6Var.getClass();
        this.i.i();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            tr6 tr6Var2 = this.i;
            this.o = tr6Var2.b;
            this.p = tr6Var2.g.a.d;
        }
        this.i = this.i.m;
        q();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        tr6 tr6Var = this.i;
        tr6Var.getClass();
        this.o = tr6Var.b;
        this.p = tr6Var.g.a.d;
        while (tr6Var != null) {
            tr6Var.i();
            tr6Var = tr6Var.m;
        }
        this.i = null;
        this.l = null;
        Arrays.fill(this.j, (Object) null);
        Arrays.fill(this.k, (Object) null);
        this.n = 0;
        q();
    }

    public final tr6 c() {
        tr6 tr6Var = this.i;
        while (tr6Var != null) {
            for (tr6 tr6Var2 : this.k) {
                if (tr6Var == tr6Var2) {
                    return tr6Var;
                }
            }
            tr6Var = tr6Var.m;
        }
        return tr6Var;
    }

    public final tr6 d() {
        tr6 tr6Var = this.i;
        while (tr6Var != null) {
            for (tr6 tr6Var2 : this.j) {
                if (tr6Var == tr6Var2) {
                    return tr6Var;
                }
            }
            tr6Var = tr6Var.m;
        }
        return tr6Var;
    }

    public final defpackage.ur6 e(defpackage.aob r22, defpackage.tr6 r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr6.e(aob, tr6, long):ur6");
    }

    public final tr6 f() {
        tr6[] tr6VarArr = this.j;
        if (tr6VarArr.length == 0) {
            return null;
        }
        tr6 tr6Var = tr6VarArr[0];
        for (tr6 tr6Var2 = this.i; tr6Var2 != null; tr6Var2 = tr6Var2.m) {
            int length = tr6VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (tr6Var2 != tr6VarArr[i]) {
                    i++;
                } else {
                    tr6Var = tr6Var2;
                    break;
                }
            }
        }
        return tr6Var;
    }

    public final long g(aob aobVar, rx6 rx6Var) {
        Object obj = rx6Var.a;
        xnb xnbVar = this.a;
        aobVar.g(obj, xnbVar);
        if (rx6Var.c()) {
            return xnbVar.a(rx6Var.b, rx6Var.c);
        }
        int i = rx6Var.e;
        if (i != -1) {
            xnbVar.d(i);
            return 0L;
        }
        return xnbVar.d;
    }

    public final ur6 h(aob aobVar, rx6 rx6Var, long j, long j2, long j3) {
        aobVar.g(rx6Var.a, this.a);
        boolean c = rx6Var.c();
        Object obj = rx6Var.a;
        if (c) {
            return i(aobVar, obj, rx6Var.b, rx6Var.c, j, rx6Var.d);
        }
        return j(aobVar, obj, j2, j3, j, rx6Var.d);
    }

    public final ur6 i(aob aobVar, Object obj, int i, int i2, long j, long j2) {
        rx6 rx6Var = new rx6(obj, i, i2, j2, -1);
        xnb xnbVar = this.a;
        long a = aobVar.g(obj, xnbVar).a(i, i2);
        if (i2 == xnbVar.e(i)) {
            da daVar = da.c;
        }
        xnbVar.g(i);
        long j3 = 0;
        if (a != -9223372036854775807L && 0 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new ur6(rx6Var, j3, -9223372036854775807L, j, a, false, false, false, false);
    }

    public final ur6 j(aob aobVar, Object obj, long j, long j2, long j3, long j4) {
        boolean z;
        long j5;
        xnb xnbVar = this.a;
        aobVar.g(obj, xnbVar);
        int b = xnbVar.b(j);
        if (b != -1) {
            xnbVar.g(b);
            xnbVar.g(b);
        }
        rx6 rx6Var = new rx6(obj, j4, b);
        if (!rx6Var.c() && b == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean o = o(aobVar, rx6Var);
        boolean n = n(aobVar, rx6Var, z);
        long g = g(aobVar, rx6Var);
        if (g != -9223372036854775807L && j >= g) {
            j5 = Math.max(0L, g - 1);
        } else {
            j5 = j;
        }
        return new ur6(rx6Var, j5, j2, j3, g, false, z, o, n);
    }

    public final tr6 k(int i) {
        return this.k[i];
    }

    public final ur6 l(aob aobVar, ur6 ur6Var) {
        boolean z;
        rx6 rx6Var = ur6Var.a;
        int i = rx6Var.e;
        if (!rx6Var.c() && i == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean o = o(aobVar, rx6Var);
        boolean n = n(aobVar, rx6Var, z2);
        long g = g(aobVar, rx6Var);
        Object obj = rx6Var.a;
        xnb xnbVar = this.a;
        aobVar.g(obj, xnbVar);
        if (rx6Var.c()) {
            xnbVar.g(rx6Var.b);
        } else if (i != -1) {
            xnbVar.g(i);
        }
        return new ur6(rx6Var, ur6Var.b, ur6Var.c, ur6Var.d, g, false, z2, o, n);
    }

    public final boolean n(aob aobVar, rx6 rx6Var, boolean z) {
        int b = aobVar.b(rx6Var.a);
        xnb xnbVar = this.a;
        int i = aobVar.f(b, xnbVar, false).c;
        znb znbVar = this.b;
        if (aobVar.m(i, znbVar, 0L).h || aobVar.d(b, xnbVar, znbVar, this.g, this.h) != -1 || !z) {
            return false;
        }
        return true;
    }

    public final boolean o(aob aobVar, rx6 rx6Var) {
        boolean z;
        if (!rx6Var.c() && rx6Var.e == -1) {
            z = true;
        } else {
            z = false;
        }
        Object obj = rx6Var.a;
        if (z) {
            if (aobVar.m(aobVar.g(obj, this.a).c, this.b, 0L).n == aobVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        tr6 tr6Var = this.m;
        if (tr6Var == null || tr6Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                tr6 tr6Var2 = (tr6) this.q.get(i);
                if (!tr6Var2.h()) {
                    this.m = tr6Var2;
                    return;
                }
            }
        }
    }

    public final void q() {
        rx6 rx6Var;
        tr6 tr6Var;
        jm5 p = mm5.p();
        for (tr6 tr6Var2 = this.i; tr6Var2 != null; tr6Var2 = tr6Var2.m) {
            p.c(tr6Var2.g.a);
        }
        tr6[] tr6VarArr = this.j;
        if (tr6VarArr.length != 0 && (tr6Var = tr6VarArr[0]) != null) {
            rx6Var = tr6Var.g.a;
        } else {
            rx6Var = null;
        }
        this.d.e(new lo6(this, p, rx6Var, (byte) 4));
    }

    public final void r(long j) {
        boolean z;
        tr6 tr6Var = this.l;
        if (tr6Var != null) {
            if (tr6Var.m == null) {
                z = true;
            } else {
                z = false;
            }
            gre.p(z);
            if (tr6Var.e) {
                tr6Var.a.t(j - tr6Var.p);
            }
        }
    }

    public final int s(tr6 tr6Var) {
        tr6[] tr6VarArr;
        tr6[] tr6VarArr2;
        tr6Var.getClass();
        if (tr6Var == this.l) {
            return 0;
        }
        this.l = tr6Var;
        int i = 0;
        while (true) {
            tr6Var = tr6Var.m;
            if (tr6Var == null) {
                break;
            }
            int i2 = 0;
            while (true) {
                tr6VarArr = this.j;
                int length = tr6VarArr.length;
                tr6VarArr2 = this.k;
                if (i2 >= length) {
                    break;
                }
                if (tr6Var == tr6VarArr[i2]) {
                    tr6 tr6Var2 = this.i;
                    tr6VarArr[i2] = tr6Var2;
                    tr6VarArr2[i2] = tr6Var2;
                    i = 3;
                }
                i2++;
            }
            for (int i3 = 0; i3 < tr6VarArr2.length; i3++) {
                if (tr6Var == tr6VarArr2[i3]) {
                    tr6VarArr2[i3] = tr6VarArr[i3];
                    i |= 2;
                }
            }
            tr6Var.i();
            this.n--;
        }
        tr6 tr6Var3 = this.l;
        tr6Var3.getClass();
        if (tr6Var3.m != null) {
            tr6Var3.b();
            tr6Var3.m = null;
            tr6Var3.c();
        }
        q();
        return i;
    }

    public final rx6 u(yb8 yb8Var, aob aobVar, Object obj, long j, boolean z, boolean z2) {
        long v;
        int b;
        xnb xnbVar = this.a;
        int i = aobVar.g(obj, xnbVar).c;
        Object obj2 = this.o;
        boolean z3 = false;
        if (obj2 != null && (b = aobVar.b(obj2)) != -1 && aobVar.f(b, xnbVar, false).c == i) {
            v = this.p;
        } else {
            tr6 tr6Var = this.i;
            while (true) {
                if (tr6Var != null) {
                    if (tr6Var.b.equals(obj)) {
                        v = tr6Var.g.a.d;
                        break;
                    }
                    tr6Var = tr6Var.m;
                } else {
                    tr6 tr6Var2 = this.i;
                    while (true) {
                        if (tr6Var2 != null) {
                            int b2 = aobVar.b(tr6Var2.b);
                            if (b2 != -1 && aobVar.f(b2, xnbVar, false).c == i) {
                                v = tr6Var2.g.a.d;
                                break;
                            }
                            tr6Var2 = tr6Var2.m;
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
        znb znbVar = this.b;
        if (!z && !z2) {
            rx6 rx6Var = yb8Var.b;
            long j2 = v;
            rx6 t = t(aobVar, obj, j, j2, znbVar, xnbVar);
            if (rx6Var.c() && rx6Var.equals(t)) {
                return rx6Var;
            }
            aobVar.g(obj, xnbVar);
            return new rx6(obj, j2, xnbVar.b(j));
        }
        Object obj3 = obj;
        long j3 = v;
        aobVar.g(obj3, xnbVar);
        aobVar.n(xnbVar.c, znbVar);
        int b3 = aobVar.b(obj);
        boolean z4 = false;
        while (b3 >= znbVar.m) {
            boolean z5 = true;
            aobVar.f(b3, xnbVar, true);
            if (da.c.a <= 0) {
                z5 = z3;
            }
            z4 |= z5;
            znb znbVar2 = znbVar;
            if (xnbVar.c(xnbVar.d) != -1) {
                obj3 = xnbVar.b;
                obj3.getClass();
            }
            if (z4 && (!z5 || xnbVar.d != 0)) {
                znbVar = znbVar2;
                break;
            }
            b3--;
            z3 = false;
            znbVar = znbVar2;
        }
        rx6 t2 = t(aobVar, obj3, j, j3, znbVar, xnbVar);
        Object obj4 = t2.a;
        int i2 = t2.b;
        if (i2 != -1 && !z) {
            aobVar.g(obj4, xnbVar);
            da.c.a(i2).getClass();
            if (0 != j) {
                return new rx6(obj4, t2.d, xnbVar.b(j));
            }
        }
        return t2;
    }

    public final long v(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            tr6 tr6Var = (tr6) this.q.get(i);
            if (tr6Var.b.equals(obj)) {
                return tr6Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int w(aob aobVar) {
        aob aobVar2;
        tr6 tr6Var;
        tr6 tr6Var2 = this.i;
        if (tr6Var2 == null) {
            return 0;
        }
        int b = aobVar.b(tr6Var2.b);
        while (true) {
            aobVar2 = aobVar;
            b = aobVar2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                tr6Var = tr6Var2.m;
                if (tr6Var == null || tr6Var2.g.g) {
                    break;
                }
                tr6Var2 = tr6Var;
            }
            if (b == -1 || tr6Var == null || aobVar2.b(tr6Var.b) != b) {
                break;
            }
            tr6Var2 = tr6Var;
            aobVar = aobVar2;
        }
        int s = s(tr6Var2);
        tr6Var2.g = l(aobVar2, tr6Var2.g);
        return s;
    }

    public final int x(aob aobVar, long j, long[] jArr, long[] jArr2) {
        long j2;
        int i;
        ur6 b;
        long j3;
        int i2;
        int i3;
        tr6 tr6Var = null;
        for (tr6 tr6Var2 = this.i; tr6Var2 != null; tr6Var2 = tr6Var2.m) {
            ur6 ur6Var = tr6Var2.g;
            rx6 rx6Var = ur6Var.a;
            if (tr6Var == null) {
                b = l(aobVar, ur6Var);
                j2 = -9223372036854775807L;
                i = 0;
            } else {
                ur6 e = e(aobVar, tr6Var, j);
                if (e != null) {
                    long j4 = e.b;
                    long j5 = ur6Var.c;
                    j2 = -9223372036854775807L;
                    long j6 = ur6Var.b;
                    i = 0;
                    if (rx6Var.equals(e.a)) {
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
                return s(tr6Var);
            }
            long j8 = ur6Var.d;
            long j9 = ur6Var.e;
            ur6 a = b.a(j8);
            tr6Var2.g = a;
            long j10 = b.e;
            if (j9 != j10) {
                if (j10 == j2) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j10 + tr6Var2.p;
                }
                if (!a.f && m(this.j, jArr, tr6Var2, j3)) {
                    i2 = 1;
                } else {
                    i2 = i;
                }
                boolean m = m(this.k, jArr2, tr6Var2, j3);
                int s = s(tr6Var2);
                if (s != 0) {
                    return s;
                }
                if (i2 != 0 && (j9 != j2 || rx6Var.e != -1)) {
                    i3 = 1;
                } else {
                    i3 = i;
                }
                if (m) {
                    return i3 | 2;
                }
                return i3;
            }
            tr6Var = tr6Var2;
        }
        return 0;
    }
}
