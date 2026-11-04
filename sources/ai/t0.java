package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class t0 extends FrameLayout {
    public final RectF f974a;
    public final RectF f975b;
    public final z0 f976c;

    public t0(z0 z0Var, Context context) {
        super(context);
        this.f976c = z0Var;
        this.f974a = new RectF();
        this.f975b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        z0 z0Var = this.f976c;
        u0 u0Var = z0Var.T1;
        FrameLayout frameLayout = u0Var.f5085b;
        RectF rectF = this.f974a;
        if (kh.k.c(frameLayout, this, rectF)) {
            TextView textView = z0Var.U1;
            RectF rectF2 = this.f975b;
            if (kh.k.c(textView, this, rectF2)) {
                float L = rectF2.right - org.telegram.messenger.g0.L(32.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(L, centerY);
                    canvas.scale(org.telegram.messenger.g0.L(32.0f) / rectF.width(), org.telegram.messenger.g0.L(32.0f) / rectF.height());
                    u0Var.f5085b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
