package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class fv {
    public float f22461a;
    public boolean f22462b;
    public float f22463c;
    public float d;
    public float f22464e;
    public ValueAnimator f22465f;
    public final Path f22466g = new Path();

    public final void a(Canvas canvas) {
        if (this.f22461a > 0.0f) {
            Path path = this.f22466g;
            path.rewind();
            path.addCircle(this.f22463c, this.d, this.f22464e * this.f22461a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f22462b && this.f22461a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f22462b && this.f22465f == null) {
            this.f22463c = f10;
            this.d = f11;
            this.f22464e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f22465f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f22464e * 0.3f, 550.0f, 250.0f));
            this.f22465f.setInterpolator(org.telegram.ui.Components.xq.f40348j);
            this.f22465f.addUpdateListener(new q(2, this, view));
            this.f22465f.addListener(new ah.l(12, this, view));
            this.f22465f.start();
        }
    }
}
