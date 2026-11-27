package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
public final class cf0 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public cf0(vk2 vk2Var) {
        this.c = 0;
        Charset charset = pr5.a;
        this.d = vk2Var;
        vk2Var.b = this;
    }

    public static void F(int i) {
        if ((i & 3) == 0) {
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public static void G(int i) {
        if ((i & 7) == 0) {
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public final void A(int i) {
        if (((vk2) this.d).b() == i) {
            return;
        }
        throw bs5.e();
    }

    public final void B(int i) {
        if ((this.a & 7) == i) {
            return;
        }
        throw bs5.b();
    }

    public final synchronized void C(int i) {
        boolean z;
        if (i < this.a) {
            z = true;
        } else {
            z = false;
        }
        this.a = i;
        if (z) {
            E();
        }
    }

    public final boolean D() {
        int i;
        vk2 vk2Var = (vk2) this.d;
        if (!vk2Var.c() && (i = this.a) != this.b) {
            return vk2Var.x(i);
        }
        return false;
    }

    public final synchronized void E() {
        int max = Math.max(0, gcc.g(this.a, 65536) - this.b);
        int i = this.c;
        if (max >= i) {
            return;
        }
        Arrays.fill((nj[]) this.d, max, i, (Object) null);
        this.c = max;
    }

    public final synchronized nj a() {
        nj njVar;
        int i = this.b + 1;
        this.b = i;
        int i2 = this.c;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.c = i3;
            njVar = ((nj[]) this.d)[i3];
            njVar.getClass();
            ((nj[]) this.d)[this.c] = null;
        } else {
            nj njVar2 = new nj(0, new byte[65536]);
            nj[] njVarArr = (nj[]) this.d;
            if (i > njVarArr.length) {
                this.d = (nj[]) Arrays.copyOf(njVarArr, njVarArr.length << 1);
            }
            njVar = njVar2;
        }
        return njVar;
    }

    public final df0 b() {
        return ((df0[]) this.d)[this.a];
    }

    public final int c() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            i = ((vk2) this.d).u();
            this.a = i;
        }
        if (i != 0 && i != this.b) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public final byte[][] d(int i, int i2) {
        int i3 = this.b * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, i3, this.c * i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            byte[] bArr2 = ((df0[]) this.d)[i4 / i2].a;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = bArr2[i6 / i];
            }
            bArr[i5] = bArr3;
        }
        return bArr;
    }

    public final void e(Object obj, fu9 fu9Var, v74 v74Var) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            fu9Var.i(obj, this, v74Var);
            if (this.a == this.b) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.b = i;
        }
    }

    public final void f(Object obj, fu9 fu9Var, v74 v74Var) {
        vk2 vk2Var = (vk2) this.d;
        int v = vk2Var.v();
        if (vk2Var.a < 100) {
            int e = vk2Var.e(v);
            vk2Var.a++;
            fu9Var.i(obj, this, v74Var);
            vk2Var.a(0);
            vk2Var.a--;
            vk2Var.d(e);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void g(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = vk2Var.b() + vk2Var.v();
                do {
                    or5Var.add(Boolean.valueOf(vk2Var.f()));
                } while (vk2Var.b() < b);
                A(b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Boolean.valueOf(vk2Var.f()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final n51 h() {
        B(2);
        return ((vk2) this.d).g();
    }

    public final void i(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        if ((this.a & 7) == 2) {
            do {
                or5Var.add(h());
                if (vk2Var.c()) {
                    return;
                }
                u = vk2Var.u();
            } while (u == this.a);
            this.c = u;
            return;
        }
        throw bs5.b();
    }

    public final void j(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 1) {
            if (i == 2) {
                int v = vk2Var.v();
                G(v);
                int b = vk2Var.b() + v;
                do {
                    or5Var.add(Double.valueOf(vk2Var.h()));
                } while (vk2Var.b() < b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Double.valueOf(vk2Var.h()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void k(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = vk2Var.b() + vk2Var.v();
                do {
                    or5Var.add(Integer.valueOf(vk2Var.i()));
                } while (vk2Var.b() < b);
                A(b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Integer.valueOf(vk2Var.i()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final Object l(a3d a3dVar, Class cls, v74 v74Var) {
        vk2 vk2Var = (vk2) this.d;
        switch (a3dVar.ordinal()) {
            case 0:
                B(1);
                return Double.valueOf(vk2Var.h());
            case 1:
                B(5);
                return Float.valueOf(vk2Var.l());
            case 2:
                B(0);
                return Long.valueOf(vk2Var.n());
            case 3:
                B(0);
                return Long.valueOf(vk2Var.w());
            case 4:
                B(0);
                return Integer.valueOf(vk2Var.m());
            case 5:
                B(1);
                return Long.valueOf(vk2Var.k());
            case 6:
                B(5);
                return Integer.valueOf(vk2Var.j());
            case 7:
                B(0);
                return Boolean.valueOf(vk2Var.f());
            case 8:
                B(2);
                return vk2Var.t();
            case 9:
            default:
                lq5.j("unsupported field type.");
                return null;
            case 10:
                B(2);
                fu9 a = ow8.c.a(cls);
                ju4 a2 = a.a();
                f(a2, a, v74Var);
                a.c(a2);
                return a2;
            case 11:
                return h();
            case 12:
                B(0);
                return Integer.valueOf(vk2Var.v());
            case 13:
                B(0);
                return Integer.valueOf(vk2Var.i());
            case 14:
                B(5);
                return Integer.valueOf(vk2Var.o());
            case 15:
                B(1);
                return Long.valueOf(vk2Var.p());
            case 16:
                B(0);
                return Integer.valueOf(vk2Var.q());
            case 17:
                B(0);
                return Long.valueOf(vk2Var.r());
        }
    }

    public final void m(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    or5Var.add(Integer.valueOf(vk2Var.j()));
                    if (!vk2Var.c()) {
                        u = vk2Var.u();
                    } else {
                        return;
                    }
                } while (u == this.a);
                this.c = u;
                return;
            }
            throw bs5.b();
        }
        int v = vk2Var.v();
        F(v);
        int b = vk2Var.b() + v;
        do {
            or5Var.add(Integer.valueOf(vk2Var.j()));
        } while (vk2Var.b() < b);
    }

    public final void n(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 1) {
            if (i == 2) {
                int v = vk2Var.v();
                G(v);
                int b = vk2Var.b() + v;
                do {
                    or5Var.add(Long.valueOf(vk2Var.k()));
                } while (vk2Var.b() < b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Long.valueOf(vk2Var.k()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void o(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    or5Var.add(Float.valueOf(vk2Var.l()));
                    if (!vk2Var.c()) {
                        u = vk2Var.u();
                    } else {
                        return;
                    }
                } while (u == this.a);
                this.c = u;
                return;
            }
            throw bs5.b();
        }
        int v = vk2Var.v();
        F(v);
        int b = vk2Var.b() + v;
        do {
            or5Var.add(Float.valueOf(vk2Var.l()));
        } while (vk2Var.b() < b);
    }

    public final void p(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = vk2Var.b() + vk2Var.v();
                do {
                    or5Var.add(Integer.valueOf(vk2Var.m()));
                } while (vk2Var.b() < b);
                A(b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Integer.valueOf(vk2Var.m()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void q(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = vk2Var.b() + vk2Var.v();
                do {
                    or5Var.add(Long.valueOf(vk2Var.n()));
                } while (vk2Var.b() < b);
                A(b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Long.valueOf(vk2Var.n()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void r(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    or5Var.add(Integer.valueOf(vk2Var.o()));
                    if (!vk2Var.c()) {
                        u = vk2Var.u();
                    } else {
                        return;
                    }
                } while (u == this.a);
                this.c = u;
                return;
            }
            throw bs5.b();
        }
        int v = vk2Var.v();
        F(v);
        int b = vk2Var.b() + v;
        do {
            or5Var.add(Integer.valueOf(vk2Var.o()));
        } while (vk2Var.b() < b);
    }

    public final void s(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 1) {
            if (i == 2) {
                int v = vk2Var.v();
                G(v);
                int b = vk2Var.b() + v;
                do {
                    or5Var.add(Long.valueOf(vk2Var.p()));
                } while (vk2Var.b() < b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Long.valueOf(vk2Var.p()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void t(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = vk2Var.b() + vk2Var.v();
                do {
                    or5Var.add(Integer.valueOf(vk2Var.q()));
                } while (vk2Var.b() < b);
                A(b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Integer.valueOf(vk2Var.q()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void u(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = vk2Var.b() + vk2Var.v();
                do {
                    or5Var.add(Long.valueOf(vk2Var.r()));
                } while (vk2Var.b() < b);
                A(b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Long.valueOf(vk2Var.r()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void v(or5 or5Var, boolean z) {
        String s;
        int u;
        vk2 vk2Var = (vk2) this.d;
        if ((this.a & 7) == 2) {
            do {
                if (z) {
                    B(2);
                    s = vk2Var.t();
                } else {
                    B(2);
                    s = vk2Var.s();
                }
                or5Var.add(s);
                if (vk2Var.c()) {
                    return;
                }
                u = vk2Var.u();
            } while (u == this.a);
            this.c = u;
            return;
        }
        throw bs5.b();
    }

    public final void w(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = vk2Var.b() + vk2Var.v();
                do {
                    or5Var.add(Integer.valueOf(vk2Var.v()));
                } while (vk2Var.b() < b);
                A(b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Integer.valueOf(vk2Var.v()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void x(or5 or5Var) {
        int u;
        vk2 vk2Var = (vk2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = vk2Var.b() + vk2Var.v();
                do {
                    or5Var.add(Long.valueOf(vk2Var.w()));
                } while (vk2Var.b() < b);
                A(b);
                return;
            }
            throw bs5.b();
        }
        do {
            or5Var.add(Long.valueOf(vk2Var.w()));
            if (vk2Var.c()) {
                return;
            }
            u = vk2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final synchronized void y(nj njVar) {
        int i = this.c;
        this.c = i + 1;
        ((nj[]) this.d)[i] = njVar;
        this.b--;
    }

    public final synchronized void z(ty0 ty0Var) {
        while (ty0Var != null) {
            int i = this.c;
            this.c = i + 1;
            nj njVar = (nj) ty0Var.c;
            njVar.getClass();
            ((nj[]) this.d)[i] = njVar;
            this.b--;
            ty0Var = (ty0) ty0Var.d;
            if (ty0Var == null || ((nj) ty0Var.c) == null) {
                ty0Var = null;
            }
        }
    }

    public cf0() {
        this.c = 0;
        this.d = new nj[100];
    }
}
