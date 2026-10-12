package org.telegram.messenger.video;

import org.telegram.ui.Components.s80;
public final class a implements Runnable {
    public final int f19235a;
    public final Object f19236b;

    public a(Object obj, int i10) {
        this.f19235a = i10;
        this.f19236b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19235a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19236b);
                return;
            case 1:
                ((s80) this.f19236b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19236b).lambda$new$2();
                return;
        }
    }
}
