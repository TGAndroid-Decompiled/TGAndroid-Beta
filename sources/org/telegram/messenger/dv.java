package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class dv {
    public float f23164a;
    public boolean f23165b;
    public float f23166c;
    public float d;
    public float f23167e;
    public ValueAnimator f23168f;
    public final Path f23169g = new Path();

    public final void a(Canvas canvas) {
        if (this.f23164a > 0.0f) {
            Path path = this.f23169g;
            path.rewind();
            path.addCircle(this.f23166c, this.d, this.f23167e * this.f23164a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f23165b && this.f23164a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f23165b && this.f23168f == null) {
            this.f23166c = f10;
            this.d = f11;
            this.f23167e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f23168f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f23167e * 0.3f, 550.0f, 250.0f));
            this.f23168f.setInterpolator(org.telegram.ui.Components.er.f34422j);
            this.f23168f.addUpdateListener(new q(2, this, view));
            this.f23168f.addListener(new ah.l(12, this, view));
            this.f23168f.start();
        }
    }
}
