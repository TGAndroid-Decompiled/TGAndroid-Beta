package org.telegram.messenger.video;

import org.telegram.ui.Components.i80;
public final class a implements Runnable {
    public final int f19768a;
    public final Object f19769b;

    public a(Object obj, int i10) {
        this.f19768a = i10;
        this.f19769b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19768a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19769b);
                return;
            case 1:
                ((i80) this.f19769b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19769b).lambda$new$2();
                return;
        }
    }
}
