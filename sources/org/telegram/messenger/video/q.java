package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f17821a;
    public final long f17822b;
    public final Object f17823c;

    public q(Object obj, long j3, int i10) {
        this.f17821a = i10;
        this.f17823c = obj;
        this.f17822b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17821a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17823c).lambda$onError$0(this.f17822b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17823c).lambda$seekTo$11(this.f17822b);
                return;
        }
    }
}
