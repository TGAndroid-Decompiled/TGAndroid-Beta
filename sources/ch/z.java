package ch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mi0;
public final class z extends AnimatorListenerAdapter {
    public final int f5247a;
    public final b0 f5248b;

    public z(b0 b0Var, int i7) {
        this.f5247a = i7;
        this.f5248b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5247a) {
            case 0:
                this.f5248b.f();
                return;
            default:
                b0 b0Var = this.f5248b;
                b0.a(b0Var, false);
                b0Var.f5015j = 0.0f;
                mi0 mi0Var = b0Var.f5019n;
                mi0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                mi0Var.setSkipDraw(false);
                b0Var.f5010c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
