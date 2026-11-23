package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class h8 extends LinearLayout {
    public final RectF f14592a;
    public final RectF f14593b;
    public final RectF f14594c;
    public final Paint d;
    public final i8 f14595e;

    public h8(i8 i8Var, Context context) {
        super(context);
        this.f14595e = i8Var;
        this.f14592a = new RectF();
        this.f14593b = new RectF();
        this.f14594c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i7) {
        FrameLayout frameLayout;
        i8 i8Var = this.f14595e;
        if (i7 <= -1) {
            frameLayout = i8Var.f14691b;
        } else if (i7 >= 1) {
            frameLayout = i8Var.f14694f;
        } else {
            frameLayout = i8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - org.telegram.messenger.g0.L(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i8 i8Var = this.f14595e;
        RectF rectF = this.f14592a;
        a(rectF, (int) Math.floor(i8Var.f14696r));
        int ceil = (int) Math.ceil(i8Var.f14696r);
        RectF rectF2 = this.f14593b;
        a(rectF2, ceil);
        float f10 = i8Var.f14696r;
        float floor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f14594c;
        org.telegram.messenger.g0.Z1(rectF, rectF2, floor, rectF3);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.15f, i0.a.f(i8Var.f14695n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(r12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
