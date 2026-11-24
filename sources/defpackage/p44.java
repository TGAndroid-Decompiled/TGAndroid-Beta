package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public abstract class p44 extends FrameLayout {
    public boolean a;
    public final o44 b;
    public boolean c;
    public float d;
    public float e;
    public boolean f;

    public p44(Context context, o44 o44Var) {
        super(context);
        this.b = o44Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.a && (view instanceof g29)) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view instanceof xjb) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), 0);
            return;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o44 o44Var = this.b;
        w44 i = o44Var.i();
        if (i == null) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.c = false;
                i.n = false;
                i.r = false;
                this.d = motionEvent.getX();
                this.e = motionEvent.getY();
                this.f = false;
                return true;
            }
            if (!this.f && actionMasked == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (this.c || oqe.a(x, y, this.d, this.e) > gm.e) {
                    this.c = true;
                    i.n = true;
                    i.e(x - this.d, y - this.e);
                    this.d = x;
                    this.e = y;
                    return true;
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                i.n = false;
                i.r = true;
                if (!this.c) {
                    o44Var.d();
                }
                invalidate();
                return false;
            }
            return true;
        }
        i.n = false;
        i.r = true;
        this.c = false;
        this.f = true;
        invalidate();
        return true;
    }
}
