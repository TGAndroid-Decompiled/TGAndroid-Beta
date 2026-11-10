package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.st0;
public final class t1 extends st0 {
    public boolean f18869f0;
    public final Paint f18870g0;
    public final RectF f18871h0;
    public final b2 f18872i0;

    public t1(b2 b2Var, Context context) {
        super(context, null);
        this.f18872i0 = b2Var;
        this.f18870g0 = new Paint(1);
        new Path();
        this.f18871h0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b2 b2Var = this.f18872i0;
        Rect rect = b2Var.f18475x;
        int r12 = m6.r1(b2Var.I, b2Var.getThemedColor(m6.f27890d6));
        Paint paint = this.f18870g0;
        paint.setColor(r12);
        if (b2Var.E && b2Var.f18477y != null) {
            RectF rectF = this.f18871h0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, b2Var.I);
            org.telegram.messenger.g0.Z1(b2Var.D, rectF, b2Var.I, rectF);
            rect.set(b2Var.f18477y.getBounds());
            b2Var.f18477y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            b2Var.f18477y.r(T1);
            b2Var.f18477y.setAlpha((int) ((1.0f - b2Var.I) * 255.0f));
            b2Var.f18477y.draw(canvas);
            b2Var.f18477y.setBounds(rect);
            rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            canvas.drawRoundRect(rectF, T1, T1, paint);
            if (b2Var.f18473w != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.W1(b2Var.I, b2Var.G[0], b2Var.H[0]), org.telegram.messenger.g0.W1(b2Var.I, b2Var.G[1], b2Var.H[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, b2Var.f18473w.getWidth(), b2Var.f18473w.getHeight(), (int) ((1.0f - b2Var.I) * 255.0f), 31);
                b2Var.f18473w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (b2Var.f18478y0.getX() + (b2Var.f18445a0.getX() + (b2Var.Z.getX() + b2Var.Y.getX()))) + b2Var.f18478y0.getWidth(), b2Var.I) - b2Var.f18473w.A1.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (b2Var.f18478y0.getY() + (b2Var.f18445a0.getY() + (b2Var.Z.getY() + b2Var.Y.getY()))) + b2Var.f18478y0.getHeight(), b2Var.I) - b2Var.f18473w.A1.getHeight());
                canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), b2Var.f18473w.A1.getWidth(), b2Var.f18473w.A1.getHeight(), (int) ((1.0f - b2Var.I) * 255.0f), 31);
                b2Var.f18473w.A1.draw(canvas);
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
        b2 b2Var = this.f18872i0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (b2Var.v0()) {
                org.telegram.messenger.k5.o(null, 2131746003, new gc(b2Var.X, b2Var.getResourceProvider()), 2131623989, 36);
                return true;
            }
        } else if (!b2Var.P.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: li.t1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
