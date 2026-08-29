package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a8 extends LinearLayout {
    public final RectF f17389a;
    public final RectF f17390b;
    public final RectF f17391c;
    public final Paint d;
    public final b8 f17392e;

    public a8(b8 b8Var, Context context) {
        super(context);
        this.f17392e = b8Var;
        this.f17389a = new RectF();
        this.f17390b = new RectF();
        this.f17391c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        b8 b8Var = this.f17392e;
        if (i10 <= -1) {
            frameLayout = b8Var.f17421b;
        } else if (i10 >= 1) {
            frameLayout = b8Var.f17424f;
        } else {
            frameLayout = b8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b8 b8Var = this.f17392e;
        RectF rectF = this.f17389a;
        a(rectF, (int) Math.floor(b8Var.f17426r));
        int ceil = (int) Math.ceil(b8Var.f17426r);
        RectF rectF2 = this.f17390b;
        a(rectF2, ceil);
        float f9 = b8Var.f17426r;
        float floor = f9 - ((float) Math.floor(f9));
        RectF rectF3 = this.f17391c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.15f, i0.a.d(b8Var.f17425n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
