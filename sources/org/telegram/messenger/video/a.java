package org.telegram.messenger.video;

import org.telegram.ui.Components.b80;
public final class a implements Runnable {
    public final int f19445a;
    public final Object f19446b;

    public a(Object obj, int i10) {
        this.f19445a = i10;
        this.f19446b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19445a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19446b);
                return;
            case 1:
                ((b80) this.f19446b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19446b).lambda$new$2();
                return;
        }
    }
}
