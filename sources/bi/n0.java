package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class n0 extends FrameLayout {
    public final RectF f3895a;
    public final RectF f3896b;
    public final t0 f3897c;

    public n0(t0 t0Var, Context context) {
        super(context);
        this.f3897c = t0Var;
        this.f3895a = new RectF();
        this.f3896b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        t0 t0Var = this.f3897c;
        o0 o0Var = t0Var.W1;
        FrameLayout frameLayout = o0Var.f10124b;
        RectF rectF = this.f3895a;
        if (jh.k.c(frameLayout, this, rectF)) {
            TextView textView = t0Var.X1;
            RectF rectF2 = this.f3896b;
            if (jh.k.c(textView, this, rectF2)) {
                float L = rectF2.right - org.telegram.messenger.g0.L(32.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(L, centerY);
                    canvas.scale(org.telegram.messenger.g0.L(32.0f) / rectF.width(), org.telegram.messenger.g0.L(32.0f) / rectF.height());
                    o0Var.f10124b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
