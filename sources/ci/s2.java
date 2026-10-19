package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s2 extends AnimatorListenerAdapter {
    public final int f5953a;
    public final View f5954b;

    public s2(int i10, View view) {
        this.f5953a = i10;
        this.f5954b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5953a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f5954b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f5954b);
                return;
        }
    }
}
