package org.telegram.messenger;

import android.view.View;
public final class is implements View.OnAttachStateChangeListener {
    public final hs f23362a;
    public final int f23363b;
    public final qs f23364c;

    public is(qs qsVar, hs hsVar, int i7) {
        this.f23364c = qsVar;
        this.f23362a = hsVar;
        this.f23363b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23364c.b(this.f23362a, this.f23363b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23364c.n(this.f23362a, this.f23363b);
    }
}
