package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
public final class a4 extends View {
    public final Paint f12085a;
    public final org.telegram.ui.Components.z5 f12086b;
    public final org.telegram.ui.Components.z5 f12087c;
    public float d;
    public float e;

    public a4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f12085a = paint;
        b bVar = new b(this, 9);
        mr mrVar = mr.h;
        this.f12086b = new org.telegram.ui.Components.z5(bVar, 420L, mrVar, 0);
        this.f12087c = new org.telegram.ui.Components.z5(new b(this, 9), 420L, mrVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4 = false;
        float d = this.f12086b.d(this.d, false);
        if (this.d > 0.0f) {
            z4 = true;
        }
        float e = this.f12087c.e(z4);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.25f, -1);
        Paint paint = this.f12085a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
