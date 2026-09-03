package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends AnimatorListenerAdapter {
    public final int f17428a;
    public final View f17429b;

    public m2(int i10, View view) {
        this.f17428a = i10;
        this.f17429b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17428a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f17429b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f17429b);
                return;
        }
    }
}
