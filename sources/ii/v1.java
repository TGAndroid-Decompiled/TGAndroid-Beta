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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.vc;
public final class v1 extends pv0 {
    public boolean f11683w0;
    public final Paint f11684x0;
    public final RectF f11685y0;
    public final d2 f11686z0;

    public v1(d2 d2Var, Context context) {
        super(context, null);
        this.f11686z0 = d2Var;
        this.f11684x0 = new Paint(1);
        new Path();
        this.f11685y0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d2 d2Var = this.f11686z0;
        Rect rect = d2Var.f11325w;
        int l1 = i6.l1(d2Var.I, d2Var.getThemedColor(i6.f18834d6));
        Paint paint = this.f11684x0;
        paint.setColor(l1);
        if (d2Var.E && d2Var.f11327x != null) {
            RectF rectF = this.f11685y0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, d2Var.I);
            AndroidUtilities.lerp(d2Var.f11329y, rectF, d2Var.I, rectF);
            rect.set(d2Var.f11327x.getBounds());
            d2Var.f11327x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            d2Var.f11327x.q(lerp);
            d2Var.f11327x.setAlpha((int) ((1.0f - d2Var.I) * 255.0f));
            d2Var.f11327x.draw(canvas);
            d2Var.f11327x.setBounds(rect);
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
                canvas.translate(AndroidUtilities.lerp(rectF.right, (d2Var.f11330y0.getX() + (d2Var.f11298a0.getX() + (d2Var.Z.getX() + d2Var.Y.getX()))) + d2Var.f11330y0.getWidth(), d2Var.I) - d2Var.v.f21871z1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (d2Var.f11330y0.getY() + (d2Var.f11298a0.getY() + (d2Var.Z.getY() + d2Var.Y.getY()))) + d2Var.f11330y0.getHeight(), d2Var.I) - d2Var.v.f21871z1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), d2Var.v.f21871z1.getWidth(), d2Var.v.f21871z1.getHeight(), (int) ((1.0f - d2Var.I) * 255.0f), 31);
                d2Var.v.f21871z1.draw(canvas);
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
        d2 d2Var = this.f11686z0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (d2Var.q0()) {
                org.telegram.messenger.y0.o(R.string.RichEditorDraftSaved, new vc(d2Var.X, d2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!d2Var.P.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: ii.v1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
