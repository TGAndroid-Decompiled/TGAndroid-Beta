package org.telegram.messenger.video;

import org.telegram.ui.Components.m60;
public final class a implements Runnable {
    public final int f26997a;
    public final Object f26998b;

    public a(Object obj, int i7) {
        this.f26997a = i7;
        this.f26998b = obj;
    }

    @Override
    public final void run() {
        switch (this.f26997a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f26998b);
                return;
            case 1:
                ((m60) this.f26998b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f26998b).lambda$new$2();
                return;
        }
    }
}
