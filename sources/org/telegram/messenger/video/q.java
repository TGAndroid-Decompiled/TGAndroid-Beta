package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f17846a;
    public final long f17847b;
    public final Object f17848c;

    public q(Object obj, long j3, int i10) {
        this.f17846a = i10;
        this.f17848c = obj;
        this.f17847b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17846a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17848c).lambda$onError$0(this.f17847b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17848c).lambda$seekTo$11(this.f17847b);
                return;
        }
    }
}
