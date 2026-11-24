package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class bzc implements ValueAnimator.AnimatorUpdateListener {
    public final hzc a;
    public final wzc b;
    public final wzc c;
    public final int d;
    public final View e;

    public bzc(hzc hzcVar, wzc wzcVar, wzc wzcVar2, int i, View view) {
        this.a = hzcVar;
        this.b = wzcVar;
        this.c = wzcVar2;
        this.d = i;
        this.e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        mzc izcVar;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        hzc hzcVar = this.a;
        gzc gzcVar = hzcVar.a;
        gzcVar.d(animatedFraction);
        float b = gzcVar.b();
        PathInterpolator pathInterpolator = dzc.e;
        int i = Build.VERSION.SDK_INT;
        wzc wzcVar = this.b;
        if (i >= 34) {
            izcVar = new lzc(wzcVar);
        } else if (i >= 30) {
            izcVar = new kzc(wzcVar);
        } else if (i >= 29) {
            izcVar = new jzc(wzcVar);
        } else {
            izcVar = new izc(wzcVar);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            tzc tzcVar = wzcVar.a;
            if (i3 == 0) {
                izcVar.c(i2, tzcVar.f(i2));
            } else {
                iq5 f = tzcVar.f(i2);
                iq5 f2 = this.c.a.f(i2);
                float f3 = 1.0f - b;
                izcVar.c(i2, wzc.e(f, (int) (((f.a - f2.a) * f3) + 0.5d), (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d)));
            }
        }
        dzc.g(this.e, izcVar.b(), Collections.singletonList(hzcVar));
    }
}
