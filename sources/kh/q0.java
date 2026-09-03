package kh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.zn;
public final class q0 extends ChatActivityEnterView {
    public final u0 f10871k5;

    public q0(u0 u0Var, Activity activity, p0 p0Var) {
        super(activity, p0Var, null, false, null);
        this.f10871k5 = u0Var;
    }

    @Override
    public final void A0(float f10) {
        u0 u0Var = this.f10871k5;
        u0Var.f10945f.setInputBubbleHeight(f10);
        u0Var.o();
    }

    @Override
    public final void h0(Menu menu) {
        zn.k8(menu, null, false, false, false, false);
    }
}
