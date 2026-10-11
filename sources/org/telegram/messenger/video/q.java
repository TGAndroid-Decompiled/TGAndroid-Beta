package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f19498a;
    public final long f19499b;
    public final Object f19500c;

    public q(Object obj, long j3, int i10) {
        this.f19498a = i10;
        this.f19500c = obj;
        this.f19499b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19498a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19500c).lambda$onError$0(this.f19499b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19500c).lambda$seekTo$11(this.f19499b);
                return;
        }
    }
}
