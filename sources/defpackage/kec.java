package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class kec implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final wec b;

    public kec(wec wecVar, byte b) {
        this.a = b;
        this.b = wecVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wec wecVar = this.b;
        switch (b) {
            case 0:
                wecVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = wecVar.e;
                View view = viewArr[1];
                if (view != null) {
                    if (wecVar.E) {
                        wecVar.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        wecVar.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        wecVar.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        wecVar.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    wecVar.c = floatValue;
                    wecVar.x(true);
                    mec mecVar = wecVar.N;
                    if (mecVar != null) {
                        mecVar.w.invalidate();
                        wecVar.N.w.h1();
                        wecVar.N.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wecVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                wecVar.O.onAnimationUpdate(valueAnimator);
                wecVar.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wecVar.N.w.h1();
                wecVar.N.invalidate();
                return;
            default:
                wecVar.getClass();
                wecVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
