package kh;

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
import org.telegram.ui.Components.gr;
public final class l extends Drawable {
    public final Paint f15559a;
    public final Paint f15560b;
    public final k f15561c;
    public final k d;
    public boolean f15562e;
    public final org.telegram.ui.Components.y5 f15563f;
    public final Path f15564g;
    public final int h;
    public float f15565i;
    public float f15566j;
    public float f15567k;
    public int f15568l;
    public boolean f15569m;
    public float f15570n;
    public float f15571o;

    public l(int i9) {
        Paint paint = new Paint(1);
        this.f15559a = paint;
        this.f15560b = new Paint(1);
        k kVar = new k(this, 0);
        this.f15561c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.f15562e = false;
        ih.g gVar = new ih.g(this, 26);
        gr grVar = gr.h;
        this.f15563f = new org.telegram.ui.Components.y5(gVar, 350L, grVar, 0);
        this.f15564g = new Path();
        this.f15565i = 21.0f;
        this.h = i9;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.k(0.3f, 250L, grVar);
        kVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.t(AndroidUtilities.dpf2(12.0f));
        kVar.f29333b = 17;
        kVar2.k(0.3f, 250L, grVar);
        kVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar2.t(AndroidUtilities.dpf2(12.0f));
        kVar2.f29333b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float dpf2 = AndroidUtilities.dpf2(this.f15565i) / 2.0f;
        float e10 = this.f15563f.e(this.f15562e);
        int i9 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i9 > 0) {
            Paint paint = this.f15560b;
            paint.setAlpha((int) (f10 * 255.0f * e10));
            canvas.drawCircle(this.f15570n, this.f15571o, AndroidUtilities.dpf2(11.33f) * e10, paint);
        }
        Paint paint2 = this.f15559a;
        paint2.setAlpha((int) ((1.0f - e10) * Color.alpha(this.f15568l) * f10));
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = this.f15570n;
        float f12 = this.f15571o;
        rectF.set(f11 - dpf2, f12 - dpf2, f11 + dpf2, f12 + dpf2);
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint2);
        int i10 = this.h;
        float f13 = ((i10 + 1) * 1.5f) + (i10 * 1.0f);
        float f14 = (1.0f / f13) * 180.0f;
        float f15 = (1.5f / f13) * 180.0f;
        float f16 = f15;
        int i11 = 0;
        while (i11 < i10) {
            float f17 = f14;
            canvas.drawArc(AndroidUtilities.rectTmp, f16 + 270.0f, f17, false, paint2);
            f16 = f17 + f15 + f16;
            i11++;
            f14 = f17;
        }
        canvas.save();
        canvas.translate(this.f15566j + 0.0f, this.f15567k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.f15570n - AndroidUtilities.dp(20.0f)), (int) (this.f15571o - AndroidUtilities.dp(20.0f)), (int) (this.f15570n + AndroidUtilities.dp(20.0f)), (int) (this.f15571o + AndroidUtilities.dp(20.0f)));
        k kVar = this.f15561c;
        kVar.setBounds(rect);
        kVar.f29351w = (int) (Color.alpha(this.f15568l) * f10);
        kVar.draw(canvas);
        if (i9 > 0) {
            Path path = this.f15564g;
            path.rewind();
            path.addCircle(this.f15570n, this.f15571o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * e10, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.f29351w = (int) (f10 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        PorterDuffXfermode porterDuffXfermode;
        if (this.f15569m != z10) {
            this.f15569m = z10;
            PorterDuffXfermode porterDuffXfermode2 = null;
            if (z10) {
                porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            } else {
                porterDuffXfermode = null;
            }
            this.f15559a.setXfermode(porterDuffXfermode);
            TextPaint textPaint = this.f15561c.f29332a;
            if (z10) {
                porterDuffXfermode2 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
            }
            textPaint.setXfermode(porterDuffXfermode2);
        }
    }

    public final void c(float f10) {
        this.d.t(AndroidUtilities.dpf2(f10));
        this.f15561c.t(AndroidUtilities.dpf2(f10));
    }

    public final void d(int i9, boolean z10, boolean z11) {
        this.f15561c.q("" + i9, z11, true);
        this.d.q("" + i9, z11, true);
        this.f15562e = z10;
        if (!z11) {
            this.f15563f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i9, int i10, int i11) {
        this.f15568l = i9;
        this.f15559a.setColor(i9);
        this.f15561c.r(i9);
        this.d.r(i11);
        this.f15560b.setColor(i10);
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
        this.f15570n = getBounds().centerX();
        this.f15571o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        this.f15570n = getBounds().centerX();
        this.f15571o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
