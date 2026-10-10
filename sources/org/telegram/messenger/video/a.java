package org.telegram.messenger.video;

import org.telegram.ui.Components.q80;
public final class a implements Runnable {
    public final int f19455a;
    public final Object f19456b;

    public a(Object obj, int i10) {
        this.f19455a = i10;
        this.f19456b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19455a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19456b);
                return;
            case 1:
                ((q80) this.f19456b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19456b).lambda$new$2();
                return;
        }
    }
}
