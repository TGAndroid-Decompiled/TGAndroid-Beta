package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import di.nb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.xi0;
public final class i0 extends Drawable {
    public final ImageView f9709a;
    public final Paint f9710b;
    public final RectF f9711c;
    public final long d;
    public final Drawable f9712e;
    public boolean f9713f;
    public float f9714g;
    public boolean h;
    public final e6 f9715i;
    public final e6 f9716j;
    public final e6 f9717k;
    public xi0 f9718l;

    public i0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f9710b = paint;
        this.f9711c = new RectF();
        this.h = false;
        nb nbVar = new nb(this, 11);
        pr prVar = pr.h;
        this.f9715i = new e6(nbVar, 320L, prVar, 0);
        this.f9716j = new e6(new nb(this, 11), 320L, prVar, 0);
        this.f9717k = new e6(new nb(this, 11), 320L, prVar, 0);
        this.f9709a = imageView;
        this.d = System.currentTimeMillis();
        this.f9712e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        float f10;
        xi0 xi0Var;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e7 = this.f9717k.e(this.h);
        if (e7 < 1.0f) {
            float f11 = 1.0f - e7;
            float f12 = (0.4f * f11) + 0.6f;
            canvas2.save();
            float f13 = centerX;
            float f14 = centerY;
            canvas2.scale(f12, f12, f13, f14);
            Drawable drawable = this.f9712e;
            drawable.setBounds(vl.w(2, centerX, drawable), vl.e(2, centerY, drawable), vl.B(2, centerX, drawable), vl.z(2, centerY, drawable));
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = j6.l1(0.2f * f11, -1);
            Paint paint = this.f9710b;
            paint.setColor(l1);
            canvas2.drawCircle(f13, f14, dp, paint);
            float f15 = f11 * 1.0f;
            paint.setColor(j6.l1(f15, -1));
            float f16 = f13 - dp;
            f7 = 255.0f;
            float f17 = f14 - dp;
            float f18 = f13 + dp;
            float f19 = f14 + dp;
            RectF rectF = this.f9711c;
            rectF.set(f16, f17, f18, f19);
            float e10 = this.f9715i.e(this.f9713f);
            paint.setColor(j6.l1((1.0f - e10) * f11 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j3) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j3)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            for (int i11 = 0; i11 < 4; i11++) {
                u1.a aVar = sp.h;
                aVar.getInterpolation((currentTimeMillis2 - (i11 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i10 + 667)) / 667.0f) * 250.0f;
            }
            f10 = 0.0f;
            paint.setColor(j6.l1(f15, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f9716j.d(this.f9714g, false)) * (-360.0f) * e10, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f7 = 255.0f;
            f10 = 0.0f;
        }
        if (e7 > f10 && (xi0Var = this.f9718l) != null) {
            int i12 = xi0Var.f32552b / 2;
            int i13 = xi0Var.f32554c / 2;
            xi0Var.setBounds(centerX - i12, centerY - i13, i12 + centerX, i13 + centerY);
            this.f9718l.setAlpha((int) (e7 * f7));
            this.f9718l.draw(canvas2);
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
