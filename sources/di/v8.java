package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v8 extends LinearLayout {
    public final RectF f8008a;
    public final RectF f8009b;
    public final RectF f8010c;
    public final Paint d;
    public final w8 e;

    public v8(w8 w8Var, Context context) {
        super(context);
        this.e = w8Var;
        this.f8008a = new RectF();
        this.f8009b = new RectF();
        this.f8010c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        w8 w8Var = this.e;
        if (i10 <= -1) {
            frameLayout = w8Var.f8058b;
        } else if (i10 >= 1) {
            frameLayout = w8Var.f8060f;
        } else {
            frameLayout = w8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        w8 w8Var = this.e;
        RectF rectF = this.f8008a;
        a(rectF, (int) Math.floor(w8Var.f8062r));
        int ceil = (int) Math.ceil(w8Var.f8062r);
        RectF rectF2 = this.f8009b;
        a(rectF2, ceil);
        float f7 = w8Var.f8062r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f8010c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.15f, i0.a.d(w8Var.f8061n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(m12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
