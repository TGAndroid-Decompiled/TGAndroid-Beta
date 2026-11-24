package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class fz1 extends AnimatorListenerAdapter {
    public final boolean a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ChatActivityEnterView f;

    public fz1(ChatActivityEnterView chatActivityEnterView, boolean z, float f, float f2, float f3, float f4) {
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
            int i2 = ChatActivityEnterView.z7;
            chatActivityEnterView.f0();
        }
        m6a m6aVar = chatActivityEnterView.q0;
        if (m6aVar != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            m6aVar.setVisibility(i);
            chatActivityEnterView.q0.setAlpha(this.d);
            chatActivityEnterView.q0.setTranslationX(this.e);
            f = chatActivityEnterView.q0.getTranslationX();
        } else {
            f = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f);
        chatActivityEnterView.H = f;
        chatActivityEnterView.u2();
        chatActivityEnterView.requestLayout();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            ChatActivityEnterView chatActivityEnterView = this.f;
            m6a m6aVar = chatActivityEnterView.q0;
            if (m6aVar != null) {
                m6aVar.setVisibility(8);
            }
            chatActivityEnterView.R0.setTranslationX(0.0f);
            chatActivityEnterView.H = 0.0f;
            chatActivityEnterView.u2();
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        float f;
        boolean z = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z) {
            int i = ChatActivityEnterView.z7;
            chatActivityEnterView.f0();
            chatActivityEnterView.q0.setVisibility(0);
        }
        m6a m6aVar = chatActivityEnterView.q0;
        if (m6aVar != null) {
            m6aVar.setAlpha(this.b);
            chatActivityEnterView.q0.setTranslationX(this.c);
            f = chatActivityEnterView.q0.getTranslationX();
        } else {
            f = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f);
        chatActivityEnterView.H = f;
        chatActivityEnterView.u2();
        eq0 eq0Var = chatActivityEnterView.m0;
        if (eq0Var != null && eq0Var.getTag() == null) {
            chatActivityEnterView.C0.clear();
        }
    }
}
