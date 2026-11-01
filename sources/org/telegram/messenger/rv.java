package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class rv {
    public float f17977a;
    public boolean f17978b;
    public float f17979c;
    public float d;
    public float e;
    public ValueAnimator f17980f;
    public final Path f17981g = new Path();

    public final void a(Canvas canvas) {
        if (this.f17977a > 0.0f) {
            Path path = this.f17981g;
            path.rewind();
            path.addCircle(this.f17979c, this.d, this.e * this.f17977a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f17978b && this.f17977a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f7, float f10, float f11, float f12) {
        if (!this.f17978b && this.f17980f == null) {
            this.f17979c = f7;
            this.d = f10;
            this.e = (float) Math.sqrt((f12 * f12) + (f11 * f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f17980f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.e * 0.3f, 550.0f, 250.0f));
            this.f17980f.setInterpolator(org.telegram.ui.Components.gr.f26526j);
            this.f17980f.addUpdateListener(new r(2, this, view));
            this.f17980f.addListener(new bg.f(7, this, view));
            this.f17980f.start();
        }
    }
}
