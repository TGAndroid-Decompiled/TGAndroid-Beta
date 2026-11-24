package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.ui.p;
public final class p18 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final p c;

    public p18(p pVar, boolean z, byte b) {
        this.a = b;
        this.c = pVar;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        p pVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = pVar.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    pVar.w = null;
                    return;
                }
                return;
            default:
                AnimatorSet animatorSet2 = pVar.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pVar.w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        p pVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = pVar.w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        pVar.r.setVisibility(4);
                        return;
                    } else {
                        pVar.n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                AnimatorSet animatorSet2 = pVar.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        pVar.s.setVisibility(4);
                        return;
                    } else {
                        pVar.V.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
