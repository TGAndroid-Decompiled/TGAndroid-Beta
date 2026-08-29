package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import jh.va;
import org.telegram.messenger.AndroidUtilities;
public final class o0 extends LinearLayout {
    public va f16006a;
    public final Path f16007b;
    public final Paint f16008c;
    public long d;
    public final org.telegram.ui.Components.d6 f16009e;
    public final r0 f16010f;

    public o0(r0 r0Var, Context context) {
        super(context);
        this.f16010f = r0Var;
        this.f16007b = new Path();
        this.f16008c = new Paint(1);
        this.d = 0L;
        this.f16009e = new org.telegram.ui.Components.d6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f16007b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        r0 r0Var = this.f16010f;
        t0 t0Var = r0Var.f16148f;
        if (t0Var != null) {
            int b10 = s.b(t0Var.f16250a, t0Var.b(), 3);
            t0 t0Var2 = r0Var.f16148f;
            int b11 = s.b(t0Var2.f16250a, t0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            t0 t0Var3 = r0Var.f16148f;
            long j11 = t0Var3.f16251b;
            org.telegram.ui.Components.d6 d6Var = this.f16009e;
            if (j10 != j11) {
                d6Var.d(t0Var3.a(), true);
            }
            float d = d6Var.d(r0Var.f16148f.a(), false);
            this.d = r0Var.f16148f.f16251b;
            Paint paint = this.f16008c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f16006a == null) {
            this.f16006a = new va(1, 250);
        }
        this.f16006a.f(0, 0, getWidth(), getHeight());
        va vaVar = this.f16006a;
        vaVar.h = 30.0f;
        vaVar.d();
        this.f16006a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
