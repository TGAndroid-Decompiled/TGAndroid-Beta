package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.qt0;
public final class u1 extends qt0 {
    public boolean f19963g0;
    public final Paint f19964h0;
    public final RectF f19965i0;
    public final c2 f19966j0;

    public u1(c2 c2Var, Context context) {
        super(context, null);
        this.f19966j0 = c2Var;
        this.f19964h0 = new Paint(1);
        new Path();
        this.f19965i0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c2 c2Var = this.f19966j0;
        Rect rect = c2Var.f19538x;
        int r12 = k6.r1(c2Var.J, c2Var.getThemedColor(k6.f27878d6));
        Paint paint = this.f19964h0;
        paint.setColor(r12);
        if (c2Var.F && c2Var.f19540y != null) {
            RectF rectF = this.f19965i0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, c2Var.J);
            org.telegram.messenger.g0.Z1(c2Var.E, rectF, c2Var.J, rectF);
            rect.set(c2Var.f19540y.getBounds());
            c2Var.f19540y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            c2Var.f19540y.r(T1);
            c2Var.f19540y.setAlpha((int) ((1.0f - c2Var.J) * 255.0f));
            c2Var.f19540y.draw(canvas);
            c2Var.f19540y.setBounds(rect);
            rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            canvas.drawRoundRect(rectF, T1, T1, paint);
            if (c2Var.f19536w != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.W1(c2Var.J, c2Var.H[0], c2Var.I[0]), org.telegram.messenger.g0.W1(c2Var.J, c2Var.H[1], c2Var.I[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, c2Var.f19536w.getWidth(), c2Var.f19536w.getHeight(), (int) ((1.0f - c2Var.J) * 255.0f), 31);
                c2Var.f19536w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (c2Var.f19542z0.getX() + (c2Var.f19510b0.getX() + (c2Var.f19507a0.getX() + c2Var.Z.getX()))) + c2Var.f19542z0.getWidth(), c2Var.J) - c2Var.f19536w.B1.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (c2Var.f19542z0.getY() + (c2Var.f19510b0.getY() + (c2Var.f19507a0.getY() + c2Var.Z.getY()))) + c2Var.f19542z0.getHeight(), c2Var.J) - c2Var.f19536w.B1.getHeight());
                canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), c2Var.f19536w.B1.getWidth(), c2Var.f19536w.B1.getHeight(), (int) ((1.0f - c2Var.J) * 255.0f), 31);
                c2Var.f19536w.B1.draw(canvas);
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
        c2 c2Var = this.f19966j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (c2Var.v0()) {
                org.telegram.messenger.k5.o(null, 2131746013, new fc(c2Var.Y, c2Var.getResourceProvider()), 2131623989, 36);
                return true;
            }
        } else if (!c2Var.Q.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: mi.u1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
