package org.telegram.messenger.video;

import org.telegram.ui.Components.n70;
public final class a implements Runnable {
    public final int f19267a;
    public final Object f19268b;

    public a(Object obj, int i10) {
        this.f19267a = i10;
        this.f19268b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19267a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19268b);
                return;
            case 1:
                ((n70) this.f19268b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19268b).lambda$new$2();
                return;
        }
    }
}
