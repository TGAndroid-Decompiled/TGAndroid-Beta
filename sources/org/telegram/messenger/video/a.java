package org.telegram.messenger.video;

import org.telegram.ui.Components.n70;
public final class a implements Runnable {
    public final int f19294a;
    public final Object f19295b;

    public a(Object obj, int i10) {
        this.f19294a = i10;
        this.f19295b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19294a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19295b);
                return;
            case 1:
                ((n70) this.f19295b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19295b).lambda$new$2();
                return;
        }
    }
}
