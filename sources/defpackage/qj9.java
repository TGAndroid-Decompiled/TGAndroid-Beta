package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class qj9 {
    public float a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public ValueAnimator f;
    public final Path g = new Path();

    public final void a(Canvas canvas) {
        if (this.a > 0.0f) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.c, this.d, this.e * this.a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        if (this.b && this.a >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void c(View view, float f, float f2, float f3, float f4) {
        if (!this.b && this.f == null) {
            this.c = f;
            this.d = f2;
            this.e = (float) Math.sqrt((f4 * f4) + (f3 * f3));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f = ofFloat;
            ofFloat.setDuration(Utilities.i(this.e * 0.3f, 550.0f, 250.0f));
            this.f.setInterpolator(d53.j);
            this.f.addUpdateListener(new pl(this, view, (byte) 26));
            this.f.addListener(new ic8((Object) this, (Object) view, (byte) 10));
            this.f.start();
        }
    }
}
