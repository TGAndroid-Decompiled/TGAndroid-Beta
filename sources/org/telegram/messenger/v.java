package org.telegram.messenger;

import android.view.View;
public final class v implements View.OnLayoutChangeListener {
    public final View f18572a;
    public final Runnable f18573b;

    public v(View view, Runnable runnable) {
        this.f18572a = view;
        this.f18573b = runnable;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f18572a.removeOnLayoutChangeListener(this);
        this.f18573b.run();
    }
}
