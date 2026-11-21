package bi;

import org.telegram.messenger.r10;
import org.telegram.ui.Components.gq0;
public final class k5 implements te.b, r10 {
    public final gq0 f3793a;

    public k5(gq0 gq0Var) {
        this.f3793a = gq0Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f3793a.l();
    }

    @Override
    public Object g(Number number, Object obj) {
        Integer num = (Integer) obj;
        gq0 gq0Var = this.f3793a;
        gq0Var.i();
        if (((Integer) number).intValue() == -1) {
            gq0Var.h(null, new l5(gq0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void D(float f10, int i7) {
    }
}
