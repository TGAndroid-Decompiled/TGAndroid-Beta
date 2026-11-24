package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
public final class k43 extends AnimatorListenerAdapter {
    public final byte a;
    public final m43 b;

    public k43(m43 m43Var, byte b) {
        this.a = b;
        this.b = m43Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        m43 m43Var = this.b;
        switch (b) {
            case 0:
                m43Var.f();
                return;
            default:
                m43Var.a(false);
                m43Var.j = 0.0f;
                t09 t09Var = m43Var.n;
                t09Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                t09Var.setSkipDraw(false);
                m43Var.c.setVisibility(8);
                m43Var.f();
                return;
        }
    }
}
