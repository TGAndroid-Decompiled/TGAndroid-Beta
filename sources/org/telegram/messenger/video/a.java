package org.telegram.messenger.video;

import org.telegram.ui.Components.i80;
public final class a implements Runnable {
    public final int f19765a;
    public final Object f19766b;

    public a(Object obj, int i10) {
        this.f19765a = i10;
        this.f19766b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19765a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19766b);
                return;
            case 1:
                ((i80) this.f19766b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19766b).lambda$new$2();
                return;
        }
    }
}
