package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w3 extends AnimatorListenerAdapter {
    public final int f1645a;
    public final View f1646b;

    public w3(int i10, View view) {
        this.f1645a = i10;
        this.f1646b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1645a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f1646b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f1646b);
                return;
        }
    }
}
