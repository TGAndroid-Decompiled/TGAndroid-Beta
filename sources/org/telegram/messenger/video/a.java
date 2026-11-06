package org.telegram.messenger.video;

import org.telegram.ui.Components.k60;
public final class a implements Runnable {
    public final int f25985a;
    public final Object f25986b;

    public a(Object obj, int i7) {
        this.f25985a = i7;
        this.f25986b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25985a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f25986b);
                return;
            case 1:
                ((k60) this.f25986b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f25986b).lambda$new$2();
                return;
        }
    }
}
