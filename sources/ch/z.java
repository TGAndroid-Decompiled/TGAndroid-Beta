package ch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi0;
public final class z extends AnimatorListenerAdapter {
    public final int f5536a;
    public final b0 f5537b;

    public z(b0 b0Var, int i7) {
        this.f5536a = i7;
        this.f5537b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5536a) {
            case 0:
                this.f5537b.f();
                return;
            default:
                b0 b0Var = this.f5537b;
                b0.a(b0Var, false);
                b0Var.f5304j = 0.0f;
                vi0 vi0Var = b0Var.f5308n;
                vi0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                vi0Var.setSkipDraw(false);
                b0Var.f5299c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
