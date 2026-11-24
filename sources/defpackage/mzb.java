package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
public final class mzb extends hn {
    public final Paint s;
    public final i46 w;
    public final ozb x;

    public mzb(ozb ozbVar, Context context) {
        super(context, false, false, false);
        this.x = ozbVar;
        this.s = new Paint(1);
        this.w = new i46();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        if (k96.a0) {
            rectF = gl.P;
            rectF.set(getWidth() - d(), (getHeight() - gl.L(18.0f)) / 2.0f, getWidth(), (gl.L(18.0f) + getHeight()) / 2.0f);
        } else {
            rectF = gl.P;
            rectF.set(0.0f, (getHeight() - gl.L(18.0f)) / 2.0f, d(), (gl.L(18.0f) + getHeight()) / 2.0f);
        }
        rzb rzbVar = this.x.n;
        int i = bkb.Fj;
        String[] strArr = rzb.R1;
        int p1 = bkb.p1(0.1175f, bkb.v0(i, rzbVar.J0));
        Paint paint = this.s;
        paint.setColor(p1);
        canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
        if (this.w.g(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF;
        rzb rzbVar = this.x.n;
        int action = motionEvent.getAction();
        i46 i46Var = this.w;
        if (action == 0) {
            String[] strArr = rzb.R1;
            m46 m46Var = new m46(null, rzbVar.J0, motionEvent.getX(), motionEvent.getY(), 0);
            m46Var.d(bkb.p1(0.1175f, bkb.v0(bkb.Fj, rzbVar.J0)));
            b46 b = m46Var.b();
            if (k96.a0) {
                rectF = gl.P;
                rectF.set(getWidth() - d(), (getHeight() - gl.L(18.0f)) / 2.0f, getWidth(), (gl.L(18.0f) + getHeight()) / 2.0f);
            } else {
                rectF = gl.P;
                rectF.set(0.0f, (getHeight() - gl.L(18.0f)) / 2.0f, d(), (gl.L(18.0f) + getHeight()) / 2.0f);
            }
            b.addRect(rectF, Path.Direction.CW);
            i46Var.a(m46Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            i46Var.e(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
