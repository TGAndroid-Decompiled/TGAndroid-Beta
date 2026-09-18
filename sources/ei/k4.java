package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.uv0;
public class k4 extends View {
    public final uv0 f8460a;
    public final Paint f8461b;
    public float f8462c;
    public o1.k d;

    public k4(Context context, e6 e6Var) {
        super(context);
        uv0 uv0Var = new uv0(new d2.c(19), new d2.c(20));
        uv0Var.f28839c = 100.0f;
        this.f8460a = uv0Var;
        Paint paint = new Paint(1);
        this.f8461b = paint;
        paint.setColor(j6.v0(j6.Oh, e6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8462c > 0.0f) {
            Paint paint = this.f8461b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f8462c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f8460a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f15490u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f8462c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f15490u.f15496i = f7 * 100.0f;
        kVar.f();
    }
}
