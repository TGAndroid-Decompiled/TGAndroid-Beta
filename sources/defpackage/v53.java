package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
public final class v53 extends AnimatorListenerAdapter {
    public final byte a;
    public final x53 b;

    public v53(x53 x53Var, byte b) {
        this.a = b;
        this.b = x53Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        x53 x53Var = this.b;
        switch (b) {
            case 0:
                x53Var.f();
                return;
            default:
                x53Var.a(false);
                x53Var.j = 0.0f;
                v29 v29Var = x53Var.n;
                v29Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                v29Var.setSkipDraw(false);
                x53Var.c.setVisibility(8);
                x53Var.f();
                return;
        }
    }
}
