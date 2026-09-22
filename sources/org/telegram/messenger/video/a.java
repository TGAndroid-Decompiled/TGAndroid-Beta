package org.telegram.messenger.video;

import org.telegram.ui.Components.y70;
public final class a implements Runnable {
    public final int f17790a;
    public final Object f17791b;

    public a(Object obj, int i10) {
        this.f17790a = i10;
        this.f17791b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17790a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17791b);
                return;
            case 1:
                ((y70) this.f17791b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17791b).lambda$new$2();
                return;
        }
    }
}
