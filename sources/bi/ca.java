package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ca extends LinearLayout {
    public final RectF f2420a;
    public final RectF f2421b;
    public final RectF f2422c;
    public final Paint d;
    public final da e;

    public ca(da daVar, Context context) {
        super(context);
        this.e = daVar;
        this.f2420a = new RectF();
        this.f2421b = new RectF();
        this.f2422c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        da daVar = this.e;
        if (i10 <= -1) {
            frameLayout = daVar.f2558b;
        } else if (i10 >= 1) {
            frameLayout = daVar.f2560f;
        } else {
            frameLayout = daVar.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        da daVar = this.e;
        RectF rectF = this.f2420a;
        a(rectF, (int) Math.floor(daVar.f2562r));
        int ceil = (int) Math.ceil(daVar.f2562r);
        RectF rectF2 = this.f2421b;
        a(rectF2, ceil);
        float f7 = daVar.f2562r;
        float floor = f7 - ((float) Math.floor(f7));
        RectF rectF3 = this.f2422c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, i0.a.d(daVar.f2561n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
