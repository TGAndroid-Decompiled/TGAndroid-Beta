package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class l extends Drawable {
    public final Paint f18020a;
    public final Paint f18021b;
    public final k f18022c;
    public final k d;
    public boolean f18023e;
    public final org.telegram.ui.Components.d6 f18024f;
    public final Path f18025g;
    public final int h;
    public float f18026i;
    public float f18027j;
    public float f18028k;
    public int f18029l;
    public boolean f18030m;
    public float f18031n;
    public float f18032o;

    public l(int i10) {
        Paint paint = new Paint(1);
        this.f18020a = paint;
        this.f18021b = new Paint(1);
        k kVar = new k(this, 0);
        this.f18022c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.f18023e = false;
        lh.m5 m5Var = new lh.m5(this, 17);
        jr jrVar = jr.h;
        this.f18024f = new org.telegram.ui.Components.d6(m5Var, 350L, jrVar, 0);
        this.f18025g = new Path();
        this.f18026i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.k(0.3f, 250L, jrVar);
        kVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.t(AndroidUtilities.dpf2(12.0f));
        kVar.f30862b = 17;
        kVar2.k(0.3f, 250L, jrVar);
        kVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar2.t(AndroidUtilities.dpf2(12.0f));
        kVar2.f30862b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f9) {
        float dpf2 = AndroidUtilities.dpf2(this.f18026i) / 2.0f;
        float e10 = this.f18024f.e(this.f18023e);
        int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f18021b;
            paint.setAlpha((int) (f9 * 255.0f * e10));
            canvas.drawCircle(this.f18031n, this.f18032o, AndroidUtilities.dpf2(11.33f) * e10, paint);
        }
        Paint paint2 = this.f18020a;
        paint2.setAlpha((int) ((1.0f - e10) * Color.alpha(this.f18029l) * f9));
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = this.f18031n;
        float f11 = this.f18032o;
        rectF.set(f10 - dpf2, f11 - dpf2, f10 + dpf2, f11 + dpf2);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i11 = this.h;
        float f12 = ((i11 + 1) * 1.5f) + (i11 * 1.0f);
        float f13 = (1.0f / f12) * 180.0f;
        float f14 = (1.5f / f12) * 180.0f;
        float f15 = f14;
        int i12 = 0;
        while (i12 < i11) {
            float f16 = f13;
            canvas.drawArc(AndroidUtilities.rectTmp, f15 + 270.0f, f16, false, paint2);
            f15 = f16 + f14 + f15;
            i12++;
            f13 = f16;
        }
        canvas.save();
        canvas.translate(this.f18027j + 0.0f, this.f18028k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.f18031n - AndroidUtilities.dp(20.0f)), (int) (this.f18032o - AndroidUtilities.dp(20.0f)), (int) (this.f18031n + AndroidUtilities.dp(20.0f)), (int) (this.f18032o + AndroidUtilities.dp(20.0f)));
        k kVar = this.f18022c;
        kVar.setBounds(rect);
        kVar.f30880w = (int) (Color.alpha(this.f18029l) * f9);
        kVar.draw(canvas);
        if (i10 > 0) {
            Path path = this.f18025g;
            path.rewind();
            path.addCircle(this.f18031n, this.f18032o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e10, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.f30880w = (int) (f9 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f18030m != z10) {
            this.f18030m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f18020a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f18022c.f30861a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f9) {
        this.d.t(AndroidUtilities.dpf2(f9));
        this.f18022c.t(AndroidUtilities.dpf2(f9));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.f18022c.q("" + i10, z11, true);
        this.d.q("" + i10, z11, true);
        this.f18023e = z10;
        if (!z11) {
            this.f18024f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.f18029l = i10;
        this.f18020a.setColor(i10);
        this.f18022c.r(i10);
        this.d.r(i12);
        this.f18021b.setColor(i11);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f18031n = getBounds().centerX();
        this.f18032o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f18031n = getBounds().centerX();
        this.f18032o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
