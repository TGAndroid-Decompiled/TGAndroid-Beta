package org.telegram.messenger.video;

import org.telegram.ui.Components.p80;
public final class a implements Runnable {
    public final int f19451a;
    public final Object f19452b;

    public a(Object obj, int i10) {
        this.f19451a = i10;
        this.f19452b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19451a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19452b);
                return;
            case 1:
                ((p80) this.f19452b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19452b).lambda$new$2();
                return;
        }
    }
}
