package org.telegram.messenger.video;

import org.telegram.ui.Components.k80;
public final class a implements Runnable {
    public final int f21552a;
    public final Object f21553b;

    public a(Object obj, int i10) {
        this.f21552a = i10;
        this.f21553b = obj;
    }

    @Override
    public final void run() {
        switch (this.f21552a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f21553b);
                return;
            case 1:
                ((k80) this.f21553b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f21553b).lambda$new$2();
                return;
        }
    }
}
