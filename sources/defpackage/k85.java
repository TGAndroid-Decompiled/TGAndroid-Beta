package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class k85 extends m8 {
    public final g95 o;

    public k85(g95 g95Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = g95Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        g95 g95Var = this.o;
        if (g95Var.U4 != this) {
            return;
        }
        g95Var.U4 = null;
        AnimatorSet animatorSet = g95Var.T4;
        if (animatorSet != null) {
            animatorSet.cancel();
            g95Var.T4 = null;
        }
        g95Var.R1.X = true;
        g95Var.T4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(g95Var.L4, so.b, 0));
        g95Var.T4.playTogether(arrayList);
        g95Var.T4.setDuration(220L);
        g95Var.T4.addListener(new kh2(this, (byte) 29));
        g95Var.T4.start();
    }
}
