package defpackage;

import java.util.function.IntSupplier;
public final class jr2 extends cr2 {
    public int d;
    public IntSupplier e;
    public int f;
    public int g;

    public final kr2 u(qr2 qr2Var) {
        boolean z;
        ym9 ym9Var;
        IntSupplier intSupplier = this.e;
        if (intSupplier != null) {
            ym9Var = intSupplier;
        } else {
            int i = this.d;
            if (i >= this.f && i <= this.g) {
                z = true;
            } else {
                z = false;
            }
            r(z, Integer.valueOf(i));
            ym9Var = new ym9(this.d);
        }
        kr2 kr2Var = new kr2(s(), ym9Var, this.f, this.g, this.a);
        q(qr2Var, kr2Var);
        return kr2Var;
    }

    public final void v(int i) {
        this.d = i;
        this.e = null;
    }

    public final void w(int i, int i2) {
        if (i <= i2) {
            this.f = i;
            this.g = i2;
            return;
        }
        w26.j(b00.g(i, i2, "range ", ".."));
    }
}
