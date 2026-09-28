package org.telegram.messenger.video;

import org.telegram.ui.Components.a80;
public final class a implements Runnable {
    public final int f17803a;
    public final Object f17804b;

    public a(Object obj, int i10) {
        this.f17803a = i10;
        this.f17804b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17803a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17804b);
                return;
            case 1:
                ((a80) this.f17804b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17804b).lambda$new$2();
                return;
        }
    }
}
