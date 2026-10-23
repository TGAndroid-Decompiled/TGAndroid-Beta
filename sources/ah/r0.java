package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gl0;
public final class r0 extends AnimatorListenerAdapter {
    public final int f854a;
    public final t0 f855b;

    public r0(t0 t0Var, int i10) {
        this.f854a = i10;
        this.f855b = t0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f854a) {
            case 0:
                this.f855b.f();
                return;
            default:
                t0 t0Var = this.f855b;
                t0.a(t0Var, false);
                t0Var.f875j = 0.0f;
                gl0 gl0Var = t0Var.f879n;
                gl0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                gl0Var.setSkipDraw(false);
                t0Var.f871c.setVisibility(8);
                t0Var.f();
                return;
        }
    }
}
