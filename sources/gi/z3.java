package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ew0;
public class z3 extends View {
    public final ew0 f11581a;
    public final Paint f11582b;
    public float f11583c;
    public o1.k d;

    public z3(Context context, d6 d6Var) {
        super(context);
        ew0 ew0Var = new ew0(new fh.b(9), new fh.b(10));
        ew0Var.f25985c = 100.0f;
        this.f11581a = ew0Var;
        Paint paint = new Paint(1);
        this.f11582b = paint;
        paint.setColor(h6.w0(h6.Oh, d6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f11583c > 0.0f) {
            Paint paint = this.f11582b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f11583c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f11581a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f17559u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f11583c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f17559u.f17565i = f7 * 100.0f;
        kVar.h();
    }
}
