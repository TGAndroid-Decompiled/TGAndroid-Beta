package org.telegram.messenger.video;

import org.telegram.ui.Components.y60;
public final class a implements Runnable {
    public final int f27376a;
    public final Object f27377b;

    public a(Object obj, int i7) {
        this.f27376a = i7;
        this.f27377b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27376a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f27377b);
                return;
            case 1:
                ((y60) this.f27377b).v();
                return;
            default:
                ((VideoFramesRewinder) this.f27377b).lambda$new$2();
                return;
        }
    }
}
