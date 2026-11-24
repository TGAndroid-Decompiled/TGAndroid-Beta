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
public final class mf0 {
    public int a;
    public boolean b;
    public int c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public mf0(wt wtVar) {
        this.h = wtVar;
        gn gnVar = new gn(true, true, true);
        this.d = gnVar;
        gn gnVar2 = new gn(true, true, true);
        this.e = gnVar2;
        this.f = new lm(wtVar, 0L, 300L, s33.h);
        this.b = false;
        gnVar.L = true;
        gnVar.w(gl.L(18.33f));
        gnVar.B = 0.6f;
        gnVar.x(gl.o());
        gnVar.q(false);
        gnVar.setCallback(wtVar);
        gnVar.N = 9999999;
        gnVar2.L = true;
        gnVar2.w(gl.L(14.0f));
        gnVar2.q(false);
        gnVar2.setCallback(wtVar);
        gnVar2.N = 9999999;
        this.g = wtVar.getContext().getResources().getDrawable(2131232855).mutate();
    }

    public final void a(Canvas canvas, float f, float f2, float f3) {
        Drawable drawable = (Drawable) this.g;
        wt wtVar = (wt) this.h;
        RectF rectF = wtVar.a;
        rectF.set(0.0f, 0.0f, f, f2);
        canvas.saveLayerAlpha(rectF, (int) (f3 * 255.0f), 31);
        gn gnVar = (gn) this.d;
        float i = gnVar.i();
        gn gnVar2 = (gn) this.e;
        float i2 = gnVar2.i();
        TextPaint textPaint = gnVar2.a;
        float f4 = i2 * i;
        canvas.save();
        float f5 = 0.82f * f2;
        canvas.translate(0.0f, tb4.A(1.0f, wtVar.H, f5, -gl.L(1.0f)));
        canvas.translate(0.0f, (-gl.L(4.0f)) * f4);
        float R1 = gl.R1(1.0f, 0.86f, f4) * wtVar.H;
        canvas.scale(R1, R1, 0.0f, 0.0f);
        gnVar.o(0.0f, 0.0f, f, f2);
        gnVar.draw(canvas);
        canvas.restore();
        float d = ((lm) this.f).d(this.b);
        canvas.save();
        canvas.translate(0.0f, ls6.B(1.0f, f4, gl.L(4.0f), (gl.L(14.0f) * f4) + ((1.0f - wtVar.H) * f5 * f4) + (-gl.L(1.0f))));
        float R12 = gl.R1(1.15f, 0.9f, f4) * wtVar.H;
        canvas.scale(R12, R12, 0.0f, 0.0f);
        gnVar2.u(bm2.f(d, this.a, bkb.w0(null, bkb.p7, false)));
        if (d > 0.0f) {
            if (this.c != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.c = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (d * 255.0f));
            drawable.setBounds(0, ((int) (f2 - gl.L(16.0f))) / 2, gl.L(16.0f), ((int) (gl.L(16.0f) + f2)) / 2);
            drawable.draw(canvas);
        }
        gnVar2.o(gl.L(20.0f) * d, 0.0f, f, f2);
        gnVar2.draw(canvas);
        canvas.restore();
        rectF.set(f - gl.L(12.0f), 0.0f, f, f2);
        wtVar.s0.s(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public final Bitmap b(int i, int i2) {
        Canvas canvas;
        Paint paint = (Paint) this.g;
        RectF rectF = (RectF) this.f;
        int v0 = bkb.v0(bkb.c6, (wjb) this.h);
        int i3 = (i + i2) << 10;
        if (i3 == this.a && !this.b) {
            if (v0 != this.c && (canvas = (Canvas) this.e) != null && ((Bitmap) this.d) != null) {
                this.c = v0;
                canvas.drawColor(v0, PorterDuff.Mode.SRC);
                ((Canvas) this.e).drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
            }
        } else {
            this.b = false;
            this.a = i3;
            this.d = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            this.e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i2, i);
            this.c = v0;
            ((Canvas) this.e).drawColor(v0);
            ((Canvas) this.e).drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public mf0(wjb wjbVar) {
        this.f = new RectF();
        Paint paint = new Paint(1);
        this.g = paint;
        this.a = 0;
        this.b = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = wjbVar;
    }
}
