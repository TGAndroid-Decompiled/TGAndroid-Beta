package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x3 extends AnimatorListenerAdapter {
    public final int f1901a;
    public final View f1902b;

    public x3(int i10, View view) {
        this.f1901a = i10;
        this.f1902b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1901a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f1902b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f1902b);
                return;
        }
    }
}
