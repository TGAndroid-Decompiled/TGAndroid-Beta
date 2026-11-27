package defpackage;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class dw4 extends ChatActivityEnterView {
    public final hw4 Y7;

    public dw4(hw4 hw4Var, Activity activity, cw4 cw4Var) {
        super(activity, cw4Var, null, false, null);
        this.Y7 = hw4Var;
    }

    @Override
    public final void F0(Menu menu) {
        zu1.E6(menu, null, false, false, false, false);
    }

    @Override
    public final void f1(float f) {
        hw4 hw4Var = this.Y7;
        hw4Var.p1.setInputBubbleHeight(f);
        hw4Var.E0();
    }
}
