package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class av {
    public float f22943a;
    public boolean f22944b;
    public float f22945c;
    public float d;
    public float f22946e;
    public ValueAnimator f22947f;
    public final Path f22948g = new Path();

    public final void a(Canvas canvas) {
        if (this.f22943a > 0.0f) {
            Path path = this.f22948g;
            path.rewind();
            path.addCircle(this.f22945c, this.d, this.f22946e * this.f22943a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f22944b && this.f22943a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f22944b && this.f22947f == null) {
            this.f22945c = f10;
            this.d = f11;
            this.f22946e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f22947f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f22946e * 0.3f, 550.0f, 250.0f));
            this.f22947f.setInterpolator(org.telegram.ui.Components.nr.f37920j);
            this.f22947f.addUpdateListener(new q(2, this, view));
            this.f22947f.addListener(new ah.l(12, this, view));
            this.f22947f.start();
        }
    }
}
