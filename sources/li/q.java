package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;
import r0.l1;
public final class q implements v10, r0.m {
    public final s f19988a;

    @Override
    public l1 P0(View view, l1 l1Var) {
        this.f19988a.a0(l1Var.f56258a.f(519).d);
        return l1.f56257b;
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        s.Z(this.f19988a, (l41) obj);
    }
}
