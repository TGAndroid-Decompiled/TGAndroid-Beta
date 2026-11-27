package defpackage;

import java.util.List;
public final class lb implements e84 {
    public final int a;
    public final ey7 d;
    public final zd1 e;
    public g84 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final mb b = new mb(0, null, "audio/mp4a-latm", true);
    public final ey7 c = new ey7(2048);
    public int i = -1;
    public long h = -1;

    public lb(int i) {
        this.a = i;
        ey7 ey7Var = new ey7(10);
        this.d = ey7Var;
        byte[] bArr = ey7Var.a;
        this.e = new zd1(bArr.length, bArr);
    }

    @Override
    public final int b(defpackage.f84 r20, defpackage.v11 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb.b(f84, v11):int");
    }

    @Override
    public final boolean c(f84 f84Var) {
        cb3 cb3Var = (cb3) f84Var;
        int g = g(cb3Var);
        int i = g;
        int i2 = 0;
        int i3 = 0;
        do {
            ey7 ey7Var = this.d;
            cb3Var.d(ey7Var.a, 0, 2, false);
            ey7Var.N(0);
            if ((ey7Var.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                cb3Var.d(ey7Var.a, 0, 4, false);
                zd1 zd1Var = this.e;
                zd1Var.l(14);
                int f = zd1Var.f(13);
                if (f <= 6) {
                    i++;
                    cb3Var.f = 0;
                    cb3Var.a(i, false);
                } else {
                    cb3Var.a(f - 6, false);
                    i3 += f;
                }
            } else {
                i++;
                cb3Var.f = 0;
                cb3Var.a(i, false);
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
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        this.f = g84Var;
        this.b.h(g84Var, new l6c(0, 1));
        g84Var.D();
    }

    public final int g(cb3 cb3Var) {
        int i = 0;
        while (true) {
            ey7 ey7Var = this.d;
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
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
