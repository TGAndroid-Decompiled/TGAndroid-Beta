package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hy1 implements ViewTreeObserver.OnPreDrawListener {
    public final tx1 a;
    public final float b;
    public final float c;
    public final ChatActivityEnterView d;

    public hy1(ChatActivityEnterView chatActivityEnterView, tx1 tx1Var, float f, float f2) {
        this.d = chatActivityEnterView;
        this.a = tx1Var;
        this.b = f;
        this.c = f2;
    }

    @Override
    public final boolean onPreDraw() {
        c8a c8aVar;
        tx1 tx1Var = this.a;
        tx1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        ChatActivityEnterView chatActivityEnterView = this.d;
        tw1 tw1Var = chatActivityEnterView.R0;
        if (chatActivityEnterView.F0 == tx1Var && (c8aVar = chatActivityEnterView.q0) != null && c8aVar.getVisibility() != 0) {
            float left = (this.b - tx1Var.getLeft()) - chatActivityEnterView.I;
            float left2 = this.c - tw1Var.getLeft();
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(k43.f);
            duration.addUpdateListener(new gy1(this, left, left2, (byte) 0));
            duration.addListener(new v5(this, duration, (byte) 11));
            chatActivityEnterView.q0.setTag(duration);
            chatActivityEnterView.H = left;
            chatActivityEnterView.B2();
            tw1Var.setTranslationX(left2);
            duration.start();
        }
        return true;
    }
}
