package org.telegram.messenger.video;

import org.telegram.ui.Components.i80;
public final class a implements Runnable {
    public final int f19783a;
    public final Object f19784b;

    public a(Object obj, int i10) {
        this.f19783a = i10;
        this.f19784b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19783a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19784b);
                return;
            case 1:
                ((i80) this.f19784b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19784b).lambda$new$2();
                return;
        }
    }
}
