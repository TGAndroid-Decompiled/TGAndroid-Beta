package defpackage;

import java.util.List;
public final class f4 implements e84 {
    public final g4 a = new g4("audio/ac3");
    public final ey7 b = new ey7(2786);
    public boolean c;

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
        ey7 ey7Var = this.b;
        int read = ((cb3) f84Var).read(ey7Var.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        ey7Var.N(0);
        ey7Var.M(read);
        boolean z = this.c;
        g4 g4Var = this.a;
        if (!z) {
            g4Var.o = 0L;
            this.c = true;
        }
        g4Var.b(ey7Var);
        return 0;
    }

    @Override
    public final boolean c(f84 f84Var) {
        cb3 cb3Var;
        int a;
        ey7 ey7Var = new ey7(10);
        int i = 0;
        while (true) {
            cb3Var = (cb3) f84Var;
            cb3Var.d(ey7Var.a, 0, 10, false);
            ey7Var.N(0);
            if (ey7Var.D() != 4801587) {
                break;
            }
            ey7Var.O(3);
            int z = ey7Var.z();
            i += z + 10;
            cb3Var.a(z, false);
        }
        cb3Var.f = 0;
        cb3Var.a(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            cb3Var.d(ey7Var.a, 0, 6, false);
            ey7Var.N(0);
            if (ey7Var.H() != 2935) {
                cb3Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                cb3Var.a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = ey7Var.a;
                if (bArr.length < 6) {
                    a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    a = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) << 1;
                } else {
                    byte b = bArr[4];
                    a = ud3.a((b & 192) >> 6, b & 63);
                }
                if (a == -1) {
                    break;
                }
                cb3Var.a(a - 6, false);
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
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.a.h(g84Var, new l6c(0, 1));
        g84Var.D();
        g84Var.m0(new qc0(-9223372036854775807L));
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
