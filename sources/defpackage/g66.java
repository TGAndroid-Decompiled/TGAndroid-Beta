package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
public abstract class g66 extends lka {
    public final i66 N0;
    public final Paint O0;
    public m66 P0;

    public g66(Context context) {
        super(context);
        this.N0 = new i66(this);
        this.O0 = new Paint(1);
    }

    private int getLinkColor() {
        return on2.p(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (isClickable()) {
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight());
            int linkColor = getLinkColor();
            Paint paint = this.O0;
            paint.setColor(linkColor);
            canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
        }
        super.onDraw(canvas);
        if (isClickable() && this.N0.g(canvas)) {
            invalidate();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return super.onTouchEvent(motionEvent);
        }
        i66 i66Var = this.N0;
        if (i66Var != null) {
            if (motionEvent.getAction() == 0) {
                m66 m66Var = new m66(null, null, motionEvent.getX(), motionEvent.getY(), 0);
                m66Var.d(getLinkColor());
                this.P0 = m66Var;
                i66Var.a(m66Var, null);
                b66 b = this.P0.b();
                b.e(null, 0, 0.0f, 0.0f);
                b.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                gm.d3(new k16(this, m66Var, (byte) 6), ViewConfiguration.getLongPressTimeout());
                return true;
            } else if (motionEvent.getAction() == 1) {
                i66Var.e(true);
                if (this.P0 != null) {
                    performClick();
                }
                this.P0 = null;
                return true;
            } else if (motionEvent.getAction() == 3) {
                i66Var.e(true);
                this.P0 = null;
                return true;
            }
        }
        if (this.P0 == null && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
