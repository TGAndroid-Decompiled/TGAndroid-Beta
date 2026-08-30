package dg;

import org.telegram.ui.ft0;
public final class o implements q0.a {
    public final int f4685a;
    public final ft0 f4686b;

    public o(ft0 ft0Var, int i10) {
        this.f4685a = i10;
        this.f4686b = ft0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f4685a) {
            case 0:
                e1.Z(this.f4686b, (Integer) obj);
                return;
            default:
                e1.c0(this.f4686b, (Integer) obj);
                return;
        }
    }
}
