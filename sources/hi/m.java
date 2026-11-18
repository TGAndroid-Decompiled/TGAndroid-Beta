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
import org.telegram.ui.Components.lr;
public final class m extends Drawable {
    public final Paint f14975a;
    public final Paint f14976b;
    public final l f14977c;
    public final l d;
    public boolean f14978e;
    public final org.telegram.ui.Components.c6 f14979f;
    public final Path f14980g;
    public final int h;
    public float f14981i;
    public float f14982j;
    public float f14983k;
    public int f14984l;
    public boolean f14985m;
    public float f14986n;
    public float f14987o;

    public m(int i7) {
        Paint paint = new Paint(1);
        this.f14975a = paint;
        this.f14976b = new Paint(1);
        l lVar = new l(this, 0);
        this.f14977c = lVar;
        l lVar2 = new l(this, 1);
        this.d = lVar2;
        this.f14978e = false;
        k kVar = new k(this, 0);
        lr lrVar = lr.h;
        this.f14979f = new org.telegram.ui.Components.c6(kVar, 350L, lrVar, 0);
        this.f14980g = new Path();
        this.f14981i = 21.0f;
        this.h = i7;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        lVar.n(0.3f, 250L, lrVar);
        lVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        lVar.w(org.telegram.messenger.g0.N(12.0f));
        lVar.f37377b = 17;
        lVar2.n(0.3f, 250L, lrVar);
        lVar2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        lVar2.w(org.telegram.messenger.g0.N(12.0f));
        lVar2.f37377b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float N = org.telegram.messenger.g0.N(this.f14981i) / 2.0f;
        float d = this.f14979f.d(this.f14978e);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint = this.f14976b;
            paint.setAlpha((int) (f10 * 255.0f * d));
            canvas.drawCircle(this.f14986n, this.f14987o, org.telegram.messenger.g0.N(11.33f) * d, paint);
        }
        Paint paint2 = this.f14975a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.f14984l) * f10));
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.f14986n;
        float f12 = this.f14987o;
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
        canvas.translate(this.f14982j + 0.0f, this.f14983k);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) (this.f14986n - org.telegram.messenger.g0.L(20.0f)), (int) (this.f14987o - org.telegram.messenger.g0.L(20.0f)), (int) (this.f14986n + org.telegram.messenger.g0.L(20.0f)), (int) (this.f14987o + org.telegram.messenger.g0.L(20.0f)));
        l lVar = this.f14977c;
        lVar.setBounds(rect);
        lVar.C = (int) (Color.alpha(this.f14984l) * f10);
        lVar.draw(canvas);
        if (i7 > 0) {
            Path path = this.f14980g;
            path.rewind();
            path.addCircle(this.f14986n, this.f14987o + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            l lVar2 = this.d;
            lVar2.setBounds(rect);
            lVar2.C = (int) (f10 * 255.0f);
            lVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f14985m != z10) {
            this.f14985m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f14975a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f14977c.f37375a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f10) {
        this.d.w(org.telegram.messenger.g0.N(f10));
        this.f14977c.w(org.telegram.messenger.g0.N(f10));
    }

    public final void d(int i7, boolean z10, boolean z11) {
        this.f14977c.t("" + i7, z11, true);
        this.d.t("" + i7, z11, true);
        this.f14978e = z10;
        if (!z11) {
            this.f14979f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i7, int i10, int i11) {
        this.f14984l = i7;
        this.f14975a.setColor(i7);
        this.f14977c.u(i7);
        this.d.u(i11);
        this.f14976b.setColor(i10);
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
        this.f14986n = getBounds().centerX();
        this.f14987o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.f14986n = getBounds().centerX();
        this.f14987o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
