package defpackage;

import java.util.List;
public final class e4 implements s84 {
    public final f4 a = new f4("audio/ac3");
    public final yw7 b = new yw7(2786);
    public boolean c;

    @Override
    public final int b(t84 t84Var, u21 u21Var) {
        yw7 yw7Var = this.b;
        int read = ((vb3) t84Var).read(yw7Var.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        yw7Var.N(0);
        yw7Var.M(read);
        boolean z = this.c;
        f4 f4Var = this.a;
        if (!z) {
            f4Var.o = 0L;
            this.c = true;
        }
        f4Var.b(yw7Var);
        return 0;
    }

    @Override
    public final boolean c(t84 t84Var) {
        vb3 vb3Var;
        int a;
        yw7 yw7Var = new yw7(10);
        int i = 0;
        while (true) {
            vb3Var = (vb3) t84Var;
            vb3Var.d(yw7Var.a, 0, 10, false);
            yw7Var.N(0);
            if (yw7Var.D() != 4801587) {
                break;
            }
            yw7Var.O(3);
            int z = yw7Var.z();
            i += z + 10;
            vb3Var.a(z, false);
        }
        vb3Var.f = 0;
        vb3Var.a(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            vb3Var.d(yw7Var.a, 0, 6, false);
            yw7Var.N(0);
            if (yw7Var.H() != 2935) {
                vb3Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                vb3Var.a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = yw7Var.a;
                if (bArr.length < 6) {
                    a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    a = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) << 1;
                } else {
                    byte b = bArr[4];
                    a = oe3.a((b & 192) >> 6, b & 63);
                }
                if (a == -1) {
                    break;
                }
                vb3Var.a(a - 6, false);
            }
        }
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.a.h(u84Var, new l4c(0, 1));
        u84Var.B();
        u84Var.f0(new od0(-9223372036854775807L));
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
