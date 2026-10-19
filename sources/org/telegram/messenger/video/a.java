package org.telegram.messenger.video;

import org.telegram.ui.Components.i80;
public final class a implements Runnable {
    public final int f19773a;
    public final Object f19774b;

    public a(Object obj, int i10) {
        this.f19773a = i10;
        this.f19774b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19773a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19774b);
                return;
            case 1:
                ((i80) this.f19774b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19774b).lambda$new$2();
                return;
        }
    }
}
