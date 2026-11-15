package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class dv {
    public float f23157a;
    public boolean f23158b;
    public float f23159c;
    public float d;
    public float f23160e;
    public ValueAnimator f23161f;
    public final Path f23162g = new Path();

    public final void a(Canvas canvas) {
        if (this.f23157a > 0.0f) {
            Path path = this.f23162g;
            path.rewind();
            path.addCircle(this.f23159c, this.d, this.f23160e * this.f23157a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f23158b && this.f23157a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f23158b && this.f23161f == null) {
            this.f23159c = f10;
            this.d = f11;
            this.f23160e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f23161f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f23160e * 0.3f, 550.0f, 250.0f));
            this.f23161f.setInterpolator(org.telegram.ui.Components.er.f34423j);
            this.f23161f.addUpdateListener(new q(2, this, view));
            this.f23161f.addListener(new ah.l(12, this, view));
            this.f23161f.start();
        }
    }
}
