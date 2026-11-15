package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.st0;
public final class r1 extends st0 {
    public boolean f21972g0;
    public final Paint f21973h0;
    public final RectF f21974i0;
    public final z1 f21975j0;

    public r1(z1 z1Var, Context context) {
        super(context, null);
        this.f21975j0 = z1Var;
        this.f21973h0 = new Paint(1);
        new Path();
        this.f21974i0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        z1 z1Var = this.f21975j0;
        Rect rect = z1Var.f22187x;
        int r12 = j6.r1(z1Var.J, z1Var.getThemedColor(j6.f28849d6));
        Paint paint = this.f21973h0;
        paint.setColor(r12);
        if (z1Var.F && z1Var.f22189y != null) {
            RectF rectF = this.f21974i0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, z1Var.J);
            org.telegram.messenger.g0.Z1(z1Var.E, rectF, z1Var.J, rectF);
            rect.set(z1Var.f22189y.getBounds());
            z1Var.f22189y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            z1Var.f22189y.r(T1);
            z1Var.f22189y.setAlpha((int) ((1.0f - z1Var.J) * 255.0f));
            z1Var.f22189y.draw(canvas);
            z1Var.f22189y.setBounds(rect);
            rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            canvas.drawRoundRect(rectF, T1, T1, paint);
            if (z1Var.f22185w != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.W1(z1Var.J, z1Var.H[0], z1Var.I[0]), org.telegram.messenger.g0.W1(z1Var.J, z1Var.H[1], z1Var.I[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, z1Var.f22185w.getWidth(), z1Var.f22185w.getHeight(), (int) ((1.0f - z1Var.J) * 255.0f), 31);
                z1Var.f22185w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (z1Var.f22191z0.getX() + (z1Var.f22159b0.getX() + (z1Var.f22156a0.getX() + z1Var.Z.getX()))) + z1Var.f22191z0.getWidth(), z1Var.J) - z1Var.f22185w.f32215i2.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (z1Var.f22191z0.getY() + (z1Var.f22159b0.getY() + (z1Var.f22156a0.getY() + z1Var.Z.getY()))) + z1Var.f22191z0.getHeight(), z1Var.J) - z1Var.f22185w.f32215i2.getHeight());
                canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), z1Var.f22185w.f32215i2.getWidth(), z1Var.f22185w.f32215i2.getHeight(), (int) ((1.0f - z1Var.J) * 255.0f), 31);
                z1Var.f22185w.f32215i2.draw(canvas);
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
        z1 z1Var = this.f21975j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (z1Var.v0()) {
                org.telegram.messenger.k5.n(null, 2131746003, new cc(z1Var.Y, z1Var.getResourceProvider()), 2131623990, 36);
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
