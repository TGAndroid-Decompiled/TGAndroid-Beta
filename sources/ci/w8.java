package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w8 extends LinearLayout {
    public final RectF f5734a;
    public final RectF f5735b;
    public final RectF f5736c;
    public final Paint d;
    public final x8 e;

    public w8(x8 x8Var, Context context) {
        super(context);
        this.e = x8Var;
        this.f5734a = new RectF();
        this.f5735b = new RectF();
        this.f5736c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        x8 x8Var = this.e;
        if (i10 <= -1) {
            frameLayout = x8Var.f5839b;
        } else if (i10 >= 1) {
            frameLayout = x8Var.f5841f;
        } else {
            frameLayout = x8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x8 x8Var = this.e;
        RectF rectF = this.f5734a;
        a(rectF, (int) Math.floor(x8Var.f5843r));
        int ceil = (int) Math.ceil(x8Var.f5843r);
        RectF rectF2 = this.f5735b;
        a(rectF2, ceil);
        float f7 = x8Var.f5843r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f5736c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.15f, i0.a.d(x8Var.f5842n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
