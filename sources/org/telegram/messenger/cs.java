package org.telegram.messenger;

import android.view.View;
public final class cs implements View.OnAttachStateChangeListener {
    public final bs f23528a;
    public final int f23529b;
    public final ks f23530c;

    public cs(ks ksVar, bs bsVar, int i7) {
        this.f23530c = ksVar;
        this.f23528a = bsVar;
        this.f23529b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23530c.b(this.f23528a, this.f23529b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23530c.n(this.f23528a, this.f23529b);
    }
}
