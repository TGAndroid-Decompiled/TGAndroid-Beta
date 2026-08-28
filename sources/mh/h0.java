package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.y5;
public final class h0 extends Drawable {
    public final ImageView f17867a;
    public final Paint f17868b;
    public final RectF f17869c;
    public final long d;
    public final Drawable f17870e;
    public boolean f17871f;
    public float f17872g;
    public boolean h;
    public final y5 f17873i;
    public final y5 f17874j;
    public final y5 f17875k;
    public mi0 f17876l;

    public h0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f17868b = paint;
        this.f17869c = new RectF();
        this.h = false;
        kh.f1 f1Var = new kh.f1(this, 23);
        gr grVar = gr.h;
        this.f17873i = new y5(f1Var, 320L, grVar, 0);
        this.f17874j = new y5(new kh.f1(this, 23), 320L, grVar, 0);
        this.f17875k = new y5(new kh.f1(this, 23), 320L, grVar, 0);
        this.f17867a = imageView;
        this.d = System.currentTimeMillis();
        this.f17870e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        mi0 mi0Var;
        int i9;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        float e10 = this.f17875k.e(this.h);
        if (e10 < 1.0f) {
            float f12 = 1.0f - e10;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = centerX;
            float f15 = centerY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.f17870e;
            drawable.setBounds(ll.x(2, centerX, drawable), ll.e(2, centerY, drawable), ll.B(2, centerX, drawable), ll.z(2, centerY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float dp = AndroidUtilities.dp(14.0f);
            int l1 = f6.l1(0.2f * f12, -1);
            Paint paint = this.f17868b;
            paint.setColor(l1);
            canvas2.drawCircle(f14, f15, dp, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(f6.l1(f16, -1));
            float f17 = f14 - dp;
            f10 = 255.0f;
            float f18 = f15 - dp;
            float f19 = f14 + dp;
            float f20 = f15 + dp;
            RectF rectF = this.f17869c;
            rectF.set(f17, f18, f19, f20);
            float e11 = this.f17873i.e(this.f17871f);
            paint.setColor(f6.l1((1.0f - e11) * f12 * 0.15f, -1));
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((float) ((currentTimeMillis - j10) % 600)) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float currentTimeMillis2 = (((float) (System.currentTimeMillis() - j10)) * 0.45f) % 5400.0f;
            float max = Math.max(0.0f, ((1520.0f * currentTimeMillis2) / 5400.0f) - 20.0f);
            for (int i10 = 0; i10 < 4; i10++) {
                u1.a aVar = jp.h;
                aVar.getInterpolation((currentTimeMillis2 - (i10 * 1350)) / 667.0f);
                max += aVar.getInterpolation((currentTimeMillis2 - (i9 + 667)) / 667.0f) * 250.0f;
            }
            f11 = 0.0f;
            paint.setColor(f6.l1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, this.f17874j.d(this.f17872g, false)) * (-360.0f) * e11, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (e10 > f11 && (mi0Var = this.f17876l) != null) {
            int i11 = mi0Var.f30842b / 2;
            int i12 = mi0Var.f30844c / 2;
            mi0Var.setBounds(centerX - i11, centerY - i12, i11 + centerX, i12 + centerY);
            this.f17876l.setAlpha((int) (e10 * f10));
            this.f17876l.draw(canvas2);
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
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
