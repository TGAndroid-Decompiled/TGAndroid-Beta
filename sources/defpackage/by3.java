package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class by3 extends jr9 {
    public int h;
    public boolean n;
    public float r;
    public final cy3 s;

    public by3(cy3 cy3Var, Context context) {
        super(context);
        float f;
        this.s = cy3Var;
        boolean z = cy3Var.h;
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
        pkb pkbVar = new pkb((byte) 5, context, this);
        this.b = pkbVar;
        pkbVar.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        for (int i = 0; i < 8; i++) {
            int i2 = cy3.e0[i];
            ay3 ay3Var = new ay3(this, context, cy3.f0[i]);
            ay3Var.setContentDescription(cy3.f(i));
            this.b.addView(ay3Var);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.U1(this.r, gl.L(30.0f), gl.L(Math.min(5.7f, this.b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
