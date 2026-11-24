package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
public final class bf9 extends ela {
    public boolean m0;
    public final Paint n0;
    public final RectF o0;
    public final jf9 p0;

    public bf9(jf9 jf9Var, Context context) {
        super(context, null);
        this.p0 = jf9Var;
        this.n0 = new Paint(1);
        this.o0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        jf9 jf9Var = this.p0;
        Rect rect = jf9Var.x;
        int p1 = cmb.p1(jf9Var.J, jf9Var.getThemedColor(cmb.c6));
        Paint paint = this.n0;
        paint.setColor(p1);
        if (jf9Var.F && jf9Var.y != null) {
            RectF rectF = this.o0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-gm.L(7.0f), -gm.L(7.0f));
            float R1 = gm.R1(gm.N(22.0f), 0.0f, jf9Var.J);
            gm.X1(jf9Var.E, rectF, jf9Var.J, rectF);
            rect.set(jf9Var.y.getBounds());
            jf9Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            jf9Var.y.r(R1);
            jf9Var.y.setAlpha((int) ((1.0f - jf9Var.J) * 255.0f));
            jf9Var.y.draw(canvas);
            jf9Var.y.setBounds(rect);
            rectF.inset(gm.L(7.0f), gm.L(7.0f));
            canvas.drawRoundRect(rectF, R1, R1, paint);
            if (jf9Var.w != null) {
                canvas.save();
                canvas.translate(gm.U1(jf9Var.J, jf9Var.H[0], jf9Var.I[0]), gm.U1(jf9Var.J, jf9Var.H[1], jf9Var.I[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, jf9Var.w.getWidth(), jf9Var.w.getHeight(), (int) ((1.0f - jf9Var.J) * 255.0f), 31);
                jf9Var.w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(gm.R1(rectF.right, (jf9Var.z0.getX() + (jf9Var.b0.getX() + (jf9Var.a0.getX() + jf9Var.Z.getX()))) + jf9Var.z0.getWidth(), jf9Var.J) - jf9Var.w.q2.getWidth(), gm.R1(rectF.bottom, (jf9Var.z0.getY() + (jf9Var.b0.getY() + (jf9Var.a0.getY() + jf9Var.Z.getY()))) + jf9Var.z0.getHeight(), jf9Var.J) - jf9Var.w.q2.getHeight());
                canvas.saveLayerAlpha(-gm.L(6.0f), -gm.L(6.0f), jf9Var.w.q2.getWidth(), jf9Var.w.q2.getHeight(), (int) ((1.0f - jf9Var.J) * 255.0f), 31);
                jf9Var.w.q2.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            canvas.save();
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        jf9 jf9Var = this.p0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (jf9Var.s0()) {
                ts2.u(null, 2131745736, new c41(jf9Var.Y, jf9Var.getResourceProvider()), 2131623990, 36);
                return true;
            }
        } else if (!jf9Var.Q.d3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf9.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
