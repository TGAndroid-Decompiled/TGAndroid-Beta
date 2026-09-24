package org.telegram.messenger.video;

import org.telegram.ui.Components.y70;
public final class a implements Runnable {
    public final int f17778a;
    public final Object f17779b;

    public a(Object obj, int i10) {
        this.f17778a = i10;
        this.f17779b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17778a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17779b);
                return;
            case 1:
                ((y70) this.f17779b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17779b).lambda$new$2();
                return;
        }
    }
}
