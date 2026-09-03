package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f20359a;
    public final long f20360b;
    public final Object f20361c;

    public q(Object obj, long j10, int i10) {
        this.f20359a = i10;
        this.f20361c = obj;
        this.f20360b = j10;
    }

    @Override
    public final void run() {
        switch (this.f20359a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f20361c).lambda$onError$0(this.f20360b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f20361c).lambda$seekTo$11(this.f20360b);
                return;
        }
    }
}
