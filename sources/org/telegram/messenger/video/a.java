package org.telegram.messenger.video;

import org.telegram.ui.Components.m60;
public final class a implements Runnable {
    public final int f26998a;
    public final Object f26999b;

    public a(Object obj, int i7) {
        this.f26998a = i7;
        this.f26999b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26998a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f26999b);
                return;
            case 1:
                ((m60) this.f26999b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f26999b).lambda$new$2();
                return;
        }
    }
}
