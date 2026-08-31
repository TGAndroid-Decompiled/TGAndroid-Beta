package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class g0 extends FrameLayout {
    public final RectF f12750a;
    public final RectF f12751b;
    public final m0 f12752c;

    public g0(m0 m0Var, Context context) {
        super(context);
        this.f12752c = m0Var;
        this.f12750a = new RectF();
        this.f12751b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m0 m0Var = this.f12752c;
        h0 h0Var = m0Var.X;
        FrameLayout frameLayout = h0Var.f13797b;
        RectF rectF = this.f12750a;
        if (vg.i.c(frameLayout, this, rectF)) {
            TextView textView = m0Var.Y;
            RectF rectF2 = this.f12751b;
            if (vg.i.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    h0Var.f13797b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
