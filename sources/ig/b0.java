package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wj0;

public final class b0 extends AnimatorListenerAdapter {

    public final int f11236a;

    public final d0 f11237b;

    public b0(d0 d0Var, int i10) {
        this.f11236a = i10;
        this.f11237b = d0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11236a) {
            case 0:
                this.f11237b.f();
                break;
            default:
                d0 d0Var = this.f11237b;
                d0.a(d0Var, false);
                d0Var.f11275j = 0.0f;
                wj0 wj0Var = d0Var.f11279n;
                wj0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                wj0Var.setSkipDraw(false);
                d0Var.f11270c.setVisibility(8);
                d0Var.f();
                break;
        }
    }
}
