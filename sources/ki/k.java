package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;
import s4.c1;
public final class k extends AnimatorListenerAdapter {
    public final c1 f15009a;
    public final int f15010b;
    public final View f15011c;
    public final o d;

    public k(o oVar, c1 c1Var, int i10, View view) {
        this.d = oVar;
        this.f15009a = c1Var;
        this.f15010b = i10;
        this.f15011c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f15010b != 0) {
            this.f15011c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        c1 c1Var = this.f15009a;
        View view = c1Var.f45738a;
        o oVar = this.d;
        oVar.X(view);
        View view2 = c1Var.f45738a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.f22939fd) {
                t1Var.f22939fd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (oVar.f45813z.remove(c1Var)) {
            oVar.v(c1Var);
            oVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
