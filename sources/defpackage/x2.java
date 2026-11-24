package defpackage;

import java.util.List;
import java.util.RandomAccess;
public final class x2 extends y2 implements RandomAccess {
    public final y2 a;
    public final int b;
    public final int c;

    public x2(y2 y2Var, int i, int i2) {
        this.a = y2Var;
        this.b = i;
        bnd.a(i, i2, y2Var.h());
        this.c = i2 - i;
    }

    @Override
    public final Object get(int i) {
        int i2 = this.c;
        if (i >= 0 && i < i2) {
            return this.a.get(this.b + i);
        }
        wa3.i(b10.g(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override
    public final int h() {
        return this.c;
    }

    @Override
    public final List subList(int i, int i2) {
        bnd.a(i, i2, this.c);
        int i3 = this.b;
        return new x2(this.a, i + i3, i3 + i2);
    }
}
