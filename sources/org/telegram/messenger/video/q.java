package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f19497a;
    public final long f19498b;
    public final Object f19499c;

    public q(Object obj, long j3, int i10) {
        this.f19497a = i10;
        this.f19499c = obj;
        this.f19498b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19497a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19499c).lambda$onError$0(this.f19498b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19499c).lambda$seekTo$11(this.f19498b);
                return;
        }
    }
}
