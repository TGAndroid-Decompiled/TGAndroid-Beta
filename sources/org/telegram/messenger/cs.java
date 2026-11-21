package org.telegram.messenger;

import android.view.View;
public final class cs implements View.OnAttachStateChangeListener {
    public final bs f23441a;
    public final int f23442b;
    public final ks f23443c;

    public cs(ks ksVar, bs bsVar, int i7) {
        this.f23443c = ksVar;
        this.f23441a = bsVar;
        this.f23442b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23443c.b(this.f23441a, this.f23442b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23443c.n(this.f23441a, this.f23442b);
    }
}
