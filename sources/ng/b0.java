package ng;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qk0;
public final class b0 extends AnimatorListenerAdapter {
    public final int f16003a;
    public final d0 f16004b;

    public b0(d0 d0Var, int i10) {
        this.f16003a = i10;
        this.f16004b = d0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16003a) {
            case 0:
                this.f16004b.f();
                return;
            default:
                d0 d0Var = this.f16004b;
                d0.a(d0Var, false);
                d0Var.f16042j = 0.0f;
                qk0 qk0Var = d0Var.f16046n;
                qk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                qk0Var.setSkipDraw(false);
                d0Var.f16037c.setVisibility(8);
                d0Var.f();
                return;
        }
    }
}
