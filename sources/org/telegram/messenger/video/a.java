package org.telegram.messenger.video;

import org.telegram.ui.Components.w70;
public final class a implements Runnable {
    public final int f17744a;
    public final Object f17745b;

    public a(Object obj, int i10) {
        this.f17744a = i10;
        this.f17745b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17744a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17745b);
                return;
            case 1:
                ((w70) this.f17745b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17745b).lambda$new$2();
                return;
        }
    }
}
