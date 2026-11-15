package bi;

import org.telegram.messenger.t10;
import org.telegram.ui.Components.wp0;
public final class z2 implements te.b, t10 {
    public final wp0 f4025a;

    public z2(wp0 wp0Var) {
        this.f4025a = wp0Var;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.f4025a.l();
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        wp0 wp0Var = this.f4025a;
        wp0Var.i();
        if (((Integer) number).intValue() == -1) {
            wp0Var.h(null, new a3(wp0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void E(float f10, int i7) {
    }
}
