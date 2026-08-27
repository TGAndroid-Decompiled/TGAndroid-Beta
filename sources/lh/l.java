package lh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class l extends Drawable {

    public final Paint f16267a;

    public final Paint f16268b;

    public final k f16269c;
    public final k d;

    public boolean f16270e;

    public final org.telegram.ui.Components.y5 f16271f;

    public final Path f16272g;
    public final int h;

    public float f16273i;

    public float f16274j;

    public float f16275k;

    public int f16276l;

    public boolean f16277m;

    public float f16278n;

    public float f16279o;

    public l(int i10) {
        Paint paint = new Paint(1);
        this.f16267a = paint;
        this.f16268b = new Paint(1);
        k kVar = new k(this, 0);
        this.f16269c = kVar;
        k kVar2 = new k(this, 1);
        this.d = kVar2;
        this.f16270e = false;
        kh.c cVar = new kh.c(this, 3);
        er erVar = er.h;
        this.f16271f = new org.telegram.ui.Components.y5(cVar, 350L, erVar, 0);
        this.f16272g = new Path();
        this.f16273i = 21.0f;
        this.h = i10;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kVar.k(0.3f, 250L, erVar);
        kVar.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar.t(AndroidUtilities.dpf2(12.0f));
        kVar.f29239b = 17;
        kVar2.k(0.3f, 250L, erVar);
        kVar2.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        kVar2.t(AndroidUtilities.dpf2(12.0f));
        kVar2.f29239b = 17;
        e(-1, -15033089, -1);
    }

    public final void a(Canvas canvas, float f10) {
        float fDpf2 = AndroidUtilities.dpf2(this.f16273i) / 2.0f;
        float fE = this.f16271f.e(this.f16270e);
        if (fE > 0.0f) {
            Paint paint = this.f16268b;
            paint.setAlpha((int) (f10 * 255.0f * fE));
            canvas.drawCircle(this.f16278n, this.f16279o, AndroidUtilities.dpf2(11.33f) * fE, paint);
        }
        int iAlpha = (int) ((1.0f - fE) * Color.alpha(this.f16276l) * f10);
        Paint paint2 = this.f16267a;
        paint2.setAlpha(iAlpha);
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = this.f16278n;
        float f12 = this.f16279o;
        rectF.set(f11 - fDpf2, f12 - fDpf2, f11 + fDpf2, f12 + fDpf2);
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
        canvas.translate(this.f16274j + 0.0f, this.f16275k);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set((int) (this.f16278n - AndroidUtilities.dp(20.0f)), (int) (this.f16279o - AndroidUtilities.dp(20.0f)), (int) (this.f16278n + AndroidUtilities.dp(20.0f)), (int) (this.f16279o + AndroidUtilities.dp(20.0f)));
        k kVar = this.f16269c;
        kVar.setBounds(rect);
        kVar.f29257w = (int) (Color.alpha(this.f16276l) * f10);
        kVar.draw(canvas);
        if (fE > 0.0f) {
            Path path = this.f16272g;
            path.rewind();
            path.addCircle(this.f16278n, this.f16279o + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(11.33f) * fE, Path.Direction.CW);
            canvas.clipPath(path);
            k kVar2 = this.d;
            kVar2.setBounds(rect);
            kVar2.f29257w = (int) (f10 * 255.0f);
            kVar2.draw(canvas);
        }
        canvas.restore();
    }

    public final void b(boolean z10) {
        if (this.f16277m != z10) {
            this.f16277m = z10;
            this.f16267a.setXfermode(z10 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
            this.f16269c.f29238a.setXfermode(z10 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        }
    }

    public final void c(float f10) {
        this.d.t(AndroidUtilities.dpf2(f10));
        this.f16269c.t(AndroidUtilities.dpf2(f10));
    }

    public final void d(int i10, boolean z10, boolean z11) {
        this.f16269c.q("" + i10, z11, true);
        this.d.q("" + i10, z11, true);
        this.f16270e = z10;
        if (!z11) {
            this.f16271f.f(z10, true);
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        a(canvas, 1.0f);
    }

    public final void e(int i10, int i11, int i12) {
        this.f16276l = i10;
        this.f16267a.setColor(i10);
        this.f16269c.r(i10);
        this.d.r(i12);
        this.f16268b.setColor(i11);
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
        this.f16278n = getBounds().centerX();
        this.f16279o = getBounds().centerY();
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f16278n = getBounds().centerX();
        this.f16279o = getBounds().centerY();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
