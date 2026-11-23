package ch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xi0;
public final class z extends AnimatorListenerAdapter {
    public final int f5565a;
    public final b0 f5566b;

    public z(b0 b0Var, int i7) {
        this.f5565a = i7;
        this.f5566b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5565a) {
            case 0:
                this.f5566b.f();
                return;
            default:
                b0 b0Var = this.f5566b;
                b0.a(b0Var, false);
                b0Var.f5333j = 0.0f;
                xi0 xi0Var = b0Var.f5337n;
                xi0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                xi0Var.setSkipDraw(false);
                b0Var.f5328c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
