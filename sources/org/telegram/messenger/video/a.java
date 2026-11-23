package org.telegram.messenger.video;

import org.telegram.ui.Components.a70;
public final class a implements Runnable {
    public final int f27348a;
    public final Object f27349b;

    public a(Object obj, int i7) {
        this.f27348a = i7;
        this.f27349b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27348a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f27349b);
                return;
            case 1:
                ((a70) this.f27349b).v();
                return;
            default:
                ((VideoFramesRewinder) this.f27349b).lambda$new$2();
                return;
        }
    }
}
