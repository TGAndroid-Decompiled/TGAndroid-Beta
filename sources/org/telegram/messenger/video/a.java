package org.telegram.messenger.video;

import org.telegram.ui.Components.n70;
public final class a implements Runnable {
    public final int f17558a;
    public final Object f17559b;

    public a(Object obj, int i10) {
        this.f17558a = i10;
        this.f17559b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17558a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17559b);
                return;
            case 1:
                ((n70) this.f17559b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17559b).lambda$new$2();
                return;
        }
    }
}
