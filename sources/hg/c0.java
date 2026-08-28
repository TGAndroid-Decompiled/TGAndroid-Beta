package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.uj0;
public final class c0 extends AnimatorListenerAdapter {
    public final int f10550a;
    public final e0 f10551b;

    public c0(e0 e0Var, int i9) {
        this.f10550a = i9;
        this.f10551b = e0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10550a) {
            case 0:
                this.f10551b.f();
                return;
            default:
                e0 e0Var = this.f10551b;
                e0.a(e0Var, false);
                e0Var.f10581j = 0.0f;
                uj0 uj0Var = e0Var.f10585n;
                uj0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                uj0Var.setSkipDraw(false);
                e0Var.f10576c.setVisibility(8);
                e0Var.f();
                return;
        }
    }
}
