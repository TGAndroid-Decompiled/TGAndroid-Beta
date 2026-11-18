package bi;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.bn;
public final class b1 extends ChatActivityEnterView {
    public final g1 f3430o7;

    public b1(g1 g1Var, Activity activity, a1 a1Var) {
        super(activity, a1Var, null, false, null);
        this.f3430o7 = g1Var;
    }

    @Override
    public final void X0(float f10) {
        g1 g1Var = this.f3430o7;
        g1Var.f3593q1.setInputBubbleHeight(f10);
        g1Var.J0();
    }

    @Override
    public final void y0(Menu menu) {
        bn.C8(menu, null, false, false, false, false);
    }
}
