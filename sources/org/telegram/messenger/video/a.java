package org.telegram.messenger.video;

import org.telegram.ui.Components.a70;
public final class a implements Runnable {
    public final int f27404a;
    public final Object f27405b;

    public a(Object obj, int i7) {
        this.f27404a = i7;
        this.f27405b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27404a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f27405b);
                return;
            case 1:
                ((a70) this.f27405b).v();
                return;
            default:
                ((VideoFramesRewinder) this.f27405b).lambda$new$2();
                return;
        }
    }
}
