package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wc;
public final class t1 extends vw0 {
    public boolean f17489l0;
    public final Paint m0;
    public final RectF f17490n0;
    public final b2 f17491o0;

    public t1(b2 b2Var, Context context) {
        super(context, null);
        this.f17491o0 = b2Var;
        this.m0 = new Paint(1);
        new Path();
        this.f17490n0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b2 b2Var = this.f17491o0;
        Rect rect = b2Var.f17147w;
        int o12 = y6.o1(b2Var.I, b2Var.getThemedColor(y6.f23356d6));
        Paint paint = this.m0;
        paint.setColor(o12);
        if (b2Var.E && b2Var.f17149x != null) {
            RectF rectF = this.f17490n0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, b2Var.I);
            AndroidUtilities.lerp(b2Var.f17151y, rectF, b2Var.I, rectF);
            rect.set(b2Var.f17149x.getBounds());
            b2Var.f17149x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            b2Var.f17149x.x(lerp);
            b2Var.f17149x.setAlpha((int) ((1.0f - b2Var.I) * 255.0f));
            b2Var.f17149x.draw(canvas);
            b2Var.f17149x.setBounds(rect);
            rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            canvas.drawRoundRect(rectF, lerp, lerp, paint);
            if (b2Var.v != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(b2Var.G[0], b2Var.H[0], b2Var.I), AndroidUtilities.lerp(b2Var.G[1], b2Var.H[1], b2Var.I));
                canvas.saveLayerAlpha(0.0f, 0.0f, b2Var.v.getWidth(), b2Var.v.getHeight(), (int) ((1.0f - b2Var.I) * 255.0f), 31);
                b2Var.v.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(rectF.right, (b2Var.f17152y0.getX() + (b2Var.f17120a0.getX() + (b2Var.Z.getX() + b2Var.Y.getX()))) + b2Var.f17152y0.getWidth(), b2Var.I) - b2Var.v.A1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (b2Var.f17152y0.getY() + (b2Var.f17120a0.getY() + (b2Var.Z.getY() + b2Var.Y.getY()))) + b2Var.f17152y0.getHeight(), b2Var.I) - b2Var.v.A1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), b2Var.v.A1.getWidth(), b2Var.v.A1.getHeight(), (int) ((1.0f - b2Var.I) * 255.0f), 31);
                b2Var.v.A1.draw(canvas);
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
        b2 b2Var = this.f17491o0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (b2Var.r0()) {
                org.telegram.messenger.t.q(R.string.RichEditorDraftSaved, new wc(b2Var.X, b2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!b2Var.P.n3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: li.t1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
