package defpackage;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class bw4 extends ChatActivityEnterView {
    public final fw4 A7;

    public bw4(fw4 fw4Var, Activity activity, aw4 aw4Var) {
        super(activity, aw4Var, null, false, null);
        this.A7 = fw4Var;
    }

    @Override
    public final void B0(Menu menu) {
        yv1.E6(menu, null, false, false, false, false);
    }

    @Override
    public final void c1(float f) {
        fw4 fw4Var = this.A7;
        fw4Var.p1.setInputBubbleHeight(f);
        fw4Var.D0();
    }
}
