package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class h0 extends FrameLayout {
    public final RectF f9195a;
    public final RectF f9196b;
    public final n0 f9197c;

    public h0(n0 n0Var, Context context) {
        super(context);
        this.f9197c = n0Var;
        this.f9195a = new RectF();
        this.f9196b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        n0 n0Var = this.f9197c;
        i0 i0Var = n0Var.W;
        FrameLayout frameLayout = i0Var.f11907b;
        RectF rectF = this.f9195a;
        if (sg.i.c(frameLayout, this, rectF)) {
            TextView textView = n0Var.X;
            RectF rectF2 = this.f9196b;
            if (sg.i.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    i0Var.f11907b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
