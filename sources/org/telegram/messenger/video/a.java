package org.telegram.messenger.video;

import org.telegram.ui.Components.f60;
public final class a implements Runnable {
    public final int f25893a;
    public final Object f25894b;

    public a(Object obj, int i3) {
        this.f25893a = i3;
        this.f25894b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25893a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f25894b);
                return;
            case 1:
                ((f60) this.f25894b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f25894b).lambda$new$2();
                return;
        }
    }
}
