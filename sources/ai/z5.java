package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class z5 extends View {
    public final Paint f2537a;
    public final org.telegram.ui.Components.f6 f2538b;
    public final org.telegram.ui.Components.f6 f2539c;
    public float d;
    public float e;

    public z5(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f2537a = paint;
        a3.d dVar = new a3.d(this, 17);
        bs bsVar = bs.h;
        this.f2538b = new org.telegram.ui.Components.f6(dVar, 420L, bsVar, 0);
        this.f2539c = new org.telegram.ui.Components.f6(new a3.d(this, 17), 420L, bsVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f2538b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e = this.f2539c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.25f, -1);
        Paint paint = this.f2537a;
        paint.setColor(m12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.h6.m1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
