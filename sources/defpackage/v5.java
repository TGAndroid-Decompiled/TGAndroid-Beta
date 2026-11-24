package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.a;
public final class v5 extends AnimatorListenerAdapter {
    public final byte a;
    public final a b;

    public v5(a aVar, byte b) {
        this.a = b;
        this.b = aVar;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                a aVar = this.b;
                AnimatorSet animatorSet = aVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aVar.Q = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a aVar = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = aVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    aVar.Q = null;
                    aVar.G.setVisibility(4);
                    return;
                }
                return;
            default:
                jia jiaVar = aVar.n[1];
                if (jiaVar != null && jiaVar.getParent() != null) {
                    ((ViewGroup) aVar.n[1].getParent()).removeView(aVar.n[1]);
                }
                aVar.P0.F(aVar.n[1]);
                aVar.n[1] = null;
                aVar.j1 = false;
                Object[] objArr = aVar.h0;
                aVar.O((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) aVar.h0[2]);
                return;
        }
    }
}
