package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class l8 extends LinearLayout {
    public final RectF f9393a;
    public final RectF f9394b;
    public final RectF f9395c;
    public final Paint d;
    public final m8 e;

    public l8(m8 m8Var, Context context) {
        super(context);
        this.e = m8Var;
        this.f9393a = new RectF();
        this.f9394b = new RectF();
        this.f9395c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        m8 m8Var = this.e;
        if (i10 <= -1) {
            frameLayout = m8Var.f9485b;
        } else if (i10 >= 1) {
            frameLayout = m8Var.f9487f;
        } else {
            frameLayout = m8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m8 m8Var = this.e;
        RectF rectF = this.f9393a;
        a(rectF, (int) Math.floor(m8Var.f9489r));
        int ceil = (int) Math.ceil(m8Var.f9489r);
        RectF rectF2 = this.f9394b;
        a(rectF2, ceil);
        float f7 = m8Var.f9489r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f9395c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.15f, i0.a.f(m8Var.f9488n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(o12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
