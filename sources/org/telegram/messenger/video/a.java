package org.telegram.messenger.video;

import org.telegram.ui.Components.n70;
public final class a implements Runnable {
    public final int f19285a;
    public final Object f19286b;

    public a(Object obj, int i10) {
        this.f19285a = i10;
        this.f19286b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19285a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19286b);
                return;
            case 1:
                ((n70) this.f19286b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19286b).lambda$new$2();
                return;
        }
    }
}
