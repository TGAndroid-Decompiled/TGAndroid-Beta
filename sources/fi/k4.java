package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hw0;
public class k4 extends View {
    public final hw0 f9386a;
    public final Paint f9387b;
    public float f9388c;
    public o1.k d;

    public k4(Context context, c6 c6Var) {
        super(context);
        hw0 hw0Var = new hw0(new c2(2), new c2(3));
        hw0Var.f25769c = 100.0f;
        this.f9386a = hw0Var;
        Paint paint = new Paint(1);
        this.f9387b = paint;
        paint.setColor(g6.w0(g6.Oh, c6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f9388c > 0.0f) {
            Paint paint = this.f9387b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f9388c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f9386a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f16468u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f9388c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f16468u.f16474i = f7 * 100.0f;
        kVar.h();
    }
}
