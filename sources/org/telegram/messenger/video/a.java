package org.telegram.messenger.video;

import org.telegram.ui.Components.b80;
public final class a implements Runnable {
    public final int f17820a;
    public final Object f17821b;

    public a(Object obj, int i10) {
        this.f17820a = i10;
        this.f17821b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17820a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17821b);
                return;
            case 1:
                ((b80) this.f17821b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17821b).lambda$new$2();
                return;
        }
    }
}
