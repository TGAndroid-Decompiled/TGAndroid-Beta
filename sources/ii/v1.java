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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.xc;
public final class v1 extends cw0 {
    public boolean f11685w0;
    public final Paint f11686x0;
    public final RectF f11687y0;
    public final d2 f11688z0;

    public v1(d2 d2Var, Context context) {
        super(context, null);
        this.f11688z0 = d2Var;
        this.f11686x0 = new Paint(1);
        new Path();
        this.f11687y0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d2 d2Var = this.f11688z0;
        Rect rect = d2Var.f11327w;
        int l1 = j6.l1(d2Var.I, d2Var.getThemedColor(j6.f19109d6));
        Paint paint = this.f11686x0;
        paint.setColor(l1);
        if (d2Var.E && d2Var.f11329x != null) {
            RectF rectF = this.f11687y0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, d2Var.I);
            AndroidUtilities.lerp(d2Var.f11331y, rectF, d2Var.I, rectF);
            rect.set(d2Var.f11329x.getBounds());
            d2Var.f11329x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            d2Var.f11329x.q(lerp);
            d2Var.f11329x.setAlpha((int) ((1.0f - d2Var.I) * 255.0f));
            d2Var.f11329x.draw(canvas);
            d2Var.f11329x.setBounds(rect);
            rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            canvas.drawRoundRect(rectF, lerp, lerp, paint);
            if (d2Var.v != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(d2Var.G[0], d2Var.H[0], d2Var.I), AndroidUtilities.lerp(d2Var.G[1], d2Var.H[1], d2Var.I));
                canvas.saveLayerAlpha(0.0f, 0.0f, d2Var.v.getWidth(), d2Var.v.getHeight(), (int) ((1.0f - d2Var.I) * 255.0f), 31);
                d2Var.v.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(rectF.right, (d2Var.f11332y0.getX() + (d2Var.f11300a0.getX() + (d2Var.Z.getX() + d2Var.Y.getX()))) + d2Var.f11332y0.getWidth(), d2Var.I) - d2Var.v.A1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (d2Var.f11332y0.getY() + (d2Var.f11300a0.getY() + (d2Var.Z.getY() + d2Var.Y.getY()))) + d2Var.f11332y0.getHeight(), d2Var.I) - d2Var.v.A1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), d2Var.v.A1.getWidth(), d2Var.v.A1.getHeight(), (int) ((1.0f - d2Var.I) * 255.0f), 31);
                d2Var.v.A1.draw(canvas);
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
        d2 d2Var = this.f11688z0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (d2Var.q0()) {
                org.telegram.messenger.l0.o(R.string.RichEditorDraftSaved, new xc(d2Var.X, d2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!d2Var.P.i3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: ii.v1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
