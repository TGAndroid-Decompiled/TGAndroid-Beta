package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class wy3 extends cv9 {
    public int h;
    public boolean n;
    public float r;
    public final xy3 s;

    public wy3(xy3 xy3Var, Context context) {
        super(context);
        float f;
        this.s = xy3Var;
        boolean z = xy3Var.h;
        this.n = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.r = f;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        oob oobVar = new oob((byte) 5, context, this);
        this.b = oobVar;
        oobVar.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        for (int i = 0; i < 8; i++) {
            int i2 = xy3.e0[i];
            vy3 vy3Var = new vy3(this, context, xy3.f0[i]);
            vy3Var.setContentDescription(xy3.f(i));
            this.b.addView(vy3Var);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.n && !this.d) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return;
                    }
                } else {
                    this.a = false;
                    return;
                }
            }
            this.a = true;
            if (!this.d) {
                this.e = -1;
            }
            this.s.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.U1(this.r, hl.L(30.0f), hl.L(Math.min(5.7f, this.b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
