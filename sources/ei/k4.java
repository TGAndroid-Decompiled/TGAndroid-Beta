package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.tv0;
public class k4 extends View {
    public final tv0 f8443a;
    public final Paint f8444b;
    public float f8445c;
    public o1.k d;

    public k4(Context context, d6 d6Var) {
        super(context);
        tv0 tv0Var = new tv0(new d2.c(18), new d2.c(19));
        tv0Var.f28635c = 100.0f;
        this.f8443a = tv0Var;
        Paint paint = new Paint(1);
        this.f8444b = paint;
        paint.setColor(h6.v0(h6.Oh, d6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8445c > 0.0f) {
            Paint paint = this.f8444b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f8445c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f8443a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f15533u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f8445c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f15533u.f15539i = f7 * 100.0f;
        kVar.f();
    }
}
