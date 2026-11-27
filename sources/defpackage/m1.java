package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.TextView;
public final class m1 extends TextView {
    public boolean a;

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), aob.U1);
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
