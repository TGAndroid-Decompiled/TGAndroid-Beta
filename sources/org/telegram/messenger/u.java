package org.telegram.messenger;

import android.view.View;
public final class u implements View.OnLayoutChangeListener {
    public final View f27101a;
    public final Runnable f27102b;

    public u(View view, Runnable runnable) {
        this.f27101a = view;
        this.f27102b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f27101a.removeOnLayoutChangeListener(this);
        this.f27102b.run();
    }
}
