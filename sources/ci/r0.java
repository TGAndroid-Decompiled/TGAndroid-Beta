package ci;

import ai.de;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r0 extends LinearLayout {
    public de f5904a;
    public final Path f5905b;
    public final Paint f5906c;
    public long d;
    public final org.telegram.ui.Components.f6 e;
    public final u0 f5907f;

    public r0(u0 u0Var, Context context) {
        super(context);
        this.f5907f = u0Var;
        this.f5905b = new Path();
        this.f5906c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.f6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f5905b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        u0 u0Var = this.f5907f;
        w0 w0Var = u0Var.f6036f;
        if (w0Var != null) {
            int b10 = u.b(w0Var.f6100a, w0Var.b(), 3);
            w0 w0Var2 = u0Var.f6036f;
            int b11 = u.b(w0Var2.f6100a, w0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            w0 w0Var3 = u0Var.f6036f;
            int i10 = (j10 > w0Var3.f6101b ? 1 : (j10 == w0Var3.f6101b ? 0 : -1));
            org.telegram.ui.Components.f6 f6Var = this.e;
            if (i10 != 0) {
                f6Var.d(w0Var3.a(), true);
            }
            float d = f6Var.d(u0Var.f6036f.a(), false);
            this.d = u0Var.f6036f.f6101b;
            Paint paint = this.f5906c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f5904a == null) {
            this.f5904a = new de(1, 250);
        }
        this.f5904a.f(0, 0, getWidth(), getHeight());
        de deVar = this.f5904a;
        deVar.h = 30.0f;
        deVar.d();
        this.f5904a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
