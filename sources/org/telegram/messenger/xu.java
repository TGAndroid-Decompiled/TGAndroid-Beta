package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class xu {
    public float f26445a;
    public boolean f26446b;
    public float f26447c;
    public float d;
    public float f26448e;
    public ValueAnimator f26449f;
    public final Path f26450g = new Path();

    public final void a(Canvas canvas) {
        if (this.f26445a > 0.0f) {
            Path path = this.f26450g;
            path.rewind();
            path.addCircle(this.f26447c, this.d, this.f26448e * this.f26445a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f26446b && this.f26445a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f26446b && this.f26449f == null) {
            this.f26447c = f10;
            this.d = f11;
            this.f26448e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f26449f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f26448e * 0.3f, 550.0f, 250.0f));
            this.f26449f.setInterpolator(org.telegram.ui.Components.xq.f40455j);
            this.f26449f.addUpdateListener(new q(2, this, view));
            this.f26449f.addListener(new bh.j(11, this, view));
            this.f26449f.start();
        }
    }
}
