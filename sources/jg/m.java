package jg;

import org.telegram.ui.er0;
public final class m implements q0.a {
    public final int f10089a;
    public final er0 f10090b;

    public m(er0 er0Var, int i10) {
        this.f10089a = i10;
        this.f10090b = er0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f10089a) {
            case 0:
                r0.X(this.f10090b, (Integer) obj);
                return;
            default:
                r0.a0(this.f10090b, (Integer) obj);
                return;
        }
    }
}
