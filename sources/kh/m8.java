package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m8 extends LinearLayout {
    public final RectF f15707a;
    public final RectF f15708b;
    public final RectF f15709c;
    public final Paint d;
    public final n8 f15710e;

    public m8(n8 n8Var, Context context) {
        super(context);
        this.f15710e = n8Var;
        this.f15707a = new RectF();
        this.f15708b = new RectF();
        this.f15709c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i9) {
        FrameLayout frameLayout;
        n8 n8Var = this.f15710e;
        if (i9 <= -1) {
            frameLayout = n8Var.f15758b;
        } else if (i9 >= 1) {
            frameLayout = n8Var.f15761f;
        } else {
            frameLayout = n8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        n8 n8Var = this.f15710e;
        RectF rectF = this.f15707a;
        a(rectF, (int) Math.floor(n8Var.f15763r));
        int ceil = (int) Math.ceil(n8Var.f15763r);
        RectF rectF2 = this.f15708b;
        a(rectF2, ceil);
        float f10 = n8Var.f15763r;
        float floor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f15709c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, i0.a.d(n8Var.f15762n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
