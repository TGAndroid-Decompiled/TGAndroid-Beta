package org.telegram.messenger.video;

import org.telegram.ui.Components.j80;
public final class a implements Runnable {
    public final int f19846a;
    public final Object f19847b;

    public a(Object obj, int i10) {
        this.f19846a = i10;
        this.f19847b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19846a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19847b);
                return;
            case 1:
                ((j80) this.f19847b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19847b).lambda$new$2();
                return;
        }
    }
}
