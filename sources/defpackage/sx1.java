package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sx1 extends AnimatorListenerAdapter {
    public final boolean a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f;

    public sx1(ChatActivityEnterView chatActivityEnterView, boolean z, float f, float f2, float f3, float f4) {
        this.f = chatActivityEnterView;
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        float f;
        int i;
        ChatActivityEnterView chatActivityEnterView = this.f;
        boolean z = this.a;
        if (z) {
            int i2 = ChatActivityEnterView.r7;
            chatActivityEnterView.f0();
        }
        k4a k4aVar = chatActivityEnterView.q0;
        if (k4aVar != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            k4aVar.setVisibility(i);
            chatActivityEnterView.q0.setAlpha(this.d);
            chatActivityEnterView.q0.setTranslationX(this.e);
            f = chatActivityEnterView.q0.getTranslationX();
        } else {
            f = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f);
        chatActivityEnterView.H = f;
        chatActivityEnterView.p2();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            ChatActivityEnterView chatActivityEnterView = this.f;
            k4a k4aVar = chatActivityEnterView.q0;
            if (k4aVar != null) {
                k4aVar.setVisibility(8);
            }
            chatActivityEnterView.R0.setTranslationX(0.0f);
            chatActivityEnterView.H = 0.0f;
            chatActivityEnterView.p2();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f;
        boolean z = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z) {
            int i = ChatActivityEnterView.r7;
            chatActivityEnterView.f0();
            chatActivityEnterView.q0.setVisibility(0);
        }
        k4a k4aVar = chatActivityEnterView.q0;
        if (k4aVar != null) {
            k4aVar.setAlpha(this.b);
            chatActivityEnterView.q0.setTranslationX(this.c);
            f = chatActivityEnterView.q0.getTranslationX();
        } else {
            f = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f);
        chatActivityEnterView.H = f;
        chatActivityEnterView.p2();
        ep0 ep0Var = chatActivityEnterView.m0;
        if (ep0Var != null && ep0Var.getTag() == null) {
            chatActivityEnterView.C0.clear();
        }
    }
}
