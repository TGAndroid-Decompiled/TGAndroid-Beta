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
    public final Paint f4937a;
    public final Paint f4938b;
    public final k f4939c;
    public final k d;
    public boolean e;
    public final org.telegram.ui.Components.e6 f4940f;
    public final Path f4941g;
    public final int h;
    public float f4942i;
    public float f4943j;
    public float f4944k;
    public int f4945l;
    public boolean f4946m;
    public float f4947n;
    public float f4948o;

    public l(int i10) {
        Paint paint = new Paint(1);
        this.f4937a = paint;
        this.f4938b = new Paint(1);
        k kVar = new k(this, 0);
        this.f4939c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.e = false;
        androidx.fragment.app.a0 a0Var = new androidx.fragment.app.a0(this, 6);
        tr trVar = tr.h;
        this.f4940f = new org.telegram.ui.Components.e6(a0Var, 350L, trVar, 0);
        this.f4941g = new Path();
        this.f4942i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.k(0.3f, 250L, trVar);
        kVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.t(AndroidUtilities.dpf2(12.0f));
        kVar.f26991b = 17;
        kVar2.k(0.3f, 250L, trVar);
        kVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar2.t(AndroidUtilities.dpf2(12.0f));
        kVar2.f26991b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f7) {
        float dpf2 = AndroidUtilities.dpf2(this.f4942i) / 2.0f;
        float e = this.f4940f.e(this.e);
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i10 > 0) {
            Paint paint = this.f4938b;
            paint.setAlpha((int) (f7 * 255.0f * e));
            canvas.drawCircle(this.f4947n, this.f4948o, AndroidUtilities.dpf2(11.33f) * e, paint);
        }
        Paint paint2 = this.f4937a;
        paint2.setAlpha((int) ((1.0f - e) * Color.alpha(this.f4945l) * f7));
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = this.f4947n;
        float f11 = this.f4948o;
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
        canvas.translate(this.f4943j + 0.0f, this.f4944k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.f4947n - AndroidUtilities.dp(20.0f)), (int) (this.f4948o - AndroidUtilities.dp(20.0f)), (int) (this.f4947n + AndroidUtilities.dp(20.0f)), (int) (this.f4948o + AndroidUtilities.dp(20.0f)));
        k kVar = this.f4939c;
        kVar.setBounds(rect);
        kVar.f27008w = (int) (Color.alpha(this.f4945l) * f7);
        kVar.draw(canvas);
        if (i10 > 0) {
            Path path = this.f4941g;
            path.rewind();
            path.addCircle(this.f4947n, this.f4948o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.f27008w = (int) (f7 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f4946m != z10) {
            this.f4946m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f4937a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f4939c.f26990a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f7) {
        this.d.t(AndroidUtilities.dpf2(f7));
        this.f4939c.t(AndroidUtilities.dpf2(f7));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.f4939c.q("" + i10, z11, true);
        this.d.q("" + i10, z11, true);
        this.e = z10;
        if (!z11) {
            this.f4940f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.f4945l = i10;
        this.f4937a.setColor(i10);
        this.f4939c.r(i10);
        this.d.r(i12);
        this.f4938b.setColor(i11);
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
        this.f4947n = getBounds().centerX();
        this.f4948o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f4947n = getBounds().centerX();
        this.f4948o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
