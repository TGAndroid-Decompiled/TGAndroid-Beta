package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class av {
    public float f22979a;
    public boolean f22980b;
    public float f22981c;
    public float d;
    public float f22982e;
    public ValueAnimator f22983f;
    public final Path f22984g = new Path();

    public final void a(Canvas canvas) {
        if (this.f22979a > 0.0f) {
            Path path = this.f22984g;
            path.rewind();
            path.addCircle(this.f22981c, this.d, this.f22982e * this.f22979a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f22980b && this.f22979a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f22980b && this.f22983f == null) {
            this.f22981c = f10;
            this.d = f11;
            this.f22982e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f22983f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f22982e * 0.3f, 550.0f, 250.0f));
            this.f22983f.setInterpolator(org.telegram.ui.Components.nr.f37964j);
            this.f22983f.addUpdateListener(new q(2, this, view));
            this.f22983f.addListener(new ah.l(12, this, view));
            this.f22983f.start();
        }
    }
}
