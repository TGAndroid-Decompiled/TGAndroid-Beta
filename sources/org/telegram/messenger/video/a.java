package org.telegram.messenger.video;

import org.telegram.ui.Components.a70;
public final class a implements Runnable {
    public final int f27384a;
    public final Object f27385b;

    public a(Object obj, int i7) {
        this.f27384a = i7;
        this.f27385b = obj;
    }

    @Override
    public final void run() {
        switch (this.f27384a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f27385b);
                return;
            case 1:
                ((a70) this.f27385b).v();
                return;
            default:
                ((VideoFramesRewinder) this.f27385b).lambda$new$2();
                return;
        }
    }
}
