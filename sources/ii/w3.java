package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import gi.i8;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.kt0;
public class w3 extends View implements z5 {
    public final kt0 f15305a;
    public final Paint f15306b;
    public float f15307c;
    public q1.g d;
    public final e6 f15308e;

    public w3(Context context, e6 e6Var) {
        super(context);
        kt0 kt0Var = new kt0(new i8(27), new i8(28));
        kt0Var.f35485c = 100.0f;
        this.f15305a = kt0Var;
        Paint paint = new Paint(1);
        this.f15306b = paint;
        this.f15308e = e6Var;
        paint.setColor(k6.w0(k6.Ci, e6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f15307c > 0.0f) {
            Paint paint = this.f15306b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f15307c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q1.g gVar = new q1.g(this, this.f15305a);
        q1.h hVar = new q1.h();
        hVar.b(400.0f);
        hVar.a(1.0f);
        gVar.f53653m = hVar;
        this.d = gVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.f15307c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        q1.g gVar = this.d;
        if (gVar == null) {
            setLoadProgress(f10);
            return;
        }
        gVar.f53653m.f53661i = f10 * 100.0f;
        gVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.f15306b.setColor(k6.w0(k6.Ci, this.f15308e));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
