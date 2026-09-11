package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import di.w9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hv0;
public class l4 extends View {
    public final hv0 f9811a;
    public final Paint f9812b;
    public float f9813c;
    public o1.k d;

    public l4(Context context, f6 f6Var) {
        super(context);
        hv0 hv0Var = new hv0(new w9(19), new w9(20));
        hv0Var.f26879c = 100.0f;
        this.f9811a = hv0Var;
        Paint paint = new Paint(1);
        this.f9812b = paint;
        paint.setColor(j6.v0(j6.Oh, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f9813c > 0.0f) {
            Paint paint = this.f9812b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f9813c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f9811a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f16825u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f9813c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f7);
            return;
        }
        kVar.f16825u.f16832i = f7 * 100.0f;
        kVar.f();
    }
}
