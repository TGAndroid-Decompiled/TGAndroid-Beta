package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;
public final class vda extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final kea c;

    public vda(kea keaVar, boolean z, byte b) {
        this.a = b;
        this.c = keaVar;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        kea keaVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet[] animatorSetArr = keaVar.O1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                if (animator.equals(keaVar.y1)) {
                    keaVar.y1 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        kea keaVar = this.c;
        switch (b) {
            case 0:
                AnimatorSet[] animatorSetArr = keaVar.O1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        keaVar.N1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            default:
                FrameLayout frameLayout = keaVar.q1;
                if (animator.equals(keaVar.y1)) {
                    if (!z) {
                        keaVar.m1.setVisibility(4);
                        FrameLayout frameLayout2 = keaVar.X1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        keaVar.p1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    keaVar.y1 = null;
                    return;
                }
                return;
        }
    }
}
