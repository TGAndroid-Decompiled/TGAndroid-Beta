package org.telegram.messenger.video;

import org.telegram.ui.Components.m80;
public final class a implements Runnable {
    public final int f18708a;
    public final Object f18709b;

    public a(Object obj, int i10) {
        this.f18708a = i10;
        this.f18709b = obj;
    }

    @Override
    public final void run() {
        switch (this.f18708a) {
            case 0:
                OldVideoPlayerRewinder.a((OldVideoPlayerRewinder) this.f18709b);
                return;
            case 1:
                ((m80) this.f18709b).u();
                return;
            default:
                ((VideoFramesRewinder) this.f18709b).lambda$new$2();
                return;
        }
    }
}
