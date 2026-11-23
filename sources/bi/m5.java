package bi;

import org.telegram.messenger.s10;
import org.telegram.ui.Components.gq0;
public final class m5 implements te.b, s10 {
    public final gq0 f3846a;

    public m5(gq0 gq0Var) {
        this.f3846a = gq0Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f3846a.l();
    }

    @Override
    public Object g(Number number, Object obj) {
        Integer num = (Integer) obj;
        gq0 gq0Var = this.f3846a;
        gq0Var.i();
        if (((Integer) number).intValue() == -1) {
            gq0Var.h(null, new n5(gq0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void D(float f10, int i7) {
    }
}
