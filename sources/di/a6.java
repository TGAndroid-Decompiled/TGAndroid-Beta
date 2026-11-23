package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import org.telegram.messenger.o10;
public final class a6 extends a5.h {
    public final View f8476c;
    public final Paint d;
    public final Path f8477e;
    public final long f8478f;
    public float h;

    public a6(hi.d dVar, int i7) {
        super(dVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.f8477e = path;
        this.f8478f = System.currentTimeMillis();
        this.h = 1.0f;
        this.f8476c = dVar;
        ((Paint) this.f220b).setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i7);
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.N(2.91f), org.telegram.messenger.g0.N(1.08f));
        path.lineTo(0.0f, -org.telegram.messenger.g0.N(1.08f));
        path.lineTo(org.telegram.messenger.g0.N(2.91f), org.telegram.messenger.g0.N(1.08f));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint = (Paint) this.f220b;
        paint.setAlpha((int) (this.h * 255.0f));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.f8478f) % 400)) / 400.0f;
        Paint paint2 = this.d;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.h));
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(1.33f));
        canvas.save();
        o10.k(org.telegram.ui.Cells.c0.e(1.166f, 2.0f, org.telegram.messenger.g0.N(2.16f) * 3.0f), 2.0f, getBounds().centerY(), getBounds().centerX(), canvas);
        for (int i7 = 0; i7 < 4; i7++) {
            if (i7 == 0) {
                f10 = 1.0f - currentTimeMillis;
            } else if (i7 == 3) {
                f10 = currentTimeMillis;
            } else {
                f10 = 1.0f;
            }
            paint2.setAlpha((int) (f10 * 255.0f * this.h));
            canvas.save();
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, f10);
            canvas.scale(T1, T1);
            canvas.drawPath(this.f8477e, paint2);
            canvas.restore();
            canvas.translate(0.0f, org.telegram.messenger.g0.N(3.3260002f) * f10);
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        View view = this.f8476c;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final void setAlpha(int i7) {
        this.h = i7 / 255.0f;
    }
}
