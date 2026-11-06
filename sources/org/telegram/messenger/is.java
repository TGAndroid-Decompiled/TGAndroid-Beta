package org.telegram.messenger;

import android.view.View;
public final class is implements View.OnAttachStateChangeListener {
    public final hs f23340a;
    public final int f23341b;
    public final qs f23342c;

    public is(qs qsVar, hs hsVar, int i7) {
        this.f23342c = qsVar;
        this.f23340a = hsVar;
        this.f23341b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23342c.b(this.f23340a, this.f23341b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23342c.n(this.f23340a, this.f23341b);
    }
}
