package org.telegram.messenger.video;

import org.telegram.ui.Components.h80;
public final class a implements Runnable {
    public final int f19853a;
    public final Object f19854b;

    public a(Object obj, int i10) {
        this.f19853a = i10;
        this.f19854b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19853a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19854b);
                return;
            case 1:
                ((h80) this.f19854b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19854b).lambda$new$2();
                return;
        }
    }
}
