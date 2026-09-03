package org.telegram.messenger.video;

import org.telegram.ui.Components.q70;
public final class a implements Runnable {
    public final int f20313a;
    public final Object f20314b;

    public a(Object obj, int i10) {
        this.f20313a = i10;
        this.f20314b = obj;
    }

    @Override
    public final void run() {
        switch (this.f20313a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f20314b);
                return;
            case 1:
                ((q70) this.f20314b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f20314b).lambda$new$2();
                return;
        }
    }
}
