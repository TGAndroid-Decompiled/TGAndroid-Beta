package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
public final class c53 extends AnimatorListenerAdapter {
    public final byte a;
    public final e53 b;

    public c53(e53 e53Var, byte b) {
        this.a = b;
        this.b = e53Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        e53 e53Var = this.b;
        switch (b) {
            case 0:
                e53Var.f();
                return;
            default:
                e53Var.a(false);
                e53Var.j = 0.0f;
                i49 i49Var = e53Var.n;
                i49Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                i49Var.setSkipDraw(false);
                e53Var.c.setVisibility(8);
                e53Var.f();
                return;
        }
    }
}
