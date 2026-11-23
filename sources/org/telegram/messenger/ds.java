package org.telegram.messenger;

import android.view.View;
public final class ds implements View.OnAttachStateChangeListener {
    public final cs f23608a;
    public final int f23609b;
    public final ls f23610c;

    public ds(ls lsVar, cs csVar, int i7) {
        this.f23610c = lsVar;
        this.f23608a = csVar;
        this.f23609b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23610c.b(this.f23608a, this.f23609b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23610c.n(this.f23608a, this.f23609b);
    }
}
