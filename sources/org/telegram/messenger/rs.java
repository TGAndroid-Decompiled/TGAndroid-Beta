package org.telegram.messenger;

import android.view.View;
public final class rs implements View.OnAttachStateChangeListener {
    public final qs f17774a;
    public final int f17775b;
    public final zs f17776c;

    public rs(zs zsVar, qs qsVar, int i10) {
        this.f17776c = zsVar;
        this.f17774a = qsVar;
        this.f17775b = i10;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f17776c.b(this.f17774a, this.f17775b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f17776c.n(this.f17774a, this.f17775b);
    }
}
