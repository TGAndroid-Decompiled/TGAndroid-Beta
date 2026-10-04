package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w3 extends AnimatorListenerAdapter {
    public final int f1797a;
    public final View f1798b;

    public w3(int i10, View view) {
        this.f1797a = i10;
        this.f1798b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1797a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f1798b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f1798b);
                return;
        }
    }
}
