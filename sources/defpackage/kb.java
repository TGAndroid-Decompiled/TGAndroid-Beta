package defpackage;

import java.util.List;
public final class kb implements s84 {
    public final int a;
    public final yw7 d;
    public final ye1 e;
    public u84 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final lb b = new lb(0, null, "audio/mp4a-latm", true);
    public final yw7 c = new yw7(2048);
    public int i = -1;
    public long h = -1;

    public kb(int i) {
        this.a = i;
        yw7 yw7Var = new yw7(10);
        this.d = yw7Var;
        byte[] bArr = yw7Var.a;
        this.e = new ye1(bArr.length, bArr);
    }

    @Override
    public final int b(defpackage.t84 r20, defpackage.u21 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb.b(t84, u21):int");
    }

    @Override
    public final boolean c(t84 t84Var) {
        vb3 vb3Var = (vb3) t84Var;
        int g = g(vb3Var);
        int i = g;
        int i2 = 0;
        int i3 = 0;
        do {
            yw7 yw7Var = this.d;
            vb3Var.d(yw7Var.a, 0, 2, false);
            yw7Var.N(0);
            if ((yw7Var.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                vb3Var.d(yw7Var.a, 0, 4, false);
                ye1 ye1Var = this.e;
                ye1Var.l(14);
                int f = ye1Var.f(13);
                if (f <= 6) {
                    i++;
                    vb3Var.f = 0;
                    vb3Var.a(i, false);
                } else {
                    vb3Var.a(f - 6, false);
                    i3 += f;
                }
            } else {
                i++;
                vb3Var.f = 0;
                vb3Var.a(i, false);
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
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        this.f = u84Var;
        this.b.h(u84Var, new l4c(0, 1));
        u84Var.B();
    }

    public final int g(vb3 vb3Var) {
        int i = 0;
        while (true) {
            yw7 yw7Var = this.d;
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
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
