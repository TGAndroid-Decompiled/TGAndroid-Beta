package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
public final class m3c extends in {
    public final Paint s;
    public final m66 w;
    public final o3c x;

    public m3c(o3c o3cVar, Context context) {
        super(context, false, false, false);
        this.x = o3cVar;
        this.s = new Paint(1);
        this.w = new m66();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        if (ob6.a0) {
            rectF = hl.P;
            rectF.set(getWidth() - d(), (getHeight() - hl.L(18.0f)) / 2.0f, getWidth(), (hl.L(18.0f) + getHeight()) / 2.0f);
        } else {
            rectF = hl.P;
            rectF.set(0.0f, (getHeight() - hl.L(18.0f)) / 2.0f, d(), (hl.L(18.0f) + getHeight()) / 2.0f);
        }
        r3c r3cVar = this.x.n;
        int i = aob.Gj;
        String[] strArr = r3c.R1;
        int p1 = aob.p1(0.1175f, aob.v0(i, r3cVar.J0));
        Paint paint = this.s;
        paint.setColor(p1);
        canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), paint);
        if (this.w.g(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF;
        r3c r3cVar = this.x.n;
        int action = motionEvent.getAction();
        m66 m66Var = this.w;
        if (action == 0) {
            String[] strArr = r3c.R1;
            q66 q66Var = new q66(null, r3cVar.J0, motionEvent.getX(), motionEvent.getY(), 0);
            q66Var.d(aob.p1(0.1175f, aob.v0(aob.Gj, r3cVar.J0)));
            f66 b = q66Var.b();
            if (ob6.a0) {
                rectF = hl.P;
                rectF.set(getWidth() - d(), (getHeight() - hl.L(18.0f)) / 2.0f, getWidth(), (hl.L(18.0f) + getHeight()) / 2.0f);
            } else {
                rectF = hl.P;
                rectF.set(0.0f, (getHeight() - hl.L(18.0f)) / 2.0f, d(), (hl.L(18.0f) + getHeight()) / 2.0f);
            }
            b.addRect(rectF, Path.Direction.CW);
            m66Var.a(q66Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            m66Var.e(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
