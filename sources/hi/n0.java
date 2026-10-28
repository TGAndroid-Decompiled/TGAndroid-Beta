package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import fi.ua;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.yj0;
public final class n0 extends Drawable {
    public final ImageView f13137a;
    public final Paint f13138b;
    public final RectF f13139c;
    public final long d;
    public final Drawable e;
    public boolean f13140f;
    public float f13141g;
    public boolean h;
    public final h6 f13142i;
    public final h6 f13143j;
    public final h6 f13144k;
    public yj0 f13145l;

    public n0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f13138b = paint;
        this.f13139c = new RectF();
        this.h = false;
        ua uaVar = new ua(this, 8);
        ds dsVar = ds.h;
        this.f13142i = new h6(uaVar, 320L, dsVar, 0);
        this.f13143j = new h6(new ua(this, 8), 320L, dsVar, 0);
        this.f13144k = new h6(new ua(this, 8), 320L, dsVar, 0);
        this.f13137a = imageView;
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
        yj0 yj0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e = this.f13144k.e(this.h);
        float f11 = 0.0f;
        char c10 = 2;
        if (e < 1.0f) {
            float f12 = 1.0f - e;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = centerX;
            float f15 = centerY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.e;
            drawable.setBounds(org.telegram.ui.d3.x(2, centerX, drawable), org.telegram.ui.d3.i(2, centerY, drawable), org.telegram.ui.d3.C(2, centerX, drawable), org.telegram.ui.d3.B(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int o12 = y6.o1(0.2f * f12, -1);
            Paint paint = this.f13138b;
            paint.setColor(o12);
            canvas2.drawCircle(f14, f15, dp, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(y6.o1(f16, -1));
            float f17 = f14 - dp;
            f10 = 255.0f;
            float f18 = f15 - dp;
            float f19 = f14 + dp;
            float f20 = f15 + dp;
            RectF rectF = this.f13139c;
            rectF.set(f17, f18, f19, f20);
            float e10 = this.f13142i.e(this.f13140f);
            paint.setColor(y6.o1((1.0f - e10) * f12 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j10) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j10)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i11 = 0;
            while (i11 < 4) {
                u1.a aVar = gq.h;
                float f21 = f11;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
                i11++;
                f11 = f21;
                c10 = c10;
            }
            f7 = f11;
            paint.setColor(y6.o1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f13143j.d(this.f13141g, false)) * (-360.0f) * e10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 0.0f;
            f10 = 255.0f;
        }
        if (e > f7 && (yj0Var = this.f13145l) != null) {
            int i12 = yj0Var.f35068b / 2;
            int i13 = yj0Var.f35070c / 2;
            yj0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f13145l.setAlpha((int) (e * f10));
            this.f13145l.draw(canvas2);
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
