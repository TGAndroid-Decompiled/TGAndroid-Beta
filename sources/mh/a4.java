package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.pu0;
public class a4 extends View {
    public final pu0 f17700a;
    public final Paint f17701b;
    public float f17702c;
    public o1.j d;

    public a4(Context context, b6 b6Var) {
        super(context);
        pu0 pu0Var = new pu0(new mg.b(8), new mg.b(9));
        pu0Var.f31764c = 100.0f;
        this.f17700a = pu0Var;
        Paint paint = new Paint(1);
        this.f17701b = paint;
        paint.setColor(f6.v0(f6.Oh, b6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f17702c > 0.0f) {
            Paint paint = this.f17701b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f17702c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.j jVar = new o1.j(this, this.f17700a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.f18800u = kVar;
        this.d = jVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.f17702c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f10);
            return;
        }
        jVar.f18800u.f18807i = f10 * 100.0f;
        jVar.f();
    }
}
