package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.wc;
public final class x1 extends aw0 {
    public boolean f9933w0;
    public final Paint f9934x0;
    public final RectF f9935y0;
    public final g2 f9936z0;

    public x1(g2 g2Var, Context context) {
        super(context, null);
        this.f9936z0 = g2Var;
        this.f9934x0 = new Paint(1);
        new Path();
        this.f9935y0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g2 g2Var = this.f9936z0;
        Rect rect = g2Var.f9607w;
        int l1 = org.telegram.ui.ActionBar.j6.l1(g2Var.I, g2Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        Paint paint = this.f9934x0;
        paint.setColor(l1);
        if (g2Var.E && g2Var.f9609x != null) {
            RectF rectF = this.f9935y0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, g2Var.I);
            AndroidUtilities.lerp(g2Var.f9611y, rectF, g2Var.I, rectF);
            rect.set(g2Var.f9609x.getBounds());
            g2Var.f9609x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            g2Var.f9609x.p(lerp);
            g2Var.f9609x.setAlpha((int) ((1.0f - g2Var.I) * 255.0f));
            g2Var.f9609x.draw(canvas);
            g2Var.f9609x.setBounds(rect);
            rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            canvas.drawRoundRect(rectF, lerp, lerp, paint);
            if (g2Var.v != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(g2Var.G[0], g2Var.H[0], g2Var.I), AndroidUtilities.lerp(g2Var.G[1], g2Var.H[1], g2Var.I));
                canvas.saveLayerAlpha(0.0f, 0.0f, g2Var.v.getWidth(), g2Var.v.getHeight(), (int) ((1.0f - g2Var.I) * 255.0f), 31);
                g2Var.v.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(rectF.right, (g2Var.f9612y0.getX() + (g2Var.f9580a0.getX() + (g2Var.Z.getX() + g2Var.Y.getX()))) + g2Var.f9612y0.getWidth(), g2Var.I) - g2Var.v.f20959z1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (g2Var.f9612y0.getY() + (g2Var.f9580a0.getY() + (g2Var.Z.getY() + g2Var.Y.getY()))) + g2Var.f9612y0.getHeight(), g2Var.I) - g2Var.v.f20959z1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), g2Var.v.f20959z1.getWidth(), g2Var.v.f20959z1.getHeight(), (int) ((1.0f - g2Var.I) * 255.0f), 31);
                g2Var.v.f20959z1.draw(canvas);
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
        g2 g2Var = this.f9936z0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (g2Var.q0()) {
                org.telegram.messenger.a2.o(R.string.RichEditorDraftSaved, new wc(g2Var.X, g2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!g2Var.P.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: hi.x1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
