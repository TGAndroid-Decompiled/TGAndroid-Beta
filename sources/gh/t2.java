package gh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wq0;

public final class t2 implements ud.b, Utilities.Callback2Return {

    public final wq0 f7532a;

    public t2(wq0 wq0Var) {
        this.f7532a = wq0Var;
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        this.f7532a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        wq0 wq0Var = this.f7532a;
        wq0Var.i();
        if (((Integer) obj).intValue() != -1) {
            return Boolean.FALSE;
        }
        wq0Var.h(null, new n2(wq0Var, 0));
        return Boolean.TRUE;
    }

    @Override
    public void A(float f10, int i10) {
    }
}
