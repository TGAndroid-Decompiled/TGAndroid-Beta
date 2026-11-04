package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class w0 extends q2 {
    public final z0 A0;
    public final RectF f1047x0;
    public final RectF f1048y0;
    public final Path f1049z0;

    public w0(z0 z0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.A0 = z0Var;
        this.f1047x0 = new RectF();
        this.f1048y0 = new RectF();
        this.f1049z0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z0 z0Var = this.A0;
        u0 u0Var = z0Var.T1;
        boolean drawChild = super.drawChild(canvas, view, j10);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = u0Var.f5085b;
            t0 t0Var = z0Var.R1;
            RectF rectF = this.f1047x0;
            if (kh.k.c(frameLayout2, t0Var, rectF)) {
                RectF rectF2 = this.f1048y0;
                if (!kh.k.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - org.telegram.messenger.g0.L(40.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f1049z0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    canvas.translate(rectF2.centerX() - (u0Var.getWidth() / 2.0f), rectF2.centerY() - (u0Var.getHeight() / 2.0f));
                    u0Var.b(canvas, u0Var.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), u0Var.getWidth(), u0Var.getHeight());
                    u0Var.c(canvas, u0Var.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), u0Var.getWidth(), u0Var.getHeight());
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(org.telegram.messenger.g0.L(80.0f) / rectF.width(), org.telegram.messenger.g0.L(80.0f) / rectF.height());
                    u0Var.f5085b.draw(canvas);
                    canvas.restore();
                }
            } else {
                return true;
            }
        }
        return drawChild;
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        Path path = this.f1049z0;
        path.rewind();
        RectF rectF = this.f1047x0;
        rectF.set(0.0f, 0.0f, i3, i10);
        rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
    }
}
