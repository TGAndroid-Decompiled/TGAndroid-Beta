package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class e34 extends FrameLayout {
    public boolean a;
    public final d34 b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;

    public e34(Context context, d34 d34Var) {
        super(context);
        this.b = d34Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.a && (view instanceof e09)) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view instanceof vhb) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), 0);
            return;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d34 d34Var = this.b;
        l34 z = d34Var.z();
        if (z == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.c = false;
                z.n = false;
                z.r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f = false;
                return true;
            }
            if (!this.f && actionMasked == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (this.c || loe.a(x, y, this.d, this.e) > gl.e) {
                    this.c = true;
                    z.n = true;
                    z.e(x - this.d, y - this.e);
                    this.d = x;
                    this.e = y;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                z.n = false;
                z.r = true;
                if (!this.c) {
                    d34Var.u();
                }
                invalidate();
                return false;
            }
            return true;
        }
        z.n = false;
        z.r = true;
        this.c = false;
        this.f = true;
        invalidate();
        return true;
    }
}
