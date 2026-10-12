package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m3 extends AnimatorListenerAdapter {
    public final int f3304a;
    public final View f3305b;

    public m3(int i10, View view) {
        this.f3304a = i10;
        this.f3305b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3304a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f3305b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f3305b);
                return;
        }
    }
}
