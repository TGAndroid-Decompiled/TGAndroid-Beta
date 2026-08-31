package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import mh.wa;
import org.telegram.messenger.AndroidUtilities;
public final class p0 extends LinearLayout {
    public wa f17610a;
    public final Path f17611b;
    public final Paint f17612c;
    public long d;
    public final org.telegram.ui.Components.z5 f17613e;
    public final s0 f17614f;

    public p0(s0 s0Var, Context context) {
        super(context);
        this.f17614f = s0Var;
        this.f17611b = new Path();
        this.f17612c = new Paint(1);
        this.d = 0L;
        this.f17613e = new org.telegram.ui.Components.z5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f17611b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        s0 s0Var = this.f17614f;
        u0 u0Var = s0Var.f17712f;
        if (u0Var != null) {
            int b10 = s.b(u0Var.f17798a, u0Var.b(), 3);
            u0 u0Var2 = s0Var.f17712f;
            int b11 = s.b(u0Var2.f17798a, u0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            u0 u0Var3 = s0Var.f17712f;
            long j11 = u0Var3.f17799b;
            org.telegram.ui.Components.z5 z5Var = this.f17613e;
            if (j10 != j11) {
                z5Var.d(u0Var3.a(), true);
            }
            float d = z5Var.d(s0Var.f17712f.a(), false);
            this.d = s0Var.f17712f.f17799b;
            Paint paint = this.f17612c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f17610a == null) {
            this.f17610a = new wa(1, 250);
        }
        this.f17610a.f(0, 0, getWidth(), getHeight());
        wa waVar = this.f17610a;
        waVar.h = 30.0f;
        waVar.d();
        this.f17610a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
