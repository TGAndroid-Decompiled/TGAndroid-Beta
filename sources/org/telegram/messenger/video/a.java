package org.telegram.messenger.video;

import org.telegram.ui.Components.l60;
public final class a implements Runnable {
    public final int f25996a;
    public final Object f25997b;

    public a(Object obj, int i7) {
        this.f25996a = i7;
        this.f25997b = obj;
    }

    @Override
    public final void run() {
        switch (this.f25996a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f25997b);
                return;
            case 1:
                ((l60) this.f25997b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f25997b).lambda$new$2();
                return;
        }
    }
}
