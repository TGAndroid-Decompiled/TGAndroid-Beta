package org.telegram.messenger.video;

import org.telegram.ui.Components.k60;
public final class a implements Runnable {
    public final int f26000a;
    public final Object f26001b;

    public a(Object obj, int i7) {
        this.f26000a = i7;
        this.f26001b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26000a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f26001b);
                return;
            case 1:
                ((k60) this.f26001b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f26001b).lambda$new$2();
                return;
        }
    }
}
