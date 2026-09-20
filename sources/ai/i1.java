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
    public yh.i8 f970a;
    public final Path f971b;
    public final Paint f972c;
    public long d;
    public final org.telegram.ui.Components.d6 e;
    public final l1 f973f;

    public i1(l1 l1Var, Context context) {
        super(context);
        this.f973f = l1Var;
        this.f971b = new Path();
        this.f972c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f971b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        l1 l1Var = this.f973f;
        n1 n1Var = l1Var.f1174f;
        if (n1Var != null) {
            int b10 = g0.b(n1Var.f1279a, n1Var.b(), 3);
            n1 n1Var2 = l1Var.f1174f;
            int b11 = g0.b(n1Var2.f1279a, n1Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            n1 n1Var3 = l1Var.f1174f;
            long j10 = n1Var3.f1280b;
            org.telegram.ui.Components.d6 d6Var = this.e;
            if (j3 != j10) {
                d6Var.d(n1Var3.a(), true);
            }
            float d = d6Var.d(l1Var.f1174f.a(), false);
            this.d = l1Var.f1174f.f1280b;
            Paint paint = this.f972c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f970a == null) {
            this.f970a = new yh.i8(1, 250);
        }
        this.f970a.f(0, 0, getWidth(), getHeight());
        yh.i8 i8Var = this.f970a;
        i8Var.h = 30.0f;
        i8Var.d();
        this.f970a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
