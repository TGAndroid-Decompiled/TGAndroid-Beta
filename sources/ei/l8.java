package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l8 extends LinearLayout {
    public final RectF f9384a;
    public final RectF f9385b;
    public final RectF f9386c;
    public final Paint d;
    public final m8 e;

    public l8(m8 m8Var, Context context) {
        super(context);
        this.e = m8Var;
        this.f9384a = new RectF();
        this.f9385b = new RectF();
        this.f9386c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        m8 m8Var = this.e;
        if (i10 <= -1) {
            frameLayout = m8Var.f9476b;
        } else if (i10 >= 1) {
            frameLayout = m8Var.f9478f;
        } else {
            frameLayout = m8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m8 m8Var = this.e;
        RectF rectF = this.f9384a;
        a(rectF, (int) Math.floor(m8Var.f9480r));
        int ceil = (int) Math.ceil(m8Var.f9480r);
        RectF rectF2 = this.f9385b;
        a(rectF2, ceil);
        float f7 = m8Var.f9480r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f9386c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.15f, i0.a.f(m8Var.f9479n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(m12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
