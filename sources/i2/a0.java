package i2;

import b2.x1;
public final class a0 implements e2.m {
    public final int f10099a = 0;
    public final x1 f10100b;

    public a0(x1 x1Var) {
        this.f10100b = x1Var;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f10099a) {
            case 0:
                ((b2.z0) obj).onVideoSizeChanged(this.f10100b);
                return;
            default:
                x1 x1Var = this.f10100b;
                ((j2.b) obj).c(x1Var);
                int i10 = x1Var.f2045a;
                return;
        }
    }
}
