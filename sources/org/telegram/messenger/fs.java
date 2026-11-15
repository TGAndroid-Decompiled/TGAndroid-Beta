package org.telegram.messenger;

import android.view.View;
public final class fs implements View.OnAttachStateChangeListener {
    public final es f23542a;
    public final int f23543b;
    public final ns f23544c;

    public fs(ns nsVar, es esVar, int i7) {
        this.f23544c = nsVar;
        this.f23542a = esVar;
        this.f23543b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23544c.b(this.f23542a, this.f23543b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23544c.n(this.f23542a, this.f23543b);
    }
}
