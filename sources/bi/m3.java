package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m3 extends AnimatorListenerAdapter {
    public final int f3308a;
    public final View f3309b;

    public m3(int i10, View view) {
        this.f3308a = i10;
        this.f3309b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3308a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f3309b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f3309b);
                return;
        }
    }
}
