package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.lt0;
public class v3 extends View implements a6 {
    public final lt0 f15003a;
    public final Paint f15004b;
    public float f15005c;
    public r1.g d;
    public final f6 f15006e;

    public v3(Context context, f6 f6Var) {
        super(context);
        lt0 lt0Var = new lt0(new g2.c(27), new g2.c(28));
        lt0Var.f35738c = 100.0f;
        this.f15003a = lt0Var;
        Paint paint = new Paint(1);
        this.f15004b = paint;
        this.f15006e = f6Var;
        paint.setColor(k6.w0(k6.Ci, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f15005c > 0.0f) {
            Paint paint = this.f15004b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f15005c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r1.g gVar = new r1.g(this, this.f15003a);
        r1.h hVar = new r1.h();
        hVar.b(400.0f);
        hVar.a(1.0f);
        gVar.f54150m = hVar;
        this.d = gVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.f15005c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        r1.g gVar = this.d;
        if (gVar == null) {
            setLoadProgress(f10);
            return;
        }
        gVar.f54150m.f54158i = f10 * 100.0f;
        gVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.f15004b.setColor(k6.w0(k6.Ci, this.f15006e));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
