package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v8 extends LinearLayout {
    public final RectF f5684a;
    public final RectF f5685b;
    public final RectF f5686c;
    public final Paint d;
    public final w8 e;

    public v8(w8 w8Var, Context context) {
        super(context);
        this.e = w8Var;
        this.f5684a = new RectF();
        this.f5685b = new RectF();
        this.f5686c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        w8 w8Var = this.e;
        if (i10 <= -1) {
            frameLayout = w8Var.f5793b;
        } else if (i10 >= 1) {
            frameLayout = w8Var.f5795f;
        } else {
            frameLayout = w8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w8 w8Var = this.e;
        RectF rectF = this.f5684a;
        a(rectF, (int) Math.floor(w8Var.f5797r));
        int ceil = (int) Math.ceil(w8Var.f5797r);
        RectF rectF2 = this.f5685b;
        a(rectF2, ceil);
        float f7 = w8Var.f5797r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f5686c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.15f, i0.a.d(w8Var.f5796n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
