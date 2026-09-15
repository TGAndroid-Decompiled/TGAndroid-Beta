package org.telegram.messenger.video;

import org.telegram.ui.Components.n70;
public final class a implements Runnable {
    public final int f17561a;
    public final Object f17562b;

    public a(Object obj, int i10) {
        this.f17561a = i10;
        this.f17562b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17561a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17562b);
                return;
            case 1:
                ((n70) this.f17562b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17562b).lambda$new$2();
                return;
        }
    }
}
