package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.u1;
import s4.b1;
public final class j extends AnimatorListenerAdapter {
    public final b1 f14323a;
    public final int f14324b;
    public final View f14325c;
    public final n d;

    public j(n nVar, b1 b1Var, int i10, View view) {
        this.d = nVar;
        this.f14323a = b1Var;
        this.f14324b = i10;
        this.f14325c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f14324b != 0) {
            this.f14325c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        b1 b1Var = this.f14323a;
        View view = b1Var.f44838a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = b1Var.f44838a;
        if (view2 instanceof u1) {
            u1 u1Var = (u1) view2;
            if (u1Var.f21929fd) {
                u1Var.f21929fd = false;
                u1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f44911z.remove(b1Var)) {
            nVar.v(b1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
