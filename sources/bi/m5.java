package bi;

import org.telegram.messenger.q10;
import org.telegram.ui.Components.fq0;
public final class m5 implements te.b, q10 {
    public final fq0 f3846a;

    public m5(fq0 fq0Var) {
        this.f3846a = fq0Var;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.f3846a.l();
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) obj;
        fq0 fq0Var = this.f3846a;
        fq0Var.i();
        if (((Integer) number).intValue() == -1) {
            fq0Var.h(null, new n5(fq0Var, 1));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public void G(float f10, int i7) {
    }
}
