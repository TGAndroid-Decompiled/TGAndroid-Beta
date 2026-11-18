package org.telegram.messenger;

import android.view.View;
public final class cs implements View.OnAttachStateChangeListener {
    public final bs f23416a;
    public final int f23417b;
    public final ks f23418c;

    public cs(ks ksVar, bs bsVar, int i7) {
        this.f23418c = ksVar;
        this.f23416a = bsVar;
        this.f23417b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23418c.b(this.f23416a, this.f23417b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23418c.n(this.f23416a, this.f23417b);
    }
}
