package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f17830a;
    public final long f17831b;
    public final Object f17832c;

    public q(Object obj, long j3, int i10) {
        this.f17830a = i10;
        this.f17832c = obj;
        this.f17831b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17830a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17832c).lambda$onError$0(this.f17831b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17832c).lambda$seekTo$11(this.f17831b);
                return;
        }
    }
}
