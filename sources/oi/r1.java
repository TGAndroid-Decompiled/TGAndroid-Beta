package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lc;
public final class r1 extends au0 {
    public boolean f22276g0;
    public final Paint f22277h0;
    public final RectF f22278i0;
    public final z1 f22279j0;

    public r1(z1 z1Var, Context context) {
        super(context, null);
        this.f22279j0 = z1Var;
        this.f22277h0 = new Paint(1);
        new Path();
        this.f22278i0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        z1 z1Var = this.f22279j0;
        Rect rect = z1Var.f22546x;
        int r12 = n6.r1(z1Var.J, z1Var.getThemedColor(n6.f29396d6));
        Paint paint = this.f22277h0;
        paint.setColor(r12);
        if (z1Var.F && z1Var.f22548y != null) {
            RectF rectF = this.f22278i0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, z1Var.J);
            org.telegram.messenger.g0.Z1(z1Var.E, rectF, z1Var.J, rectF);
            rect.set(z1Var.f22548y.getBounds());
            z1Var.f22548y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            z1Var.f22548y.r(T1);
            z1Var.f22548y.setAlpha((int) ((1.0f - z1Var.J) * 255.0f));
            z1Var.f22548y.draw(canvas);
            z1Var.f22548y.setBounds(rect);
            rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            canvas.drawRoundRect(rectF, T1, T1, paint);
            if (z1Var.f22544w != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.W1(z1Var.J, z1Var.H[0], z1Var.I[0]), org.telegram.messenger.g0.W1(z1Var.J, z1Var.H[1], z1Var.I[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, z1Var.f22544w.getWidth(), z1Var.f22544w.getHeight(), (int) ((1.0f - z1Var.J) * 255.0f), 31);
                z1Var.f22544w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (z1Var.f22550z0.getX() + (z1Var.f22518b0.getX() + (z1Var.f22515a0.getX() + z1Var.Z.getX()))) + z1Var.f22550z0.getWidth(), z1Var.J) - z1Var.f22544w.f32651o2.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (z1Var.f22550z0.getY() + (z1Var.f22518b0.getY() + (z1Var.f22515a0.getY() + z1Var.Z.getY()))) + z1Var.f22550z0.getHeight(), z1Var.J) - z1Var.f22544w.f32651o2.getHeight());
                canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), z1Var.f22544w.f32651o2.getWidth(), z1Var.f22544w.f32651o2.getHeight(), (int) ((1.0f - z1Var.J) * 255.0f), 31);
                z1Var.f22544w.f32651o2.draw(canvas);
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
        z1 z1Var = this.f22279j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (z1Var.v0()) {
                org.telegram.messenger.f3.n(null, 2131745808, new lc(z1Var.Y, z1Var.getResourceProvider()), 2131623990, 36);
                return true;
            }
        } else if (!z1Var.Q.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: oi.r1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
