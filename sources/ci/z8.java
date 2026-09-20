package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class z8 extends LinearLayout {
    public final RectF f5875a;
    public final RectF f5876b;
    public final RectF f5877c;
    public final Paint d;
    public final a9 e;

    public z8(a9 a9Var, Context context) {
        super(context);
        this.e = a9Var;
        this.f5875a = new RectF();
        this.f5876b = new RectF();
        this.f5877c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        a9 a9Var = this.e;
        if (i10 <= -1) {
            frameLayout = a9Var.f4358b;
        } else if (i10 >= 1) {
            frameLayout = a9Var.f4360f;
        } else {
            frameLayout = a9Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a9 a9Var = this.e;
        RectF rectF = this.f5875a;
        a(rectF, (int) Math.floor(a9Var.f4362r));
        int ceil = (int) Math.ceil(a9Var.f4362r);
        RectF rectF2 = this.f5876b;
        a(rectF2, ceil);
        float f7 = a9Var.f4362r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f5877c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, i0.a.d(a9Var.f4361n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
