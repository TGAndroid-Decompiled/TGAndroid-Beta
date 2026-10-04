package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f19486a;
    public final long f19487b;
    public final Object f19488c;

    public q(Object obj, long j3, int i10) {
        this.f19486a = i10;
        this.f19488c = obj;
        this.f19487b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19486a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19488c).lambda$onError$0(this.f19487b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19488c).lambda$seekTo$11(this.f19487b);
                return;
        }
    }
}
