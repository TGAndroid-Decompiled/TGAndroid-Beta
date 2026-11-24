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
public final class mg0 {
    public int a;
    public boolean b;
    public int c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public mg0(wu wuVar) {
        this.h = wuVar;
        ho hoVar = new ho(true, true, true);
        this.d = hoVar;
        ho hoVar2 = new ho(true, true, true);
        this.e = hoVar2;
        this.f = new ln(wuVar, 0L, 300L, d53.h);
        this.b = false;
        hoVar.L = true;
        hoVar.w(gm.L(18.33f));
        hoVar.B = 0.6f;
        hoVar.x(gm.o());
        hoVar.q(false);
        hoVar.setCallback(wuVar);
        hoVar.N = 9999999;
        hoVar2.L = true;
        hoVar2.w(gm.L(14.0f));
        hoVar2.q(false);
        hoVar2.setCallback(wuVar);
        hoVar2.N = 9999999;
        this.g = wuVar.getContext().getResources().getDrawable(2131232868).mutate();
    }

    public final void a(Canvas canvas, float f, float f2, float f3) {
        Drawable drawable = (Drawable) this.g;
        wu wuVar = (wu) this.h;
        RectF rectF = wuVar.a;
        rectF.set(0.0f, 0.0f, f, f2);
        canvas.saveLayerAlpha(rectF, (int) (f3 * 255.0f), 31);
        ho hoVar = (ho) this.d;
        float i = hoVar.i();
        ho hoVar2 = (ho) this.e;
        float i2 = hoVar2.i();
        TextPaint textPaint = hoVar2.a;
        float f4 = i2 * i;
        canvas.save();
        float f5 = 0.82f * f2;
        canvas.translate(0.0f, td4.A(1.0f, wuVar.H, f5, -gm.L(1.0f)));
        canvas.translate(0.0f, (-gm.L(4.0f)) * f4);
        float R1 = gm.R1(1.0f, 0.86f, f4) * wuVar.H;
        canvas.scale(R1, R1, 0.0f, 0.0f);
        hoVar.o(0.0f, 0.0f, f, f2);
        hoVar.draw(canvas);
        canvas.restore();
        float d = ((ln) this.f).d(this.b);
        canvas.save();
        canvas.translate(0.0f, kt6.B(1.0f, f4, gm.L(4.0f), (gm.L(14.0f) * f4) + ((1.0f - wuVar.H) * f5 * f4) + (-gm.L(1.0f))));
        float R12 = gm.R1(1.15f, 0.9f, f4) * wuVar.H;
        canvas.scale(R12, R12, 0.0f, 0.0f);
        hoVar2.u(on2.f(d, this.a, cmb.w0(null, cmb.p7, false)));
        if (d > 0.0f) {
            if (this.c != textPaint.getColor()) {
                int color = textPaint.getColor();
                this.c = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.setAlpha((int) (d * 255.0f));
            drawable.setBounds(0, ((int) (f2 - gm.L(16.0f))) / 2, gm.L(16.0f), ((int) (gm.L(16.0f) + f2)) / 2);
            drawable.draw(canvas);
        }
        hoVar2.o(gm.L(20.0f) * d, 0.0f, f, f2);
        hoVar2.draw(canvas);
        canvas.restore();
        rectF.set(f - gm.L(12.0f), 0.0f, f, f2);
        wuVar.s0.r(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }

    public final Bitmap b(int i, int i2) {
        Canvas canvas;
        Paint paint = (Paint) this.g;
        RectF rectF = (RectF) this.f;
        int v0 = cmb.v0(cmb.c6, (ylb) this.h);
        int i3 = (i + i2) << 10;
        if (i3 == this.a && !this.b) {
            if (v0 != this.c && (canvas = (Canvas) this.e) != null && ((Bitmap) this.d) != null) {
                this.c = v0;
                canvas.drawColor(v0, PorterDuff.Mode.SRC);
                ((Canvas) this.e).drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
            }
        } else {
            this.b = false;
            this.a = i3;
            this.d = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            this.e = new Canvas((Bitmap) this.d);
            rectF.set(0.0f, 0.0f, i2, i);
            this.c = v0;
            ((Canvas) this.e).drawColor(v0);
            ((Canvas) this.e).drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
        }
        return (Bitmap) this.d;
    }

    public mg0(ylb ylbVar) {
        this.f = new RectF();
        Paint paint = new Paint(1);
        this.g = paint;
        this.a = 0;
        this.b = true;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.h = ylbVar;
    }
}
