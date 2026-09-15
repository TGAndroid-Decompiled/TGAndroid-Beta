package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends LinearLayout {
    public final RectF f5869a;
    public final RectF f5870b;
    public final RectF f5871c;
    public final Paint d;
    public final a9 e;

    public z8(a9 a9Var, Context context) {
        super(context);
        this.e = a9Var;
        this.f5869a = new RectF();
        this.f5870b = new RectF();
        this.f5871c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        a9 a9Var = this.e;
        if (i10 <= -1) {
            frameLayout = a9Var.f4352b;
        } else if (i10 >= 1) {
            frameLayout = a9Var.f4354f;
        } else {
            frameLayout = a9Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a9 a9Var = this.e;
        RectF rectF = this.f5869a;
        a(rectF, (int) Math.floor(a9Var.f4356r));
        int ceil = (int) Math.ceil(a9Var.f4356r);
        RectF rectF2 = this.f5870b;
        a(rectF2, ceil);
        float f7 = a9Var.f4356r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f5871c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.15f, i0.a.d(a9Var.f4355n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
