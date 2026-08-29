package ih;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.tn;
public final class r0 extends ChatActivityEnterView {
    public final v0 f9350j5;

    public r0(v0 v0Var, Activity activity, q0 q0Var) {
        super(activity, q0Var, null, false, null);
        this.f9350j5 = v0Var;
    }

    @Override
    public final void A0(float f9) {
        v0 v0Var = this.f9350j5;
        v0Var.f9427f.setInputBubbleHeight(f9);
        v0Var.o();
    }

    @Override
    public final void h0(Menu menu) {
        tn.k8(menu, null, false, false, false, false);
    }
}
