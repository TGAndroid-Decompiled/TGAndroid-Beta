package fi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.ui.Components.wq;
public final class l extends Drawable {
    public final Paint f12288a;
    public final Paint f12289b;
    public final k f12290c;
    public final k d;
    public boolean f12291e;
    public final org.telegram.ui.Components.v5 f12292f;
    public final Path f12293g;
    public final int h;
    public float f12294i;
    public float f12295j;
    public float f12296k;
    public int f12297l;
    public boolean f12298m;
    public float f12299n;
    public float f12300o;

    public l(int i7) {
        Paint paint = new Paint(1);
        this.f12288a = paint;
        this.f12289b = new Paint(1);
        k kVar = new k(this, 0);
        this.f12290c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.f12291e = false;
        di.f8 f8Var = new di.f8(this, 12);
        wq wqVar = wq.h;
        this.f12292f = new org.telegram.ui.Components.v5(f8Var, 350L, wqVar, 0);
        this.f12293g = new Path();
        this.f12294i = 21.0f;
        this.h = i7;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.n(0.3f, 250L, wqVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.N(12.0f));
        kVar.f34187b = 17;
        kVar2.n(0.3f, 250L, wqVar);
        kVar2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar2.w(org.telegram.messenger.g0.N(12.0f));
        kVar2.f34187b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float N = org.telegram.messenger.g0.N(this.f12294i) / 2.0f;
        float d = this.f12292f.d(this.f12291e);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint = this.f12289b;
            paint.setAlpha((int) (f10 * 255.0f * d));
            canvas.drawCircle(this.f12299n, this.f12300o, org.telegram.messenger.g0.N(11.33f) * d, paint);
        }
        Paint paint2 = this.f12288a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.f12297l) * f10));
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.f12299n;
        float f12 = this.f12300o;
        rectF.set(f11 - N, f12 - N, f11 + N, f12 + N);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i10 = this.h;
        float f13 = ((i10 + 1) * 1.5f) + (i10 * 1.0f);
        float f14 = (1.0f / f13) * 180.0f;
        float f15 = (1.5f / f13) * 180.0f;
        int i11 = 0;
        float f16 = f15;
        while (i11 < i10) {
            float f17 = f14;
            canvas.drawArc(org.telegram.messenger.g0.P, f16 + 270.0f, f17, false, paint2);
            f16 = f17 + f15 + f16;
            i11++;
            f14 = f17;
        }
        canvas.save();
        canvas.translate(this.f12295j + 0.0f, this.f12296k);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) (this.f12299n - org.telegram.messenger.g0.L(20.0f)), (int) (this.f12300o - org.telegram.messenger.g0.L(20.0f)), (int) (this.f12299n + org.telegram.messenger.g0.L(20.0f)), (int) (this.f12300o + org.telegram.messenger.g0.L(20.0f)));
        k kVar = this.f12290c;
        kVar.setBounds(rect);
        kVar.B = (int) (Color.alpha(this.f12297l) * f10);
        kVar.draw(canvas);
        if (i7 > 0) {
            Path path = this.f12293g;
            path.rewind();
            path.addCircle(this.f12299n, this.f12300o + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.B = (int) (f10 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z9) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f12298m != z9) {
            this.f12298m = z9;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z9) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f12288a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f12290c.f34185a;
            if (z9) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f10) {
        this.d.w(org.telegram.messenger.g0.N(f10));
        this.f12290c.w(org.telegram.messenger.g0.N(f10));
    }

    public final void d(int i7, boolean z9, boolean z10) {
        this.f12290c.t("" + i7, z10, true);
        this.d.t("" + i7, z10, true);
        this.f12291e = z9;
        if (!z10) {
            this.f12292f.f(z9, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i7, int i10, int i11) {
        this.f12297l = i7;
        this.f12288a.setColor(i7);
        this.f12290c.u(i7);
        this.d.u(i11);
        this.f12289b.setColor(i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f12299n = getBounds().centerX();
        this.f12300o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.f12299n = getBounds().centerX();
        this.f12300o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
