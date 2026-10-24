package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.t1;
import s4.b1;
public final class i extends AnimatorListenerAdapter {
    public final b1 f16176a;
    public final int f16177b;
    public final View f16178c;
    public final m d;

    public i(m mVar, b1 b1Var, int i10, View view) {
        this.d = mVar;
        this.f16176a = b1Var;
        this.f16177b = i10;
        this.f16178c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f16177b != 0) {
            this.f16178c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        b1 b1Var = this.f16176a;
        View view = b1Var.f46342a;
        m mVar = this.d;
        mVar.X(view);
        View view2 = b1Var.f46342a;
        if (view2 instanceof t1) {
            t1 t1Var = (t1) view2;
            if (t1Var.f23392fd) {
                t1Var.f23392fd = false;
                t1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (mVar.f46415z.remove(b1Var)) {
            mVar.v(b1Var);
            mVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
