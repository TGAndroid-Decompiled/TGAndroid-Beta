package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class g0 extends FrameLayout {
    public final RectF f10610a;
    public final RectF f10611b;
    public final m0 f10612c;

    public g0(m0 m0Var, Context context) {
        super(context);
        this.f10612c = m0Var;
        this.f10610a = new RectF();
        this.f10611b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m0 m0Var = this.f10612c;
        h0 h0Var = m0Var.X;
        FrameLayout frameLayout = h0Var.f12215b;
        RectF rectF = this.f10610a;
        if (ug.i.c(frameLayout, this, rectF)) {
            TextView textView = m0Var.Y;
            RectF rectF2 = this.f10611b;
            if (ug.i.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    h0Var.f12215b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
