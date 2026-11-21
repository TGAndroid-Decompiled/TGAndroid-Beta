package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class m7 extends LinearLayout {
    public final RectF f15023a;
    public final RectF f15024b;
    public final RectF f15025c;
    public final Paint d;
    public final n7 f15026e;

    public m7(n7 n7Var, Context context) {
        super(context);
        this.f15026e = n7Var;
        this.f15023a = new RectF();
        this.f15024b = new RectF();
        this.f15025c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i7) {
        FrameLayout frameLayout;
        n7 n7Var = this.f15026e;
        if (i7 <= -1) {
            frameLayout = n7Var.f15115b;
        } else if (i7 >= 1) {
            frameLayout = n7Var.f15118f;
        } else {
            frameLayout = n7Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - org.telegram.messenger.g0.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n7 n7Var = this.f15026e;
        RectF rectF = this.f15023a;
        a(rectF, (int) Math.floor(n7Var.f15120r));
        int ceil = (int) Math.ceil(n7Var.f15120r);
        RectF rectF2 = this.f15024b;
        a(rectF2, ceil);
        float f10 = n7Var.f15120r;
        float floor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f15025c;
        org.telegram.messenger.g0.Z1(rectF, rectF2, floor, rectF3);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, i0.a.f(n7Var.f15119n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(r12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
