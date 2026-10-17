package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s2 extends AnimatorListenerAdapter {
    public final int f5955a;
    public final View f5956b;

    public s2(int i10, View view) {
        this.f5955a = i10;
        this.f5956b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5955a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5956b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f5956b);
                return;
        }
    }
}
