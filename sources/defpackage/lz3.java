package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class lz3 extends lt9 {
    public int h;
    public boolean n;
    public float r;
    public final mz3 s;

    public lz3(mz3 mz3Var, Context context) {
        super(context);
        float f;
        this.s = mz3Var;
        boolean z = mz3Var.h;
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
        qmb qmbVar = new qmb((byte) 5, context, this);
        this.b = qmbVar;
        qmbVar.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        for (int i = 0; i < 8; i++) {
            int i2 = mz3.e0[i];
            kz3 kz3Var = new kz3(this, context, mz3.f0[i]);
            kz3Var.setContentDescription(mz3.f(i));
            this.b.addView(kz3Var);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.U1(this.r, gm.L(30.0f), gm.L(Math.min(5.7f, this.b.getChildCount()) * 32.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
