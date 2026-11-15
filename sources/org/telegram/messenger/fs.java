package org.telegram.messenger;

import android.view.View;
public final class fs implements View.OnAttachStateChangeListener {
    public final es f23544a;
    public final int f23545b;
    public final ns f23546c;

    public fs(ns nsVar, es esVar, int i7) {
        this.f23546c = nsVar;
        this.f23544a = esVar;
        this.f23545b = i7;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f23546c.b(this.f23544a, this.f23545b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f23546c.n(this.f23544a, this.f23545b);
    }
}
