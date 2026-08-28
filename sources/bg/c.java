package bg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
public final class c extends View {
    public final i6 f1709a;
    public float f1710b;
    public ValueAnimator f1711c;
    public int d;
    public final Paint f1712e;

    public c(Context context) {
        super(context);
        this.f1710b = 1.0f;
        i6 i6Var = new i6(false, false, true, false);
        this.f1709a = i6Var;
        i6Var.k(0.3f, 250L, gr.h);
        i6Var.setCallback(this);
        i6Var.t(AndroidUtilities.dp(11.5f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.r(-1);
        i6Var.q("", true, true);
        i6Var.f29333b = 17;
        Paint paint = new Paint(1);
        this.f1712e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i9, boolean z10) {
        if (!u0.i()) {
            i9 = 0;
        }
        if (i9 > 0) {
            setVisibility(0);
        }
        i6 i6Var = this.f1709a;
        if (z10) {
            i6Var.b();
        }
        if (z10 && i9 != this.d && i9 > 0) {
            ValueAnimator valueAnimator = this.f1711c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f1711c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f1711c = ofFloat;
            ofFloat.addUpdateListener(new b(this, 0));
            this.f1711c.addListener(new ag.e(this, 1));
            this.f1711c.setInterpolator(new OvershootInterpolator(2.0f));
            this.f1711c.setDuration(200L);
            this.f1711c.start();
        }
        this.d = i9;
        int length = i6Var.f29337g.length();
        i6Var.q("x" + i9, z10, true);
        int length2 = i6Var.f29337g.length();
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
        i6 i6Var = this.f1709a;
        rect.set(0, 0, dp + ((int) i6Var.d()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.f1710b != 1.0f) {
            canvas.save();
            float f10 = this.f1710b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.f1712e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        i6Var.setBounds(rect);
        i6Var.draw(canvas);
        if (this.f1710b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f1709a.e() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }
}
