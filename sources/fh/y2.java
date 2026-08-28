package fh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vq0;
public final class y2 implements td.b, Utilities.Callback2Return {
    public final vq0 f6879a;

    public y2(vq0 vq0Var) {
        this.f6879a = vq0Var;
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        this.f6879a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        vq0 vq0Var = this.f6879a;
        vq0Var.i();
        if (((Integer) obj).intValue() == -1) {
            vq0Var.h(null, new s2(vq0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void B(float f10, int i9) {
    }
}
