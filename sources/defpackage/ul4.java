package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
public final class ul4 extends View {
    public final RectF a;
    public final rj4 b;
    public long c;
    public final xl4 d;

    public ul4(xl4 xl4Var, Activity activity) {
        super(activity);
        this.d = xl4Var;
        this.a = new RectF();
        this.b = new rj4(this, (byte) 3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xl4 xl4Var = this.d;
        je8 je8Var = xl4Var.b;
        long duration = je8Var.getDuration();
        if (duration > 0 && aob.k2 != null) {
            float a = ete.a(((float) je8Var.k()) / ((float) duration), 0.0f, 1.0f);
            float N = hl.N(1.5f);
            RectF rectF = this.a;
            rectF.set(N, N, getWidth() - N, getHeight() - N);
            canvas.drawArc(rectF, -90.0f, a * 360.0f, false, aob.k2);
        }
        rj4 rj4Var = this.b;
        removeCallbacks(rj4Var);
        if (xl4Var.N) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.c > 500) {
            this.c = elapsedRealtime;
            xl4Var.u();
        }
        if (je8Var.i()) {
            postInvalidateOnAnimation();
        } else {
            postDelayed(rj4Var, 250L);
        }
    }
}
