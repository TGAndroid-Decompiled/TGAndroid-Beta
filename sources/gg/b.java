package gg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mr;
public final class b extends View {
    public final j6 f6544a;
    public float f6545b;
    public ValueAnimator f6546c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.f6545b = 1.0f;
        j6 j6Var = new j6(false, false, true, false);
        this.f6544a = j6Var;
        j6Var.k(0.3f, 250L, mr.h);
        j6Var.setCallback(this);
        j6Var.t(AndroidUtilities.dp(11.5f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.r(-1);
        j6Var.q("", true, true);
        j6Var.f25847b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i10, boolean z4) {
        if (!p0.i()) {
            i10 = 0;
        }
        if (i10 > 0) {
            setVisibility(0);
        }
        j6 j6Var = this.f6544a;
        if (z4) {
            j6Var.b();
        }
        if (z4 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.f6546c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f6546c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f6546c = ofFloat;
            ofFloat.addUpdateListener(new dg.o1(this, 9));
            this.f6546c.addListener(new cg.l0(this, 6));
            this.f6546c.setInterpolator(new OvershootInterpolator(2.0f));
            this.f6546c.setDuration(200L);
            this.f6546c.start();
        }
        this.d = i10;
        int length = j6Var.f25850g.length();
        j6Var.q("x" + i10, z4, true);
        int length2 = j6Var.f25850g.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        int dp = AndroidUtilities.dp(8.0f);
        j6 j6Var = this.f6544a;
        rect.set(0, 0, dp + ((int) j6Var.d()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.f6545b != 1.0f) {
            canvas.save();
            float f10 = this.f6545b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        j6Var.setBounds(rect);
        j6Var.draw(canvas);
        if (this.f6545b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f6544a.e() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }
}
