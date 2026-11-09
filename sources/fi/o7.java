package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class o7 extends LinearLayout {
    public final RectF f12560a;
    public final RectF f12561b;
    public final RectF f12562c;
    public final Paint d;
    public final p7 f12563e;

    public o7(p7 p7Var, Context context) {
        super(context);
        this.f12563e = p7Var;
        this.f12560a = new RectF();
        this.f12561b = new RectF();
        this.f12562c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i7) {
        FrameLayout frameLayout;
        p7 p7Var = this.f12563e;
        if (i7 <= -1) {
            frameLayout = p7Var.f12599b;
        } else if (i7 >= 1) {
            frameLayout = p7Var.f12602f;
        } else {
            frameLayout = p7Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - org.telegram.messenger.g0.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        p7 p7Var = this.f12563e;
        RectF rectF = this.f12560a;
        a(rectF, (int) Math.floor(p7Var.f12604r));
        int ceil = (int) Math.ceil(p7Var.f12604r);
        RectF rectF2 = this.f12561b;
        a(rectF2, ceil);
        float f10 = p7Var.f12604r;
        float floor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f12562c;
        org.telegram.messenger.g0.Z1(rectF, rectF2, floor, rectF3);
        int r12 = org.telegram.ui.ActionBar.l6.r1(0.15f, i0.a.f(p7Var.f12603n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(r12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
