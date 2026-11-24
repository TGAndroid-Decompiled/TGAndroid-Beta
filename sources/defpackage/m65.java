package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class m65 extends m8 {
    public final h75 o;

    public m65(h75 h75Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = h75Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        h75 h75Var = this.o;
        if (h75Var.U4 != this) {
            return;
        }
        h75Var.U4 = null;
        AnimatorSet animatorSet = h75Var.T4;
        if (animatorSet != null) {
            animatorSet.cancel();
            h75Var.T4 = null;
        }
        h75Var.R1.X = true;
        h75Var.T4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(h75Var.L4, rn.b, 0));
        h75Var.T4.playTogether(arrayList);
        h75Var.T4.setDuration(220L);
        h75Var.T4.addListener(new im2(this, (byte) 27));
        h75Var.T4.start();
    }
}
