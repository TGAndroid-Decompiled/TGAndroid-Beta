package org.telegram.messenger.video;

import org.telegram.ui.Components.z60;
public final class a implements Runnable {
    public final int f18698a;
    public final Object f18699b;

    public a(Object obj, int i10) {
        this.f18698a = i10;
        this.f18699b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18698a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f18699b);
                return;
            case 1:
                ((z60) this.f18699b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f18699b).lambda$new$2();
                return;
        }
    }
}
