package org.telegram.messenger.video;

import org.telegram.ui.Components.q80;
public final class a implements Runnable {
    public final int f19452a;
    public final Object f19453b;

    public a(Object obj, int i10) {
        this.f19452a = i10;
        this.f19453b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19452a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19453b);
                return;
            case 1:
                ((q80) this.f19453b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19453b).lambda$new$2();
                return;
        }
    }
}
