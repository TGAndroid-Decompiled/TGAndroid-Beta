package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
public final class tua extends rp2 {
    public final c51 c;
    public final Paint d;
    public final Path e;
    public final long f;
    public float h;

    public tua(c51 c51Var, int i) {
        super(c51Var);
        Paint paint = new Paint(1);
        this.d = paint;
        Path path = new Path();
        this.e = path;
        this.f = System.currentTimeMillis();
        this.h = 1.0f;
        this.c = c51Var;
        ((Paint) this.b).setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i);
        path.rewind();
        path.moveTo(-hl.N(2.91f), hl.N(1.08f));
        path.lineTo(0.0f, -hl.N(1.08f));
        path.lineTo(hl.N(2.91f), hl.N(1.08f));
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        Paint paint = (Paint) this.b;
        paint.setAlpha((int) (this.h * 255.0f));
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
        float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.f) % 400)) / 400.0f;
        Paint paint2 = this.d;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * this.h));
        paint2.setStrokeWidth(hl.N(1.33f));
        canvas.save();
        uh9.n(bp1.e(1.166f, 2.0f, hl.N(2.16f) * 3.0f), 2.0f, getBounds().centerY(), getBounds().centerX(), canvas);
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                f = 1.0f - currentTimeMillis;
            } else if (i == 3) {
                f = currentTimeMillis;
            } else {
                f = 1.0f;
            }
            paint2.setAlpha((int) (f * 255.0f * this.h));
            canvas.save();
            float R1 = hl.R1(0.5f, 1.0f, f);
            canvas.scale(R1, R1);
            canvas.drawPath(this.e, paint2);
            canvas.restore();
            canvas.translate(0.0f, hl.N(3.3260002f) * f);
        }
        canvas.restore();
        paint2.setAlpha(alpha);
        c51 c51Var = this.c;
        if (c51Var != null) {
            c51Var.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return hl.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return hl.L(18.0f);
    }

    @Override
    public final void setAlpha(int i) {
        this.h = i / 255.0f;
    }
}
