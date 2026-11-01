package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.vu0;
public final class b2 extends vu0 {
    public boolean f2858f0;
    public final Paint f2859g0;
    public final RectF f2860h0;
    public final k2 f2861i0;

    public b2(k2 k2Var, Context context) {
        super(context, null);
        this.f2861i0 = k2Var;
        this.f2859g0 = new Paint(1);
        new Path();
        this.f2860h0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k2 k2Var = this.f2861i0;
        Rect rect = k2Var.f3164x;
        int r12 = org.telegram.ui.ActionBar.t6.r1(k2Var.I, k2Var.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6));
        Paint paint = this.f2859g0;
        paint.setColor(r12);
        if (k2Var.E && k2Var.f3166y != null) {
            RectF rectF = this.f2860h0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-org.telegram.messenger.i0.L(7.0f), -org.telegram.messenger.i0.L(7.0f));
            float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(22.0f), 0.0f, k2Var.I);
            org.telegram.messenger.i0.Z1(k2Var.D, rectF, k2Var.I, rectF);
            rect.set(k2Var.f3166y.getBounds());
            k2Var.f3166y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            k2Var.f3166y.q(T1);
            k2Var.f3166y.setAlpha((int) ((1.0f - k2Var.I) * 255.0f));
            k2Var.f3166y.draw(canvas);
            k2Var.f3166y.setBounds(rect);
            rectF.inset(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
            canvas.drawRoundRect(rectF, T1, T1, paint);
            if (k2Var.f3162w != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.W1(k2Var.I, k2Var.G[0], k2Var.H[0]), org.telegram.messenger.i0.W1(k2Var.I, k2Var.G[1], k2Var.H[1]));
                canvas.saveLayerAlpha(0.0f, 0.0f, k2Var.f3162w.getWidth(), k2Var.f3162w.getHeight(), (int) ((1.0f - k2Var.I) * 255.0f), 31);
                k2Var.f3162w.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.T1(rectF.right, (k2Var.f3167y0.getX() + (k2Var.f3135a0.getX() + (k2Var.Z.getX() + k2Var.Y.getX()))) + k2Var.f3167y0.getWidth(), k2Var.I) - k2Var.f3162w.A1.getWidth(), org.telegram.messenger.i0.T1(rectF.bottom, (k2Var.f3167y0.getY() + (k2Var.f3135a0.getY() + (k2Var.Z.getY() + k2Var.Y.getY()))) + k2Var.f3167y0.getHeight(), k2Var.I) - k2Var.f3162w.A1.getHeight());
                canvas.saveLayerAlpha(-org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(6.0f), k2Var.f3162w.A1.getWidth(), k2Var.f3162w.A1.getHeight(), (int) ((1.0f - k2Var.I) * 255.0f), 31);
                k2Var.f3162w.A1.draw(canvas);
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
        k2 k2Var = this.f2861i0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (k2Var.v0()) {
                org.telegram.messenger.m5.n(null, 2131746020, new cc(k2Var.X, k2Var.getResourceProvider()), 2131623989, 36);
                return true;
            }
        } else if (!k2Var.P.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: bi.b2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
