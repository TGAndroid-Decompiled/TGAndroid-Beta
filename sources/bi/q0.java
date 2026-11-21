package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.n10;
public final class q0 extends g3 {
    public final t0 A0;
    public final RectF f4013x0;
    public final RectF f4014y0;
    public final Path f4015z0;

    public q0(t0 t0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var);
        this.A0 = t0Var;
        this.f4013x0 = new RectF();
        this.f4014y0 = new RectF();
        this.f4015z0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        t0 t0Var = this.A0;
        o0 o0Var = t0Var.W1;
        boolean drawChild = super.drawChild(canvas, view, j3);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = o0Var.f10142b;
            n0 n0Var = t0Var.U1;
            RectF rectF = this.f4013x0;
            if (jh.k.c(frameLayout2, n0Var, rectF)) {
                RectF rectF2 = this.f4014y0;
                if (!jh.k.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - org.telegram.messenger.g0.L(40.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.g0.L(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.f4015z0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    float centerX2 = rectF2.centerX() - (o0Var.getWidth() / 2.0f);
                    n10.k(o0Var.getHeight(), 2.0f, rectF2.centerY(), centerX2, canvas);
                    o0Var.b(o0Var.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), o0Var.getWidth(), o0Var.getHeight(), canvas);
                    o0Var.c(o0Var.getWidth() / 2.0f, org.telegram.messenger.g0.L(104.0f), o0Var.getWidth(), o0Var.getHeight(), canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(org.telegram.messenger.g0.L(80.0f) / rectF.width(), org.telegram.messenger.g0.L(80.0f) / rectF.height());
                    o0Var.f10142b.draw(canvas);
                    canvas.restore();
                }
            } else {
                return true;
            }
        }
        return drawChild;
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Path path = this.f4015z0;
        path.rewind();
        RectF rectF = this.f4013x0;
        rectF.set(0.0f, 0.0f, i7, i10);
        rectF.inset(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
    }
}
