package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import lh.wa;
import org.telegram.messenger.AndroidUtilities;
public final class p0 extends LinearLayout {
    public wa f15736a;
    public final Path f15737b;
    public final Paint f15738c;
    public long d;
    public final org.telegram.ui.Components.z5 e;
    public final s0 f15739f;

    public p0(s0 s0Var, Context context) {
        super(context);
        this.f15739f = s0Var;
        this.f15737b = new Path();
        this.f15738c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.z5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f15737b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        s0 s0Var = this.f15739f;
        u0 u0Var = s0Var.f15863f;
        if (u0Var != null) {
            int b10 = t.b(u0Var.f15947a, u0Var.b(), 3);
            u0 u0Var2 = s0Var.f15863f;
            int b11 = t.b(u0Var2.f15947a, u0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            u0 u0Var3 = s0Var.f15863f;
            long j11 = u0Var3.f15948b;
            org.telegram.ui.Components.z5 z5Var = this.e;
            if (j10 != j11) {
                z5Var.d(u0Var3.a(), true);
            }
            float d = z5Var.d(s0Var.f15863f.a(), false);
            this.d = s0Var.f15863f.f15948b;
            Paint paint = this.f15738c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f15736a == null) {
            this.f15736a = new wa(1, 250);
        }
        this.f15736a.f(0, 0, getWidth(), getHeight());
        wa waVar = this.f15736a;
        waVar.h = 30.0f;
        waVar.d();
        this.f15736a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
