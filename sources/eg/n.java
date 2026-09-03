package eg;

import org.telegram.ui.mt0;
public final class n implements q0.a {
    public final int f5375a;
    public final mt0 f5376b;

    public n(mt0 mt0Var, int i10) {
        this.f5375a = i10;
        this.f5376b = mt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f5375a) {
            case 0:
                c1.Z(this.f5376b, (Integer) obj);
                return;
            default:
                c1.c0(this.f5376b, (Integer) obj);
                return;
        }
    }
}
