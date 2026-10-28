package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class h8 extends LinearLayout {
    public final RectF f10963a;
    public final RectF f10964b;
    public final RectF f10965c;
    public final Paint d;
    public final i8 e;

    public h8(i8 i8Var, Context context) {
        super(context);
        this.e = i8Var;
        this.f10963a = new RectF();
        this.f10964b = new RectF();
        this.f10965c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        i8 i8Var = this.e;
        if (i10 <= -1) {
            frameLayout = i8Var.f11006b;
        } else if (i10 >= 1) {
            frameLayout = i8Var.f11008f;
        } else {
            frameLayout = i8Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i8 i8Var = this.e;
        RectF rectF = this.f10963a;
        a(rectF, (int) Math.floor(i8Var.f11010r));
        int ceil = (int) Math.ceil(i8Var.f11010r);
        RectF rectF2 = this.f10964b;
        a(rectF2, ceil);
        float f7 = i8Var.f11010r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f10965c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.15f, i0.a.f(i8Var.f11009n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(o12);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
