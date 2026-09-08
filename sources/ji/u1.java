package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.yc;
public final class u1 extends ov0 {
    public boolean f14234w0;
    public final Paint f14235x0;
    public final RectF f14236y0;
    public final c2 f14237z0;

    public u1(c2 c2Var, Context context) {
        super(context, null);
        this.f14237z0 = c2Var;
        this.f14235x0 = new Paint(1);
        new Path();
        this.f14236y0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        c2 c2Var = this.f14237z0;
        Rect rect = c2Var.f13861w;
        int l1 = org.telegram.ui.ActionBar.j6.l1(c2Var.I, c2Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
        Paint paint = this.f14235x0;
        paint.setColor(l1);
        if (c2Var.E && c2Var.f13863x != null) {
            RectF rectF = this.f14236y0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, c2Var.I);
            AndroidUtilities.lerp(c2Var.f13865y, rectF, c2Var.I, rectF);
            rect.set(c2Var.f13863x.getBounds());
            c2Var.f13863x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            c2Var.f13863x.p(lerp);
            c2Var.f13863x.setAlpha((int) ((1.0f - c2Var.I) * 255.0f));
            c2Var.f13863x.draw(canvas);
            c2Var.f13863x.setBounds(rect);
            rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            canvas.drawRoundRect(rectF, lerp, lerp, paint);
            if (c2Var.v != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(c2Var.G[0], c2Var.H[0], c2Var.I), AndroidUtilities.lerp(c2Var.G[1], c2Var.H[1], c2Var.I));
                canvas.saveLayerAlpha(0.0f, 0.0f, c2Var.v.getWidth(), c2Var.v.getHeight(), (int) ((1.0f - c2Var.I) * 255.0f), 31);
                c2Var.v.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(rectF.right, (c2Var.f13866y0.getX() + (c2Var.f13833a0.getX() + (c2Var.Z.getX() + c2Var.Y.getX()))) + c2Var.f13866y0.getWidth(), c2Var.I) - c2Var.v.f23832z1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (c2Var.f13866y0.getY() + (c2Var.f13833a0.getY() + (c2Var.Z.getY() + c2Var.Y.getY()))) + c2Var.f13866y0.getHeight(), c2Var.I) - c2Var.v.f23832z1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), c2Var.v.f23832z1.getWidth(), c2Var.v.f23832z1.getHeight(), (int) ((1.0f - c2Var.I) * 255.0f), 31);
                c2Var.v.f23832z1.draw(canvas);
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
        c2 c2Var = this.f14237z0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (c2Var.q0()) {
                org.telegram.messenger.w1.o(R.string.RichEditorDraftSaved, new yc(c2Var.X, c2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!c2Var.P.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: ji.u1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
