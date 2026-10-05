package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class i1 extends LinearLayout {
    public yh.l8 f1060a;
    public final Path f1061b;
    public final Paint f1062c;
    public long d;
    public final org.telegram.ui.Components.e6 f1063e;
    public final l1 f1064f;

    public i1(l1 l1Var, Context context) {
        super(context);
        this.f1064f = l1Var;
        this.f1061b = new Path();
        this.f1062c = new Paint(1);
        this.d = 0L;
        this.f1063e = new org.telegram.ui.Components.e6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f1061b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        l1 l1Var = this.f1064f;
        n1 n1Var = l1Var.f1269f;
        if (n1Var != null) {
            int b10 = g0.b(n1Var.f1392a, n1Var.b(), 3);
            n1 n1Var2 = l1Var.f1269f;
            int b11 = g0.b(n1Var2.f1392a, n1Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            n1 n1Var3 = l1Var.f1269f;
            long j10 = n1Var3.f1393b;
            org.telegram.ui.Components.e6 e6Var = this.f1063e;
            if (j3 != j10) {
                e6Var.d(n1Var3.a(), true);
            }
            float d = e6Var.d(l1Var.f1269f.a(), false);
            this.d = l1Var.f1269f.f1393b;
            Paint paint = this.f1062c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f1060a == null) {
            this.f1060a = new yh.l8(1, 250);
        }
        this.f1060a.f(0, 0, getWidth(), getHeight());
        yh.l8 l8Var = this.f1060a;
        l8Var.h = 30.0f;
        l8Var.d();
        this.f1060a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
