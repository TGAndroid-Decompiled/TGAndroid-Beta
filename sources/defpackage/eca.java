package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class eca extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final tca c;

    public eca(tca tcaVar, boolean z, byte b) {
        this.a = b;
        this.c = tcaVar;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        tca tcaVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet[] animatorSetArr = tcaVar.O1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                if (animator.equals(tcaVar.y1)) {
                    tcaVar.y1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        tca tcaVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet[] animatorSetArr = tcaVar.O1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        tcaVar.N1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                FrameLayout frameLayout = tcaVar.q1;
                if (animator.equals(tcaVar.y1)) {
                    if (!z) {
                        tcaVar.m1.setVisibility(4);
                        FrameLayout frameLayout2 = tcaVar.X1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        tcaVar.p1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    tcaVar.y1 = null;
                    return;
                }
                return;
        }
    }
}
