package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class n7 extends LinearLayout {
    public final RectF f15101a;
    public final RectF f15102b;
    public final RectF f15103c;
    public final Paint d;
    public final o7 f15104e;

    public n7(o7 o7Var, Context context) {
        super(context);
        this.f15104e = o7Var;
        this.f15101a = new RectF();
        this.f15102b = new RectF();
        this.f15103c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i7) {
        FrameLayout frameLayout;
        o7 o7Var = this.f15104e;
        if (i7 <= -1) {
            frameLayout = o7Var.f15182b;
        } else if (i7 >= 1) {
            frameLayout = o7Var.f15185f;
        } else {
            frameLayout = o7Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - org.telegram.messenger.g0.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        o7 o7Var = this.f15104e;
        RectF rectF = this.f15101a;
        a(rectF, (int) Math.floor(o7Var.f15187r));
        int ceil = (int) Math.ceil(o7Var.f15187r);
        RectF rectF2 = this.f15102b;
        a(rectF2, ceil);
        float f10 = o7Var.f15187r;
        float floor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f15103c;
        org.telegram.messenger.g0.Z1(rectF, rectF2, floor, rectF3);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.15f, i0.a.f(o7Var.f15186n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(r12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
