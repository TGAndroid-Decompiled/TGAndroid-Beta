package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class l2 extends AnimatorListenerAdapter {
    public final int f15544a;
    public final View f15545b;

    public l2(int i10, View view) {
        this.f15544a = i10;
        this.f15545b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15544a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f15545b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f15545b);
                return;
        }
    }
}
