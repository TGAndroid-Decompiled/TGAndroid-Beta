package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.lw0;
public class j4 extends View {
    public final lw0 f9133a;
    public final Paint f9134b;
    public float f9135c;
    public o1.k d;

    public j4(Context context, e6 e6Var) {
        super(context);
        lw0 lw0Var = new lw0(new d2.c(18), new d2.c(19));
        lw0Var.f28618c = 100.0f;
        this.f9133a = lw0Var;
        Paint paint = new Paint(1);
        this.f9134b = paint;
        paint.setColor(i6.w0(i6.Oh, e6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f9135c > 0.0f) {
            Paint paint = this.f9134b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f9135c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f9133a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f16938u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f9135c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f16938u.f16945i = f7 * 100.0f;
        kVar.h();
    }
}
