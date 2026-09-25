package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f17836a;
    public final long f17837b;
    public final Object f17838c;

    public q(Object obj, long j3, int i10) {
        this.f17836a = i10;
        this.f17838c = obj;
        this.f17837b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17836a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17838c).lambda$onError$0(this.f17837b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17838c).lambda$seekTo$11(this.f17837b);
                return;
        }
    }
}
