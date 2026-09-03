package org.telegram.messenger.video;

import org.telegram.ui.Components.p70;
public final class a implements Runnable {
    public final int f18671a;
    public final Object f18672b;

    public a(Object obj, int i10) {
        this.f18671a = i10;
        this.f18672b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18671a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f18672b);
                return;
            case 1:
                ((p70) this.f18672b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f18672b).lambda$new$2();
                return;
        }
    }
}
