package org.telegram.messenger.video;

import org.telegram.ui.Components.l80;
public final class a implements Runnable {
    public final int f18403a;
    public final Object f18404b;

    public a(Object obj, int i10) {
        this.f18403a = i10;
        this.f18404b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18403a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f18404b);
                return;
            case 1:
                ((l80) this.f18404b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f18404b).lambda$new$2();
                return;
        }
    }
}
