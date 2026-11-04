package gi;

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
import org.telegram.ui.Components.xq;
public final class l extends Drawable {
    public final Paint f13052a;
    public final Paint f13053b;
    public final k f13054c;
    public final k d;
    public boolean f13055e;
    public final org.telegram.ui.Components.u5 f13056f;
    public final Path f13057g;
    public final int h;
    public float f13058i;
    public float f13059j;
    public float f13060k;
    public int f13061l;
    public boolean f13062m;
    public float f13063n;
    public float f13064o;

    public l(int i3) {
        Paint paint = new Paint(1);
        this.f13052a = paint;
        this.f13053b = new Paint(1);
        k kVar = new k(this, 0);
        this.f13054c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.f13055e = false;
        ei.z5 z5Var = new ei.z5(this, 17);
        xq xqVar = xq.h;
        this.f13056f = new org.telegram.ui.Components.u5(z5Var, 350L, xqVar, 0);
        this.f13057g = new Path();
        this.f13058i = 21.0f;
        this.h = i3;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.n(0.3f, 250L, xqVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.N(12.0f));
        kVar.f33983b = 17;
        kVar2.n(0.3f, 250L, xqVar);
        kVar2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar2.w(org.telegram.messenger.g0.N(12.0f));
        kVar2.f33983b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float N = org.telegram.messenger.g0.N(this.f13058i) / 2.0f;
        float d = this.f13056f.d(this.f13055e);
        int i3 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i3 > 0) {
            Paint paint = this.f13053b;
            paint.setAlpha((int) (f10 * 255.0f * d));
            canvas.drawCircle(this.f13063n, this.f13064o, org.telegram.messenger.g0.N(11.33f) * d, paint);
        }
        Paint paint2 = this.f13052a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.f13061l) * f10));
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.f13063n;
        float f12 = this.f13064o;
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
        canvas.translate(this.f13059j + 0.0f, this.f13060k);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) (this.f13063n - org.telegram.messenger.g0.L(20.0f)), (int) (this.f13064o - org.telegram.messenger.g0.L(20.0f)), (int) (this.f13063n + org.telegram.messenger.g0.L(20.0f)), (int) (this.f13064o + org.telegram.messenger.g0.L(20.0f)));
        k kVar = this.f13054c;
        kVar.setBounds(rect);
        kVar.B = (int) (Color.alpha(this.f13061l) * f10);
        kVar.draw(canvas);
        if (i3 > 0) {
            Path path = this.f13057g;
            path.rewind();
            path.addCircle(this.f13063n, this.f13064o + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.B = (int) (f10 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f13062m != z10) {
            this.f13062m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f13052a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f13054c.f33981a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f10) {
        this.d.w(org.telegram.messenger.g0.N(f10));
        this.f13054c.w(org.telegram.messenger.g0.N(f10));
    }

    public final void d(int i3, boolean z10, boolean z11) {
        this.f13054c.t("" + i3, z11, true);
        this.d.t("" + i3, z11, true);
        this.f13055e = z10;
        if (!z11) {
            this.f13056f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i3, int i10, int i11) {
        this.f13061l = i3;
        this.f13052a.setColor(i3);
        this.f13054c.u(i3);
        this.d.u(i11);
        this.f13053b.setColor(i10);
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
        this.f13063n = getBounds().centerX();
        this.f13064o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i3, int i10, int i11, int i12) {
        super.setBounds(i3, i10, i11, i12);
        this.f13063n = getBounds().centerX();
        this.f13064o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
