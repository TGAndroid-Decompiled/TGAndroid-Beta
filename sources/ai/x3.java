package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x3 extends AnimatorListenerAdapter {
    public final int f1903a;
    public final View f1904b;

    public x3(int i10, View view) {
        this.f1903a = i10;
        this.f1904b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1903a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f1904b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f1904b);
                return;
        }
    }
}
