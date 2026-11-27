package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class b9b extends FrameLayout {
    public final Paint a;
    public final mm b;
    public final vnb c;
    public final e9b d;

    public b9b(e9b e9bVar, Context context, vnb vnbVar) {
        super(context);
        this.d = e9bVar;
        this.c = vnbVar;
        this.a = new Paint(1);
        this.b = new mm(this, 0L, 350L, k43.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        int v0 = aob.v0(aob.h5, this.c);
        Paint paint = this.a;
        paint.setColor(v0);
        e9b e9bVar = this.d;
        float max = Math.max(0.0f, e9bVar.E0());
        if (max < hl.m) {
            z = true;
        } else {
            z = false;
        }
        mm mmVar = this.b;
        float R1 = hl.R1(max, 0.0f, mmVar.d(z));
        RectF rectF = hl.P;
        rectF.set(e9bVar.u0, R1, getWidth() - e9bVar.u0, hl.L(14.0f) + getHeight());
        float L = (1.0f - mmVar.c) * hl.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        e9bVar.q1.setTranslationY(Math.max(hl.L(8.0f) + hl.m, hl.L(14.0f) + R1));
        canvas.save();
        canvas.clipRect(e9bVar.u0, hl.L(14.0f) + hl.m, getWidth() - e9bVar.u0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        e9b e9bVar = this.d;
        if (y < e9bVar.E0()) {
            e9bVar.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
