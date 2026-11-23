package bi;

import android.app.Activity;
import android.view.Menu;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.bn;
public final class f1 extends ChatActivityEnterView {
    public final k1 f3616t7;

    public f1(k1 k1Var, Activity activity, e1 e1Var) {
        super(activity, e1Var, null, false, null);
        this.f3616t7 = k1Var;
    }

    @Override
    public final void C0(Menu menu) {
        bn.C8(menu, null, false, false, false, false);
    }

    @Override
    public final void b1(float f10) {
        k1 k1Var = this.f3616t7;
        k1Var.f3774q1.setInputBubbleHeight(f10);
        k1Var.J0();
    }
}
