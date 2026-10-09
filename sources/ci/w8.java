package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class w8 extends LinearLayout {
    public final RectF f6216a;
    public final RectF f6217b;
    public final RectF f6218c;
    public final Paint d;
    public final x8 f6219e;

    public w8(x8 x8Var, Context context) {
        super(context);
        this.f6219e = x8Var;
        this.f6216a = new RectF();
        this.f6217b = new RectF();
        this.f6218c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        x8 x8Var = this.f6219e;
        if (i10 <= -1) {
            frameLayout = x8Var.f6312b;
        } else if (i10 >= 1) {
            frameLayout = x8Var.f6315f;
        } else {
            frameLayout = x8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x8 x8Var = this.f6219e;
        RectF rectF = this.f6216a;
        a(rectF, (int) Math.floor(x8Var.f6317r));
        int ceil = (int) Math.ceil(x8Var.f6317r);
        RectF rectF2 = this.f6217b;
        a(rectF2, ceil);
        float f7 = x8Var.f6317r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f6218c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.15f, i0.a.d(x8Var.f6316n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(m12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
