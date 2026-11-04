package ai;

import org.telegram.messenger.o10;
import org.telegram.ui.Components.vp0;
public final class j3 implements qe.b, o10 {
    public final vp0 f750a;

    public j3(vp0 vp0Var) {
        this.f750a = vp0Var;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.f750a.l();
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        vp0 vp0Var = this.f750a;
        vp0Var.i();
        if (((Integer) number).intValue() == -1) {
            vp0Var.h(null, new l3(vp0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void F(float f10, int i3) {
    }
}
