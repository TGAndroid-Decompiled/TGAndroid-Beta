package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.TextView;
public final class l1 extends TextView {
    public boolean a;

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), cmb.T1);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.a;
        if (motionEvent.getAction() == 0) {
            this.a = true;
        } else if (motionEvent.getAction() != 2) {
            this.a = false;
        }
        if (z != this.a) {
            invalidate();
        }
        if (!this.a && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
