package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r2 extends AnimatorListenerAdapter {
    public final int f9111a;
    public final View f9112b;

    public r2(int i10, View view) {
        this.f9111a = i10;
        this.f9112b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9111a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f9112b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f9112b);
                return;
        }
    }
}
