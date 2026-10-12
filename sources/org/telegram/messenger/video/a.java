package org.telegram.messenger.video;

import org.telegram.ui.Components.s80;
public final class a implements Runnable {
    public final int f19236a;
    public final Object f19237b;

    public a(Object obj, int i10) {
        this.f19236a = i10;
        this.f19237b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19236a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19237b);
                return;
            case 1:
                ((s80) this.f19237b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19237b).lambda$new$2();
                return;
        }
    }
}
