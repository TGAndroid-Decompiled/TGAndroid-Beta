package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.u1;
import s4.d1;
public final class j extends AnimatorListenerAdapter {
    public final d1 f14237a;
    public final int f14238b;
    public final View f14239c;
    public final n d;

    public j(n nVar, d1 d1Var, int i10, View view) {
        this.d = nVar;
        this.f14237a = d1Var;
        this.f14238b = i10;
        this.f14239c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f14238b != 0) {
            this.f14239c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        d1 d1Var = this.f14237a;
        View view = d1Var.f47889a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = d1Var.f47889a;
        if (view2 instanceof u1) {
            u1 u1Var = (u1) view2;
            if (u1Var.f22964fd) {
                u1Var.f22964fd = false;
                u1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f47959z.remove(d1Var)) {
            nVar.v(d1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
