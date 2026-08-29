package org.telegram.messenger.video;

import org.telegram.ui.Components.j70;
public final class a implements Runnable {
    public final int f21852a;
    public final Object f21853b;

    public a(Object obj, int i10) {
        this.f21852a = i10;
        this.f21853b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21852a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f21853b);
                return;
            case 1:
                ((j70) this.f21853b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f21853b).lambda$new$2();
                return;
        }
    }
}
