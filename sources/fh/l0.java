package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l0 extends FrameLayout {
    public final RectF f6595a;
    public final RectF f6596b;
    public final r0 f6597c;

    public l0(r0 r0Var, Context context) {
        super(context);
        this.f6597c = r0Var;
        this.f6595a = new RectF();
        this.f6596b = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        r0 r0Var = this.f6597c;
        m0 m0Var = r0Var.W;
        FrameLayout frameLayout = m0Var.f8108b;
        RectF rectF = this.f6595a;
        if (pg.i.c(frameLayout, this, rectF)) {
            TextView textView = r0Var.X;
            RectF rectF2 = this.f6596b;
            if (pg.i.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.translate(dp, centerY);
                    canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                    m0Var.f8108b.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }
}
