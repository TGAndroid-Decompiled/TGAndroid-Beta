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
    public zh.b8 f2819a;
    public final Path f2820b;
    public final Paint f2821c;
    public long d;
    public final org.telegram.ui.Components.g6 e;
    public final d1 f2822f;

    public a1(d1 d1Var, Context context) {
        super(context);
        this.f2822f = d1Var;
        this.f2820b = new Path();
        this.f2821c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.g6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f2820b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        d1 d1Var = this.f2822f;
        f1 f1Var = d1Var.f2945f;
        if (f1Var != null) {
            int b10 = z.b(f1Var.f3011a, f1Var.b(), 3);
            f1 f1Var2 = d1Var.f2945f;
            int b11 = z.b(f1Var2.f3011a, f1Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            f1 f1Var3 = d1Var.f2945f;
            int i10 = (j10 > f1Var3.f3012b ? 1 : (j10 == f1Var3.f3012b ? 0 : -1));
            org.telegram.ui.Components.g6 g6Var = this.e;
            if (i10 != 0) {
                g6Var.d(f1Var3.a(), true);
            }
            float d = g6Var.d(d1Var.f2945f.a(), false);
            this.d = d1Var.f2945f.f3012b;
            Paint paint = this.f2821c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f2819a == null) {
            this.f2819a = new zh.b8(1, 250);
        }
        this.f2819a.f(0, 0, getWidth(), getHeight());
        zh.b8 b8Var = this.f2819a;
        b8Var.h = 30.0f;
        b8Var.d();
        this.f2819a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
