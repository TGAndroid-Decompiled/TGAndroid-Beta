package org.telegram.messenger.video;

import org.telegram.ui.Components.k60;
public final class a implements Runnable {
    public final int f25993a;
    public final Object f25994b;

    public a(Object obj, int i7) {
        this.f25993a = i7;
        this.f25994b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25993a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f25994b);
                return;
            case 1:
                ((k60) this.f25994b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f25994b).lambda$new$2();
                return;
        }
    }
}
