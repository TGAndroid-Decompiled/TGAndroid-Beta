package defpackage;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zt4 extends ChatActivityEnterView {
    public final du4 s7;

    public zt4(du4 du4Var, Activity activity, yt4 yt4Var) {
        super(activity, yt4Var, null, false, null);
        this.s7 = du4Var;
    }

    @Override
    public final void B0(Menu menu) {
        mu1.x6(menu, null, false, false, false, false);
    }

    @Override
    public final void a1(float f) {
        du4 du4Var = this.s7;
        du4Var.p1.setInputBubbleHeight(f);
        du4Var.D0();
    }
}
