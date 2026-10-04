package org.telegram.messenger.video;

import org.telegram.ui.Components.b80;
public final class a implements Runnable {
    public final int f19448a;
    public final Object f19449b;

    public a(Object obj, int i10) {
        this.f19448a = i10;
        this.f19449b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19448a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19449b);
                return;
            case 1:
                ((b80) this.f19449b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19449b).lambda$new$2();
                return;
        }
    }
}
