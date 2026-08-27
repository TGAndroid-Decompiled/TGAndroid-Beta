package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.su0;

public class y3 extends View {

    public final su0 f19059a;

    public final Paint f19060b;

    public float f19061c;
    public o1.j d;

    public y3(Context context, c6 c6Var) {
        super(context);
        su0 su0Var = new su0(new ng.a(15), new ng.a(16));
        su0Var.f32580c = 100.0f;
        this.f19059a = su0Var;
        Paint paint = new Paint(1);
        this.f19060b = paint;
        paint.setColor(g6.v0(g6.Oh, c6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f19061c > 0.0f) {
            float height = getHeight();
            Paint paint = this.f19060b;
            float strokeWidth = height - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, strokeWidth, getWidth() * this.f19061c, strokeWidth, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.j jVar = new o1.j(this, this.f19059a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.f19147u = kVar;
        this.d = jVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.f19061c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f10);
            return;
        }
        jVar.f19147u.f19154i = f10 * 100.0f;
        jVar.f();
    }
}
