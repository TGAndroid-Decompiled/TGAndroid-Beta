package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.s1;
import s4.e1;
public final class i extends AnimatorListenerAdapter {
    public final e1 f18524a;
    public final int f18525b;
    public final View f18526c;
    public final m d;

    public i(m mVar, e1 e1Var, int i10, View view) {
        this.d = mVar;
        this.f18524a = e1Var;
        this.f18525b = i10;
        this.f18526c = view;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        if (this.f18525b != 0) {
            this.f18526c.setTranslationY(0.0f);
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        animator.removeAllListeners();
        e1 e1Var = this.f18524a;
        View view = e1Var.f47773a;
        m mVar = this.d;
        mVar.X(view);
        View view2 = e1Var.f47773a;
        if (view2 instanceof s1) {
            s1 s1Var = (s1) view2;
            if (s1Var.f25100fd) {
                s1Var.f25100fd = false;
                s1Var.setVisibility(0);
            }
            MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
            if (currentMessagesGroup != null) {
                currentMessagesGroup.transitionParams.reset();
            }
        }
        if (mVar.f47832z.remove(e1Var)) {
            mVar.v(e1Var);
            mVar.G();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        this.d.getClass();
    }
}
