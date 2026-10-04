package org.telegram.messenger.video;

import org.telegram.ui.Components.b80;
public final class a implements Runnable {
    public final int f19447a;
    public final Object f19448b;

    public a(Object obj, int i10) {
        this.f19447a = i10;
        this.f19448b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19447a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19448b);
                return;
            case 1:
                ((b80) this.f19448b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19448b).lambda$new$2();
                return;
        }
    }
}
