package org.telegram.messenger;

import android.view.View;
public final class ss implements View.OnAttachStateChangeListener {
    public final rs f18138a;
    public final int f18139b;
    public final at f18140c;

    public ss(at atVar, rs rsVar, int i10) {
        this.f18140c = atVar;
        this.f18138a = rsVar;
        this.f18139b = i10;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f18140c.b(this.f18138a, this.f18139b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f18140c.n(this.f18138a, this.f18139b);
    }
}
