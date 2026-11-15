package bi;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.an;
public final class b1 extends ChatActivityEnterView {
    public final f1 O6;

    public b1(f1 f1Var, Activity activity, a1 a1Var) {
        super(activity, a1Var, null, false, null);
        this.O6 = f1Var;
    }

    @Override
    public final void P0(float f10) {
        f1 f1Var = this.O6;
        f1Var.f3499q1.setInputBubbleHeight(f10);
        f1Var.I0();
    }

    @Override
    public final void q0(Menu menu) {
        an.C8(menu, null, false, false, false, false);
    }
}
