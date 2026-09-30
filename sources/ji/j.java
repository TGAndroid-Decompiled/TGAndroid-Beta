package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.u1;
import s4.c1;
public final class j extends AnimatorListenerAdapter {
    public final c1 f13078a;
    public final int f13079b;
    public final View f13080c;
    public final n d;

    public j(n nVar, c1 c1Var, int i10, View view) {
        this.d = nVar;
        this.f13078a = c1Var;
        this.f13079b = i10;
        this.f13080c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f13079b != 0) {
            this.f13080c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        c1 c1Var = this.f13078a;
        View view = c1Var.f43068a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = c1Var.f43068a;
        if (view2 instanceof u1) {
            u1 u1Var = (u1) view2;
            if (u1Var.f21363fd) {
                u1Var.f21363fd = false;
                u1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f43135z.remove(c1Var)) {
            nVar.v(c1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
