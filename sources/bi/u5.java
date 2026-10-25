package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public final class u5 extends View {
    public final Paint f5514a;
    public final org.telegram.ui.Components.h6 f5515b;
    public final org.telegram.ui.Components.h6 f5516c;
    public float d;
    public float e;

    public u5(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f5514a = paint;
        a3.d dVar = new a3.d(this, 28);
        ds dsVar = ds.h;
        this.f5515b = new org.telegram.ui.Components.h6(dVar, 420L, dsVar, 0);
        this.f5516c = new org.telegram.ui.Components.h6(new a3.d(this, 28), 420L, dsVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f5515b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e = this.f5516c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f7 = this.e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f7, height - f7, width + f7, height + f7);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.25f, -1);
        Paint paint = this.f5514a;
        paint.setColor(o12);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.y6.o1(e, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
