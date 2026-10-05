package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import ci.qc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
public final class j0 extends Drawable {
    public final ImageView f9106a;
    public final Paint f9107b;
    public final RectF f9108c;
    public final long d;
    public final Drawable f9109e;
    public boolean f9110f;
    public float f9111g;
    public boolean h;
    public final e6 f9112i;
    public final e6 f9113j;
    public final e6 f9114k;
    public kj0 f9115l;

    public j0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f9107b = paint;
        this.f9108c = new RectF();
        this.h = false;
        qc qcVar = new qc(this, 7);
        tr trVar = tr.h;
        this.f9112i = new e6(qcVar, 320L, trVar, 0);
        this.f9113j = new e6(new qc(this, 7), 320L, trVar, 0);
        this.f9114k = new e6(new qc(this, 7), 320L, trVar, 0);
        this.f9106a = imageView;
        this.d = System.currentTimeMillis();
        this.f9109e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        kj0 kj0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e7 = this.f9114k.e(this.h);
        if (e7 < 1.0f) {
            float f11 = 1.0f - e7;
            float f12 = (0.4f * f11) + 0.6f;
            canvas2.save();
            float f13 = centerX;
            float f14 = centerY;
            canvas2.scale(f12, f12, f13, f14);
            Drawable drawable = this.f9109e;
            drawable.setBounds(org.telegram.ui.Cells.c1.t(2, centerX, drawable), org.telegram.ui.Cells.c1.e(2, centerY, drawable), org.telegram.ui.Cells.c1.x(2, centerX, drawable), org.telegram.ui.Cells.c1.w(2, centerY, drawable));
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = i6.l1(0.2f * f11, -1);
            Paint paint = this.f9107b;
            paint.setColor(l1);
            canvas2.drawCircle(f13, f14, dp, paint);
            float f15 = f11 * 1.0f;
            paint.setColor(i6.l1(f15, -1));
            float f16 = f13 - dp;
            f7 = 255.0f;
            float f17 = f14 - dp;
            float f18 = f13 + dp;
            float f19 = f14 + dp;
            RectF rectF = this.f9108c;
            rectF.set(f16, f17, f18, f19);
            float e10 = this.f9112i.e(this.f9110f);
            paint.setColor(i6.l1((1.0f - e10) * f11 * 0.15f, -1));
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
            paint.setColor(i6.l1(f15, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f9113j.d(this.f9111g, false)) * (-360.0f) * e10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 255.0f;
            f10 = 0.0f;
        }
        if (e7 > f10 && (kj0Var = this.f9115l) != null) {
            int i12 = kj0Var.f28211b / 2;
            int i13 = kj0Var.f28213c / 2;
            kj0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f9115l.setAlpha((int) (e7 * f7));
            this.f9115l.draw(canvas2);
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
