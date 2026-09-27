package org.telegram.messenger.video;

import org.telegram.ui.Components.a80;
public final class a implements Runnable {
    public final int f17787a;
    public final Object f17788b;

    public a(Object obj, int i10) {
        this.f17787a = i10;
        this.f17788b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17787a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17788b);
                return;
            case 1:
                ((a80) this.f17788b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17788b).lambda$new$2();
                return;
        }
    }
}
