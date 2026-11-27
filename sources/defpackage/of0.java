package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
public final class of0 {
    public int a;
    public boolean b;
    public int c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public of0(xt xtVar) {
        this.h = xtVar;
        hn hnVar = new hn(true, true, true);
        this.d = hnVar;
        hn hnVar2 = new hn(true, true, true);
        this.e = hnVar2;
        this.f = new mm(xtVar, 0L, 300L, k43.h);
        this.b = false;
        hnVar.L = true;
        hnVar.w(hl.L(18.33f));
        hnVar.B = 0.6f;
        hnVar.x(hl.o());
        hnVar.q(false);
        hnVar.setCallback(xtVar);
        hnVar.N = 9999999;
        hnVar2.L = true;
        hnVar2.w(hl.L(14.0f));
        hnVar2.q(false);
        hnVar2.setCallback(xtVar);
        hnVar2.N = 9999999;
        this.g = xtVar.getContext().getResources().getDrawable(2131232874).mutate();
    }

    public final void a(Canvas canvas, float f, float f2, float f3) {
        Drawable drawable = (Drawable) this.g;
        xt xtVar = (xt) this.h;
        RectF rectF = xtVar.a;
        rectF.set(0.0f, 0.0f, f, f2);
        canvas.saveLayerAlpha(rectF, (int) (f3 * 255.0f), 31);
        hn hnVar = (hn) this.d;
        float i = hnVar.i();
        hn hnVar2 = (hn) this.e;
        float i2 = hnVar2.i();
        TextPaint textPaint = hnVar2.a;
        float f4 = i2 * i;
        canvas.save();
        float f5 = 0.82f * f2;
        canvas.translate(0.0f, qd4.A(1.0f, xtVar.H, f5, -hl.L(1.0f)));
        canvas.translate(0.0f, (-hl.L(4.0f)) * f4);
        float R1 = hl.R1(1.0f, 0.86f, f4) * xtVar.H;
        canvas.scale(R1, R1, 0.0f, 0.0f);
        hnVar.o(0.0f, 0.0f, f, f2);
        hnVar.draw(canvas);
        canvas.restore();
        float d = ((mm) this.f).d(this.b);
        canvas.save();
        canvas.translate(0.0f, qu6.B(1.0f, f4, hl.L(4.0f), (hl.L(14.0f) * f4) + ((1.0f - xtVar.H) * f5 * f4) + (-hl.L(1.0f))));
        float R12 = hl.R1(1.15f, 0.9f, f4) * xtVar.H;
        canvas.scale(R12, R12, 0.0f, 0.0f);
        hnVar2.u(vm2.f(d, this.a, aob.w0(null, aob.q7, false)));
        if (d > 0.0f) {
            if (this.c != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.c = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (d * 255.0f));
            drawable.setBounds(0, ((int) (f2 - hl.L(16.0f))) / 2, hl.L(16.0f), ((int) (hl.L(16.0f) + f2)) / 2);
            drawable.draw(canvas);
        }
        hnVar2.o(hl.L(20.0f) * d, 0.0f, f, f2);
        hnVar2.draw(canvas);
        canvas.restore();
        rectF.set(f - hl.L(12.0f), 0.0f, f, f2);
        xtVar.s0.r(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public final Bitmap b(int i, int i2) {
        Canvas canvas;
        Paint paint = (Paint) this.g;
        RectF rectF = (RectF) this.f;
        int v0 = aob.v0(aob.d6, (vnb) this.h);
        int i3 = (i + i2) << 10;
        if (i3 == this.a && !this.b) {
            if (v0 != this.c && (canvas = (Canvas) this.e) != null && ((Bitmap) this.d) != null) {
                this.c = v0;
                canvas.drawColor(v0, PorterDuff.Mode.SRC);
                ((Canvas) this.e).drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
            }
        } else {
            this.b = false;
            this.a = i3;
            this.d = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            this.e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i2, i);
            this.c = v0;
            ((Canvas) this.e).drawColor(v0);
            ((Canvas) this.e).drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public of0(vnb vnbVar) {
        this.f = new RectF();
        Paint paint = new Paint(1);
        this.g = paint;
        this.a = 0;
        this.b = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = vnbVar;
    }
}
