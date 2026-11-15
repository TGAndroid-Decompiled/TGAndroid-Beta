package hi;

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
import org.telegram.ui.Components.er;
public final class l extends Drawable {
    public final Paint f14530a;
    public final Paint f14531b;
    public final k f14532c;
    public final k d;
    public boolean f14533e;
    public final org.telegram.ui.Components.u5 f14534f;
    public final Path f14535g;
    public final int h;
    public float f14536i;
    public float f14537j;
    public float f14538k;
    public int f14539l;
    public boolean f14540m;
    public float f14541n;
    public float f14542o;

    public l(int i7) {
        Paint paint = new Paint(1);
        this.f14530a = paint;
        this.f14531b = new Paint(1);
        k kVar = new k(this, 0);
        this.f14532c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.f14533e = false;
        fi.c1 c1Var = new fi.c1(this, 26);
        er erVar = er.h;
        this.f14534f = new org.telegram.ui.Components.u5(c1Var, 350L, erVar, 0);
        this.f14535g = new Path();
        this.f14536i = 21.0f;
        this.h = i7;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.n(0.3f, 250L, erVar);
        kVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar.w(org.telegram.messenger.g0.N(12.0f));
        kVar.f34833b = 17;
        kVar2.n(0.3f, 250L, erVar);
        kVar2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        kVar2.w(org.telegram.messenger.g0.N(12.0f));
        kVar2.f34833b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float N = org.telegram.messenger.g0.N(this.f14536i) / 2.0f;
        float d = this.f14534f.d(this.f14533e);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint = this.f14531b;
            paint.setAlpha((int) (f10 * 255.0f * d));
            canvas.drawCircle(this.f14541n, this.f14542o, org.telegram.messenger.g0.N(11.33f) * d, paint);
        }
        Paint paint2 = this.f14530a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.f14539l) * f10));
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.f14541n;
        float f12 = this.f14542o;
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
        canvas.translate(this.f14537j + 0.0f, this.f14538k);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) (this.f14541n - org.telegram.messenger.g0.L(20.0f)), (int) (this.f14542o - org.telegram.messenger.g0.L(20.0f)), (int) (this.f14541n + org.telegram.messenger.g0.L(20.0f)), (int) (this.f14542o + org.telegram.messenger.g0.L(20.0f)));
        k kVar = this.f14532c;
        kVar.setBounds(rect);
        kVar.C = (int) (Color.alpha(this.f14539l) * f10);
        kVar.draw(canvas);
        if (i7 > 0) {
            Path path = this.f14535g;
            path.rewind();
            path.addCircle(this.f14541n, this.f14542o + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.C = (int) (f10 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f14540m != z10) {
            this.f14540m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f14530a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f14532c.f34831a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f10) {
        this.d.w(org.telegram.messenger.g0.N(f10));
        this.f14532c.w(org.telegram.messenger.g0.N(f10));
    }

    public final void d(int i7, boolean z10, boolean z11) {
        this.f14532c.t("" + i7, z11, true);
        this.d.t("" + i7, z11, true);
        this.f14533e = z10;
        if (!z11) {
            this.f14534f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i7, int i10, int i11) {
        this.f14539l = i7;
        this.f14530a.setColor(i7);
        this.f14532c.u(i7);
        this.d.u(i11);
        this.f14531b.setColor(i10);
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
        this.f14541n = getBounds().centerX();
        this.f14542o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.f14541n = getBounds().centerX();
        this.f14542o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
