package m;

import android.view.View;
import android.view.ViewConfiguration;
public abstract class v1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float f15590a;
    public final int f15591b;
    public final int f15592c;
    public final View d;
    public u1 f15593e;
    public u1 f15594f;
    public boolean h;
    public int f15595n;
    public final int[] f15596r = new int[2];

    public v1(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f15590a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f15591b = tapTimeout;
        this.f15592c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        u1 u1Var = this.f15594f;
        View view = this.d;
        if (u1Var != null) {
            view.removeCallbacks(u1Var);
        }
        u1 u1Var2 = this.f15593e;
        if (u1Var2 != null) {
            view.removeCallbacks(u1Var2);
        }
    }

    public abstract l.b0 b();

    public abstract boolean c();

    public boolean d() {
        l.b0 b10 = b();
        if (b10 != null && b10.a()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    @Override
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: m.v1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.f15595n = -1;
        u1 u1Var = this.f15593e;
        if (u1Var != null) {
            this.d.removeCallbacks(u1Var);
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
