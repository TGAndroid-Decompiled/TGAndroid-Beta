package bi;

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
import org.telegram.ui.Components.wr;
public final class n extends Drawable {
    public final Paint f3208a;
    public final Paint f3209b;
    public final m f3210c;
    public final m d;
    public boolean e;
    public final org.telegram.ui.Components.d6 f3211f;
    public final Path f3212g;
    public final int h;
    public float f3213i;
    public float f3214j;
    public float f3215k;
    public int f3216l;
    public boolean f3217m;
    public float f3218n;
    public float f3219o;

    public n(int i10) {
        Paint paint = new Paint(1);
        this.f3208a = paint;
        this.f3209b = new Paint(1);
        m mVar = new m(this, 0);
        this.f3210c = mVar;
        m mVar2 = new m(this, 1);
        this.d = mVar2;
        this.e = false;
        a3.d dVar = new a3.d(this, 12);
        wr wrVar = wr.h;
        this.f3211f = new org.telegram.ui.Components.d6(dVar, 350L, wrVar, 0);
        this.f3212g = new Path();
        this.f3213i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        mVar.k(0.3f, 250L, wrVar);
        mVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        mVar.t(AndroidUtilities.dpf2(12.0f));
        mVar.f25425b = 17;
        mVar2.k(0.3f, 250L, wrVar);
        mVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        mVar2.t(AndroidUtilities.dpf2(12.0f));
        mVar2.f25425b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f7) {
        float dpf2 = AndroidUtilities.dpf2(this.f3213i) / 2.0f;
        float e = this.f3211f.e(this.e);
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f3209b;
            paint.setAlpha((int) (f7 * 255.0f * e));
            canvas.drawCircle(this.f3218n, this.f3219o, AndroidUtilities.dpf2(11.33f) * e, paint);
        }
        Paint paint2 = this.f3208a;
        paint2.setAlpha((int) ((1.0f - e) * Color.alpha(this.f3216l) * f7));
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = this.f3218n;
        float f11 = this.f3219o;
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
        canvas.translate(this.f3214j + 0.0f, this.f3215k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.f3218n - AndroidUtilities.dp(20.0f)), (int) (this.f3219o - AndroidUtilities.dp(20.0f)), (int) (this.f3218n + AndroidUtilities.dp(20.0f)), (int) (this.f3219o + AndroidUtilities.dp(20.0f)));
        m mVar = this.f3210c;
        mVar.setBounds(rect);
        mVar.f25442w = (int) (Color.alpha(this.f3216l) * f7);
        mVar.draw(canvas);
        if (i10 > 0) {
            Path path = this.f3212g;
            path.rewind();
            path.addCircle(this.f3218n, this.f3219o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e, Path.Direction.CW);
            canvas.clipPath(path);
            m mVar2 = this.d;
            mVar2.setBounds(rect);
            mVar2.f25442w = (int) (f7 * 255.0f);
            mVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f3217m != z10) {
            this.f3217m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f3208a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f3210c.f25424a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f7) {
        this.d.t(AndroidUtilities.dpf2(f7));
        this.f3210c.t(AndroidUtilities.dpf2(f7));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.f3210c.q("" + i10, z11, true);
        this.d.q("" + i10, z11, true);
        this.e = z10;
        if (!z11) {
            this.f3211f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.f3216l = i10;
        this.f3208a.setColor(i10);
        this.f3210c.r(i10);
        this.d.r(i12);
        this.f3209b.setColor(i11);
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
        this.f3218n = getBounds().centerX();
        this.f3219o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f3218n = getBounds().centerX();
        this.f3219o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
