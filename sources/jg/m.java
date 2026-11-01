package jg;

import org.telegram.ui.cr0;
public final class m implements q0.a {
    public final int f10090a;
    public final cr0 f10091b;

    public m(cr0 cr0Var, int i10) {
        this.f10090a = i10;
        this.f10091b = cr0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f10090a) {
            case 0:
                r0.X(this.f10091b, (Integer) obj);
                return;
            default:
                r0.a0(this.f10091b, (Integer) obj);
                return;
        }
    }
}
