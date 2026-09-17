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
    public zh.h8 f2759a;
    public final Path f2760b;
    public final Paint f2761c;
    public long d;
    public final org.telegram.ui.Components.e6 f2762e;
    public final d1 f2763f;

    public a1(d1 d1Var, Context context) {
        super(context);
        this.f2763f = d1Var;
        this.f2760b = new Path();
        this.f2761c = new Paint(1);
        this.d = 0L;
        this.f2762e = new org.telegram.ui.Components.e6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f2760b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        d1 d1Var = this.f2763f;
        f1 f1Var = d1Var.f2878f;
        if (f1Var != null) {
            int b10 = z.b(f1Var.f2974a, f1Var.b(), 3);
            f1 f1Var2 = d1Var.f2878f;
            int b11 = z.b(f1Var2.f2974a, f1Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            f1 f1Var3 = d1Var.f2878f;
            long j10 = f1Var3.f2975b;
            org.telegram.ui.Components.e6 e6Var = this.f2762e;
            if (j3 != j10) {
                e6Var.d(f1Var3.a(), true);
            }
            float d = e6Var.d(d1Var.f2878f.a(), false);
            this.d = d1Var.f2878f.f2975b;
            Paint paint = this.f2761c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f2759a == null) {
            this.f2759a = new zh.h8(1, 250);
        }
        this.f2759a.f(0, 0, getWidth(), getHeight());
        zh.h8 h8Var = this.f2759a;
        h8Var.h = 30.0f;
        h8Var.d();
        this.f2759a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
