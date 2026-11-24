package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class wq8 implements yq8 {
    public Bitmap a;
    public Canvas b;
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final zq8 i;

    public wq8(zq8 zq8Var) {
        this.i = zq8Var;
        Paint paint = new Paint();
        this.c = paint;
        Paint paint2 = new Paint();
        this.d = paint2;
        paint.setFlags(7);
        paint.setFilterBitmap(true);
        paint2.setFlags(7);
        paint2.setFilterBitmap(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, -7500.0f}));
    }

    @Override
    public final void a(k88 k88Var, Canvas canvas) {
        Canvas canvas2;
        int i;
        int i2;
        zq8 zq8Var = (zq8) k88Var.b;
        zq8 zq8Var2 = this.i;
        Paint paint = zq8Var2.a;
        Bitmap bitmap = this.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            int a = (int) ((1.0f - ((moe.a(zq8Var2.f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (zq8Var2.getWidth() - this.f) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -gl.L(32.0f));
            if (a != 255) {
                this.a.eraseColor(0);
                this.b.save();
                this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
                float f = -width;
                this.b.translate(f, 0.0f);
                zq8Var.a(this.b);
                this.b.restore();
                this.b.save();
                this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
                vj7 vj7Var = zq8Var2.n;
                Canvas canvas3 = this.b;
                if (vj7Var != null) {
                    canvas3.save();
                    this.b.translate(f, gl.L(32.0f));
                    vj7 vj7Var2 = zq8Var2.n;
                    if (vj7Var2.c) {
                        Canvas canvas4 = this.b;
                        float centerX = zq8Var2.n.e.centerX();
                        RectF rectF = zq8Var2.n.e;
                        canvas4.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), Math.min(vj7Var2.e.width(), zq8Var2.n.e.height()) / 2.0f, paint);
                    } else if (vj7Var2.b) {
                        this.b.drawPath(vj7Var2.d, paint);
                    } else {
                        float max = Math.max(vj7Var2.e.width(), zq8Var2.n.e.height()) / 2.0f;
                        this.b.drawRoundRect(zq8Var2.n.e, max, max, paint);
                    }
                    this.b.restore();
                } else {
                    canvas3.drawRect(0.0f, 0.0f, this.f, gl.L(32.0f), paint);
                }
                this.b.restore();
                Utilities.stackBlurBitmap(this.a, (int) ((zq8Var2.d * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                i = 255;
                canvas2 = canvas;
                canvas2.saveLayer(0.0f, 0.0f, this.g, this.h, null);
                canvas2.scale(this.g / this.a.getWidth(), this.h / this.a.getHeight());
                canvas2.drawBitmap(this.a, 0.0f, 0.0f, this.c);
                canvas2.drawBitmap(this.a, 0.0f, 0.0f, this.d);
                canvas2.restore();
                canvas2.restore();
            } else {
                canvas2 = canvas;
                i = 255;
            }
            if (a != 0) {
                if (a != i) {
                    Canvas canvas5 = canvas2;
                    i2 = a;
                    canvas5.saveLayerAlpha(width, 0.0f, width + this.f, this.e, i2);
                    canvas2 = canvas5;
                } else {
                    i2 = a;
                }
                zq8Var.a(canvas2);
                if (i2 != i) {
                    canvas2.restore();
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void d(int i, int i2) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            bitmap.recycle();
            this.a = null;
        }
        this.f = Math.min(gl.L(120.0f), i);
        int min = Math.min(gl.L(220.0f), i2);
        this.e = min;
        this.g = this.f;
        int L = gl.L(32.0f) + min;
        this.h = L;
        this.a = Bitmap.createBitmap((int) (this.g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.b = new Canvas(this.a);
    }

    @Override
    public final void b(float f) {
    }

    @Override
    public final void c(float f) {
    }
}
