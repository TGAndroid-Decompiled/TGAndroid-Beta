package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class b4 extends View {
    public final Paint f11793a;
    public final org.telegram.ui.Components.d6 f11794b;
    public final org.telegram.ui.Components.d6 f11795c;
    public float d;
    public float f11796e;

    public b4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f11793a = paint;
        o oVar = new o(this, 8);
        jr jrVar = jr.h;
        this.f11794b = new org.telegram.ui.Components.d6(oVar, 420L, jrVar, 0);
        this.f11795c = new org.telegram.ui.Components.d6(new o(this, 8), 420L, jrVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f11794b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e10 = this.f11795c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f9 = this.f11796e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f9, height - f9, width + f9, height + f9);
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.25f, -1);
        Paint paint = this.f11793a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e10 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(e10, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
