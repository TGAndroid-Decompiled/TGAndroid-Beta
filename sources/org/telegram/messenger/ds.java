package org.telegram.messenger;

import android.view.View;
public final class ds implements View.OnAttachStateChangeListener {
    public final cs f23572a;
    public final int f23573b;
    public final ls f23574c;

    public ds(ls lsVar, cs csVar, int i7) {
        this.f23574c = lsVar;
        this.f23572a = csVar;
        this.f23573b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23574c.b(this.f23572a, this.f23573b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23574c.n(this.f23572a, this.f23573b);
    }
}
