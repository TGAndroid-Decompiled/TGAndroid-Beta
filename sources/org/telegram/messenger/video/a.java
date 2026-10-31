package org.telegram.messenger.video;

import org.telegram.ui.Components.z60;
public final class a implements Runnable {
    public final int f18543a;
    public final Object f18544b;

    public a(Object obj, int i10) {
        this.f18543a = i10;
        this.f18544b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18543a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f18544b);
                return;
            case 1:
                ((z60) this.f18544b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f18544b).lambda$new$2();
                return;
        }
    }
}
