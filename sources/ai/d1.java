package ai;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.wm;
public final class d1 extends ChatActivityEnterView {
    public final i1 f560u5;

    public d1(i1 i1Var, Activity activity, c1 c1Var) {
        super(activity, c1Var, null, false, null);
        this.f560u5 = i1Var;
    }

    @Override
    public final void e0(Menu menu) {
        wm.A8(menu, null, false, false, false, false);
    }

    @Override
    public final void z0(float f10) {
        i1 i1Var = this.f560u5;
        i1Var.f695n1.setInputBubbleHeight(f10);
        i1Var.I0();
    }
}
