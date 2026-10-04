package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v8 extends LinearLayout {
    public final RectF f6124a;
    public final RectF f6125b;
    public final RectF f6126c;
    public final Paint d;
    public final w8 f6127e;

    public v8(w8 w8Var, Context context) {
        super(context);
        this.f6127e = w8Var;
        this.f6124a = new RectF();
        this.f6125b = new RectF();
        this.f6126c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        w8 w8Var = this.f6127e;
        if (i10 <= -1) {
            frameLayout = w8Var.f6240b;
        } else if (i10 >= 1) {
            frameLayout = w8Var.f6243f;
        } else {
            frameLayout = w8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w8 w8Var = this.f6127e;
        RectF rectF = this.f6124a;
        a(rectF, (int) Math.floor(w8Var.f6245r));
        int ceil = (int) Math.ceil(w8Var.f6245r);
        RectF rectF2 = this.f6125b;
        a(rectF2, ceil);
        float f7 = w8Var.f6245r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f6126c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.15f, i0.a.d(w8Var.f6244n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
