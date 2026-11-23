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
public final class s1 extends du0 {
    public boolean f22342g0;
    public final Paint f22343h0;
    public final RectF f22344i0;
    public final a2 f22345j0;

    public s1(a2 a2Var, Context context) {
        super(context, null);
        this.f22345j0 = a2Var;
        this.f22343h0 = new Paint(1);
        new Path();
        this.f22344i0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a2 a2Var = this.f22345j0;
        Rect rect = a2Var.f21956x;
        int r12 = m6.r1(a2Var.J, a2Var.getThemedColor(m6.f29347d6));
        Paint paint = this.f22343h0;
        paint.setColor(r12);
        if (a2Var.F && a2Var.f21958y != null) {
            RectF rectF = this.f22344i0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, a2Var.J);
            org.telegram.messenger.g0.Z1(a2Var.E, rectF, a2Var.J, rectF);
            rect.set(a2Var.f21958y.getBounds());
            a2Var.f21958y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            a2Var.f21958y.r(T1);
            a2Var.f21958y.setAlpha((int) ((1.0f - a2Var.J) * 255.0f));
            a2Var.f21958y.draw(canvas);
            a2Var.f21958y.setBounds(rect);
            rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            canvas.drawRoundRect(rectF, T1, T1, paint);
            if (a2Var.f21954w != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.W1(a2Var.J, a2Var.H[0], a2Var.I[0]), org.telegram.messenger.g0.W1(a2Var.J, a2Var.H[1], a2Var.I[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, a2Var.f21954w.getWidth(), a2Var.f21954w.getHeight(), (int) ((1.0f - a2Var.J) * 255.0f), 31);
                a2Var.f21954w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (a2Var.f21960z0.getX() + (a2Var.f21928b0.getX() + (a2Var.f21925a0.getX() + a2Var.Z.getX()))) + a2Var.f21960z0.getWidth(), a2Var.J) - a2Var.f21954w.f32664q2.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (a2Var.f21960z0.getY() + (a2Var.f21928b0.getY() + (a2Var.f21925a0.getY() + a2Var.Z.getY()))) + a2Var.f21960z0.getHeight(), a2Var.J) - a2Var.f21954w.f32664q2.getHeight());
                canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), a2Var.f21954w.f32664q2.getWidth(), a2Var.f21954w.f32664q2.getHeight(), (int) ((1.0f - a2Var.J) * 255.0f), 31);
                a2Var.f21954w.f32664q2.draw(canvas);
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
        a2 a2Var = this.f22345j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (a2Var.v0()) {
                org.telegram.messenger.f3.n(null, 2131745807, new lc(a2Var.Y, a2Var.getResourceProvider()), 2131623990, 36);
                return true;
            }
        } else if (!a2Var.Q.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: oi.s1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
