package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class j0 extends x1 {
    public final RectF f12817j0;
    public final RectF f12818k0;
    public final Path f12819l0;
    public final m0 m0;

    public j0(m0 m0Var, Context context, int i10, g6 g6Var) {
        super(context, i10, g6Var);
        this.m0 = m0Var;
        this.f12817j0 = new RectF();
        this.f12818k0 = new RectF();
        this.f12819l0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        m0 m0Var = this.m0;
        h0 h0Var = m0Var.X;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = h0Var.f13799b;
            g0 g0Var = m0Var.V;
            RectF rectF = this.f12817j0;
            if (vg.i.c(frameLayout2, g0Var, rectF)) {
                RectF rectF2 = this.f12818k0;
                if (!vg.i.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f12819l0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (h0Var.getWidth() / 2.0f), rectF2.centerY() - (h0Var.getHeight() / 2.0f));
                    h0Var.b(canvas, h0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), h0Var.getWidth(), h0Var.getHeight());
                    h0Var.c(canvas, h0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), h0Var.getWidth(), h0Var.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                    h0Var.f13799b.draw(canvas);
                    canvas.restore();
                }
            } else {
                return true;
            }
        }
        return drawChild;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f12819l0;
        path.rewind();
        RectF rectF = this.f12817j0;
        rectF.set(0.0f, 0.0f, i10, i11);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
