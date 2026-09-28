package org.telegram.messenger.video;

import org.telegram.ui.Components.a80;
public final class a implements Runnable {
    public final int f17804a;
    public final Object f17805b;

    public a(Object obj, int i10) {
        this.f17804a = i10;
        this.f17805b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17804a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17805b);
                return;
            case 1:
                ((a80) this.f17805b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17805b).lambda$new$2();
                return;
        }
    }
}
