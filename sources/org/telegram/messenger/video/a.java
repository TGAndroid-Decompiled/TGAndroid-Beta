package org.telegram.messenger.video;

import org.telegram.ui.Components.i80;
public final class a implements Runnable {
    public final int f19776a;
    public final Object f19777b;

    public a(Object obj, int i10) {
        this.f19776a = i10;
        this.f19777b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19776a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19777b);
                return;
            case 1:
                ((i80) this.f19777b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19777b).lambda$new$2();
                return;
        }
    }
}
