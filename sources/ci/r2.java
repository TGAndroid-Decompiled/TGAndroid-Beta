package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r2 extends AnimatorListenerAdapter {
    public final int f5852a;
    public final View f5853b;

    public r2(int i10, View view) {
        this.f5852a = i10;
        this.f5853b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5852a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5853b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f5853b);
                return;
        }
    }
}
