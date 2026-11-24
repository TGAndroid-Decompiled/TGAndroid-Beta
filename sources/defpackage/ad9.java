package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
public final class ad9 extends cja {
    public boolean m0;
    public final Paint n0;
    public final RectF o0;
    public final hd9 p0;

    public ad9(hd9 hd9Var, Context context) {
        super(context, null);
        this.p0 = hd9Var;
        this.n0 = new Paint(1);
        this.o0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        hd9 hd9Var = this.p0;
        Rect rect = hd9Var.x;
        int p1 = bkb.p1(hd9Var.J, hd9Var.getThemedColor(bkb.c6));
        Paint paint = this.n0;
        paint.setColor(p1);
        if (hd9Var.F && hd9Var.y != null) {
            RectF rectF = this.o0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-gl.L(7.0f), -gl.L(7.0f));
            float R1 = gl.R1(gl.N(22.0f), 0.0f, hd9Var.J);
            gl.X1(hd9Var.E, rectF, hd9Var.J, rectF);
            rect.set(hd9Var.y.getBounds());
            hd9Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            hd9Var.y.r(R1);
            hd9Var.y.setAlpha((int) ((1.0f - hd9Var.J) * 255.0f));
            hd9Var.y.draw(canvas);
            hd9Var.y.setBounds(rect);
            rectF.inset(gl.L(7.0f), gl.L(7.0f));
            canvas.drawRoundRect(rectF, R1, R1, paint);
            if (hd9Var.w != null) {
                canvas.save();
                canvas.translate(gl.U1(hd9Var.J, hd9Var.H[0], hd9Var.I[0]), gl.U1(hd9Var.J, hd9Var.H[1], hd9Var.I[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, hd9Var.w.getWidth(), hd9Var.w.getHeight(), (int) ((1.0f - hd9Var.J) * 255.0f), 31);
                hd9Var.w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(gl.R1(rectF.right, (hd9Var.z0.getX() + (hd9Var.b0.getX() + (hd9Var.a0.getX() + hd9Var.Z.getX()))) + hd9Var.z0.getWidth(), hd9Var.J) - hd9Var.w.q2.getWidth(), gl.R1(rectF.bottom, (hd9Var.z0.getY() + (hd9Var.b0.getY() + (hd9Var.a0.getY() + hd9Var.Z.getY()))) + hd9Var.z0.getHeight(), hd9Var.J) - hd9Var.w.q2.getHeight());
                canvas.saveLayerAlpha(-gl.L(6.0f), -gl.L(6.0f), hd9Var.w.q2.getWidth(), hd9Var.w.q2.getHeight(), (int) ((1.0f - hd9Var.J) * 255.0f), 31);
                hd9Var.w.q2.draw(canvas);
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
        hd9 hd9Var = this.p0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (hd9Var.r0()) {
                ir2.v(null, 2131745810, new u21(hd9Var.Y, hd9Var.getResourceProvider()), 2131623990, 36);
                return true;
            }
        } else if (!hd9Var.Q.d3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad9.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
