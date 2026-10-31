package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class qv {
    public float f17631a;
    public boolean f17632b;
    public float f17633c;
    public float d;
    public float e;
    public ValueAnimator f17634f;
    public final Path f17635g = new Path();

    public final void a(Canvas canvas) {
        if (this.f17631a > 0.0f) {
            Path path = this.f17635g;
            path.rewind();
            path.addCircle(this.f17633c, this.d, this.e * this.f17631a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f17632b && this.f17631a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f7, float f10, float f11, float f12) {
        if (!this.f17632b && this.f17634f == null) {
            this.f17633c = f7;
            this.d = f10;
            this.e = (float) Math.sqrt((f12 * f12) + (f11 * f11));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f17634f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.e * 0.3f, 550.0f, 250.0f));
            this.f17634f.setInterpolator(org.telegram.ui.Components.gr.f26498j);
            this.f17634f.addUpdateListener(new r(2, this, view));
            this.f17634f.addListener(new bg.f(7, this, view));
            this.f17634f.start();
        }
    }
}
