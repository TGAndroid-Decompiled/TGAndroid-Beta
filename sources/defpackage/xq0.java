package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class xq0 extends Drawable {
    public final long a;
    public final Drawable b;
    public final Paint c;
    public final Path d;
    public boolean e;
    public final ln f;

    public xq0(Context context) {
        Paint paint = new Paint(1);
        this.c = paint;
        Path path = new Path();
        this.d = path;
        this.e = false;
        this.f = new ln(new f00(this, (byte) 23), 420L, d53.h, 0);
        this.a = System.currentTimeMillis();
        this.b = b10.d(context, 2131231248);
        paint.setPathEffect(new CornerPathEffect(gm.L(1.0f)));
        path.rewind();
        path.moveTo(-gm.N(1.33f), gm.N(0.16f));
        path.lineTo(-gm.N(1.33f), -gm.N(3.5f));
        path.lineTo(gm.N(1.33f), -gm.N(3.5f));
        path.lineTo(gm.N(1.33f), gm.N(0.16f));
        path.lineTo(gm.N(3.5f), gm.N(0.16f));
        path.lineTo(0.0f, gm.N(3.5f));
        path.lineTo(-gm.N(3.5f), gm.N(0.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.b;
        drawable.setBounds(bounds);
        drawable.draw(canvas);
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(getBounds().centerX(), getBounds().centerY());
            canvas.translate(-gm.N(8.166f), gm.N(5.0f));
            float f = (d * 0.5f) + 0.5f;
            canvas.scale(f, f);
            int p1 = cmb.p1(0.4f, -1);
            Paint paint = this.c;
            paint.setColor(p1);
            Path path = this.d;
            canvas.drawPath(path, paint);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.a) % 450)) / 450.0f;
            float f2 = 0.5f + currentTimeMillis;
            canvas.save();
            canvas.clipRect(-gm.L(5.0f), gm.R1(-gm.N(3.5f), gm.N(3.5f), currentTimeMillis), gm.L(5.0f), gm.R1(-gm.N(3.5f), gm.N(3.5f), f2));
            paint.setColor(cmb.p1(1.0f, -1));
            canvas.drawPath(path, paint);
            canvas.restore();
            if (f2 > 1.0f) {
                canvas.save();
                canvas.clipRect(-gm.L(5.0f), gm.R1(-gm.N(3.5f), gm.N(3.5f), 0.0f), gm.L(5.0f), gm.R1(-gm.N(3.5f), gm.N(3.5f), f2 - 1.0f));
                paint.setColor(cmb.p1(1.0f, -1));
                canvas.drawPath(path, paint);
                canvas.restore();
            }
            canvas.restore();
            invalidateSelf();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
    }
}
