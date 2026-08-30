package org.telegram.messenger.video;

import org.telegram.ui.Components.o70;
public final class a implements Runnable {
    public final int f18689a;
    public final Object f18690b;

    public a(Object obj, int i10) {
        this.f18689a = i10;
        this.f18690b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18689a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f18690b);
                return;
            case 1:
                ((o70) this.f18690b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f18690b).lambda$new$2();
                return;
        }
    }
}
