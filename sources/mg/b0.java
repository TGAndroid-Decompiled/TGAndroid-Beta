package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pk0;
public final class b0 extends AnimatorListenerAdapter {
    public final int f13931a;
    public final d0 f13932b;

    public b0(d0 d0Var, int i10) {
        this.f13931a = i10;
        this.f13932b = d0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13931a) {
            case 0:
                this.f13932b.f();
                return;
            default:
                d0 d0Var = this.f13932b;
                d0.a(d0Var, false);
                d0Var.f13966j = 0.0f;
                pk0 pk0Var = d0Var.f13970n;
                pk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                pk0Var.setSkipDraw(false);
                d0Var.f13962c.setVisibility(8);
                d0Var.f();
                return;
        }
    }
}
