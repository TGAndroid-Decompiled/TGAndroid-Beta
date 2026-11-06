package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class fv {
    public float f22454a;
    public boolean f22455b;
    public float f22456c;
    public float d;
    public float f22457e;
    public ValueAnimator f22458f;
    public final Path f22459g = new Path();

    public final void a(Canvas canvas) {
        if (this.f22454a > 0.0f) {
            Path path = this.f22459g;
            path.rewind();
            path.addCircle(this.f22456c, this.d, this.f22457e * this.f22454a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f22455b && this.f22454a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f22455b && this.f22458f == null) {
            this.f22456c = f10;
            this.d = f11;
            this.f22457e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f22458f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f22457e * 0.3f, 550.0f, 250.0f));
            this.f22458f.setInterpolator(org.telegram.ui.Components.xq.f40313j);
            this.f22458f.addUpdateListener(new q(2, this, view));
            this.f22458f.addListener(new ah.l(12, this, view));
            this.f22458f.start();
        }
    }
}
