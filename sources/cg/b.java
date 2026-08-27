package cg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;

public final class b extends View {

    public final i6 f2603a;

    public float f2604b;

    public ValueAnimator f2605c;
    public int d;

    public final Paint f2606e;

    public b(Context context) {
        super(context);
        this.f2604b = 1.0f;
        i6 i6Var = new i6(false, false, true, false);
        this.f2603a = i6Var;
        i6Var.k(0.3f, 250L, er.h);
        i6Var.setCallback(this);
        i6Var.t(AndroidUtilities.dp(11.5f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.r(-1);
        i6Var.q("", true, true);
        i6Var.f29239b = 17;
        Paint paint = new Paint(1);
        this.f2606e = paint;
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
        i6 i6Var = this.f2603a;
        if (z10) {
            i6Var.b();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.f2605c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f2605c = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f2605c = valueAnimatorOfFloat;
            int i11 = 3;
            valueAnimatorOfFloat.addUpdateListener(new ag.u(this, i11));
            this.f2605c.addListener(new ag.r1(this, i11));
            this.f2605c.setInterpolator(new OvershootInterpolator(2.0f));
            this.f2605c.setDuration(200L);
            this.f2605c.start();
        }
        this.d = i10;
        int length = i6Var.f29243g.length();
        i6Var.q("x" + i10, z10, true);
        int length2 = i6Var.f29243g.length();
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
        int iDp = AndroidUtilities.dp(8.0f);
        i6 i6Var = this.f2603a;
        rect.set(0, 0, iDp + ((int) i6Var.d()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.f2604b != 1.0f) {
            canvas.save();
            float f10 = this.f2604b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.f2606e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        i6Var.setBounds(rect);
        i6Var.draw(canvas);
        if (this.f2604b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f2603a.e() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }
}
