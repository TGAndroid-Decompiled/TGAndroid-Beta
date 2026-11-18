package ch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vi0;
public final class z extends AnimatorListenerAdapter {
    public final int f5533a;
    public final b0 f5534b;

    public z(b0 b0Var, int i7) {
        this.f5533a = i7;
        this.f5534b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5533a) {
            case 0:
                this.f5534b.f();
                return;
            default:
                b0 b0Var = this.f5534b;
                b0.a(b0Var, false);
                b0Var.f5301j = 0.0f;
                vi0 vi0Var = b0Var.f5305n;
                vi0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                vi0Var.setSkipDraw(false);
                b0Var.f5296c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
