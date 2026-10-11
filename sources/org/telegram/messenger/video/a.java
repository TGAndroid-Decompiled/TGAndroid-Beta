package org.telegram.messenger.video;

import org.telegram.ui.Components.p80;
public final class a implements Runnable {
    public final int f19488a;
    public final Object f19489b;

    public a(Object obj, int i10) {
        this.f19488a = i10;
        this.f19489b = obj;
    }

    @Override
    public final void run() {
        switch (this.f19488a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f19489b);
                return;
            case 1:
                ((p80) this.f19489b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f19489b).lambda$new$2();
                return;
        }
    }
}
