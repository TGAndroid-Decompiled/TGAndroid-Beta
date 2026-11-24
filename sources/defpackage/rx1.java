package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rx1 implements ViewTreeObserver.OnPreDrawListener {
    public final ex1 a;
    public final float b;
    public final float c;
    public final ChatActivityEnterView d;

    public rx1(ChatActivityEnterView chatActivityEnterView, ex1 ex1Var, float f, float f2) {
        this.d = chatActivityEnterView;
        this.a = ex1Var;
        this.b = f;
        this.c = f2;
    }

    @Override
    public final boolean onPreDraw() {
        k4a k4aVar;
        ex1 ex1Var = this.a;
        ex1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        ChatActivityEnterView chatActivityEnterView = this.d;
        ew1 ew1Var = chatActivityEnterView.R0;
        if (chatActivityEnterView.F0 == ex1Var && (k4aVar = chatActivityEnterView.q0) != null && k4aVar.getVisibility() != 0) {
            float left = (this.b - ex1Var.getLeft()) - chatActivityEnterView.I;
            float left2 = this.c - ew1Var.getLeft();
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(s33.f);
            duration.addUpdateListener(new qx1(this, left, left2, (byte) 0));
            duration.addListener(new u5(this, duration, (byte) 10));
            chatActivityEnterView.q0.setTag(duration);
            chatActivityEnterView.H = left;
            chatActivityEnterView.p2();
            ew1Var.setTranslationX(left2);
            duration.start();
        }
        return true;
    }
}
