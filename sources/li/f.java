package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import s4.b1;
public final class f extends AnimatorListenerAdapter {
    public final int f16100a = 1;
    public final View f16101b;
    public final b1 f16102c;
    public final m d;

    public f(m mVar, b1 b1Var, View view) {
        this.d = mVar;
        this.f16102c = b1Var;
        this.f16101b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16100a) {
            case 0:
                this.f16101b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16100a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f16101b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                m mVar = this.d;
                ArrayList arrayList = mVar.f46010y;
                b1 b1Var = this.f16102c;
                if (arrayList.remove(b1Var)) {
                    mVar.u(b1Var);
                    mVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f16101b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                m mVar2 = this.d;
                ArrayList arrayList2 = mVar2.A;
                b1 b1Var2 = this.f16102c;
                if (arrayList2.remove(b1Var2)) {
                    mVar2.d(b1Var2);
                    mVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16100a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(m mVar, View view, b1 b1Var) {
        this.d = mVar;
        this.f16101b = view;
        this.f16102c = b1Var;
    }
}
