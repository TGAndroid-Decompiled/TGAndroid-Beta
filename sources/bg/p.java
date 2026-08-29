package bg;

import org.telegram.ui.ws0;
public final class p implements q0.a {
    public final int f2447a;
    public final ws0 f2448b;

    public p(ws0 ws0Var, int i10) {
        this.f2447a = i10;
        this.f2448b = ws0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f2447a) {
            case 0:
                g1.Z(this.f2448b, (Integer) obj);
                return;
            default:
                g1.c0(this.f2448b, (Integer) obj);
                return;
        }
    }
}
