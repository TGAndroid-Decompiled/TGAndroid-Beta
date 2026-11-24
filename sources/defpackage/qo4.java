package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
public abstract class qo4 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public po4 e;
    public po4 f;
    public boolean h;
    public int n;
    public final int[] r = new int[2];

    public qo4(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        po4 po4Var = this.f;
        View view = this.d;
        if (po4Var != null) {
            view.removeCallbacks(po4Var);
        }
        po4 po4Var2 = this.e;
        if (po4Var2 != null) {
            view.removeCallbacks(po4Var2);
        }
    }

    public abstract xia b();

    public abstract boolean c();

    public boolean d() {
        xia b = b();
        if (b != null && b.a()) {
            b.dismiss();
            return true;
        }
        return true;
    }

    @Override
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo4.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.n = -1;
        po4 po4Var = this.e;
        if (po4Var != null) {
            this.d.removeCallbacks(po4Var);
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
