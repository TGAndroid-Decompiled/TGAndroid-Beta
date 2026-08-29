package ih;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr0;
public final class p2 implements vd.b, Utilities.Callback2Return {
    public final gr0 f9323a;

    public p2(gr0 gr0Var) {
        this.f9323a = gr0Var;
    }

    @Override
    public void N(int i10, float f9, float f10, vd.c cVar) {
        this.f9323a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        gr0 gr0Var = this.f9323a;
        gr0Var.i();
        if (((Integer) obj).intValue() == -1) {
            gr0Var.h(null, new k2(gr0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void z(float f9, int i10) {
    }
}
