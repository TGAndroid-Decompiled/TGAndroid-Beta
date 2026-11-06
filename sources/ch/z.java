package ch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ii0;
public final class z extends AnimatorListenerAdapter {
    public final int f6414a;
    public final b0 f6415b;

    public z(b0 b0Var, int i7) {
        this.f6414a = i7;
        this.f6415b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6414a) {
            case 0:
                this.f6415b.f();
                return;
            default:
                b0 b0Var = this.f6415b;
                b0.a(b0Var, false);
                b0Var.f6190j = 0.0f;
                ii0 ii0Var = b0Var.f6194n;
                ii0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                ii0Var.setSkipDraw(false);
                b0Var.f6185c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
