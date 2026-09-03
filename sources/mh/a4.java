package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class a4 extends View {
    public final Paint f13688a;
    public final org.telegram.ui.Components.z5 f13689b;
    public final org.telegram.ui.Components.z5 f13690c;
    public float d;
    public float f13691e;

    public a4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f13688a = paint;
        lh.c3 c3Var = new lh.c3(this, 10);
        pr prVar = pr.h;
        this.f13689b = new org.telegram.ui.Components.z5(c3Var, 420L, prVar, 0);
        this.f13690c = new org.telegram.ui.Components.z5(new lh.c3(this, 10), 420L, prVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4 = false;
        float d = this.f13689b.d(this.d, false);
        if (this.d > 0.0f) {
            z4 = true;
        }
        float e6 = this.f13690c.e(z4);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.f13691e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int l1 = org.telegram.ui.ActionBar.k6.l1(0.25f, -1);
        Paint paint = this.f13688a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e6 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.l1(e6, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
