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
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
public final class i0 extends Drawable {
    public final ImageView f8379a;
    public final Paint f8380b;
    public final RectF f8381c;
    public final long d;
    public final Drawable e;
    public boolean f8382f;
    public float f8383g;
    public boolean h;
    public final e6 f8384i;
    public final e6 f8385j;
    public final e6 f8386k;
    public lj0 f8387l;

    public i0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f8380b = paint;
        this.f8381c = new RectF();
        this.h = false;
        rc rcVar = new rc(this, 7);
        tr trVar = tr.h;
        this.f8384i = new e6(rcVar, 320L, trVar, 0);
        this.f8385j = new e6(new rc(this, 7), 320L, trVar, 0);
        this.f8386k = new e6(new rc(this, 7), 320L, trVar, 0);
        this.f8379a = imageView;
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
        lj0 lj0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e = this.f8386k.e(this.h);
        if (e < 1.0f) {
            float f11 = 1.0f - e;
            float f12 = (0.4f * f11) + 0.6f;
            canvas2.save();
            float f13 = centerX;
            float f14 = centerY;
            canvas2.scale(f12, f12, f13, f14);
            Drawable drawable = this.e;
            drawable.setBounds(ok.z(2, centerX, drawable), ok.d(2, centerY, drawable), org.telegram.ui.Cells.c1.t(2, centerX, drawable), org.telegram.ui.Cells.c1.d(2, centerY, drawable));
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = h6.l1(0.2f * f11, -1);
            Paint paint = this.f8380b;
            paint.setColor(l1);
            canvas2.drawCircle(f13, f14, dp, paint);
            float f15 = f11 * 1.0f;
            paint.setColor(h6.l1(f15, -1));
            float f16 = f13 - dp;
            f7 = 255.0f;
            float f17 = f14 - dp;
            float f18 = f13 + dp;
            float f19 = f14 + dp;
            RectF rectF = this.f8381c;
            rectF.set(f16, f17, f18, f19);
            float e7 = this.f8384i.e(this.f8382f);
            paint.setColor(h6.l1((1.0f - e7) * f11 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j3) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j3)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                u1.a aVar = wp.h;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
            }
            f10 = 0.0f;
            paint.setColor(h6.l1(f15, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f8385j.d(this.f8383g, false)) * (-360.0f) * e7, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 255.0f;
            f10 = 0.0f;
        }
        if (e > f10 && (lj0Var = this.f8387l) != null) {
            int i12 = lj0Var.f26009b / 2;
            int i13 = lj0Var.f26011c / 2;
            lj0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f8387l.setAlpha((int) (e * f7));
            this.f8387l.draw(canvas2);
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
