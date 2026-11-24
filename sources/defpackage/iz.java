package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class iz extends nv4 {
    public final lz A0;
    public final RectF x0;
    public final RectF y0;
    public final Path z0;

    public iz(lz lzVar, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context);
        this.A0 = lzVar;
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
        lz lzVar = this.A0;
        gz gzVar = lzVar.V1;
        boolean drawChild = super.drawChild(canvas, view, j);
        FrameLayout frameLayout = this.d;
        if (view == frameLayout) {
            FrameLayout frameLayout2 = gzVar.b;
            fz fzVar = lzVar.T1;
            RectF rectF = this.x0;
            if (zec.c(frameLayout2, fzVar, rectF)) {
                RectF rectF2 = this.y0;
                if (!zec.c(frameLayout, this, rectF2)) {
                    return true;
                }
                float centerX = rectF2.centerX() - gl.L(40.0f);
                float centerY = rectF2.centerY() - gl.L(40.0f);
                if (!rectF.isEmpty()) {
                    canvas.save();
                    canvas.clipPath(this.z0);
                    canvas.scale(0.6f, 0.6f, rectF2.centerX(), rectF2.centerY());
                    float centerX2 = rectF2.centerX() - (gzVar.getWidth() / 2.0f);
                    de9.n(gzVar.getHeight(), 2.0f, rectF2.centerY(), centerX2, canvas);
                    gzVar.b(gzVar.getWidth() / 2.0f, gl.L(104.0f), gzVar.getWidth(), gzVar.getHeight(), canvas);
                    gzVar.c(gzVar.getWidth() / 2.0f, gl.L(104.0f), gzVar.getWidth(), gzVar.getHeight(), canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(centerX, centerY);
                    canvas.scale(gl.L(80.0f) / rectF.width(), gl.L(80.0f) / rectF.height());
                    gzVar.b.draw(canvas);
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
        rectF.inset(gl.L(3.33f), gl.L(4.0f));
        path.addRoundRect(rectF, gl.L(11.0f), gl.L(11.0f), Path.Direction.CW);
    }
}
