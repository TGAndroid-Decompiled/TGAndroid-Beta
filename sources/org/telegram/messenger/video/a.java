package org.telegram.messenger.video;

import org.telegram.ui.Components.q70;
public final class a implements Runnable {
    public final int f20311a;
    public final Object f20312b;

    public a(Object obj, int i10) {
        this.f20311a = i10;
        this.f20312b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20311a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f20312b);
                return;
            case 1:
                ((q70) this.f20312b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f20312b).lambda$new$2();
                return;
        }
    }
}
