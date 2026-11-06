package org.telegram.messenger;

import android.view.View;
public final class is implements View.OnAttachStateChangeListener {
    public final hs f23333a;
    public final int f23334b;
    public final qs f23335c;

    public is(qs qsVar, hs hsVar, int i7) {
        this.f23335c = qsVar;
        this.f23333a = hsVar;
        this.f23334b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23335c.b(this.f23333a, this.f23334b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23335c.n(this.f23333a, this.f23334b);
    }
}
