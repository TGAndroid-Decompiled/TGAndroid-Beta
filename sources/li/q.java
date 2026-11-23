package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;
import r0.l1;
public final class q implements w10, r0.m {
    public final s f19985a;

    @Override
    public l1 P0(View view, l1 l1Var) {
        this.f19985a.a0(l1Var.f56268a.f(519).d);
        return l1.f56267b;
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        s.Z(this.f19985a, (o41) obj);
    }
}
