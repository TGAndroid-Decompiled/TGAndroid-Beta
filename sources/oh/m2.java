package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends AnimatorListenerAdapter {
    public final int f17426a;
    public final View f17427b;

    public m2(int i10, View view) {
        this.f17426a = i10;
        this.f17427b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17426a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f17427b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f17427b);
                return;
        }
    }
}
