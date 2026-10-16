package m;

import android.view.View;
import android.view.ViewConfiguration;
public abstract class w1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float f15001a;
    public final int f15002b;
    public final int f15003c;
    public final View d;
    public v1 e;
    public v1 f15004f;
    public boolean h;
    public int f15005n;
    public final int[] f15006r = new int[2];

    public w1(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f15001a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f15002b = tapTimeout;
        this.f15003c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        v1 v1Var = this.f15004f;
        View view = this.d;
        if (v1Var != null) {
            view.removeCallbacks(v1Var);
        }
        v1 v1Var2 = this.e;
        if (v1Var2 != null) {
            view.removeCallbacks(v1Var2);
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
        throw new UnsupportedOperationException("Method not decompiled: m.w1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.f15005n = -1;
        v1 v1Var = this.e;
        if (v1Var != null) {
            this.d.removeCallbacks(v1Var);
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
