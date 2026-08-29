package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k2 extends AnimatorListenerAdapter {
    public final int f15819a;
    public final View f15820b;

    public k2(int i10, View view) {
        this.f15819a = i10;
        this.f15820b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15819a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f15820b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f15820b);
                return;
        }
    }
}
