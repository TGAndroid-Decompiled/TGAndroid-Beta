package org.telegram.messenger.video;

import org.telegram.ui.Components.x60;
public final class a implements Runnable {
    public final int f27472a;
    public final Object f27473b;

    public a(Object obj, int i7) {
        this.f27472a = i7;
        this.f27473b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27472a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f27473b);
                return;
            case 1:
                ((x60) this.f27473b).v();
                return;
            default:
                ((VideoFramesRewinder) this.f27473b).lambda$new$2();
                return;
        }
    }
}
