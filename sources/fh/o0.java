package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o0 extends f2 {
    public final RectF f6649i0;
    public final RectF f6650j0;
    public final Path f6651k0;
    public final r0 f6652l0;

    public o0(r0 r0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.f6652l0 = r0Var;
        this.f6649i0 = new RectF();
        this.f6650j0 = new RectF();
        this.f6651k0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r0 r0Var = this.f6652l0;
        m0 m0Var = r0Var.W;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = m0Var.f8108b;
            l0 l0Var = r0Var.U;
            RectF rectF = this.f6649i0;
            if (pg.i.c(frameLayout2, l0Var, rectF)) {
                RectF rectF2 = this.f6650j0;
                if (!pg.i.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f6651k0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (m0Var.getWidth() / 2.0f), rectF2.centerY() - (m0Var.getHeight() / 2.0f));
                    m0Var.b(canvas, m0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), m0Var.getWidth(), m0Var.getHeight());
                    m0Var.c(canvas, m0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), m0Var.getWidth(), m0Var.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                    m0Var.f8108b.draw(canvas);
                    canvas.restore();
                }
            } else {
                return true;
            }
        }
        return drawChild;
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Path path = this.f6651k0;
        path.rewind();
        RectF rectF = this.f6649i0;
        rectF.set(0.0f, 0.0f, i9, i10);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
