package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;
import s4.c1;
public final class j extends AnimatorListenerAdapter {
    public final c1 f10663a;
    public final int f10664b;
    public final View f10665c;
    public final n d;

    public j(n nVar, c1 c1Var, int i10, View view) {
        this.d = nVar;
        this.f10663a = c1Var;
        this.f10664b = i10;
        this.f10665c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f10664b != 0) {
            this.f10665c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        c1 c1Var = this.f10663a;
        View view = c1Var.f41610a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = c1Var.f41610a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.f20137fd) {
                t1Var.f20137fd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f41677z.remove(c1Var)) {
            nVar.v(c1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
