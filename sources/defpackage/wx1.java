package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wx1 implements gk {
    public final ChatActivityEnterView a;

    public wx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public final void a() {
        int i = ChatActivityEnterView.z7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        ValueAnimator valueAnimator = chatActivityEnterView.B5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.D5 = 0.0f;
        chatActivityEnterView.C5 = 0.0f;
        s09 s09Var = chatActivityEnterView.h1;
        if (s09Var != null) {
            s09Var.setRotation(0.0f);
            s09 s09Var2 = chatActivityEnterView.h1;
            s09Var2.setPivotX(s09Var2.getWidth() / 2.0f);
            s09 s09Var3 = chatActivityEnterView.h1;
            s09Var3.setPivotY(s09Var3.getHeight() / 2.0f);
            if (chatActivityEnterView.h1.getAnimatedDrawable() == chatActivityEnterView.z5) {
                chatActivityEnterView.h1.setProgress(0.0f);
            }
        }
        lx1 lx1Var = chatActivityEnterView.y5;
        chatActivityEnterView.y5 = null;
        if (lx1Var != null) {
            lx1Var.run();
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        boolean x1 = chatActivityEnterView.x1(z, i, i2, 0L, true);
        j67 j67Var = chatActivityEnterView.M0;
        if (j67Var != null) {
            j67Var.f(!x1);
            chatActivityEnterView.M0 = null;
        }
    }
}
