package lh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr0;
public final class o2 implements xd.b, Utilities.Callback2Return {
    public final pr0 f12875a;

    public o2(pr0 pr0Var) {
        this.f12875a = pr0Var;
    }

    @Override
    public void L(int i10, float f10, float f11, xd.c cVar) {
        this.f12875a.l();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        pr0 pr0Var = this.f12875a;
        pr0Var.i();
        if (((Integer) obj).intValue() == -1) {
            pr0Var.h(null, new j2(pr0Var, 0));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void z(float f10, int i10) {
    }
}
