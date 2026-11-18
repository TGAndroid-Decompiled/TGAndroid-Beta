package org.telegram.messenger.video;

import org.telegram.ui.Components.y60;
public final class a implements Runnable {
    public final int f27378a;
    public final Object f27379b;

    public a(Object obj, int i7) {
        this.f27378a = i7;
        this.f27379b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27378a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f27379b);
                return;
            case 1:
                ((y60) this.f27379b).v();
                return;
            default:
                ((VideoFramesRewinder) this.f27379b).lambda$new$2();
                return;
        }
    }
}
