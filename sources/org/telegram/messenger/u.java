package org.telegram.messenger;

import android.view.View;
public final class u implements View.OnLayoutChangeListener {
    public final View f27103a;
    public final Runnable f27104b;

    public u(View view, Runnable runnable) {
        this.f27103a = view;
        this.f27104b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f27103a.removeOnLayoutChangeListener(this);
        this.f27104b.run();
    }
}
