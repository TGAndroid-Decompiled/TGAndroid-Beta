package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class o85 extends n8 {
    public final j95 o;

    public o85(j95 j95Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = j95Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        j95 j95Var = this.o;
        if (j95Var.U4 != this) {
            return;
        }
        j95Var.U4 = null;
        AnimatorSet animatorSet = j95Var.T4;
        if (animatorSet != null) {
            animatorSet.cancel();
            j95Var.T4 = null;
        }
        j95Var.R1.X = true;
        j95Var.T4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(j95Var.L4, sn.b, 0));
        j95Var.T4.playTogether(arrayList);
        j95Var.T4.setDuration(220L);
        j95Var.T4.addListener(new cn2(this, (byte) 26));
        j95Var.T4.start();
    }
}
