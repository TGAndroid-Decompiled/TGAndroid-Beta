package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
public final class uy4 extends yke {
    public final boolean a;
    public final Paint b = new Paint();
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public final yy4 g;

    public uy4(yy4 yy4Var, boolean z) {
        this.g = yy4Var;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f = -1;
        this.a = z;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override
    public final void b() {
        this.e = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        boolean z;
        float f;
        Paint paint;
        Paint paint2;
        float f2;
        float f3;
        yy4 yy4Var = this.g;
        Rect bounds = yy4Var.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f4 = width;
        int ceil = (int) Math.ceil(f4 / 5.0f);
        float f5 = height;
        int ceil2 = (int) Math.ceil(f5 / 5.0f);
        boolean z2 = this.a;
        if (z2) {
            z = yy4Var.w;
        } else {
            z = yy4Var.x;
        }
        Paint paint3 = this.c;
        Paint paint4 = this.d;
        if (!z && this.e == width && this.f == height) {
            paint = paint3;
            paint2 = paint4;
        } else {
            int i = yy4Var.y;
            if (i != 1 && i != 4) {
                f = f4;
            } else {
                f = f5;
            }
            if (z2) {
                zy4 zy4Var = yy4Var.E;
                zy4Var.getClass();
                paint2 = paint4;
                paint = paint3;
                paint.setShader(yy4Var.l(zy4Var, f, 0.0f, -1, 5));
                zy4 zy4Var2 = yy4Var.F;
                zy4Var2.getClass();
                paint2.setShader(yy4Var.l(zy4Var2, f, 0.0f, yy4Var.I, 5));
            } else {
                paint = paint3;
                paint2 = paint4;
                zy4 zy4Var3 = yy4Var.G;
                zy4Var3.getClass();
                paint2.setShader(yy4Var.l(zy4Var3, f, 0.0f, yy4Var.K, 5));
            }
            this.e = width;
            this.f = height;
            if (z2) {
                yy4Var.w = false;
            } else {
                yy4Var.x = false;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f6 = ceil;
        float f7 = ceil2;
        Paint paint5 = paint;
        Paint paint6 = paint2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f6, f7, this.b);
        if (z2) {
            canvas.drawColor((yy4Var.I & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f8 = yy4Var.d;
            float f9 = bounds.left + f8;
            float f10 = yy4Var.e;
            float f11 = bounds.top + f10;
            canvas.translate(-f9, -f11);
            yy4Var.f.e(f9, f11, bounds.right + f8, f10 + bounds.bottom, canvas);
            canvas.restore();
            f2 = f6;
            f3 = f7;
            canvas.drawRect(0.0f, 0.0f, f2, f3, paint5);
        } else {
            f2 = f6;
            f3 = f7;
        }
        canvas.drawRect(0.0f, 0.0f, f2, f3, paint6);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
    }

    @Override
    public final void e(float f) {
        this.b.setAlpha(Math.round(f * 255.0f));
    }
}
