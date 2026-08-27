package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class l2 extends AnimatorListenerAdapter {

    public final int f13610a;

    public final View f13611b;

    public l2(int i10, View view) {
        this.f13610a = i10;
        this.f13611b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13610a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f13611b);
                break;
            default:
                AndroidUtilities.removeFromParent(this.f13611b);
                break;
        }
    }
}
