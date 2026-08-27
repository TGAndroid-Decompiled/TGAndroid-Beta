package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class b4 extends View {

    public final Paint f9000a;

    public final org.telegram.ui.Components.y5 f9001b;

    public final org.telegram.ui.Components.y5 f9002c;
    public float d;

    public float f9003e;

    public b4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f9000a = paint;
        int i10 = 24;
        f2.r rVar = new f2.r(this, i10);
        er erVar = er.h;
        this.f9001b = new org.telegram.ui.Components.y5(rVar, 420L, erVar, 0);
        this.f9002c = new org.telegram.ui.Components.y5(new f2.r(this, i10), 420L, erVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fD = this.f9001b.d(this.d, false);
        float fE = this.f9002c.e(this.d > 0.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.f9003e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.25f, -1);
        Paint paint = this.f9000a;
        paint.setColor(iL1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (fE > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(fE, -1));
            canvas.drawArc(rectF, 135.0f, fD * 270.0f, false, paint);
        }
    }
}
