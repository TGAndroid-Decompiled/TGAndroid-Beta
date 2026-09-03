package m;

import android.view.View;
import android.view.ViewConfiguration;
public abstract class u1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float f13351a;
    public final int f13352b;
    public final int f13353c;
    public final View d;
    public t1 f13354e;
    public t1 f13355f;
    public boolean h;
    public int f13356n;
    public final int[] f13357r = new int[2];

    public u1(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f13351a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f13352b = tapTimeout;
        this.f13353c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        t1 t1Var = this.f13355f;
        View view = this.d;
        if (t1Var != null) {
            view.removeCallbacks(t1Var);
        }
        t1 t1Var2 = this.f13354e;
        if (t1Var2 != null) {
            view.removeCallbacks(t1Var2);
        }
    }

    public abstract l.c0 b();

    public abstract boolean c();

    public boolean d() {
        l.c0 b10 = b();
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
        this.f13356n = -1;
        t1 t1Var = this.f13354e;
        if (t1Var != null) {
            this.d.removeCallbacks(t1Var);
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
