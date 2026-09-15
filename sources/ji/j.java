package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;
import s4.c1;
public final class j extends AnimatorListenerAdapter {
    public final c1 f13071a;
    public final int f13072b;
    public final View f13073c;
    public final n d;

    public j(n nVar, c1 c1Var, int i10, View view) {
        this.d = nVar;
        this.f13071a = c1Var;
        this.f13072b = i10;
        this.f13073c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f13072b != 0) {
            this.f13073c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        c1 c1Var = this.f13071a;
        View view = c1Var.f42675a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = c1Var.f42675a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.f21055fd) {
                t1Var.f21055fd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f42742z.remove(c1Var)) {
            nVar.v(c1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
