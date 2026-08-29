package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fk0;
public final class b0 extends AnimatorListenerAdapter {
    public final int f13649a;
    public final d0 f13650b;

    public b0(d0 d0Var, int i10) {
        this.f13649a = i10;
        this.f13650b = d0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13649a) {
            case 0:
                this.f13650b.f();
                return;
            default:
                d0 d0Var = this.f13650b;
                d0.a(d0Var, false);
                d0Var.f13688j = 0.0f;
                fk0 fk0Var = d0Var.f13692n;
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                fk0Var.setSkipDraw(false);
                d0Var.f13683c.setVisibility(8);
                d0Var.f();
                return;
        }
    }
}
