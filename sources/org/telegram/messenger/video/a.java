package org.telegram.messenger.video;

import org.telegram.ui.Components.w70;
public final class a implements Runnable {
    public final int f16621a;
    public final Object f16622b;

    public a(Object obj, int i10) {
        this.f16621a = i10;
        this.f16622b = obj;
    }

    @Override
    public final void run() {
        switch (this.f16621a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f16622b);
                return;
            case 1:
                ((w70) this.f16622b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f16622b).lambda$new$2();
                return;
        }
    }
}
