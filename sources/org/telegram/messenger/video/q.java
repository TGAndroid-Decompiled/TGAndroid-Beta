package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f17863a;
    public final long f17864b;
    public final Object f17865c;

    public q(Object obj, long j3, int i10) {
        this.f17863a = i10;
        this.f17865c = obj;
        this.f17864b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17863a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17865c).lambda$onError$0(this.f17864b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17865c).lambda$seekTo$11(this.f17864b);
                return;
        }
    }
}
