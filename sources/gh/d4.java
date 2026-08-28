package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class d4 extends View {
    public final Paint f7959a;
    public final org.telegram.ui.Components.y5 f7960b;
    public final org.telegram.ui.Components.y5 f7961c;
    public float d;
    public float f7962e;

    public d4(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f7959a = paint;
        fh.o1 o1Var = new fh.o1(this, 13);
        gr grVar = gr.h;
        this.f7960b = new org.telegram.ui.Components.y5(o1Var, 420L, grVar, 0);
        this.f7961c = new org.telegram.ui.Components.y5(new fh.o1(this, 13), 420L, grVar, 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = false;
        float d = this.f7960b.d(this.d, false);
        if (this.d > 0.0f) {
            z10 = true;
        }
        float e10 = this.f7961c.e(z10);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f10 = this.f7962e;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width - f10, height - f10, width + f10, height + f10);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.25f, -1);
        Paint paint = this.f7959a;
        paint.setColor(l1);
        canvas.drawArc(rectF, 135.0f, 270.0f, false, paint);
        if (e10 > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(e10, -1));
            canvas.drawArc(rectF, 135.0f, d * 270.0f, false, paint);
        }
    }
}
