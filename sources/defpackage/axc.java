package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
public final class axc implements ValueAnimator.AnimatorUpdateListener {
    public final gxc a;
    public final vxc b;
    public final vxc c;
    public final int d;
    public final View e;

    public axc(gxc gxcVar, vxc vxcVar, vxc vxcVar2, int i, View view) {
        this.a = gxcVar;
        this.b = vxcVar;
        this.c = vxcVar2;
        this.d = i;
        this.e = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        lxc hxcVar;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        gxc gxcVar = this.a;
        fxc fxcVar = gxcVar.a;
        fxcVar.d(animatedFraction);
        float b = fxcVar.b();
        PathInterpolator pathInterpolator = cxc.e;
        int i = Build.VERSION.SDK_INT;
        vxc vxcVar = this.b;
        if (i >= 34) {
            hxcVar = new kxc(vxcVar);
        } else if (i >= 30) {
            hxcVar = new jxc(vxcVar);
        } else if (i >= 29) {
            hxcVar = new ixc(vxcVar);
        } else {
            hxcVar = new hxc(vxcVar);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            sxc sxcVar = vxcVar.a;
            if (i3 == 0) {
                hxcVar.c(i2, sxcVar.f(i2));
            } else {
                io5 f = sxcVar.f(i2);
                io5 f2 = this.c.a.f(i2);
                float f3 = 1.0f - b;
                hxcVar.c(i2, vxc.e(f, (int) (((f.a - f2.a) * f3) + 0.5d), (int) (((f.b - f2.b) * f3) + 0.5d), (int) (((f.c - f2.c) * f3) + 0.5d), (int) (((f.d - f2.d) * f3) + 0.5d)));
            }
        }
        cxc.g(this.e, hxcVar.b(), Collections.singletonList(gxcVar));
    }
}
