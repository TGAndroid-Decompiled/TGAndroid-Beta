package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.u1;
import s4.c1;
public final class j extends AnimatorListenerAdapter {
    public final c1 f13066a;
    public final int f13067b;
    public final View f13068c;
    public final n d;

    public j(n nVar, c1 c1Var, int i10, View view) {
        this.d = nVar;
        this.f13066a = c1Var;
        this.f13067b = i10;
        this.f13068c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f13067b != 0) {
            this.f13068c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        c1 c1Var = this.f13066a;
        View view = c1Var.f43005a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = c1Var.f43005a;
        if (view2 instanceof u1) {
            u1 u1Var = (u1) view2;
            if (u1Var.f21343fd) {
                u1Var.f21343fd = false;
                u1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f43072z.remove(c1Var)) {
            nVar.v(c1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
