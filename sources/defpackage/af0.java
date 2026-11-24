package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
public final class af0 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public af0(ak2 ak2Var) {
        this.c = 0;
        Charset charset = mp5.a;
        this.d = ak2Var;
        ak2Var.b = this;
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
        if (((ak2) this.d).b() == i) {
            return;
        }
        throw zp5.e();
    }

    public final void B(int i) {
        if ((this.a & 7) == i) {
            return;
        }
        throw zp5.b();
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
        ak2 ak2Var = (ak2) this.d;
        if (!ak2Var.c() && (i = this.a) != this.b) {
            return ak2Var.x(i);
        }
        return false;
    }

    public final synchronized void E() {
        int max = Math.max(0, g8c.g(this.a, 65536) - this.b);
        int i = this.c;
        if (max >= i) {
            return;
        }
        Arrays.fill((mj[]) this.d, max, i, (Object) null);
        this.c = max;
    }

    public final synchronized mj a() {
        mj mjVar;
        int i = this.b + 1;
        this.b = i;
        int i2 = this.c;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.c = i3;
            mjVar = ((mj[]) this.d)[i3];
            mjVar.getClass();
            ((mj[]) this.d)[this.c] = null;
        } else {
            mj mjVar2 = new mj(0, new byte[65536]);
            mj[] mjVarArr = (mj[]) this.d;
            if (i > mjVarArr.length) {
                this.d = (mj[]) Arrays.copyOf(mjVarArr, mjVarArr.length << 1);
            }
            mjVar = mjVar2;
        }
        return mjVar;
    }

    public final bf0 b() {
        return ((bf0[]) this.d)[this.a];
    }

    public final int c() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            i = ((ak2) this.d).u();
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
            byte[] bArr2 = ((bf0[]) this.d)[i4 / i2].a;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = bArr2[i6 / i];
            }
            bArr[i5] = bArr3;
        }
        return bArr;
    }

    public final void e(Object obj, nq9 nq9Var, b74 b74Var) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            nq9Var.h(obj, this, b74Var);
            if (this.a == this.b) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.b = i;
        }
    }

    public final void f(Object obj, nq9 nq9Var, b74 b74Var) {
        ak2 ak2Var = (ak2) this.d;
        int v = ak2Var.v();
        if (ak2Var.a < 100) {
            int e = ak2Var.e(v);
            ak2Var.a++;
            nq9Var.h(obj, this, b74Var);
            ak2Var.a(0);
            ak2Var.a--;
            ak2Var.d(e);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void g(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = ak2Var.b() + ak2Var.v();
                do {
                    lp5Var.add(Boolean.valueOf(ak2Var.f()));
                } while (ak2Var.b() < b);
                A(b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Boolean.valueOf(ak2Var.f()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final f51 h() {
        B(2);
        return ((ak2) this.d).g();
    }

    public final void i(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        if ((this.a & 7) == 2) {
            do {
                lp5Var.add(h());
                if (ak2Var.c()) {
                    return;
                }
                u = ak2Var.u();
            } while (u == this.a);
            this.c = u;
            return;
        }
        throw zp5.b();
    }

    public final void j(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 1) {
            if (i == 2) {
                int v = ak2Var.v();
                G(v);
                int b = ak2Var.b() + v;
                do {
                    lp5Var.add(Double.valueOf(ak2Var.h()));
                } while (ak2Var.b() < b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Double.valueOf(ak2Var.h()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void k(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = ak2Var.b() + ak2Var.v();
                do {
                    lp5Var.add(Integer.valueOf(ak2Var.i()));
                } while (ak2Var.b() < b);
                A(b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Integer.valueOf(ak2Var.i()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final Object l(kyc kycVar, Class cls, b74 b74Var) {
        ak2 ak2Var = (ak2) this.d;
        switch (kycVar.ordinal()) {
            case 0:
                B(1);
                return Double.valueOf(ak2Var.h());
            case 1:
                B(5);
                return Float.valueOf(ak2Var.l());
            case 2:
                B(0);
                return Long.valueOf(ak2Var.n());
            case 3:
                B(0);
                return Long.valueOf(ak2Var.w());
            case 4:
                B(0);
                return Integer.valueOf(ak2Var.m());
            case 5:
                B(1);
                return Long.valueOf(ak2Var.k());
            case 6:
                B(5);
                return Integer.valueOf(ak2Var.j());
            case 7:
                B(0);
                return Boolean.valueOf(ak2Var.f());
            case 8:
                B(2);
                return ak2Var.t();
            case 9:
            default:
                w26.j("unsupported field type.");
                return null;
            case 10:
                B(2);
                nq9 a = ft8.c.a(cls);
                fs4 a2 = a.a();
                f(a2, a, b74Var);
                a.c(a2);
                return a2;
            case 11:
                return h();
            case 12:
                B(0);
                return Integer.valueOf(ak2Var.v());
            case 13:
                B(0);
                return Integer.valueOf(ak2Var.i());
            case 14:
                B(5);
                return Integer.valueOf(ak2Var.o());
            case 15:
                B(1);
                return Long.valueOf(ak2Var.p());
            case 16:
                B(0);
                return Integer.valueOf(ak2Var.q());
            case 17:
                B(0);
                return Long.valueOf(ak2Var.r());
        }
    }

    public final void m(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    lp5Var.add(Integer.valueOf(ak2Var.j()));
                    if (!ak2Var.c()) {
                        u = ak2Var.u();
                    } else {
                        return;
                    }
                } while (u == this.a);
                this.c = u;
                return;
            }
            throw zp5.b();
        }
        int v = ak2Var.v();
        F(v);
        int b = ak2Var.b() + v;
        do {
            lp5Var.add(Integer.valueOf(ak2Var.j()));
        } while (ak2Var.b() < b);
    }

    public final void n(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 1) {
            if (i == 2) {
                int v = ak2Var.v();
                G(v);
                int b = ak2Var.b() + v;
                do {
                    lp5Var.add(Long.valueOf(ak2Var.k()));
                } while (ak2Var.b() < b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Long.valueOf(ak2Var.k()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void o(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    lp5Var.add(Float.valueOf(ak2Var.l()));
                    if (!ak2Var.c()) {
                        u = ak2Var.u();
                    } else {
                        return;
                    }
                } while (u == this.a);
                this.c = u;
                return;
            }
            throw zp5.b();
        }
        int v = ak2Var.v();
        F(v);
        int b = ak2Var.b() + v;
        do {
            lp5Var.add(Float.valueOf(ak2Var.l()));
        } while (ak2Var.b() < b);
    }

    public final void p(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = ak2Var.b() + ak2Var.v();
                do {
                    lp5Var.add(Integer.valueOf(ak2Var.m()));
                } while (ak2Var.b() < b);
                A(b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Integer.valueOf(ak2Var.m()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void q(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = ak2Var.b() + ak2Var.v();
                do {
                    lp5Var.add(Long.valueOf(ak2Var.n()));
                } while (ak2Var.b() < b);
                A(b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Long.valueOf(ak2Var.n()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void r(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 2) {
            if (i == 5) {
                do {
                    lp5Var.add(Integer.valueOf(ak2Var.o()));
                    if (!ak2Var.c()) {
                        u = ak2Var.u();
                    } else {
                        return;
                    }
                } while (u == this.a);
                this.c = u;
                return;
            }
            throw zp5.b();
        }
        int v = ak2Var.v();
        F(v);
        int b = ak2Var.b() + v;
        do {
            lp5Var.add(Integer.valueOf(ak2Var.o()));
        } while (ak2Var.b() < b);
    }

    public final void s(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 1) {
            if (i == 2) {
                int v = ak2Var.v();
                G(v);
                int b = ak2Var.b() + v;
                do {
                    lp5Var.add(Long.valueOf(ak2Var.p()));
                } while (ak2Var.b() < b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Long.valueOf(ak2Var.p()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void t(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = ak2Var.b() + ak2Var.v();
                do {
                    lp5Var.add(Integer.valueOf(ak2Var.q()));
                } while (ak2Var.b() < b);
                A(b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Integer.valueOf(ak2Var.q()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void u(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = ak2Var.b() + ak2Var.v();
                do {
                    lp5Var.add(Long.valueOf(ak2Var.r()));
                } while (ak2Var.b() < b);
                A(b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Long.valueOf(ak2Var.r()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void v(lp5 lp5Var, boolean z) {
        String s;
        int u;
        ak2 ak2Var = (ak2) this.d;
        if ((this.a & 7) == 2) {
            do {
                if (z) {
                    B(2);
                    s = ak2Var.t();
                } else {
                    B(2);
                    s = ak2Var.s();
                }
                lp5Var.add(s);
                if (ak2Var.c()) {
                    return;
                }
                u = ak2Var.u();
            } while (u == this.a);
            this.c = u;
            return;
        }
        throw zp5.b();
    }

    public final void w(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = ak2Var.b() + ak2Var.v();
                do {
                    lp5Var.add(Integer.valueOf(ak2Var.v()));
                } while (ak2Var.b() < b);
                A(b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Integer.valueOf(ak2Var.v()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final void x(lp5 lp5Var) {
        int u;
        ak2 ak2Var = (ak2) this.d;
        int i = this.a & 7;
        if (i != 0) {
            if (i == 2) {
                int b = ak2Var.b() + ak2Var.v();
                do {
                    lp5Var.add(Long.valueOf(ak2Var.w()));
                } while (ak2Var.b() < b);
                A(b);
                return;
            }
            throw zp5.b();
        }
        do {
            lp5Var.add(Long.valueOf(ak2Var.w()));
            if (ak2Var.c()) {
                return;
            }
            u = ak2Var.u();
        } while (u == this.a);
        this.c = u;
    }

    public final synchronized void y(mj mjVar) {
        int i = this.c;
        this.c = i + 1;
        ((mj[]) this.d)[i] = mjVar;
        this.b--;
    }

    public final synchronized void z(ly0 ly0Var) {
        while (ly0Var != null) {
            int i = this.c;
            this.c = i + 1;
            mj mjVar = (mj) ly0Var.c;
            mjVar.getClass();
            ((mj[]) this.d)[i] = mjVar;
            this.b--;
            ly0Var = (ly0) ly0Var.d;
            if (ly0Var == null || ((mj) ly0Var.c) == null) {
                ly0Var = null;
            }
        }
    }

    public af0() {
        this.c = 0;
        this.d = new mj[100];
    }
}
