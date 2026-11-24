package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class oz1 extends AnimatorListenerAdapter {
    public final byte a;
    public final byte b;
    public final FrameLayout c;

    public oz1(FrameLayout frameLayout, int i, byte b) {
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
                uz1 uz1Var = chatActivityEnterView.P3;
                if (uz1Var != null) {
                    uz1Var.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                return;
            case 1:
                w14 w14Var = (w14) frameLayout;
                cj8 cj8Var = w14Var.r;
                if (b2 == 1) {
                    i = 0;
                } else {
                    i = 8;
                }
                cj8Var.setVisibility(i);
                TextView textView = w14Var.h;
                if (b2 == 2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                TextView textView2 = w14Var.n;
                if (b2 != 3) {
                    i3 = 8;
                }
                textView2.setVisibility(i3);
                return;
            default:
                wb5 wb5Var = (wb5) frameLayout;
                if (!wb5Var.c()) {
                    wb5Var.b(b2);
                }
                wb5Var.e0 = null;
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                w14 w14Var = (w14) this.c;
                w14Var.r.setVisibility(0);
                w14Var.h.setVisibility(0);
                w14Var.n.setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
