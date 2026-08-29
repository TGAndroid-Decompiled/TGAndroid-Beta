package eg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
public final class b extends View {
    public final n6 f5921a;
    public float f5922b;
    public ValueAnimator f5923c;
    public int d;
    public final Paint f5924e;

    public b(Context context) {
        super(context);
        this.f5922b = 1.0f;
        n6 n6Var = new n6(false, false, true, false);
        this.f5921a = n6Var;
        n6Var.k(0.3f, 250L, jr.h);
        n6Var.setCallback(this);
        n6Var.t(AndroidUtilities.dp(11.5f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.r(-1);
        n6Var.q("", true, true);
        n6Var.f30862b = 17;
        Paint paint = new Paint(1);
        this.f5924e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i10, boolean z10) {
        if (!q0.i()) {
            i10 = 0;
        }
        if (i10 > 0) {
            setVisibility(0);
        }
        n6 n6Var = this.f5921a;
        if (z10) {
            n6Var.b();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.f5923c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f5923c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f5923c = ofFloat;
            ofFloat.addUpdateListener(new bg.q1(this, 9));
            this.f5923c.addListener(new ag.m0(this, 6));
            this.f5923c.setInterpolator(new OvershootInterpolator(2.0f));
            this.f5923c.setDuration(200L);
            this.f5923c.start();
        }
        this.d = i10;
        int length = n6Var.f30866g.length();
        n6Var.q("x" + i10, z10, true);
        int length2 = n6Var.f30866g.length();
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
        n6 n6Var = this.f5921a;
        rect.set(0, 0, dp + ((int) n6Var.d()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.f5922b != 1.0f) {
            canvas.save();
            float f9 = this.f5922b;
            canvas.scale(f9, f9, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.f5924e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        n6Var.setBounds(rect);
        n6Var.draw(canvas);
        if (this.f5922b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f5921a.e() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }
}
