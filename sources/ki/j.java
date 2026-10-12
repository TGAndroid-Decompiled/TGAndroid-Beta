package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.u1;
import s4.b1;
public final class j extends AnimatorListenerAdapter {
    public final b1 f14321a;
    public final int f14322b;
    public final View f14323c;
    public final n d;

    public j(n nVar, b1 b1Var, int i10, View view) {
        this.d = nVar;
        this.f14321a = b1Var;
        this.f14322b = i10;
        this.f14323c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f14322b != 0) {
            this.f14323c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        b1 b1Var = this.f14321a;
        View view = b1Var.f44838a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = b1Var.f44838a;
        if (view2 instanceof u1) {
            u1 u1Var = (u1) view2;
            if (u1Var.f22220fd) {
                u1Var.f22220fd = false;
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
