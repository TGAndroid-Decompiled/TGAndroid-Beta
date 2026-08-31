package eg;

import org.telegram.ui.ht0;
public final class n implements q0.a {
    public final int f5375a;
    public final ht0 f5376b;

    public n(ht0 ht0Var, int i10) {
        this.f5375a = i10;
        this.f5376b = ht0Var;
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
