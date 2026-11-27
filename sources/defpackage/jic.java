package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class jic implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final vic b;

    public jic(vic vicVar, byte b) {
        this.a = b;
        this.b = vicVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        vic vicVar = this.b;
        switch (b) {
            case 0:
                vicVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = vicVar.e;
                View view = viewArr[1];
                if (view != null) {
                    if (vicVar.E) {
                        vicVar.G(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        vicVar.G(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        vicVar.G(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        vicVar.G(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    vicVar.c = floatValue;
                    vicVar.y(true);
                    lic licVar = vicVar.N;
                    if (licVar != null) {
                        licVar.w.invalidate();
                        vicVar.N.w.i1();
                        vicVar.N.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                vicVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                vicVar.O.onAnimationUpdate(valueAnimator);
                vicVar.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vicVar.N.w.i1();
                vicVar.N.invalidate();
                return;
            default:
                vicVar.getClass();
                vicVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
