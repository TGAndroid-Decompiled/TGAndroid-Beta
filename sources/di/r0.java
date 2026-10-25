package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import bi.td;
import org.telegram.messenger.AndroidUtilities;
public final class r0 extends LinearLayout {
    public td f9106a;
    public final Path f9107b;
    public final Paint f9108c;
    public long d;
    public final org.telegram.ui.Components.h6 e;
    public final u0 f9109f;

    public r0(u0 u0Var, Context context) {
        super(context);
        this.f9109f = u0Var;
        this.f9107b = new Path();
        this.f9108c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.h6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f9107b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        u0 u0Var = this.f9109f;
        w0 w0Var = u0Var.f9220f;
        if (w0Var != null) {
            int b10 = u.b(w0Var.f9284a, w0Var.b(), 3);
            w0 w0Var2 = u0Var.f9220f;
            int b11 = u.b(w0Var2.f9284a, w0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            w0 w0Var3 = u0Var.f9220f;
            int i10 = (j10 > w0Var3.f9285b ? 1 : (j10 == w0Var3.f9285b ? 0 : -1));
            org.telegram.ui.Components.h6 h6Var = this.e;
            if (i10 != 0) {
                h6Var.d(w0Var3.a(), true);
            }
            float d = h6Var.d(u0Var.f9220f.a(), false);
            this.d = u0Var.f9220f.f9285b;
            Paint paint = this.f9108c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f9106a == null) {
            this.f9106a = new td(1, 250);
        }
        this.f9106a.f(0, 0, getWidth(), getHeight());
        td tdVar = this.f9106a;
        tdVar.h = 30.0f;
        tdVar.d();
        this.f9106a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
