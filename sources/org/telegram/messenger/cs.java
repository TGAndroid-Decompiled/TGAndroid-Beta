package org.telegram.messenger;

import android.view.View;
public final class cs implements View.OnAttachStateChangeListener {
    public final bs f23413a;
    public final int f23414b;
    public final ks f23415c;

    public cs(ks ksVar, bs bsVar, int i7) {
        this.f23415c = ksVar;
        this.f23413a = bsVar;
        this.f23414b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23415c.b(this.f23413a, this.f23414b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23415c.n(this.f23413a, this.f23414b);
    }
}
