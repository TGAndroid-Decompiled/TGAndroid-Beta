package org.telegram.messenger;

import android.view.View;
public final class is implements View.OnAttachStateChangeListener {
    public final hs f23366a;
    public final int f23367b;
    public final qs f23368c;

    public is(qs qsVar, hs hsVar, int i7) {
        this.f23368c = qsVar;
        this.f23366a = hsVar;
        this.f23367b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23368c.b(this.f23366a, this.f23367b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23368c.n(this.f23366a, this.f23367b);
    }
}
