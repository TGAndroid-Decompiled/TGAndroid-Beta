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
    public yh.b8 f1120a;
    public final Path f1121b;
    public final Paint f1122c;
    public long d;
    public final org.telegram.ui.Components.g6 f1123e;
    public final l1 f1124f;

    public i1(l1 l1Var, Context context) {
        super(context);
        this.f1124f = l1Var;
        this.f1121b = new Path();
        this.f1122c = new Paint(1);
        this.d = 0L;
        this.f1123e = new org.telegram.ui.Components.g6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f1121b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        l1 l1Var = this.f1124f;
        n1 n1Var = l1Var.f1322f;
        if (n1Var != null) {
            int b10 = g0.b(n1Var.f1439a, n1Var.b(), 3);
            n1 n1Var2 = l1Var.f1322f;
            int b11 = g0.b(n1Var2.f1439a, n1Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            n1 n1Var3 = l1Var.f1322f;
            int i10 = (j3 > n1Var3.f1440b ? 1 : (j3 == n1Var3.f1440b ? 0 : -1));
            org.telegram.ui.Components.g6 g6Var = this.f1123e;
            if (i10 != 0) {
                g6Var.d(n1Var3.a(), true);
            }
            float d = g6Var.d(l1Var.f1322f.a(), false);
            this.d = l1Var.f1322f.f1440b;
            Paint paint = this.f1122c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f1120a == null) {
            this.f1120a = new yh.b8(1, 250);
        }
        this.f1120a.f(0, 0, getWidth(), getHeight());
        yh.b8 b8Var = this.f1120a;
        b8Var.h = 30.0f;
        b8Var.d();
        this.f1120a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
