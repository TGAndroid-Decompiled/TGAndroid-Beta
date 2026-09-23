package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ul;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.yi0;
public final class i0 extends Drawable {
    public final ImageView f8368a;
    public final Paint f8369b;
    public final RectF f8370c;
    public final long d;
    public final Drawable e;
    public boolean f8371f;
    public float f8372g;
    public boolean h;
    public final e6 f8373i;
    public final e6 f8374j;
    public final e6 f8375k;
    public yi0 f8376l;

    public i0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f8369b = paint;
        this.f8370c = new RectF();
        this.h = false;
        rc rcVar = new rc(this, 7);
        rr rrVar = rr.h;
        this.f8373i = new e6(rcVar, 320L, rrVar, 0);
        this.f8374j = new e6(new rc(this, 7), 320L, rrVar, 0);
        this.f8375k = new e6(new rc(this, 7), 320L, rrVar, 0);
        this.f8368a = imageView;
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
        yi0 yi0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e = this.f8375k.e(this.h);
        if (e < 1.0f) {
            float f11 = 1.0f - e;
            float f12 = (0.4f * f11) + 0.6f;
            canvas2.save();
            float f13 = centerX;
            float f14 = centerY;
            canvas2.scale(f12, f12, f13, f14);
            Drawable drawable = this.e;
            drawable.setBounds(ul.x(2, centerX, drawable), ul.e(2, centerY, drawable), ul.B(2, centerX, drawable), ul.z(2, centerY, drawable));
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = h6.l1(0.2f * f11, -1);
            Paint paint = this.f8369b;
            paint.setColor(l1);
            canvas2.drawCircle(f13, f14, dp, paint);
            float f15 = f11 * 1.0f;
            paint.setColor(h6.l1(f15, -1));
            float f16 = f13 - dp;
            f7 = 255.0f;
            float f17 = f14 - dp;
            float f18 = f13 + dp;
            float f19 = f14 + dp;
            RectF rectF = this.f8370c;
            rectF.set(f16, f17, f18, f19);
            float e7 = this.f8373i.e(this.f8371f);
            paint.setColor(h6.l1((1.0f - e7) * f11 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j3) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j3)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                u1.a aVar = up.h;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
            }
            f10 = 0.0f;
            paint.setColor(h6.l1(f15, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f8374j.d(this.f8372g, false)) * (-360.0f) * e7, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 255.0f;
            f10 = 0.0f;
        }
        if (e > f10 && (yi0Var = this.f8376l) != null) {
            int i12 = yi0Var.f30259b / 2;
            int i13 = yi0Var.f30261c / 2;
            yi0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f8376l.setAlpha((int) (e * f7));
            this.f8376l.draw(canvas2);
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
