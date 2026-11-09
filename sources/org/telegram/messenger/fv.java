package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
public final class fv {
    public float f22480a;
    public boolean f22481b;
    public float f22482c;
    public float d;
    public float f22483e;
    public ValueAnimator f22484f;
    public final Path f22485g = new Path();

    public final void a(Canvas canvas) {
        if (this.f22480a > 0.0f) {
            Path path = this.f22485g;
            path.rewind();
            path.addCircle(this.f22482c, this.d, this.f22483e * this.f22480a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.f22481b && this.f22480a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (!this.f22481b && this.f22484f == null) {
            this.f22482c = f10;
            this.d = f11;
            this.f22483e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f22484f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.f22483e * 0.3f, 550.0f, 250.0f));
            this.f22484f.setInterpolator(org.telegram.ui.Components.xq.f40461j);
            this.f22484f.addUpdateListener(new q(2, this, view));
            this.f22484f.addListener(new ah.l(12, this, view));
            this.f22484f.start();
        }
    }
}
