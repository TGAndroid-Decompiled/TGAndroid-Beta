package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.Utilities;
public final class zl0 extends Drawable {
    public final yl0 b;
    public Bitmap c;
    public Canvas d;
    public int e;
    public float f;
    public int g;
    public int h;
    public final Paint a = new Paint(2);
    public int i = 255;

    public zl0(yl0 yl0Var) {
        this.b = yl0Var;
    }

    public final void a() {
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            bitmap.recycle();
            this.c = null;
        }
    }

    public final void b(int i, int i2, float f, int i3) {
        int i4 = i3 << 1;
        int i5 = (int) ((i + i4) / f);
        int i6 = (int) ((i2 + i4) / f);
        Bitmap bitmap = this.c;
        if (bitmap != null && bitmap.getWidth() == i5 && this.c.getHeight() == i6) {
            this.c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.c = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.c);
        }
        this.f = f;
        this.e = i3;
        this.d.save();
        float f2 = i3 / f;
        this.d.translate(f2, f2);
        float f3 = 1.0f / f;
        this.d.scale(f3, f3);
        this.b.n(this.d, 255);
        Utilities.stackBlurBitmap(this.c, (int) f2);
        this.d.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i = this.i;
        yl0 yl0Var = this.b;
        if (i == 255) {
            canvas.save();
            canvas.translate(this.g, this.h);
            yl0Var.n(canvas, 255);
            canvas.restore();
        } else if (i != 0) {
            double d = i / 255.0d;
            double d2 = d / ((1.0d - d) * 6.0d);
            double d3 = 1.0d + d2;
            double sqrt = ((-d3) + Math.sqrt((d3 * d3) - (((-d2) * 4.0d) * (-d)))) / ((-2.0d) * d2);
            int b = pqe.b((int) (d2 * sqrt * 255.0d), 0, 255);
            int b2 = pqe.b((int) (sqrt * 255.0d), 0, 255);
            if (b2 > 0 && this.c != null) {
                Paint paint = this.a;
                paint.setAlpha(b2);
                canvas.save();
                int i2 = this.g;
                int i3 = this.e;
                canvas.translate(i2 - i3, this.h - i3);
                float f = this.f;
                canvas.scale(f, f);
                canvas.drawBitmap(this.c, 0.0f, 0.0f, paint);
                canvas.restore();
            }
            if (b > 0) {
                canvas.save();
                canvas.translate(this.g, this.h);
                yl0Var.n(canvas, b);
                canvas.restore();
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.i;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
        this.i = i;
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        this.g = i;
        this.h = i2;
        super.setBounds(i, i2, i3, i4);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
