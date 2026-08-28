package org.telegram.messenger.video;

import org.telegram.ui.Components.x60;
public final class a implements Runnable {
    public final int f21785a;
    public final Object f21786b;

    public a(Object obj, int i9) {
        this.f21785a = i9;
        this.f21786b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21785a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f21786b);
                return;
            case 1:
                ((x60) this.f21786b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f21786b).lambda$new$2();
                return;
        }
    }
}
