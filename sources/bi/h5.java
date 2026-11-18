package bi;

import org.telegram.messenger.r10;
import org.telegram.ui.Components.eq0;
public final class h5 implements te.b, r10 {
    public final eq0 f3701a;

    public h5(eq0 eq0Var) {
        this.f3701a = eq0Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f3701a.l();
    }

    @Override
    public Object g(Number number, Object obj) {
        Integer num = (Integer) obj;
        eq0 eq0Var = this.f3701a;
        eq0Var.i();
        if (((Integer) number).intValue() == -1) {
            eq0Var.h(null, new i5(eq0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void D(float f10, int i7) {
    }
}
