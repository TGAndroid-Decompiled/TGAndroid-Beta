package defpackage;

import java.util.List;
public final class kb implements j74 {
    public final int a;
    public final xu7 d;
    public final qd1 e;
    public l74 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final lb b = new lb(0, null, "audio/mp4a-latm", true);
    public final xu7 c = new xu7(2048);
    public int i = -1;
    public long h = -1;

    public kb(int i) {
        this.a = i;
        xu7 xu7Var = new xu7(10);
        this.d = xu7Var;
        byte[] bArr = xu7Var.a;
        this.e = new qd1(bArr.length, bArr);
    }

    @Override
    public final int b(defpackage.k74 r20, defpackage.m11 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb.b(k74, m11):int");
    }

    @Override
    public final boolean c(k74 k74Var) {
        ja3 ja3Var = (ja3) k74Var;
        int g = g(ja3Var);
        int i = g;
        int i2 = 0;
        int i3 = 0;
        do {
            xu7 xu7Var = this.d;
            ja3Var.d(xu7Var.a, 0, 2, false);
            xu7Var.N(0);
            if ((xu7Var.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                ja3Var.d(xu7Var.a, 0, 4, false);
                qd1 qd1Var = this.e;
                qd1Var.l(14);
                int f = qd1Var.f(13);
                if (f <= 6) {
                    i++;
                    ja3Var.f = 0;
                    ja3Var.a(i, false);
                } else {
                    ja3Var.a(f - 6, false);
                    i3 += f;
                }
            } else {
                i++;
                ja3Var.f = 0;
                ja3Var.a(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - g < 8192);
        return false;
    }

    @Override
    public final void d(long j, long j2) {
        this.k = false;
        this.b.d();
        this.g = j2;
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        this.f = l74Var;
        this.b.h(l74Var, new l2c(0, 1));
        l74Var.z();
    }

    public final int g(ja3 ja3Var) {
        int i = 0;
        while (true) {
            xu7 xu7Var = this.d;
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
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
