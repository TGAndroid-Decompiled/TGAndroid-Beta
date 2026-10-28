package org.telegram.messenger.video;

import org.telegram.ui.Components.l80;
public final class a implements Runnable {
    public final int f21538a;
    public final Object f21539b;

    public a(Object obj, int i10) {
        this.f21538a = i10;
        this.f21539b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21538a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f21539b);
                return;
            case 1:
                ((l80) this.f21539b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f21539b).lambda$new$2();
                return;
        }
    }
}
