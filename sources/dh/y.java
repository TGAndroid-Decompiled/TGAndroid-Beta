package dh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.li0;
public final class y extends AnimatorListenerAdapter {
    public final int f9167a;
    public final a0 f9168b;

    public y(a0 a0Var, int i3) {
        this.f9167a = i3;
        this.f9168b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9167a) {
            case 0:
                this.f9168b.f();
                return;
            default:
                a0 a0Var = this.f9168b;
                a0.a(a0Var, false);
                a0Var.f8938j = 0.0f;
                li0 li0Var = a0Var.f8942n;
                li0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                li0Var.setSkipDraw(false);
                a0Var.f8933c.setVisibility(8);
                a0Var.f();
                return;
        }
    }
}
