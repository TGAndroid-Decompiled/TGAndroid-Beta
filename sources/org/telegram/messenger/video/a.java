package org.telegram.messenger.video;

import org.telegram.ui.Components.o70;
public final class a implements Runnable {
    public final int f17538a;
    public final Object f17539b;

    public a(Object obj, int i10) {
        this.f17538a = i10;
        this.f17539b = obj;
    }

    @Override
    public final void run() {
        switch (this.f17538a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f17539b);
                return;
            case 1:
                ((o70) this.f17539b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f17539b).lambda$new$2();
                return;
        }
    }
}
