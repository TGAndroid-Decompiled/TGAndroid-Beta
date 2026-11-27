package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ry1 extends AnimatorListenerAdapter {
    public final byte a;
    public final byte b;
    public final FrameLayout c;

    public ry1(FrameLayout frameLayout, int i, byte b) {
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
                    chatActivityEnterView.p3 = 0;
                }
                chatActivityEnterView.W0 = null;
                chatActivityEnterView.w2.setTranslationY(0.0f);
                chatActivityEnterView.w2.setVisibility(8);
                chatActivityEnterView.z4.e();
                xy1 xy1Var = chatActivityEnterView.O3;
                if (xy1Var != null) {
                    xy1Var.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 1:
                g14 g14Var = (g14) frameLayout;
                ok8 ok8Var = g14Var.r;
                if (b2 == 1) {
                    i = 0;
                } else {
                    i = 8;
                }
                ok8Var.setVisibility(i);
                TextView textView = g14Var.h;
                if (b2 == 2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                TextView textView2 = g14Var.n;
                if (b2 != 3) {
                    i3 = 8;
                }
                textView2.setVisibility(i3);
                return;
            default:
                zb5 zb5Var = (zb5) frameLayout;
                if (!zb5Var.c()) {
                    zb5Var.b(b2);
                }
                zb5Var.e0 = null;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                g14 g14Var = (g14) this.c;
                g14Var.r.setVisibility(0);
                g14Var.h.setVisibility(0);
                g14Var.n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
