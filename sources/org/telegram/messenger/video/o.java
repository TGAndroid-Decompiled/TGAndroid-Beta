package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19813a;
    public final long f19814b;
    public final Object f19815c;

    public o(Object obj, long j10, int i10) {
        this.f19813a = i10;
        this.f19815c = obj;
        this.f19814b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19813a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19815c).lambda$onError$0(this.f19814b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19815c).lambda$seekTo$11(this.f19814b);
                return;
        }
    }
}
