package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.sv0;
public class o4 extends View {
    public final sv0 f6832a;
    public final Paint f6833b;
    public float f6834c;
    public o1.k d;

    public o4(Context context, f6 f6Var) {
        super(context);
        sv0 sv0Var = new sv0(new dh.a(11), new dh.a(12));
        sv0Var.f27224c = 100.0f;
        this.f6832a = sv0Var;
        Paint paint = new Paint(1);
        this.f6833b = paint;
        paint.setColor(j6.v0(j6.Oh, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f6834c > 0.0f) {
            Paint paint = this.f6833b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f6834c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f6832a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f14134u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f6834c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f14134u.f14140i = f7 * 100.0f;
        kVar.f();
    }
}
