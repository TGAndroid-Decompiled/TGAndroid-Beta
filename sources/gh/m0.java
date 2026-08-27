package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class m0 extends b2 {

    public final RectF f7423i0;

    public final RectF f7424j0;

    public final Path f7425k0;

    public final p0 f7426l0;

    public m0(p0 p0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f7426l0 = p0Var;
        this.f7423i0 = new RectF();
        this.f7424j0 = new RectF();
        this.f7425k0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        p0 p0Var = this.f7426l0;
        k0 k0Var = p0Var.W;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = k0Var.f9174b;
            j0 j0Var = p0Var.U;
            RectF rectF = this.f7423i0;
            if (!qg.j.c(frameLayout2, j0Var, rectF)) {
                return true;
            }
            RectF rectF2 = this.f7424j0;
            if (!qg.j.c(frameLayout, this, rectF2)) {
                return true;
            }
            float fCenterX = rectF2.centerX() - AndroidUtilities.dp(40.0f);
            float fCenterY = rectF2.centerY() - AndroidUtilities.dp(40.0f);
            if (!rectF.isEmpty()) {
                canvas.save();
                canvas.clipPath(this.f7425k0);
                canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                canvas.translate(rectF2.centerX() - (k0Var.getWidth() / 2.0f), rectF2.centerY() - (k0Var.getHeight() / 2.0f));
                k0Var.b(canvas, k0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), k0Var.getWidth(), k0Var.getHeight());
                k0Var.c(canvas, k0Var.getWidth() / 2.0f, AndroidUtilities.dp(104.0f), k0Var.getWidth(), k0Var.getHeight());
                canvas.restore();
                canvas.save();
                canvas.translate(fCenterX, fCenterY);
                canvas.scale(AndroidUtilities.dp(80.0f) / rectF.width(), AndroidUtilities.dp(80.0f) / rectF.height());
                k0Var.f9174b.draw(canvas);
                canvas.restore();
            }
        }
        return zDrawChild;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f7425k0;
        path.rewind();
        RectF rectF = this.f7423i0;
        rectF.set(0.0f, 0.0f, i10, i11);
        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        path.addRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), Path.Direction.CW);
    }
}
