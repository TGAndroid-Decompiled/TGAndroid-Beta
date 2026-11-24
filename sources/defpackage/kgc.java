package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class kgc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final wgc b;

    public kgc(wgc wgcVar, byte b) {
        this.a = b;
        this.b = wgcVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wgc wgcVar = this.b;
        switch (b) {
            case 0:
                wgcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = wgcVar.e;
                View view = viewArr[1];
                if (view != null) {
                    if (wgcVar.E) {
                        wgcVar.F(view, (1.0f - floatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        wgcVar.F(view2, (-view2.getMeasuredWidth()) * floatValue);
                    } else {
                        wgcVar.F(view, (1.0f - floatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        wgcVar.F(view3, view3.getMeasuredWidth() * floatValue);
                    }
                    wgcVar.c = floatValue;
                    wgcVar.x(true);
                    mgc mgcVar = wgcVar.N;
                    if (mgcVar != null) {
                        mgcVar.w.invalidate();
                        wgcVar.N.w.h1();
                        wgcVar.N.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                wgcVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 2:
                wgcVar.O.onAnimationUpdate(valueAnimator);
                wgcVar.N.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wgcVar.N.w.h1();
                wgcVar.N.invalidate();
                return;
            default:
                wgcVar.getClass();
                wgcVar.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
