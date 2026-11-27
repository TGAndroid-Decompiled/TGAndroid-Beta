package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
public final class o19 extends Drawable {
    public final View a;
    public final Paint b;
    public final Path c;
    public int d;
    public boolean e;
    public final mm f;

    public o19(View view) {
        Paint paint = new Paint(1);
        this.b = paint;
        Path path = new Path();
        this.c = path;
        this.d = 255;
        this.a = view;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(hl.L(1.0f));
        this.f = new mm(view, 0L, 350L, k43.h);
        float N = hl.N(4.66f);
        float N2 = hl.N(2.16f);
        path.rewind();
        path.moveTo(N / 2.0f, 0.0f);
        float f = (-N) / 2.0f;
        path.lineTo(f, 0.0f);
        float f2 = f + N2;
        path.lineTo(f2, -N2);
        path.moveTo(f, 0.0f);
        path.lineTo(f2, N2);
    }

    @Override
    public final void draw(Canvas canvas) {
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        float d = this.f.d(this.e);
        float N = hl.N(2.51f);
        canvas.save();
        canvas.translate(centerX, centerY);
        canvas.save();
        canvas.translate(N, N);
        canvas.rotate(45.0f);
        canvas.scale(hl.R1(-1.0f, 1.0f, d), 1.0f);
        Path path = this.c;
        Paint paint = this.b;
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        float f = -N;
        canvas.translate(f, f);
        canvas.rotate(225.0f);
        canvas.scale(hl.R1(-1.0f, 1.0f, d), 1.0f);
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.d = i;
        this.b.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
