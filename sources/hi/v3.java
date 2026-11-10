package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.mt0;
public class v3 extends View implements c6 {
    public final mt0 f15008a;
    public final Paint f15009b;
    public float f15010c;
    public r1.g d;
    public final h6 f15011e;

    public v3(Context context, h6 h6Var) {
        super(context);
        mt0 mt0Var = new mt0(new g2.c(27), new g2.c(28));
        mt0Var.f36092c = 100.0f;
        this.f15008a = mt0Var;
        Paint paint = new Paint(1);
        this.f15009b = paint;
        this.f15011e = h6Var;
        paint.setColor(m6.w0(m6.Ci, h6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f15010c > 0.0f) {
            Paint paint = this.f15009b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f15010c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r1.g gVar = new r1.g(this, this.f15008a);
        r1.h hVar = new r1.h();
        hVar.b(400.0f);
        hVar.a(1.0f);
        gVar.f54279m = hVar;
        this.d = gVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.f15010c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        r1.g gVar = this.d;
        if (gVar == null) {
            setLoadProgress(f10);
            return;
        }
        gVar.f54279m.f54287i = f10 * 100.0f;
        gVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.f15009b.setColor(m6.w0(m6.Ci, this.f15011e));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
