package org.telegram.messenger.video;

import org.telegram.ui.Components.b80;
public final class a implements Runnable {
    public final int f19440a;
    public final Object f19441b;

    public a(Object obj, int i10) {
        this.f19440a = i10;
        this.f19441b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19440a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19441b);
                return;
            case 1:
                ((b80) this.f19441b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19441b).lambda$new$2();
                return;
        }
    }
}
