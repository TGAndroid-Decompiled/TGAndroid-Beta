package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.u1;
import s4.c1;
public final class j extends AnimatorListenerAdapter {
    public final c1 f14204a;
    public final int f14205b;
    public final View f14206c;
    public final n d;

    public j(n nVar, c1 c1Var, int i10, View view) {
        this.d = nVar;
        this.f14204a = c1Var;
        this.f14205b = i10;
        this.f14206c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f14205b != 0) {
            this.f14206c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        c1 c1Var = this.f14204a;
        View view = c1Var.f46531a;
        n nVar = this.d;
        nVar.X(view);
        View view2 = c1Var.f46531a;
        if (view2 instanceof u1) {
            u1 u1Var = (u1) view2;
            if (u1Var.f23207fd) {
                u1Var.f23207fd = false;
                u1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (nVar.f46606z.remove(c1Var)) {
            nVar.v(c1Var);
            nVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
