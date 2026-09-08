package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19328a;
    public final long f19329b;
    public final Object f19330c;

    public p(Object obj, long j3, int i10) {
        this.f19328a = i10;
        this.f19330c = obj;
        this.f19329b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19328a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19330c).lambda$onError$0(this.f19329b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19330c).lambda$seekTo$11(this.f19329b);
                return;
        }
    }
}
