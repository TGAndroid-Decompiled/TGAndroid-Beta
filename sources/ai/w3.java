package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w3 extends AnimatorListenerAdapter {
    public final int f1649a;
    public final View f1650b;

    public w3(int i10, View view) {
        this.f1649a = i10;
        this.f1650b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1649a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f1650b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f1650b);
                return;
        }
    }
}
