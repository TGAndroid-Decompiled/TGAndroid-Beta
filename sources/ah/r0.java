package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cl0;
public final class r0 extends AnimatorListenerAdapter {
    public final int f855a;
    public final t0 f856b;

    public r0(t0 t0Var, int i10) {
        this.f855a = i10;
        this.f856b = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f855a) {
            case 0:
                this.f856b.f();
                return;
            default:
                t0 t0Var = this.f856b;
                t0.a(t0Var, false);
                t0Var.f876j = 0.0f;
                cl0 cl0Var = t0Var.f880n;
                cl0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                cl0Var.setSkipDraw(false);
                t0Var.f872c.setVisibility(8);
                t0Var.f();
                return;
        }
    }
}
