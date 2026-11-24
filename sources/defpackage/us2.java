package defpackage;

import java.util.function.IntSupplier;
public final class us2 extends ns2 {
    public int d;
    public IntSupplier e;
    public int f;
    public int g;

    public final vs2 u(bt2 bt2Var) {
        boolean z;
        zo9 zo9Var;
        IntSupplier intSupplier = this.e;
        if (intSupplier != null) {
            zo9Var = intSupplier;
        } else {
            int i = this.d;
            if (i >= this.f && i <= this.g) {
                z = true;
            } else {
                z = false;
            }
            r(z, Integer.valueOf(i));
            zo9Var = new zo9(this.d);
        }
        vs2 vs2Var = new vs2(s(), zo9Var, this.f, this.g, this.a);
        q(bt2Var, vs2Var);
        return vs2Var;
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
        u36.j(b10.g(i, i2, "range ", ".."));
    }
}
