package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class a1 extends LinearLayout {
    public zh.h8 f2732a;
    public final Path f2733b;
    public final Paint f2734c;
    public long d;
    public final org.telegram.ui.Components.e6 f2735e;
    public final d1 f2736f;

    public a1(d1 d1Var, Context context) {
        super(context);
        this.f2736f = d1Var;
        this.f2733b = new Path();
        this.f2734c = new Paint(1);
        this.d = 0L;
        this.f2735e = new org.telegram.ui.Components.e6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f2733b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        d1 d1Var = this.f2736f;
        f1 f1Var = d1Var.f2851f;
        if (f1Var != null) {
            int b10 = z.b(f1Var.f2947a, f1Var.b(), 3);
            f1 f1Var2 = d1Var.f2851f;
            int b11 = z.b(f1Var2.f2947a, f1Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            f1 f1Var3 = d1Var.f2851f;
            long j10 = f1Var3.f2948b;
            org.telegram.ui.Components.e6 e6Var = this.f2735e;
            if (j3 != j10) {
                e6Var.d(f1Var3.a(), true);
            }
            float d = e6Var.d(d1Var.f2851f.a(), false);
            this.d = d1Var.f2851f.f2948b;
            Paint paint = this.f2734c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f2732a == null) {
            this.f2732a = new zh.h8(1, 250);
        }
        this.f2732a.f(0, 0, getWidth(), getHeight());
        zh.h8 h8Var = this.f2732a;
        h8Var.h = 30.0f;
        h8Var.d();
        this.f2732a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
