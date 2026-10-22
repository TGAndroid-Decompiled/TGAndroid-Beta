package org.telegram.messenger.video;

import org.telegram.ui.Components.i80;
public final class a implements Runnable {
    public final int f19790a;
    public final Object f19791b;

    public a(Object obj, int i10) {
        this.f19790a = i10;
        this.f19791b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19790a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19791b);
                return;
            case 1:
                ((i80) this.f19791b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19791b).lambda$new$2();
                return;
        }
    }
}
