package org.telegram.messenger.video;

import org.telegram.ui.Components.n70;
public final class a implements Runnable {
    public final int f17570a;
    public final Object f17571b;

    public a(Object obj, int i10) {
        this.f17570a = i10;
        this.f17571b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17570a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17571b);
                return;
            case 1:
                ((n70) this.f17571b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17571b).lambda$new$2();
                return;
        }
    }
}
