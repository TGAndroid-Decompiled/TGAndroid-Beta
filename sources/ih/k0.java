package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class k0 extends y1 {
    public final RectF f9260i0;
    public final RectF f9261j0;
    public final Path f9262k0;
    public final n0 f9263l0;

    public k0(n0 n0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f9263l0 = n0Var;
        this.f9260i0 = new RectF();
        this.f9261j0 = new RectF();
        this.f9262k0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        n0 n0Var = this.f9263l0;
        i0 i0Var = n0Var.W;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = i0Var.f11907b;
            h0 h0Var = n0Var.U;
            RectF rectF = this.f9260i0;
            if (sg.i.c(frameLayout2, h0Var, rectF)) {
                RectF rectF2 = this.f9261j0;
                if (!sg.i.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f9262k0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (i0Var.getWidth() / 2.0f), rectF2.centerY() - (i0Var.getHeight() / 2.0f));
                    i0Var.b(canvas, i0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), i0Var.getWidth(), i0Var.getHeight());
                    i0Var.c(canvas, i0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), i0Var.getWidth(), i0Var.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                    i0Var.f11907b.draw(canvas);
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
        Path path = this.f9262k0;
        path.rewind();
        RectF rectF = this.f9260i0;
        rectF.set(0.0f, 0.0f, i10, i11);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
