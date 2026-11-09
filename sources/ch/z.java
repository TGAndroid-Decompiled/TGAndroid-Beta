package ch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ji0;
public final class z extends AnimatorListenerAdapter {
    public final int f6412a;
    public final b0 f6413b;

    public z(b0 b0Var, int i7) {
        this.f6412a = i7;
        this.f6413b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6412a) {
            case 0:
                this.f6413b.f();
                return;
            default:
                b0 b0Var = this.f6413b;
                b0.a(b0Var, false);
                b0Var.f6188j = 0.0f;
                ji0 ji0Var = b0Var.f6192n;
                ji0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                ji0Var.setSkipDraw(false);
                b0Var.f6183c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
