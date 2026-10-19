package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.u1;
import s4.b1;
public final class i extends AnimatorListenerAdapter {
    public final b1 f16115a;
    public final int f16116b;
    public final View f16117c;
    public final m d;

    public i(m mVar, b1 b1Var, int i10, View view) {
        this.d = mVar;
        this.f16115a = b1Var;
        this.f16116b = i10;
        this.f16117c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f16116b != 0) {
            this.f16117c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        b1 b1Var = this.f16115a;
        View view = b1Var.f45910a;
        m mVar = this.d;
        mVar.X(view);
        View view2 = b1Var.f45910a;
        if (view2 instanceof u1) {
            u1 u1Var = (u1) view2;
            if (u1Var.f23299fd) {
                u1Var.f23299fd = false;
                u1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = u1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (mVar.f45983z.remove(b1Var)) {
            mVar.v(b1Var);
            mVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
