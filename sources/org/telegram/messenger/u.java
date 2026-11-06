package org.telegram.messenger;

import android.view.View;
public final class u implements View.OnLayoutChangeListener {
    public final View f25706a;
    public final Runnable f25707b;

    public u(View view, Runnable runnable) {
        this.f25706a = view;
        this.f25707b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f25706a.removeOnLayoutChangeListener(this);
        this.f25707b.run();
    }
}
