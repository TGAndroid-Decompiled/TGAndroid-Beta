package org.telegram.messenger.video;

import org.telegram.ui.Components.n70;
public final class a implements Runnable {
    public final int f19258a;
    public final Object f19259b;

    public a(Object obj, int i10) {
        this.f19258a = i10;
        this.f19259b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19258a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19259b);
                return;
            case 1:
                ((n70) this.f19259b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19259b).lambda$new$2();
                return;
        }
    }
}
