package org.telegram.messenger.video;

import org.telegram.ui.Components.v70;
public final class a implements Runnable {
    public final int f17775a;
    public final Object f17776b;

    public a(Object obj, int i10) {
        this.f17775a = i10;
        this.f17776b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17775a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17776b);
                return;
            case 1:
                ((v70) this.f17776b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17776b).lambda$new$2();
                return;
        }
    }
}
