package fh;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.qn;
public final class v0 extends ChatActivityEnterView {
    public final z0 f6811j5;

    public v0(z0 z0Var, Activity activity, u0 u0Var) {
        super(activity, u0Var, null, false, null);
        this.f6811j5 = z0Var;
    }

    @Override
    public final void g0(Menu menu) {
        qn.k8(menu, null, false, false, false, false);
    }

    @Override
    public final void z0(float f10) {
        z0 z0Var = this.f6811j5;
        z0Var.f6900f.setInputBubbleHeight(f10);
        z0Var.o();
    }
}
