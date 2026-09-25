package org.telegram.messenger.video;

import org.telegram.ui.Components.y70;
public final class a implements Runnable {
    public final int f17793a;
    public final Object f17794b;

    public a(Object obj, int i10) {
        this.f17793a = i10;
        this.f17794b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17793a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17794b);
                return;
            case 1:
                ((y70) this.f17794b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17794b).lambda$new$2();
                return;
        }
    }
}
