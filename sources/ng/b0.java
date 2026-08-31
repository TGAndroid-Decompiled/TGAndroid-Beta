package ng;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.rk0;
public final class b0 extends AnimatorListenerAdapter {
    public final int f16001a;
    public final d0 f16002b;

    public b0(d0 d0Var, int i10) {
        this.f16001a = i10;
        this.f16002b = d0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16001a) {
            case 0:
                this.f16002b.f();
                return;
            default:
                d0 d0Var = this.f16002b;
                d0.a(d0Var, false);
                d0Var.f16040j = 0.0f;
                rk0 rk0Var = d0Var.f16044n;
                rk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                rk0Var.setSkipDraw(false);
                d0Var.f16035c.setVisibility(8);
                d0Var.f();
                return;
        }
    }
}
