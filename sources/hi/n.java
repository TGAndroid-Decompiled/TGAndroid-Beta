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
import org.telegram.ui.Components.nr;
public final class n extends Drawable {
    public final Paint f15045a;
    public final Paint f15046b;
    public final m f15047c;
    public final m d;
    public boolean f15048e;
    public final org.telegram.ui.Components.d6 f15049f;
    public final Path f15050g;
    public final int h;
    public float f15051i;
    public float f15052j;
    public float f15053k;
    public int f15054l;
    public boolean f15055m;
    public float f15056n;
    public float f15057o;

    public n(int i7) {
        Paint paint = new Paint(1);
        this.f15045a = paint;
        this.f15046b = new Paint(1);
        m mVar = new m(this, 0);
        this.f15047c = mVar;
        m mVar2 = new m(this, 1);
        this.d = mVar2;
        this.f15048e = false;
        l lVar = new l(this, 0);
        nr nrVar = nr.h;
        this.f15049f = new org.telegram.ui.Components.d6(lVar, 350L, nrVar, 0);
        this.f15050g = new Path();
        this.f15051i = 21.0f;
        this.h = i7;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        mVar.n(0.3f, 250L, nrVar);
        mVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        mVar.w(org.telegram.messenger.g0.N(12.0f));
        mVar.f37791b = 17;
        mVar2.n(0.3f, 250L, nrVar);
        mVar2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        mVar2.w(org.telegram.messenger.g0.N(12.0f));
        mVar2.f37791b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float N = org.telegram.messenger.g0.N(this.f15051i) / 2.0f;
        float d = this.f15049f.d(this.f15048e);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint = this.f15046b;
            paint.setAlpha((int) (f10 * 255.0f * d));
            canvas.drawCircle(this.f15056n, this.f15057o, org.telegram.messenger.g0.N(11.33f) * d, paint);
        }
        Paint paint2 = this.f15045a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.f15054l) * f10));
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.f15056n;
        float f12 = this.f15057o;
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
        canvas.translate(this.f15052j + 0.0f, this.f15053k);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) (this.f15056n - org.telegram.messenger.g0.L(20.0f)), (int) (this.f15057o - org.telegram.messenger.g0.L(20.0f)), (int) (this.f15056n + org.telegram.messenger.g0.L(20.0f)), (int) (this.f15057o + org.telegram.messenger.g0.L(20.0f)));
        m mVar = this.f15047c;
        mVar.setBounds(rect);
        mVar.C = (int) (Color.alpha(this.f15054l) * f10);
        mVar.draw(canvas);
        if (i7 > 0) {
            Path path = this.f15050g;
            path.rewind();
            path.addCircle(this.f15056n, this.f15057o + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(11.33f) * d, Path.Direction.CW);
            canvas.clipPath(path);
            m mVar2 = this.d;
            mVar2.setBounds(rect);
            mVar2.C = (int) (f10 * 255.0f);
            mVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f15055m != z10) {
            this.f15055m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f15045a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f15047c.f37789a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f10) {
        this.d.w(org.telegram.messenger.g0.N(f10));
        this.f15047c.w(org.telegram.messenger.g0.N(f10));
    }

    public final void d(int i7, boolean z10, boolean z11) {
        this.f15047c.t("" + i7, z11, true);
        this.d.t("" + i7, z11, true);
        this.f15048e = z10;
        if (!z11) {
            this.f15049f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i7, int i10, int i11) {
        this.f15054l = i7;
        this.f15045a.setColor(i7);
        this.f15047c.u(i7);
        this.d.u(i11);
        this.f15046b.setColor(i10);
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
        this.f15056n = getBounds().centerX();
        this.f15057o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.f15056n = getBounds().centerX();
        this.f15057o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
