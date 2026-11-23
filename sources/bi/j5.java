package bi;

import org.telegram.messenger.s10;
import org.telegram.ui.Components.gq0;
public final class j5 implements te.b, s10 {
    public final gq0 f3754a;

    public j5(gq0 gq0Var) {
        this.f3754a = gq0Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f3754a.l();
    }

    @Override
    public Object g(Number number, Object obj) {
        Integer num = (Integer) obj;
        gq0 gq0Var = this.f3754a;
        gq0Var.i();
        if (((Integer) number).intValue() == -1) {
            gq0Var.h(null, new k5(gq0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void D(float f10, int i7) {
    }
}
