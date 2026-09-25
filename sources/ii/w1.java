package ii;

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
import org.telegram.ui.Components.xc;
public final class w1 extends aw0 {
    public boolean f11692w0;
    public final Paint f11693x0;
    public final RectF f11694y0;
    public final e2 f11695z0;

    public w1(e2 e2Var, Context context) {
        super(context, null);
        this.f11695z0 = e2Var;
        this.f11693x0 = new Paint(1);
        new Path();
        this.f11694y0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.f11695z0;
        Rect rect = e2Var.f11335w;
        int l1 = org.telegram.ui.ActionBar.h6.l1(e2Var.I, e2Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6));
        Paint paint = this.f11693x0;
        paint.setColor(l1);
        if (e2Var.E && e2Var.f11337x != null) {
            RectF rectF = this.f11694y0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, e2Var.I);
            AndroidUtilities.lerp(e2Var.f11339y, rectF, e2Var.I, rectF);
            rect.set(e2Var.f11337x.getBounds());
            e2Var.f11337x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            e2Var.f11337x.q(lerp);
            e2Var.f11337x.setAlpha((int) ((1.0f - e2Var.I) * 255.0f));
            e2Var.f11337x.draw(canvas);
            e2Var.f11337x.setBounds(rect);
            rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            canvas.drawRoundRect(rectF, lerp, lerp, paint);
            if (e2Var.v != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(e2Var.G[0], e2Var.H[0], e2Var.I), AndroidUtilities.lerp(e2Var.G[1], e2Var.H[1], e2Var.I));
                canvas.saveLayerAlpha(0.0f, 0.0f, e2Var.v.getWidth(), e2Var.v.getHeight(), (int) ((1.0f - e2Var.I) * 255.0f), 31);
                e2Var.v.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(rectF.right, (e2Var.f11340y0.getX() + (e2Var.f11308a0.getX() + (e2Var.Z.getX() + e2Var.Y.getX()))) + e2Var.f11340y0.getWidth(), e2Var.I) - e2Var.v.A1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (e2Var.f11340y0.getY() + (e2Var.f11308a0.getY() + (e2Var.Z.getY() + e2Var.Y.getY()))) + e2Var.f11340y0.getHeight(), e2Var.I) - e2Var.v.A1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), e2Var.v.A1.getWidth(), e2Var.v.A1.getHeight(), (int) ((1.0f - e2Var.I) * 255.0f), 31);
                e2Var.v.A1.draw(canvas);
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
        e2 e2Var = this.f11695z0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (e2Var.q0()) {
                org.telegram.messenger.f0.p(R.string.RichEditorDraftSaved, new xc(e2Var.X, e2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!e2Var.P.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: ii.w1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
