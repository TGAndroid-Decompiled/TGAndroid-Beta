package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j3 extends AnimatorListenerAdapter {
    public final int f3161a;
    public final View f3162b;

    public j3(int i10, View view) {
        this.f3161a = i10;
        this.f3162b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3161a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f3162b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f3162b);
                return;
        }
    }
}
