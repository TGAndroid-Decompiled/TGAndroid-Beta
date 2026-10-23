package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19883a;
    public final long f19884b;
    public final Object f19885c;

    public o(Object obj, long j10, int i10) {
        this.f19883a = i10;
        this.f19885c = obj;
        this.f19884b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19883a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19885c).lambda$onError$0(this.f19884b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19885c).lambda$seekTo$11(this.f19884b);
                return;
        }
    }
}
