package org.telegram.messenger;

import android.view.View;
public final class u implements View.OnLayoutChangeListener {
    public final View f25714a;
    public final Runnable f25715b;

    public u(View view, Runnable runnable) {
        this.f25714a = view;
        this.f25715b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f25714a.removeOnLayoutChangeListener(this);
        this.f25715b.run();
    }
}
