package ci;

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
import org.telegram.ui.Components.tr;
public final class l extends Drawable {
    public final Paint f5461a;
    public final Paint f5462b;
    public final k f5463c;
    public final k d;
    public boolean f5464e;
    public final org.telegram.ui.Components.e6 f5465f;
    public final Path f5466g;
    public final int h;
    public float f5467i;
    public float f5468j;
    public float f5469k;
    public int f5470l;
    public boolean f5471m;
    public float f5472n;
    public float f5473o;

    public l(int i10) {
        Paint paint = new Paint(1);
        this.f5461a = paint;
        this.f5462b = new Paint(1);
        k kVar = new k(this, 0);
        this.f5463c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.f5464e = false;
        androidx.fragment.app.a0 a0Var = new androidx.fragment.app.a0(this, 6);
        tr trVar = tr.h;
        this.f5465f = new org.telegram.ui.Components.e6(a0Var, 350L, trVar, 0);
        this.f5466g = new Path();
        this.f5467i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.k(0.3f, 250L, trVar);
        kVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.t(AndroidUtilities.dpf2(12.0f));
        kVar.f29239b = 17;
        kVar2.k(0.3f, 250L, trVar);
        kVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar2.t(AndroidUtilities.dpf2(12.0f));
        kVar2.f29239b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f7) {
        float dpf2 = AndroidUtilities.dpf2(this.f5467i) / 2.0f;
        float e7 = this.f5465f.e(this.f5464e);
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f5462b;
            paint.setAlpha((int) (f7 * 255.0f * e7));
            canvas.drawCircle(this.f5472n, this.f5473o, AndroidUtilities.dpf2(11.33f) * e7, paint);
        }
        Paint paint2 = this.f5461a;
        paint2.setAlpha((int) ((1.0f - e7) * Color.alpha(this.f5470l) * f7));
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = this.f5472n;
        float f11 = this.f5473o;
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
        canvas.translate(this.f5468j + 0.0f, this.f5469k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.f5472n - AndroidUtilities.dp(20.0f)), (int) (this.f5473o - AndroidUtilities.dp(20.0f)), (int) (this.f5472n + AndroidUtilities.dp(20.0f)), (int) (this.f5473o + AndroidUtilities.dp(20.0f)));
        k kVar = this.f5463c;
        kVar.setBounds(rect);
        kVar.f29257w = (int) (Color.alpha(this.f5470l) * f7);
        kVar.draw(canvas);
        if (i10 > 0) {
            Path path = this.f5466g;
            path.rewind();
            path.addCircle(this.f5472n, this.f5473o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e7, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.f29257w = (int) (f7 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f5471m != z10) {
            this.f5471m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f5461a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f5463c.f29238a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f7) {
        this.d.t(AndroidUtilities.dpf2(f7));
        this.f5463c.t(AndroidUtilities.dpf2(f7));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.f5463c.q("" + i10, z11, true);
        this.d.q("" + i10, z11, true);
        this.f5464e = z10;
        if (!z11) {
            this.f5465f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.f5470l = i10;
        this.f5461a.setColor(i10);
        this.f5463c.r(i10);
        this.d.r(i12);
        this.f5462b.setColor(i11);
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
        this.f5472n = getBounds().centerX();
        this.f5473o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f5472n = getBounds().centerX();
        this.f5473o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
