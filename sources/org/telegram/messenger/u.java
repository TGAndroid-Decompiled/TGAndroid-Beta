package org.telegram.messenger;

import android.view.View;
public final class u implements View.OnLayoutChangeListener {
    public final View f25710a;
    public final Runnable f25711b;

    public u(View view, Runnable runnable) {
        this.f25710a = view;
        this.f25711b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f25710a.removeOnLayoutChangeListener(this);
        this.f25711b.run();
    }
}
