package org.telegram.messenger;

import android.view.View;
public final class u implements View.OnLayoutChangeListener {
    public final View f25632a;
    public final Runnable f25633b;

    public u(View view, Runnable runnable) {
        this.f25632a = view;
        this.f25633b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f25632a.removeOnLayoutChangeListener(this);
        this.f25633b.run();
    }
}
