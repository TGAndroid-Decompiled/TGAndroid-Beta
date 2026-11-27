package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
public final class rg9 extends wma {
    public boolean g0;
    public final Paint h0;
    public final RectF i0;
    public final yg9 j0;

    public rg9(yg9 yg9Var, Context context) {
        super(context, null);
        this.j0 = yg9Var;
        this.h0 = new Paint(1);
        this.i0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yg9 yg9Var = this.j0;
        Rect rect = yg9Var.x;
        int p1 = aob.p1(yg9Var.J, yg9Var.getThemedColor(aob.d6));
        Paint paint = this.h0;
        paint.setColor(p1);
        if (yg9Var.F && yg9Var.y != null) {
            RectF rectF = this.i0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-hl.L(7.0f), -hl.L(7.0f));
            float R1 = hl.R1(hl.N(22.0f), 0.0f, yg9Var.J);
            hl.X1(yg9Var.E, rectF, yg9Var.J, rectF);
            rect.set(yg9Var.y.getBounds());
            yg9Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            yg9Var.y.r(R1);
            yg9Var.y.setAlpha((int) ((1.0f - yg9Var.J) * 255.0f));
            yg9Var.y.draw(canvas);
            yg9Var.y.setBounds(rect);
            rectF.inset(hl.L(7.0f), hl.L(7.0f));
            canvas.drawRoundRect(rectF, R1, R1, paint);
            if (yg9Var.w != null) {
                canvas.save();
                canvas.translate(hl.U1(yg9Var.J, yg9Var.H[0], yg9Var.I[0]), hl.U1(yg9Var.J, yg9Var.H[1], yg9Var.I[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, yg9Var.w.getWidth(), yg9Var.w.getHeight(), (int) ((1.0f - yg9Var.J) * 255.0f), 31);
                yg9Var.w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(hl.R1(rectF.right, (yg9Var.z0.getX() + (yg9Var.b0.getX() + (yg9Var.a0.getX() + yg9Var.Z.getX()))) + yg9Var.z0.getWidth(), yg9Var.J) - yg9Var.w.p2.getWidth(), hl.R1(rectF.bottom, (yg9Var.z0.getY() + (yg9Var.b0.getY() + (yg9Var.a0.getY() + yg9Var.Z.getY()))) + yg9Var.z0.getHeight(), yg9Var.J) - yg9Var.w.p2.getHeight());
                canvas.saveLayerAlpha(-hl.L(6.0f), -hl.L(6.0f), yg9Var.w.p2.getWidth(), yg9Var.w.p2.getHeight(), (int) ((1.0f - yg9Var.J) * 255.0f), 31);
                yg9Var.w.p2.draw(canvas);
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
        yg9 yg9Var = this.j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (yg9Var.r0()) {
                bs2.v(null, 2131745730, new d31(yg9Var.Y, yg9Var.getResourceProvider()), 2131623990, 36);
                return true;
            }
        } else if (!yg9Var.Q.e3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg9.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
