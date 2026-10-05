package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fw0;
public class l4 extends View {
    public final fw0 f9186a;
    public final Paint f9187b;
    public float f9188c;
    public o1.k d;

    public l4(Context context, d6 d6Var) {
        super(context);
        fw0 fw0Var = new fw0(new d2.c(19), new d2.c(20));
        fw0Var.f26617c = 100.0f;
        this.f9186a = fw0Var;
        Paint paint = new Paint(1);
        this.f9187b = paint;
        paint.setColor(i6.v0(i6.Oh, d6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f9188c > 0.0f) {
            Paint paint = this.f9187b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f9188c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f9186a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f16993u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f9188c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f16993u.f17000i = f7 * 100.0f;
        kVar.f();
    }
}
