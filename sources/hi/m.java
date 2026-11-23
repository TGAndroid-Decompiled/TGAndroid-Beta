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
import org.telegram.ui.Components.kr;
public final class m extends Drawable {
    public final Paint f14851a;
    public final Paint f14852b;
    public final l f14853c;
    public final l d;
    public boolean f14854e;
    public final org.telegram.ui.Components.c6 f14855f;
    public final Path f14856g;
    public final int h;
    public float f14857i;
    public float f14858j;
    public float f14859k;
    public int f14860l;
    public boolean f14861m;
    public float f14862n;
    public float f14863o;

    public m(int i7) {
        Paint paint = new Paint(1);
        this.f14851a = paint;
        this.f14852b = new Paint(1);
        l lVar = new l(this, 0);
        this.f14853c = lVar;
        l lVar2 = new l(this, 1);
        this.d = lVar2;
        this.f14854e = false;
        f2.a aVar = new f2.a(this, 29);
        kr krVar = kr.h;
        this.f14855f = new org.telegram.ui.Components.c6(aVar, 350L, krVar, 0);
        this.f14856g = new Path();
        this.f14857i = 21.0f;
        this.h = i7;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        lVar.n(0.3f, 250L, krVar);
        lVar.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        lVar.w(org.telegram.messenger.g0.N(12.0f));
        lVar.f37394b = 17;
        lVar2.n(0.3f, 250L, krVar);
        lVar2.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        lVar2.w(org.telegram.messenger.g0.N(12.0f));
        lVar2.f37394b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float N = org.telegram.messenger.g0.N(this.f14857i) / 2.0f;
        float d = this.f14855f.d(this.f14854e);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint = this.f14852b;
            paint.setAlpha((int) (f10 * 255.0f * d));
            canvas.drawCircle(this.f14862n, this.f14863o, org.telegram.messenger.g0.N(11.33f) * d, paint);
        }
        Paint paint2 = this.f14851a;
        paint2.setAlpha((int) ((1.0f - d) * Color.alpha(this.f14860l) * f10));
        RectF rectF = org.telegram.messenger.g0.P;
        float f11 = this.f14862n;
        float f12 = this.f14863o;
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
        canvas.translate(this.f14858j + 0.0f, this.f14859k);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set((int) (this.f14862n - org.telegram.messenger.g0.L(20.0f)), (int) (this.f14863o - org.telegram.messenger.g0.L(20.0f)), (int) (this.f14862n + org.telegram.messenger.g0.L(20.0f)), (int) (this.f14863o + org.telegram.messenger.g0.L(20.0f)));
        l lVar = this.f14853c;
        lVar.setBounds(rect);
        lVar.C = (int) (Color.alpha(this.f14860l) * f10);
        lVar.draw(canvas);
        if (i7 > 0) {
            Path path = this.f14856g;
            path.rewind();
            path.addCircle(this.f14862n, this.f14863o + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.N(11.33f) * d, Path.Direction.CW);
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
        if (this.f14861m != z10) {
            this.f14861m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f14851a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f14853c.f37392a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f10) {
        this.d.w(org.telegram.messenger.g0.N(f10));
        this.f14853c.w(org.telegram.messenger.g0.N(f10));
    }

    public final void d(int i7, boolean z10, boolean z11) {
        this.f14853c.t("" + i7, z11, true);
        this.d.t("" + i7, z11, true);
        this.f14854e = z10;
        if (!z11) {
            this.f14855f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i7, int i10, int i11) {
        this.f14860l = i7;
        this.f14851a.setColor(i7);
        this.f14853c.u(i7);
        this.d.u(i11);
        this.f14852b.setColor(i10);
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
        this.f14862n = getBounds().centerX();
        this.f14863o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.f14862n = getBounds().centerX();
        this.f14863o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
