package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fl0;
public final class g0 extends AnimatorListenerAdapter {
    public final int f4032a;
    public final i0 f4033b;

    public g0(i0 i0Var, int i10) {
        this.f4032a = i10;
        this.f4033b = i0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4032a) {
            case 0:
                this.f4033b.f();
                return;
            default:
                i0 i0Var = this.f4033b;
                i0.a(i0Var, false);
                i0Var.f4053j = 0.0f;
                fl0 fl0Var = i0Var.f4057n;
                fl0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                fl0Var.setSkipDraw(false);
                i0Var.f4049c.setVisibility(8);
                i0Var.f();
                return;
        }
    }
}
