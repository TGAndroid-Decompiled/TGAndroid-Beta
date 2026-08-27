package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class j0 extends FrameLayout {

    public final RectF f7345a;

    public final RectF f7346b;

    public final p0 f7347c;

    public j0(p0 p0Var, Context context) {
        super(context);
        this.f7347c = p0Var;
        this.f7345a = new RectF();
        this.f7346b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        p0 p0Var = this.f7347c;
        k0 k0Var = p0Var.W;
        FrameLayout frameLayout = k0Var.f9174b;
        RectF rectF = this.f7345a;
        if (qg.j.c(frameLayout, this, rectF)) {
            TextView textView = p0Var.X;
            RectF rectF2 = this.f7346b;
            if (qg.j.c(textView, this, rectF2)) {
                float fDp = rectF2.right - AndroidUtilities.dp(32.0f);
                float fCenterY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(fDp, fCenterY);
                canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                k0Var.f9174b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
