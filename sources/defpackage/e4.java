package defpackage;

import java.util.List;
public final class e4 implements j74 {
    public final f4 a = new f4("audio/ac3");
    public final xu7 b = new xu7(2786);
    public boolean c;

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        xu7 xu7Var = this.b;
        int read = ((ja3) k74Var).read(xu7Var.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        xu7Var.N(0);
        xu7Var.M(read);
        boolean z = this.c;
        f4 f4Var = this.a;
        if (!z) {
            f4Var.o = 0L;
            this.c = true;
        }
        f4Var.b(xu7Var);
        return 0;
    }

    @Override
    public final boolean c(k74 k74Var) {
        ja3 ja3Var;
        int a;
        xu7 xu7Var = new xu7(10);
        int i = 0;
        while (true) {
            ja3Var = (ja3) k74Var;
            ja3Var.d(xu7Var.a, 0, 10, false);
            xu7Var.N(0);
            if (xu7Var.D() != 4801587) {
                break;
            }
            xu7Var.O(3);
            int z = xu7Var.z();
            i += z + 10;
            ja3Var.a(z, false);
        }
        ja3Var.f = 0;
        ja3Var.a(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            ja3Var.d(xu7Var.a, 0, 6, false);
            xu7Var.N(0);
            if (xu7Var.H() != 2935) {
                ja3Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                ja3Var.a(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = xu7Var.a;
                if (bArr.length < 6) {
                    a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    a = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) << 1;
                } else {
                    byte b = bArr[4];
                    a = cd3.a((b & 192) >> 6, b & 63);
                }
                if (a == -1) {
                    break;
                }
                ja3Var.a(a - 6, false);
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
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.a.h(l74Var, new l2c(0, 1));
        l74Var.B();
        l74Var.f0(new oc0(-9223372036854775807L));
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
