package m;

import android.view.View;
import android.view.ViewConfiguration;
public abstract class u1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float f18736a;
    public final int f18737b;
    public final int f18738c;
    public final View d;
    public t1 f18739e;
    public t1 f18740f;
    public boolean h;
    public int f18741n;
    public final int[] f18742r = new int[2];

    public u1(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f18736a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f18737b = tapTimeout;
        this.f18738c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        t1 t1Var = this.f18740f;
        View view = this.d;
        if (t1Var != null) {
            view.removeCallbacks(t1Var);
        }
        t1 t1Var2 = this.f18739e;
        if (t1Var2 != null) {
            view.removeCallbacks(t1Var2);
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
        throw new UnsupportedOperationException("Method not decompiled: m.u1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.f18741n = -1;
        t1 t1Var = this.f18739e;
        if (t1Var != null) {
            this.d.removeCallbacks(t1Var);
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
