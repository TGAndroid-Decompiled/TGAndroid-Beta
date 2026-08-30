package kh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.or0;
public final class p2 implements xd.b, Utilities.Callback2Return {
    public final or0 f10746a;

    public p2(or0 or0Var) {
        this.f10746a = or0Var;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.f10746a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        or0 or0Var = this.f10746a;
        or0Var.i();
        if (((Integer) obj).intValue() == -1) {
            or0Var.h(null, new k2(or0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
