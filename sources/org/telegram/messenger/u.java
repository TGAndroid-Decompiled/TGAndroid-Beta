package org.telegram.messenger;

import android.view.View;
public final class u implements View.OnLayoutChangeListener {
    public final View f26761a;
    public final Runnable f26762b;

    public u(View view, Runnable runnable) {
        this.f26761a = view;
        this.f26762b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f26761a.removeOnLayoutChangeListener(this);
        this.f26762b.run();
    }
}
