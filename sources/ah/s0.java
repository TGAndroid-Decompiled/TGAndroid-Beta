package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fk0;
public final class s0 extends AnimatorListenerAdapter {
    public final int f681a;
    public final u0 f682b;

    public s0(u0 u0Var, int i10) {
        this.f681a = i10;
        this.f682b = u0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f681a) {
            case 0:
                this.f682b.f();
                return;
            default:
                u0 u0Var = this.f682b;
                u0.a(u0Var, false);
                u0Var.f704j = 0.0f;
                fk0 fk0Var = u0Var.f708n;
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                fk0Var.setSkipDraw(false);
                u0Var.f699c.setVisibility(8);
                u0Var.f();
                return;
        }
    }
}
