package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class by1 extends AnimatorListenerAdapter {
    public final byte a;
    public final byte b;
    public final FrameLayout c;

    public by1(FrameLayout frameLayout, int i, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        byte b = this.a;
        int i3 = 0;
        byte b2 = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) frameLayout;
                if (b2 == 0) {
                    chatActivityEnterView.q3 = 0;
                }
                chatActivityEnterView.W0 = null;
                chatActivityEnterView.x2.setTranslationY(0.0f);
                chatActivityEnterView.x2.setVisibility(8);
                chatActivityEnterView.A4.e();
                hy1 hy1Var = chatActivityEnterView.P3;
                if (hy1Var != null) {
                    hy1Var.k(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 1:
                l04 l04Var = (l04) frameLayout;
                ah8 ah8Var = l04Var.r;
                if (b2 == 1) {
                    i = 0;
                } else {
                    i = 8;
                }
                ah8Var.setVisibility(i);
                TextView textView = l04Var.h;
                if (b2 == 2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                TextView textView2 = l04Var.n;
                if (b2 != 3) {
                    i3 = 8;
                }
                textView2.setVisibility(i3);
                return;
            default:
                y95 y95Var = (y95) frameLayout;
                if (!y95Var.c()) {
                    y95Var.b(b2);
                }
                y95Var.e0 = null;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                l04 l04Var = (l04) this.c;
                l04Var.r.setVisibility(0);
                l04Var.h.setVisibility(0);
                l04Var.n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
