package org.telegram.messenger;

import android.view.View;
public final class v implements View.OnLayoutChangeListener {
    public final View f18433a;
    public final Runnable f18434b;

    public v(View view, Runnable runnable) {
        this.f18433a = view;
        this.f18434b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f18433a.removeOnLayoutChangeListener(this);
        this.f18434b.run();
    }
}
