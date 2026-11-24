package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
public final class ag0 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public ag0(nl2 nl2Var) {
        this.c = 0;
        Charset charset = mr5.a;
        this.d = nl2Var;
        nl2Var.b = this;
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
        if (((nl2) this.d).b() == i) {
            return;
        }
        throw yr5.e();
    }

    public final void B(int i) {
        if ((this.a & 7) == i) {
            return;
        }
        throw yr5.b();
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
        nl2 nl2Var = (nl2) this.d;
        if (!nl2Var.c() && (i = this.a) != this.b) {
            return nl2Var.x(i);
        }
        return false;
    }

    public final synchronized void E() {
        int max = Math.max(0, hac.g(this.a, 65536) - this.b);
        int i = this.c;
        if (max >= i) {
            return;
        }
        Arrays.fill((mk[]) this.d, max, i, (Object) null);
        this.c = max;
    }

    public final synchronized mk a() {
        mk mkVar;
        int i = this.b + 1;
        this.b = i;
        int i2 = this.c;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.c = i3;
            mkVar = ((mk[]) this.d)[i3];
            mkVar.getClass();
            ((mk[]) this.d)[this.c] = null;
        } else {
            mk mkVar2 = new mk(0, new byte[65536]);
            mk[] mkVarArr = (mk[]) this.d;
            if (i > mkVarArr.length) {
                this.d = (mk[]) Arrays.copyOf(mkVarArr, mkVarArr.length << 1);
            }
            mkVar = mkVar2;
        }
        return mkVar;
    }

    public final bg0 b() {
        return ((bg0[]) this.d)[this.a];
    }

    public final int c() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            i = ((nl2) this.d).u();
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
            byte[] bArr2 = ((bg0[]) this.d)[i4 / i2].a;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = bArr2[i6 / i];
            }
            bArr[i5] = bArr3;
        }
        return bArr;
    }

    public final void e(Object obj, os9 os9Var, k84 k84Var) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            os9Var.i(obj, this, k84Var);
            if (this.a == this.b) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.b = i;
        }
    }

    public final void f(Object obj, os9 os9Var, k84 k84Var) {
        nl2 nl2Var = (nl2) this.d;
        int v = nl2Var.v();
        if (nl2Var.a < 100) {
            int e = nl2Var.e(v);
            nl2Var.a++;
            os9Var.i(obj, this, k84Var);
            nl2Var.a(0);
            nl2Var.a--;
            nl2Var.d(e);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void g(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = nl2Var.b() + nl2Var.v();
                do {
                    lr5Var.add(Boolean.valueOf(nl2Var.f()));
                } while (nl2Var.b() < b);
                A(b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Boolean.valueOf(nl2Var.f()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final m61 h() {
        B(2);
        return ((nl2) this.d).g();
    }

    public final void i(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        if ((this.a & 7) == 2) {
            do {
                lr5Var.add(h());
                if (nl2Var.c()) {
                    return;
                }
                u = nl2Var.u();
            } while (u == this.a);
            this.c = u;
            return;
        }
        throw yr5.b();
    }

    public final void j(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 1) {
            if (i == 2) {
                int v = nl2Var.v();
                G(v);
                int b = nl2Var.b() + v;
                do {
                    lr5Var.add(Double.valueOf(nl2Var.h()));
                } while (nl2Var.b() < b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Double.valueOf(nl2Var.h()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void k(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = nl2Var.b() + nl2Var.v();
                do {
                    lr5Var.add(Integer.valueOf(nl2Var.i()));
                } while (nl2Var.b() < b);
                A(b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Integer.valueOf(nl2Var.i()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final Object l(l0d l0dVar, Class cls, k84 k84Var) {
        nl2 nl2Var = (nl2) this.d;
        switch (l0dVar.ordinal()) {
            case 0:
                B(1);
                return Double.valueOf(nl2Var.h());
            case 1:
                B(5);
                return Float.valueOf(nl2Var.l());
            case 2:
                B(0);
                return Long.valueOf(nl2Var.n());
            case 3:
                B(0);
                return Long.valueOf(nl2Var.w());
            case 4:
                B(0);
                return Integer.valueOf(nl2Var.m());
            case 5:
                B(1);
                return Long.valueOf(nl2Var.k());
            case 6:
                B(5);
                return Integer.valueOf(nl2Var.j());
            case 7:
                B(0);
                return Boolean.valueOf(nl2Var.f());
            case 8:
                B(2);
                return nl2Var.t();
            case 9:
            default:
                u36.j("unsupported field type.");
                return null;
            case 10:
                B(2);
                os9 a = gv8.c.a(cls);
                gu4 a2 = a.a();
                f(a2, a, k84Var);
                a.c(a2);
                return a2;
            case 11:
                return h();
            case 12:
                B(0);
                return Integer.valueOf(nl2Var.v());
            case 13:
                B(0);
                return Integer.valueOf(nl2Var.i());
            case 14:
                B(5);
                return Integer.valueOf(nl2Var.o());
            case 15:
                B(1);
                return Long.valueOf(nl2Var.p());
            case 16:
                B(0);
                return Integer.valueOf(nl2Var.q());
            case 17:
                B(0);
                return Long.valueOf(nl2Var.r());
        }
    }

    public final void m(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    lr5Var.add(Integer.valueOf(nl2Var.j()));
                    if (!nl2Var.c()) {
                        u = nl2Var.u();
                    } else {
                        return;
                    }
                } while (u == this.a);
                this.c = u;
                return;
            }
            throw yr5.b();
        }
        int v = nl2Var.v();
        F(v);
        int b = nl2Var.b() + v;
        do {
            lr5Var.add(Integer.valueOf(nl2Var.j()));
        } while (nl2Var.b() < b);
    }

    public final void n(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 1) {
            if (i == 2) {
                int v = nl2Var.v();
                G(v);
                int b = nl2Var.b() + v;
                do {
                    lr5Var.add(Long.valueOf(nl2Var.k()));
                } while (nl2Var.b() < b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Long.valueOf(nl2Var.k()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void o(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    lr5Var.add(Float.valueOf(nl2Var.l()));
                    if (!nl2Var.c()) {
                        u = nl2Var.u();
                    } else {
                        return;
                    }
                } while (u == this.a);
                this.c = u;
                return;
            }
            throw yr5.b();
        }
        int v = nl2Var.v();
        F(v);
        int b = nl2Var.b() + v;
        do {
            lr5Var.add(Float.valueOf(nl2Var.l()));
        } while (nl2Var.b() < b);
    }

    public final void p(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = nl2Var.b() + nl2Var.v();
                do {
                    lr5Var.add(Integer.valueOf(nl2Var.m()));
                } while (nl2Var.b() < b);
                A(b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Integer.valueOf(nl2Var.m()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void q(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = nl2Var.b() + nl2Var.v();
                do {
                    lr5Var.add(Long.valueOf(nl2Var.n()));
                } while (nl2Var.b() < b);
                A(b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Long.valueOf(nl2Var.n()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void r(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    lr5Var.add(Integer.valueOf(nl2Var.o()));
                    if (!nl2Var.c()) {
                        u = nl2Var.u();
                    } else {
                        return;
                    }
                } while (u == this.a);
                this.c = u;
                return;
            }
            throw yr5.b();
        }
        int v = nl2Var.v();
        F(v);
        int b = nl2Var.b() + v;
        do {
            lr5Var.add(Integer.valueOf(nl2Var.o()));
        } while (nl2Var.b() < b);
    }

    public final void s(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 1) {
            if (i == 2) {
                int v = nl2Var.v();
                G(v);
                int b = nl2Var.b() + v;
                do {
                    lr5Var.add(Long.valueOf(nl2Var.p()));
                } while (nl2Var.b() < b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Long.valueOf(nl2Var.p()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void t(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = nl2Var.b() + nl2Var.v();
                do {
                    lr5Var.add(Integer.valueOf(nl2Var.q()));
                } while (nl2Var.b() < b);
                A(b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Integer.valueOf(nl2Var.q()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void u(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = nl2Var.b() + nl2Var.v();
                do {
                    lr5Var.add(Long.valueOf(nl2Var.r()));
                } while (nl2Var.b() < b);
                A(b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Long.valueOf(nl2Var.r()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void v(lr5 lr5Var, boolean z) {
        String s;
        int u;
        nl2 nl2Var = (nl2) this.d;
        if ((this.a & 7) == 2) {
            do {
                if (z) {
                    B(2);
                    s = nl2Var.t();
                } else {
                    B(2);
                    s = nl2Var.s();
                }
                lr5Var.add(s);
                if (nl2Var.c()) {
                    return;
                }
                u = nl2Var.u();
            } while (u == this.a);
            this.c = u;
            return;
        }
        throw yr5.b();
    }

    public final void w(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = nl2Var.b() + nl2Var.v();
                do {
                    lr5Var.add(Integer.valueOf(nl2Var.v()));
                } while (nl2Var.b() < b);
                A(b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Integer.valueOf(nl2Var.v()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void x(lr5 lr5Var) {
        int u;
        nl2 nl2Var = (nl2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = nl2Var.b() + nl2Var.v();
                do {
                    lr5Var.add(Long.valueOf(nl2Var.w()));
                } while (nl2Var.b() < b);
                A(b);
                return;
            }
            throw yr5.b();
        }
        do {
            lr5Var.add(Long.valueOf(nl2Var.w()));
            if (nl2Var.c()) {
                return;
            }
            u = nl2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final synchronized void y(mk mkVar) {
        int i = this.c;
        this.c = i + 1;
        ((mk[]) this.d)[i] = mkVar;
        this.b--;
    }

    public final synchronized void z(sz0 sz0Var) {
        while (sz0Var != null) {
            int i = this.c;
            this.c = i + 1;
            mk mkVar = (mk) sz0Var.c;
            mkVar.getClass();
            ((mk[]) this.d)[i] = mkVar;
            this.b--;
            sz0Var = (sz0) sz0Var.d;
            if (sz0Var == null || ((mk) sz0Var.c) == null) {
                sz0Var = null;
            }
        }
    }

    public ag0() {
        this.c = 0;
        this.d = new mk[100];
    }
}
