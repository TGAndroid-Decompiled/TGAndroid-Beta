package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class au6 {
    public final ea3 c;
    public final xgb d;
    public final lu3 e;
    public long f;
    public int g;
    public boolean h;
    public yt6 i;
    public final yt6[] j;
    public final yt6[] k;
    public yt6 l;
    public yt6 m;
    public int n;
    public Object o;
    public long p;
    public final xrb a = new xrb();
    public final zrb b = new zrb();
    public ArrayList q = new ArrayList();

    public au6(ea3 ea3Var, xgb xgbVar, lu3 lu3Var, int i) {
        this.c = ea3Var;
        this.d = xgbVar;
        this.e = lu3Var;
        this.j = new yt6[i];
        this.k = new yt6[i];
    }

    public static boolean m(yt6[] yt6VarArr, long[] jArr, yt6 yt6Var, long j) {
        for (int i = 0; i < yt6VarArr.length; i++) {
            yt6 yt6Var2 = yt6VarArr[i];
            if (yt6Var2 != null) {
                yt6 yt6Var3 = yt6Var;
                while (true) {
                    yt6Var3 = yt6Var3.m;
                    if (yt6Var3 != null) {
                        if (yt6Var3 == yt6Var2) {
                            return true;
                        }
                    } else if (yt6Var2 == yt6Var) {
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

    public static vz6 t(asb asbVar, Object obj, long j, long j2, zrb zrbVar, xrb xrbVar) {
        asbVar.g(obj, xrbVar);
        asbVar.n(xrbVar.c, zrbVar);
        asbVar.b(obj);
        int i = ea.c.a;
        if (i != 0) {
            if (i == 1) {
                xrbVar.f(0);
            }
            xrbVar.g(0);
        }
        asbVar.g(obj, xrbVar);
        int c = xrbVar.c(j);
        if (c == -1) {
            return new vz6(obj, j2, xrbVar.b(j));
        }
        return new vz6(obj, c, xrbVar.e(c), j2, -1);
    }

    public final yt6 a() {
        yt6 yt6Var;
        if (this.i == null) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            yt6[] yt6VarArr = this.j;
            if (i2 >= yt6VarArr.length) {
                break;
            }
            if (this.i.equals(yt6VarArr[i2])) {
                yt6VarArr[i2] = this.i.m;
            }
            i2++;
        }
        this.i.getClass();
        while (true) {
            yt6[] yt6VarArr2 = this.k;
            int length = yt6VarArr2.length;
            yt6Var = this.i;
            if (i >= length) {
                break;
            }
            if (yt6Var.equals(yt6VarArr2[i])) {
                yt6VarArr2[i] = this.i.m;
            }
            i++;
        }
        yt6Var.getClass();
        this.i.i();
        int i3 = this.n - 1;
        this.n = i3;
        if (i3 == 0) {
            this.l = null;
            yt6 yt6Var2 = this.i;
            this.o = yt6Var2.b;
            this.p = yt6Var2.g.a.d;
        }
        this.i = this.i.m;
        q();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        yt6 yt6Var = this.i;
        yt6Var.getClass();
        this.o = yt6Var.b;
        this.p = yt6Var.g.a.d;
        while (yt6Var != null) {
            yt6Var.i();
            yt6Var = yt6Var.m;
        }
        this.i = null;
        this.l = null;
        Arrays.fill(this.j, (Object) null);
        Arrays.fill(this.k, (Object) null);
        this.n = 0;
        q();
    }

    public final yt6 c() {
        yt6 yt6Var = this.i;
        while (yt6Var != null) {
            for (yt6 yt6Var2 : this.k) {
                if (yt6Var == yt6Var2) {
                    return yt6Var;
                }
            }
            yt6Var = yt6Var.m;
        }
        return yt6Var;
    }

    public final yt6 d() {
        yt6 yt6Var = this.i;
        while (yt6Var != null) {
            for (yt6 yt6Var2 : this.j) {
                if (yt6Var == yt6Var2) {
                    return yt6Var;
                }
            }
            yt6Var = yt6Var.m;
        }
        return yt6Var;
    }

    public final defpackage.zt6 e(defpackage.asb r22, defpackage.yt6 r23, long r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au6.e(asb, yt6, long):zt6");
    }

    public final yt6 f() {
        yt6[] yt6VarArr = this.j;
        if (yt6VarArr.length == 0) {
            return null;
        }
        yt6 yt6Var = yt6VarArr[0];
        for (yt6 yt6Var2 = this.i; yt6Var2 != null; yt6Var2 = yt6Var2.m) {
            int length = yt6VarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (yt6Var2 != yt6VarArr[i]) {
                    i++;
                } else {
                    yt6Var = yt6Var2;
                    break;
                }
            }
        }
        return yt6Var;
    }

    public final long g(asb asbVar, vz6 vz6Var) {
        Object obj = vz6Var.a;
        xrb xrbVar = this.a;
        asbVar.g(obj, xrbVar);
        if (vz6Var.c()) {
            return xrbVar.a(vz6Var.b, vz6Var.c);
        }
        int i = vz6Var.e;
        if (i != -1) {
            xrbVar.d(i);
            return 0L;
        }
        return xrbVar.d;
    }

    public final zt6 h(asb asbVar, vz6 vz6Var, long j, long j2, long j3) {
        asbVar.g(vz6Var.a, this.a);
        boolean c = vz6Var.c();
        Object obj = vz6Var.a;
        if (c) {
            return i(asbVar, obj, vz6Var.b, vz6Var.c, j, vz6Var.d);
        }
        return j(asbVar, obj, j2, j3, j, vz6Var.d);
    }

    public final zt6 i(asb asbVar, Object obj, int i, int i2, long j, long j2) {
        vz6 vz6Var = new vz6(obj, i, i2, j2, -1);
        xrb xrbVar = this.a;
        long a = asbVar.g(obj, xrbVar).a(i, i2);
        if (i2 == xrbVar.e(i)) {
            ea eaVar = ea.c;
        }
        xrbVar.g(i);
        long j3 = 0;
        if (a != -9223372036854775807L && 0 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new zt6(vz6Var, j3, -9223372036854775807L, j, a, false, false, false, false);
    }

    public final zt6 j(asb asbVar, Object obj, long j, long j2, long j3, long j4) {
        boolean z;
        long j5;
        xrb xrbVar = this.a;
        asbVar.g(obj, xrbVar);
        int b = xrbVar.b(j);
        if (b != -1) {
            xrbVar.g(b);
            xrbVar.g(b);
        }
        vz6 vz6Var = new vz6(obj, j4, b);
        if (!vz6Var.c() && b == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean o = o(asbVar, vz6Var);
        boolean n = n(asbVar, vz6Var, z);
        long g = g(asbVar, vz6Var);
        if (g != -9223372036854775807L && j >= g) {
            j5 = Math.max(0L, g - 1);
        } else {
            j5 = j;
        }
        return new zt6(vz6Var, j5, j2, j3, g, false, z, o, n);
    }

    public final yt6 k(int i) {
        return this.k[i];
    }

    public final zt6 l(asb asbVar, zt6 zt6Var) {
        boolean z;
        vz6 vz6Var = zt6Var.a;
        int i = vz6Var.e;
        if (!vz6Var.c() && i == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean o = o(asbVar, vz6Var);
        boolean n = n(asbVar, vz6Var, z2);
        long g = g(asbVar, vz6Var);
        Object obj = vz6Var.a;
        xrb xrbVar = this.a;
        asbVar.g(obj, xrbVar);
        if (vz6Var.c()) {
            xrbVar.g(vz6Var.b);
        } else if (i != -1) {
            xrbVar.g(i);
        }
        return new zt6(vz6Var, zt6Var.b, zt6Var.c, zt6Var.d, g, false, z2, o, n);
    }

    public final boolean n(asb asbVar, vz6 vz6Var, boolean z) {
        int b = asbVar.b(vz6Var.a);
        xrb xrbVar = this.a;
        int i = asbVar.f(b, xrbVar, false).c;
        zrb zrbVar = this.b;
        if (asbVar.m(i, zrbVar, 0L).h || asbVar.d(b, xrbVar, zrbVar, this.g, this.h) != -1 || !z) {
            return false;
        }
        return true;
    }

    public final boolean o(asb asbVar, vz6 vz6Var) {
        boolean z;
        if (!vz6Var.c() && vz6Var.e == -1) {
            z = true;
        } else {
            z = false;
        }
        Object obj = vz6Var.a;
        if (z) {
            if (asbVar.m(asbVar.g(obj, this.a).c, this.b, 0L).n == asbVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        yt6 yt6Var = this.m;
        if (yt6Var == null || yt6Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                yt6 yt6Var2 = (yt6) this.q.get(i);
                if (!yt6Var2.h()) {
                    this.m = yt6Var2;
                    return;
                }
            }
        }
    }

    public final void q() {
        vz6 vz6Var;
        yt6 yt6Var;
        mo5 p = po5.p();
        for (yt6 yt6Var2 = this.i; yt6Var2 != null; yt6Var2 = yt6Var2.m) {
            p.c(yt6Var2.g.a);
        }
        yt6[] yt6VarArr = this.j;
        if (yt6VarArr.length != 0 && (yt6Var = yt6VarArr[0]) != null) {
            vz6Var = yt6Var.g.a;
        } else {
            vz6Var = null;
        }
        this.d.e(new yg6(this, p, vz6Var, (byte) 9));
    }

    public final void r(long j) {
        boolean z;
        yt6 yt6Var = this.l;
        if (yt6Var != null) {
            if (yt6Var.m == null) {
                z = true;
            } else {
                z = false;
            }
            yve.p(z);
            if (yt6Var.e) {
                yt6Var.a.u(j - yt6Var.p);
            }
        }
    }

    public final int s(yt6 yt6Var) {
        yt6[] yt6VarArr;
        yt6[] yt6VarArr2;
        yt6Var.getClass();
        if (yt6Var == this.l) {
            return 0;
        }
        this.l = yt6Var;
        int i = 0;
        while (true) {
            yt6Var = yt6Var.m;
            if (yt6Var == null) {
                break;
            }
            int i2 = 0;
            while (true) {
                yt6VarArr = this.j;
                int length = yt6VarArr.length;
                yt6VarArr2 = this.k;
                if (i2 >= length) {
                    break;
                }
                if (yt6Var == yt6VarArr[i2]) {
                    yt6 yt6Var2 = this.i;
                    yt6VarArr[i2] = yt6Var2;
                    yt6VarArr2[i2] = yt6Var2;
                    i = 3;
                }
                i2++;
            }
            for (int i3 = 0; i3 < yt6VarArr2.length; i3++) {
                if (yt6Var == yt6VarArr2[i3]) {
                    yt6VarArr2[i3] = yt6VarArr[i3];
                    i |= 2;
                }
            }
            yt6Var.i();
            this.n--;
        }
        yt6 yt6Var3 = this.l;
        yt6Var3.getClass();
        if (yt6Var3.m != null) {
            yt6Var3.b();
            yt6Var3.m = null;
            yt6Var3.c();
        }
        q();
        return i;
    }

    public final vz6 u(nf8 nf8Var, asb asbVar, Object obj, long j, boolean z, boolean z2) {
        long v;
        int b;
        xrb xrbVar = this.a;
        int i = asbVar.g(obj, xrbVar).c;
        Object obj2 = this.o;
        boolean z3 = false;
        if (obj2 != null && (b = asbVar.b(obj2)) != -1 && asbVar.f(b, xrbVar, false).c == i) {
            v = this.p;
        } else {
            yt6 yt6Var = this.i;
            while (true) {
                if (yt6Var != null) {
                    if (yt6Var.b.equals(obj)) {
                        v = yt6Var.g.a.d;
                        break;
                    }
                    yt6Var = yt6Var.m;
                } else {
                    yt6 yt6Var2 = this.i;
                    while (true) {
                        if (yt6Var2 != null) {
                            int b2 = asbVar.b(yt6Var2.b);
                            if (b2 != -1 && asbVar.f(b2, xrbVar, false).c == i) {
                                v = yt6Var2.g.a.d;
                                break;
                            }
                            yt6Var2 = yt6Var2.m;
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
        zrb zrbVar = this.b;
        if (!z && !z2) {
            vz6 vz6Var = nf8Var.b;
            long j2 = v;
            vz6 t = t(asbVar, obj, j, j2, zrbVar, xrbVar);
            if (vz6Var.c() && vz6Var.equals(t)) {
                return vz6Var;
            }
            asbVar.g(obj, xrbVar);
            return new vz6(obj, j2, xrbVar.b(j));
        }
        Object obj3 = obj;
        long j3 = v;
        asbVar.g(obj3, xrbVar);
        asbVar.n(xrbVar.c, zrbVar);
        int b3 = asbVar.b(obj);
        boolean z4 = false;
        while (b3 >= zrbVar.m) {
            boolean z5 = true;
            asbVar.f(b3, xrbVar, true);
            if (ea.c.a <= 0) {
                z5 = z3;
            }
            z4 |= z5;
            zrb zrbVar2 = zrbVar;
            if (xrbVar.c(xrbVar.d) != -1) {
                obj3 = xrbVar.b;
                obj3.getClass();
            }
            if (z4 && (!z5 || xrbVar.d != 0)) {
                zrbVar = zrbVar2;
                break;
            }
            b3--;
            z3 = false;
            zrbVar = zrbVar2;
        }
        vz6 t2 = t(asbVar, obj3, j, j3, zrbVar, xrbVar);
        Object obj4 = t2.a;
        int i2 = t2.b;
        if (i2 != -1 && !z) {
            asbVar.g(obj4, xrbVar);
            ea.c.a(i2).getClass();
            if (0 != j) {
                return new vz6(obj4, t2.d, xrbVar.b(j));
            }
        }
        return t2;
    }

    public final long v(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            yt6 yt6Var = (yt6) this.q.get(i);
            if (yt6Var.b.equals(obj)) {
                return yt6Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int w(asb asbVar) {
        asb asbVar2;
        yt6 yt6Var;
        yt6 yt6Var2 = this.i;
        if (yt6Var2 == null) {
            return 0;
        }
        int b = asbVar.b(yt6Var2.b);
        while (true) {
            asbVar2 = asbVar;
            b = asbVar2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                yt6Var = yt6Var2.m;
                if (yt6Var == null || yt6Var2.g.g) {
                    break;
                }
                yt6Var2 = yt6Var;
            }
            if (b == -1 || yt6Var == null || asbVar2.b(yt6Var.b) != b) {
                break;
            }
            yt6Var2 = yt6Var;
            asbVar = asbVar2;
        }
        int s = s(yt6Var2);
        yt6Var2.g = l(asbVar2, yt6Var2.g);
        return s;
    }

    public final int x(asb asbVar, long j, long[] jArr, long[] jArr2) {
        long j2;
        int i;
        zt6 b;
        long j3;
        int i2;
        int i3;
        yt6 yt6Var = null;
        for (yt6 yt6Var2 = this.i; yt6Var2 != null; yt6Var2 = yt6Var2.m) {
            zt6 zt6Var = yt6Var2.g;
            vz6 vz6Var = zt6Var.a;
            if (yt6Var == null) {
                b = l(asbVar, zt6Var);
                j2 = -9223372036854775807L;
                i = 0;
            } else {
                zt6 e = e(asbVar, yt6Var, j);
                if (e != null) {
                    long j4 = e.b;
                    long j5 = zt6Var.c;
                    j2 = -9223372036854775807L;
                    long j6 = zt6Var.b;
                    i = 0;
                    if (vz6Var.equals(e.a)) {
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
                return s(yt6Var);
            }
            long j8 = zt6Var.d;
            long j9 = zt6Var.e;
            zt6 a = b.a(j8);
            yt6Var2.g = a;
            long j10 = b.e;
            if (j9 != j10) {
                if (j10 == j2) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j10 + yt6Var2.p;
                }
                if (!a.f && m(this.j, jArr, yt6Var2, j3)) {
                    i2 = 1;
                } else {
                    i2 = i;
                }
                boolean m = m(this.k, jArr2, yt6Var2, j3);
                int s = s(yt6Var2);
                if (s != 0) {
                    return s;
                }
                if (i2 != 0 && (j9 != j2 || vz6Var.e != -1)) {
                    i3 = 1;
                } else {
                    i3 = i;
                }
                if (m) {
                    return i3 | 2;
                }
                return i3;
            }
            yt6Var = yt6Var2;
        }
        return 0;
    }
}
