package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import bi.wc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
public final class l0 extends Drawable {
    public final ImageView f6736a;
    public final Paint f6737b;
    public final RectF f6738c;
    public final long d;
    public final Drawable e;
    public boolean f6739f;
    public float f6740g;
    public boolean h;
    public final d6 f6741i;
    public final d6 f6742j;
    public final d6 f6743k;
    public hj0 f6744l;

    public l0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f6737b = paint;
        this.f6738c = new RectF();
        this.h = false;
        wc wcVar = new wc(this, 13);
        wr wrVar = wr.h;
        this.f6741i = new d6(wcVar, 320L, wrVar, 0);
        this.f6742j = new d6(new wc(this, 13), 320L, wrVar, 0);
        this.f6743k = new d6(new wc(this, 13), 320L, wrVar, 0);
        this.f6736a = imageView;
        this.d = System.currentTimeMillis();
        this.e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        hj0 hj0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e = this.f6743k.e(this.h);
        if (e < 1.0f) {
            float f11 = 1.0f - e;
            float f12 = (0.4f * f11) + 0.6f;
            canvas2.save();
            float f13 = centerX;
            float f14 = centerY;
            canvas2.scale(f12, f12, f13, f14);
            Drawable drawable = this.e;
            drawable.setBounds(em.w(2, centerX, drawable), em.e(2, centerY, drawable), em.B(2, centerX, drawable), em.z(2, centerY, drawable));
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = j6.l1(0.2f * f11, -1);
            Paint paint = this.f6737b;
            paint.setColor(l1);
            canvas2.drawCircle(f13, f14, dp, paint);
            float f15 = f11 * 1.0f;
            paint.setColor(j6.l1(f15, -1));
            float f16 = f13 - dp;
            f7 = 255.0f;
            float f17 = f14 - dp;
            float f18 = f13 + dp;
            float f19 = f14 + dp;
            RectF rectF = this.f6738c;
            rectF.set(f16, f17, f18, f19);
            float e7 = this.f6741i.e(this.f6739f);
            paint.setColor(j6.l1((1.0f - e7) * f11 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j3) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j3)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                u1.a aVar = zp.h;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
            }
            f10 = 0.0f;
            paint.setColor(j6.l1(f15, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f6742j.d(this.f6740g, false)) * (-360.0f) * e7, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 255.0f;
            f10 = 0.0f;
        }
        if (e > f10 && (hj0Var = this.f6744l) != null) {
            int i12 = hj0Var.f23647b / 2;
            int i13 = hj0Var.f23649c / 2;
            hj0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f6744l.setAlpha((int) (e * f7));
            this.f6744l.draw(canvas2);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(40.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(40.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
