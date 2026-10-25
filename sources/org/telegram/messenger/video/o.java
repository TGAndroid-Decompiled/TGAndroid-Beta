package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f21589a;
    public final long f21590b;
    public final Object f21591c;

    public o(Object obj, long j10, int i10) {
        this.f21589a = i10;
        this.f21591c = obj;
        this.f21590b = j10;
    }

    @Override
    public final void run() {
        switch (this.f21589a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f21591c).lambda$onError$0(this.f21590b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f21591c).lambda$seekTo$11(this.f21590b);
                return;
        }
    }
}
