package di;

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
import org.telegram.ui.Components.es;
public final class l extends Drawable {
    public final Paint f7322a;
    public final Paint f7323b;
    public final k f7324c;
    public final k d;
    public boolean e;
    public final org.telegram.ui.Components.g6 f7325f;
    public final Path f7326g;
    public final int h;
    public float f7327i;
    public float f7328j;
    public float f7329k;
    public int f7330l;
    public boolean f7331m;
    public float f7332n;
    public float f7333o;

    public l(int i10) {
        Paint paint = new Paint(1);
        this.f7322a = paint;
        this.f7323b = new Paint(1);
        k kVar = new k(this, 0);
        this.f7324c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.e = false;
        bi.la laVar = new bi.la(this, 15);
        es esVar = es.h;
        this.f7325f = new org.telegram.ui.Components.g6(laVar, 350L, esVar, 0);
        this.f7326g = new Path();
        this.f7327i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.n(0.3f, 250L, esVar);
        kVar.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.w(AndroidUtilities.dpf2(12.0f));
        kVar.f28435b = 17;
        kVar2.n(0.3f, 250L, esVar);
        kVar2.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar2.w(AndroidUtilities.dpf2(12.0f));
        kVar2.f28435b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f7) {
        float dpf2 = AndroidUtilities.dpf2(this.f7327i) / 2.0f;
        float e = this.f7325f.e(this.e);
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f7323b;
            paint.setAlpha((int) (f7 * 255.0f * e));
            canvas.drawCircle(this.f7332n, this.f7333o, AndroidUtilities.dpf2(11.33f) * e, paint);
        }
        Paint paint2 = this.f7322a;
        paint2.setAlpha((int) ((1.0f - e) * Color.alpha(this.f7330l) * f7));
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = this.f7332n;
        float f11 = this.f7333o;
        rectF.set(f10 - dpf2, f11 - dpf2, f10 + dpf2, f11 + dpf2);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i11 = this.h;
        float f12 = ((i11 + 1) * 1.5f) + (i11 * 1.0f);
        float f13 = (1.0f / f12) * 180.0f;
        float f14 = (1.5f / f12) * 180.0f;
        int i12 = 0;
        float f15 = f14;
        while (i12 < i11) {
            float f16 = f13;
            canvas.drawArc(AndroidUtilities.rectTmp, f15 + 270.0f, f16, false, paint2);
            f15 = f16 + f14 + f15;
            i12++;
            f13 = f16;
        }
        canvas.save();
        canvas.translate(this.f7328j + 0.0f, this.f7329k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.f7332n - AndroidUtilities.dp(20.0f)), (int) (this.f7333o - AndroidUtilities.dp(20.0f)), (int) (this.f7332n + AndroidUtilities.dp(20.0f)), (int) (this.f7333o + AndroidUtilities.dp(20.0f)));
        k kVar = this.f7324c;
        kVar.setBounds(rect);
        kVar.B = (int) (Color.alpha(this.f7330l) * f7);
        kVar.draw(canvas);
        if (i10 > 0) {
            Path path = this.f7326g;
            path.rewind();
            path.addCircle(this.f7332n, this.f7333o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.B = (int) (f7 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f7331m != z10) {
            this.f7331m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f7322a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f7324c.f28433a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f7) {
        this.d.w(AndroidUtilities.dpf2(f7));
        this.f7324c.w(AndroidUtilities.dpf2(f7));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.f7324c.t("" + i10, z11, true);
        this.d.t("" + i10, z11, true);
        this.e = z10;
        if (!z11) {
            this.f7325f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.f7330l = i10;
        this.f7322a.setColor(i10);
        this.f7324c.u(i10);
        this.d.u(i12);
        this.f7323b.setColor(i11);
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
        this.f7332n = getBounds().centerX();
        this.f7333o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f7332n = getBounds().centerX();
        this.f7333o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
