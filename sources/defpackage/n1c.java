package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
public final class n1c extends io {
    public final Paint s;
    public final i66 w;
    public final p1c x;

    public n1c(p1c p1cVar, Context context) {
        super(context, false, false, false);
        this.x = p1cVar;
        this.s = new Paint(1);
        this.w = new i66();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        if (jb6.a0) {
            rectF = gm.P;
            rectF.set(getWidth() - d(), (getHeight() - gm.L(18.0f)) / 2.0f, getWidth(), (gm.L(18.0f) + getHeight()) / 2.0f);
        } else {
            rectF = gm.P;
            rectF.set(0.0f, (getHeight() - gm.L(18.0f)) / 2.0f, d(), (gm.L(18.0f) + getHeight()) / 2.0f);
        }
        s1c s1cVar = this.x.n;
        int i = cmb.Fj;
        String[] strArr = s1c.R1;
        int p1 = cmb.p1(0.1175f, cmb.v0(i, s1cVar.J0));
        Paint paint = this.s;
        paint.setColor(p1);
        canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
        if (this.w.g(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF;
        s1c s1cVar = this.x.n;
        int action = motionEvent.getAction();
        i66 i66Var = this.w;
        if (action == 0) {
            String[] strArr = s1c.R1;
            m66 m66Var = new m66(null, s1cVar.J0, motionEvent.getX(), motionEvent.getY(), 0);
            m66Var.d(cmb.p1(0.1175f, cmb.v0(cmb.Fj, s1cVar.J0)));
            b66 b = m66Var.b();
            if (jb6.a0) {
                rectF = gm.P;
                rectF.set(getWidth() - d(), (getHeight() - gm.L(18.0f)) / 2.0f, getWidth(), (gm.L(18.0f) + getHeight()) / 2.0f);
            } else {
                rectF = gm.P;
                rectF.set(0.0f, (getHeight() - gm.L(18.0f)) / 2.0f, d(), (gm.L(18.0f) + getHeight()) / 2.0f);
            }
            b.addRect(rectF, Path.Direction.CW);
            i66Var.a(m66Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            i66Var.e(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
