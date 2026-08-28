package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m2 extends AnimatorListenerAdapter {
    public final int f11751a;
    public final View f11752b;

    public m2(int i9, View view) {
        this.f11751a = i9;
        this.f11752b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11751a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f11752b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f11752b);
                return;
        }
    }
}
