package org.telegram.messenger.video;

import org.telegram.ui.Components.i80;
public final class a implements Runnable {
    public final int f19771a;
    public final Object f19772b;

    public a(Object obj, int i10) {
        this.f19771a = i10;
        this.f19772b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19771a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19772b);
                return;
            case 1:
                ((i80) this.f19772b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19772b).lambda$new$2();
                return;
        }
    }
}
