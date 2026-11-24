package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class x49 extends Drawable {
    public final Paint a = new Paint(1);
    public final View b;
    public final Path c;
    public final RectF d;
    public final r59 e;

    public x49(r59 r59Var, View view, Path path, RectF rectF) {
        this.e = r59Var;
        this.b = view;
        this.c = path;
        this.d = rectF;
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        View view = this.b;
        canvas.translate(-view.getX(), -view.getY());
        canvas.clipPath(this.c);
        int v0 = cmb.v0(cmb.c6, this.e.o2);
        Paint paint = this.a;
        paint.setColor(on2.p(v0, paint.getAlpha()));
        canvas.drawRect(this.d, paint);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
