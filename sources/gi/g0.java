package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ei.bc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zr;
public final class g0 extends Drawable {
    public final ImageView f11236a;
    public final Paint f11237b;
    public final RectF f11238c;
    public final long d;
    public final Drawable e;
    public boolean f11239f;
    public float f11240g;
    public boolean h;
    public final d6 f11241i;
    public final d6 f11242j;
    public final d6 f11243k;
    public xj0 f11244l;

    public g0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f11237b = paint;
        this.f11238c = new RectF();
        this.h = false;
        bc bcVar = new bc(this, 3);
        zr zrVar = zr.h;
        this.f11241i = new d6(bcVar, 320L, zrVar, 0);
        this.f11242j = new d6(new bc(this, 3), 320L, zrVar, 0);
        this.f11243k = new d6(new bc(this, 3), 320L, zrVar, 0);
        this.f11236a = imageView;
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
        xj0 xj0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e = this.f11243k.e(this.h);
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
            drawable.setBounds(org.telegram.ui.Cells.b1.f(2, centerX, drawable), tl.d(2, centerY, drawable), org.telegram.ui.Cells.b1.y(2, centerX, drawable), org.telegram.ui.Cells.b1.u(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int o12 = k6.o1(0.2f * f12, -1);
            Paint paint = this.f11237b;
            paint.setColor(o12);
            canvas2.drawCircle(f14, f15, dp, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(k6.o1(f16, -1));
            float f17 = f14 - dp;
            f10 = 255.0f;
            float f18 = f15 - dp;
            float f19 = f14 + dp;
            float f20 = f15 + dp;
            RectF rectF = this.f11238c;
            rectF.set(f17, f18, f19, f20);
            float e7 = this.f11241i.e(this.f11239f);
            paint.setColor(k6.o1((1.0f - e7) * f12 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j10) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j10)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            int i11 = 0;
            while (i11 < 4) {
                u1.a aVar = cq.h;
                float f21 = f11;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
                i11++;
                f11 = f21;
                c10 = c10;
            }
            f7 = f11;
            paint.setColor(k6.o1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f11242j.d(this.f11240g, false)) * (-360.0f) * e7, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 0.0f;
            f10 = 255.0f;
        }
        if (e > f7 && (xj0Var = this.f11244l) != null) {
            int i12 = xj0Var.f32595b / 2;
            int i13 = xj0Var.f32597c / 2;
            xj0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f11244l.setAlpha((int) (e * f10));
            this.f11244l.draw(canvas2);
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
