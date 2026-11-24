package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class oqa implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final rqa b;

    public oqa(rqa rqaVar, byte b) {
        this.a = b;
        this.b = rqaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rqa rqaVar = this.b;
        switch (b) {
            case 0:
                rqaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rqaVar.d(rqaVar.b0);
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float w = b00.w((float) Math.pow((floatValue * 2.0f) - 2.0f, 2.0d), 0.075f, floatValue, 1.0f);
                rqaVar.A0 = w;
                FrameLayout frameLayout = rqaVar.b;
                frameLayout.setScaleX(w);
                frameLayout.setScaleY(rqaVar.A0);
                rqaVar.invalidate();
                return;
            default:
                rqaVar.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rqaVar.d(rqaVar.b0);
                return;
        }
    }
}
