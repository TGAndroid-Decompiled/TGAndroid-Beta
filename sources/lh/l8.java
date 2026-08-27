package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class l8 extends LinearLayout {

    public final RectF f16320a;

    public final RectF f16321b;

    public final RectF f16322c;
    public final Paint d;

    public final m8 f16323e;

    public l8(m8 m8Var, Context context) {
        super(context);
        this.f16323e = m8Var;
        this.f16320a = new RectF();
        this.f16321b = new RectF();
        this.f16322c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        m8 m8Var = this.f16323e;
        if (i10 <= -1) {
            frameLayout = m8Var.f16389b;
        } else {
            frameLayout = i10 >= 1 ? m8Var.f16392f : m8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m8 m8Var = this.f16323e;
        int iFloor = (int) Math.floor(m8Var.f16394r);
        RectF rectF = this.f16320a;
        a(rectF, iFloor);
        int iCeil = (int) Math.ceil(m8Var.f16394r);
        RectF rectF2 = this.f16321b;
        a(rectF2, iCeil);
        float f10 = m8Var.f16394r;
        float fFloor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f16322c;
        AndroidUtilities.lerp(rectF, rectF2, fFloor, rectF3);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.15f, i0.b.d(m8Var.f16393n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(iL1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
