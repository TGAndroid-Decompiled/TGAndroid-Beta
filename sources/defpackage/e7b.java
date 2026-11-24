package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class e7b extends FrameLayout {
    public final Paint a;
    public final ln b;
    public final ylb c;
    public final h7b d;

    public e7b(h7b h7bVar, Context context, ylb ylbVar) {
        super(context);
        this.d = h7bVar;
        this.c = ylbVar;
        this.a = new Paint(1);
        this.b = new ln(this, 0L, 350L, d53.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        int v0 = cmb.v0(cmb.g5, this.c);
        Paint paint = this.a;
        paint.setColor(v0);
        h7b h7bVar = this.d;
        float max = Math.max(0.0f, h7bVar.D0());
        if (max < gm.m) {
            z = true;
        } else {
            z = false;
        }
        ln lnVar = this.b;
        float R1 = gm.R1(max, 0.0f, lnVar.d(z));
        RectF rectF = gm.P;
        rectF.set(h7bVar.u0, R1, getWidth() - h7bVar.u0, gm.L(14.0f) + getHeight());
        float L = (1.0f - lnVar.c) * gm.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        h7bVar.q1.setTranslationY(Math.max(gm.L(8.0f) + gm.m, gm.L(14.0f) + R1));
        canvas.save();
        canvas.clipRect(h7bVar.u0, gm.L(14.0f) + gm.m, getWidth() - h7bVar.u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        h7b h7bVar = this.d;
        if (y < h7bVar.D0()) {
            h7bVar.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
