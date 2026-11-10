package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class fv {
    public float f22484a;
    public boolean f22485b;
    public float f22486c;
    public float d;
    public float f22487e;
    public ValueAnimator f22488f;
    public final Path f22489g = new Path();

    public final void a(Canvas canvas) {
        if (this.f22484a > 0.0f) {
            Path path = this.f22489g;
            path.rewind();
            path.addCircle(this.f22486c, this.d, this.f22487e * this.f22484a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f22485b && this.f22484a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f22485b && this.f22488f == null) {
            this.f22486c = f10;
            this.d = f11;
            this.f22487e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f22488f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f22487e * 0.3f, 550.0f, 250.0f));
            this.f22488f.setInterpolator(org.telegram.ui.Components.wq.f40049j);
            this.f22488f.addUpdateListener(new q(2, this, view));
            this.f22488f.addListener(new ah.l(12, this, view));
            this.f22488f.start();
        }
    }
}
