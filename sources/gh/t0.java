package gh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.rn;

public final class t0 extends ChatActivityEnterView {

    public final x0 f7531j5;

    public t0(x0 x0Var, Activity activity, s0 s0Var) {
        super(activity, s0Var, null, false, null);
        this.f7531j5 = x0Var;
    }

    @Override
    public final void A0(float f10) {
        x0 x0Var = this.f7531j5;
        x0Var.f7617f.setInputBubbleHeight(f10);
        x0Var.p();
    }

    @Override
    public final void h0(Menu menu) {
        rn.k8(menu, null, false, false, false, false);
    }
}
