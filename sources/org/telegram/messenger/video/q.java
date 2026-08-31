package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f20357a;
    public final long f20358b;
    public final Object f20359c;

    public q(Object obj, long j10, int i10) {
        this.f20357a = i10;
        this.f20359c = obj;
        this.f20358b = j10;
    }

    @Override
    public final void run() {
        switch (this.f20357a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f20359c).lambda$onError$0(this.f20358b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f20359c).lambda$seekTo$11(this.f20358b);
                return;
        }
    }
}
