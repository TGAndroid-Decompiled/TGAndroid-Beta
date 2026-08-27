package nh;

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
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.y5;

public final class g0 extends Drawable {

    public final ImageView f18688a;

    public final Paint f18689b;

    public final RectF f18690c;
    public final long d;

    public final Drawable f18691e;

    public boolean f18692f;

    public float f18693g;
    public boolean h;

    public final y5 f18694i;

    public final y5 f18695j;

    public final y5 f18696k;

    public oi0 f18697l;

    public g0(Context context, ImageView imageView) {
        Paint paint = new Paint(1);
        this.f18689b = paint;
        this.f18690c = new RectF();
        this.h = false;
        f0 f0Var = new f0(this, 0);
        er erVar = er.h;
        this.f18694i = new y5(f0Var, 320L, erVar, 0);
        this.f18695j = new y5(new f0(this, 0), 320L, erVar, 0);
        this.f18696k = new y5(new f0(this, 0), 320L, erVar, 0);
        this.f18688a = imageView;
        this.d = System.currentTimeMillis();
        this.f18691e = context.getResources().getDrawable(R.drawable.search_files_filled).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        oi0 oi0Var;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int iCenterX = bounds.centerX();
        int iCenterY = bounds.centerY();
        float fE = this.f18696k.e(this.h);
        if (fE < 1.0f) {
            float f12 = 1.0f - fE;
            float f13 = (0.4f * f12) + 0.6f;
            canvas2.save();
            float f14 = iCenterX;
            float f15 = iCenterY;
            canvas2.scale(f13, f13, f14, f15);
            Drawable drawable = this.f18691e;
            drawable.setBounds(rl.v(2, iCenterX, drawable), rl.e(2, iCenterY, drawable), rl.A(2, iCenterX, drawable), rl.y(2, iCenterY, drawable));
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.draw(canvas2);
            float fDp = AndroidUtilities.dp(14.0f);
            int iL1 = g6.l1(0.2f * f12, -1);
            Paint paint = this.f18689b;
            paint.setColor(iL1);
            canvas2.drawCircle(f14, f15, fDp, paint);
            float f16 = f12 * 1.0f;
            paint.setColor(g6.l1(f16, -1));
            float f17 = f14 - fDp;
            f10 = 255.0f;
            float f18 = f15 - fDp;
            float f19 = f14 + fDp;
            float f20 = f15 + fDp;
            RectF rectF = this.f18690c;
            rectF.set(f17, f18, f19, f20);
            float fE2 = this.f18694i.e(this.f18692f);
            paint.setColor(g6.l1((1.0f - fE2) * f12 * 0.15f, -1));
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.d;
            canvas2.drawArc(rectF, (-(((((jCurrentTimeMillis - j10) % 600) / 600.0f) - 1.0f) * 360.0f)) - 90.0f, -90.0f, false, paint);
            float fCurrentTimeMillis = ((System.currentTimeMillis() - j10) * 0.45f) % 5400.0f;
            float fMax = Math.max(0.0f, ((1520.0f * fCurrentTimeMillis) / 5400.0f) - 20.0f);
            for (int i10 = 0; i10 < 4; i10++) {
                u1.a aVar = hp.h;
                int i11 = i10 * 1350;
                aVar.getInterpolation((fCurrentTimeMillis - i11) / 667.0f);
                fMax += aVar.getInterpolation((fCurrentTimeMillis - (i11 + 667)) / 667.0f) * 250.0f;
            }
            f11 = 0.0f;
            paint.setColor(g6.l1(f16, -1));
            canvas2 = canvas;
            canvas2.drawArc(rectF, (-90.0f) - fMax, Math.max(0.02f, this.f18695j.d(this.f18693g, false)) * (-360.0f) * fE2, false, paint);
            invalidateSelf();
            canvas2.restore();
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (fE <= f11 || (oi0Var = this.f18697l) == null) {
            return;
        }
        int i12 = oi0Var.f31307b / 2;
        int i13 = oi0Var.f31309c / 2;
        oi0Var.setBounds(iCenterX - i12, iCenterY - i13, i12 + iCenterX, i13 + iCenterY);
        this.f18697l.setAlpha((int) (fE * f10));
        this.f18697l.draw(canvas2);
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
