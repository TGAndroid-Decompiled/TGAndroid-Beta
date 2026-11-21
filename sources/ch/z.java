package ch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xi0;
public final class z extends AnimatorListenerAdapter {
    public final int f5562a;
    public final b0 f5563b;

    public z(b0 b0Var, int i7) {
        this.f5562a = i7;
        this.f5563b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5562a) {
            case 0:
                this.f5563b.f();
                return;
            default:
                b0 b0Var = this.f5563b;
                b0.a(b0Var, false);
                b0Var.f5330j = 0.0f;
                xi0 xi0Var = b0Var.f5334n;
                xi0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                xi0Var.setSkipDraw(false);
                b0Var.f5325c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
