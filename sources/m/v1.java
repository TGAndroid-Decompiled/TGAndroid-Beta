package m;

import android.view.View;
import android.view.ViewConfiguration;
public abstract class v1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float f16710a;
    public final int f16711b;
    public final int f16712c;
    public final View d;
    public u1 f16713e;
    public u1 f16714f;
    public boolean h;
    public int f16715n;
    public final int[] f16716r = new int[2];

    public v1(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f16710a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f16711b = tapTimeout;
        this.f16712c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        u1 u1Var = this.f16714f;
        View view = this.d;
        if (u1Var != null) {
            view.removeCallbacks(u1Var);
        }
        u1 u1Var2 = this.f16713e;
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
        this.f16715n = -1;
        u1 u1Var = this.f16713e;
        if (u1Var != null) {
            this.d.removeCallbacks(u1Var);
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
