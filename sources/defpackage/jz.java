package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class jz extends sx4 {
    public final mz A0;
    public final RectF x0;
    public final RectF y0;
    public final Path z0;

    public jz(mz mzVar, Context context, int i, vnb vnbVar) {
        super(i, vnbVar, context);
        this.A0 = mzVar;
        this.x0 = new RectF();
        this.y0 = new RectF();
        this.z0 = new Path();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        mz mzVar = this.A0;
        hz hzVar = mzVar.V1;
        boolean drawChild = super.drawChild(canvas, view, j);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = hzVar.b;
            gz gzVar = mzVar.T1;
            RectF rectF = this.x0;
            if (yic.c(frameLayout2, gzVar, rectF)) {
                RectF rectF2 = this.y0;
                if (!yic.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - hl.L(40.0f);
                float centerY = rectF2.centerY() - hl.L(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.z0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    float centerX2 = rectF2.centerX() - (hzVar.getWidth() / 2.0f);
                    uh9.n(hzVar.getHeight(), 2.0f, rectF2.centerY(), centerX2, canvas);
                    hzVar.b(hzVar.getWidth() / 2.0f, hl.L(104.0f), hzVar.getWidth(), hzVar.getHeight(), canvas);
                    hzVar.c(hzVar.getWidth() / 2.0f, hl.L(104.0f), hzVar.getWidth(), hzVar.getHeight(), canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(hl.L(80.0f) / rectF.width(), hl.L(80.0f) / rectF.height());
                    hzVar.b.draw(canvas);
                    canvas.restore();
                }
            } else {
                return true;
            }
        }
        return drawChild;
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Path path = this.z0;
        path.rewind();
        RectF rectF = this.x0;
        rectF.set(0.0f, 0.0f, i, i2);
        rectF.inset(hl.L(3.33f), hl.L(4.0f));
        path.addRoundRect(rectF, hl.L(11.0f), hl.L(11.0f), Path.Direction.CW);
    }
}
