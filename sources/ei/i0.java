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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.jq;
public final class i0 extends Drawable {
    public final ImageView f9105a;
    public final Paint f9106b;
    public final RectF f9107c;
    public final long d;
    public final Drawable f9108e;
    public boolean f9109f;
    public float f9110g;
    public boolean h;
    public final g6 f9111i;
    public final g6 f9112j;
    public final g6 f9113k;
    public dk0 f9114l;

    public i0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f9106b = paint;
        this.f9107c = new RectF();
        this.h = false;
        rc rcVar = new rc(this, 7);
        is isVar = is.h;
        this.f9111i = new g6(rcVar, 320L, isVar, 0);
        this.f9112j = new g6(new rc(this, 7), 320L, isVar, 0);
        this.f9113k = new g6(new rc(this, 7), 320L, isVar, 0);
        this.f9105a = imageView;
        this.d = System.currentTimeMillis();
        this.f9108e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        dk0 dk0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e7 = this.f9113k.e(this.h);
        float f11 = 0.0f;
        char c10 = 2;
        if (e7 < 1.0f) {
            float f12 = 1.0f - e7;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = centerX;
            float f15 = centerY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.f9108e;
            drawable.setBounds(org.telegram.ui.Cells.c1.s(2, centerX, drawable), org.telegram.ui.Cells.c1.c(2, centerY, drawable), org.telegram.ui.Cells.c1.w(2, centerX, drawable), org.telegram.ui.Cells.c1.v(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int m12 = i6.m1(0.2f * f12, -1);
            Paint paint = this.f9106b;
            paint.setColor(m12);
            canvas2.drawCircle(f14, f15, dp, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(i6.m1(f16, -1));
            float f17 = f14 - dp;
            f10 = 255.0f;
            float f18 = f15 - dp;
            float f19 = f14 + dp;
            float f20 = f15 + dp;
            RectF rectF = this.f9107c;
            rectF.set(f17, f18, f19, f20);
            float e10 = this.f9111i.e(this.f9109f);
            paint.setColor(i6.m1((1.0f - e10) * f12 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j3) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j3)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i11 = 0;
            while (i11 < 4) {
                u1.a aVar = jq.h;
                float f21 = f11;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
                i11++;
                f11 = f21;
                c10 = c10;
            }
            f7 = f11;
            paint.setColor(i6.m1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f9112j.d(this.f9110g, false)) * (-360.0f) * e10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 0.0f;
            f10 = 255.0f;
        }
        if (e7 > f7 && (dk0Var = this.f9114l) != null) {
            int i12 = dk0Var.f25727b / 2;
            int i13 = dk0Var.f25729c / 2;
            dk0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f9114l.setAlpha((int) (e7 * f10));
            this.f9114l.draw(canvas2);
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
