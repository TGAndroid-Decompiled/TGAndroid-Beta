package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class d5b extends FrameLayout {
    public final Paint a;
    public final lm b;
    public final wjb c;
    public final g5b d;

    public d5b(g5b g5bVar, Context context, wjb wjbVar) {
        super(context);
        this.d = g5bVar;
        this.c = wjbVar;
        this.a = new Paint(1);
        this.b = new lm(this, 0L, 350L, s33.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        int v0 = bkb.v0(bkb.g5, this.c);
        Paint paint = this.a;
        paint.setColor(v0);
        g5b g5bVar = this.d;
        float max = Math.max(0.0f, g5bVar.D0());
        if (max < gl.m) {
            z = true;
        } else {
            z = false;
        }
        lm lmVar = this.b;
        float R1 = gl.R1(max, 0.0f, lmVar.d(z));
        RectF rectF = gl.P;
        rectF.set(g5bVar.u0, R1, getWidth() - g5bVar.u0, gl.L(14.0f) + getHeight());
        float L = (1.0f - lmVar.c) * gl.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        g5bVar.q1.setTranslationY(Math.max(gl.L(8.0f) + gl.m, gl.L(14.0f) + R1));
        canvas.save();
        canvas.clipRect(g5bVar.u0, gl.L(14.0f) + gl.m, getWidth() - g5bVar.u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        g5b g5bVar = this.d;
        if (y < g5bVar.D0()) {
            g5bVar.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
