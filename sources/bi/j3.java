package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j3 extends AnimatorListenerAdapter {
    public final int f3134a;
    public final View f3135b;

    public j3(int i10, View view) {
        this.f3134a = i10;
        this.f3135b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3134a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f3135b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f3135b);
                return;
        }
    }
}
