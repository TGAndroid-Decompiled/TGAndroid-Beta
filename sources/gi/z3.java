package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.cw0;
public class z3 extends View {
    public final cw0 f11582a;
    public final Paint f11583b;
    public float f11584c;
    public o1.k d;

    public z3(Context context, d6 d6Var) {
        super(context);
        cw0 cw0Var = new cw0(new fh.b(9), new fh.b(10));
        cw0Var.f25395c = 100.0f;
        this.f11582a = cw0Var;
        Paint paint = new Paint(1);
        this.f11583b = paint;
        paint.setColor(h6.w0(h6.Oh, d6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f11584c > 0.0f) {
            Paint paint = this.f11583b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f11584c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f11582a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f17555u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f11584c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f17555u.f17561i = f7 * 100.0f;
        kVar.h();
    }
}
