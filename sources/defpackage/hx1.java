package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hx1 implements hj {
    public final ChatActivityEnterView a;

    public hx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a() {
        AnimatorSet animatorSet;
        int i = ChatActivityEnterView.X7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (!chatActivityEnterView.C5 && (animatorSet = chatActivityEnterView.B5) != null) {
            chatActivityEnterView.C5 = true;
            chatActivityEnterView.B5 = null;
            animatorSet.start();
        }
        ValueAnimator valueAnimator = chatActivityEnterView.F5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.H5 = 0.0f;
        chatActivityEnterView.G5 = 0.0f;
        e29 e29Var = chatActivityEnterView.h1;
        if (e29Var != null) {
            e29Var.setRotation(0.0f);
            e29 e29Var2 = chatActivityEnterView.h1;
            e29Var2.setPivotX(e29Var2.getWidth() / 2.0f);
            e29 e29Var3 = chatActivityEnterView.h1;
            e29Var3.setPivotY(e29Var3.getHeight() / 2.0f);
            if (chatActivityEnterView.h1.getAnimatedDrawable() == chatActivityEnterView.D5) {
                chatActivityEnterView.h1.setProgress(0.0f);
            }
        }
        dy1 dy1Var = chatActivityEnterView.A5;
        chatActivityEnterView.A5 = null;
        if (dy1Var != null) {
            dy1Var.run();
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        this.a.F1(z, i, i2, 0L, true);
    }
}
