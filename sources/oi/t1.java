package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.lc;
public final class t1 extends du0 {
    public boolean f22400g0;
    public final Paint f22401h0;
    public final RectF f22402i0;
    public final b2 f22403j0;

    public t1(b2 b2Var, Context context) {
        super(context, null);
        this.f22403j0 = b2Var;
        this.f22401h0 = new Paint(1);
        new Path();
        this.f22402i0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b2 b2Var = this.f22403j0;
        Rect rect = b2Var.f22019x;
        int r12 = m6.r1(b2Var.J, b2Var.getThemedColor(m6.f29381d6));
        Paint paint = this.f22401h0;
        paint.setColor(r12);
        if (b2Var.F && b2Var.f22021y != null) {
            RectF rectF = this.f22402i0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, b2Var.J);
            org.telegram.messenger.g0.Z1(b2Var.E, rectF, b2Var.J, rectF);
            rect.set(b2Var.f22021y.getBounds());
            b2Var.f22021y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            b2Var.f22021y.r(T1);
            b2Var.f22021y.setAlpha((int) ((1.0f - b2Var.J) * 255.0f));
            b2Var.f22021y.draw(canvas);
            b2Var.f22021y.setBounds(rect);
            rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            canvas.drawRoundRect(rectF, T1, T1, paint);
            if (b2Var.f22017w != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.W1(b2Var.J, b2Var.H[0], b2Var.I[0]), org.telegram.messenger.g0.W1(b2Var.J, b2Var.H[1], b2Var.I[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, b2Var.f22017w.getWidth(), b2Var.f22017w.getHeight(), (int) ((1.0f - b2Var.J) * 255.0f), 31);
                b2Var.f22017w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (b2Var.f22023z0.getX() + (b2Var.f21991b0.getX() + (b2Var.f21988a0.getX() + b2Var.Z.getX()))) + b2Var.f22023z0.getWidth(), b2Var.J) - b2Var.f22017w.f32698q2.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (b2Var.f22023z0.getY() + (b2Var.f21991b0.getY() + (b2Var.f21988a0.getY() + b2Var.Z.getY()))) + b2Var.f22023z0.getHeight(), b2Var.J) - b2Var.f22017w.f32698q2.getHeight());
                canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), b2Var.f22017w.f32698q2.getWidth(), b2Var.f22017w.f32698q2.getHeight(), (int) ((1.0f - b2Var.J) * 255.0f), 31);
                b2Var.f22017w.f32698q2.draw(canvas);
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
        b2 b2Var = this.f22403j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (b2Var.v0()) {
                org.telegram.messenger.f3.n(null, 2131745807, new lc(b2Var.Y, b2Var.getResourceProvider()), 2131623990, 36);
                return true;
            }
        } else if (!b2Var.Q.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: oi.t1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
