package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f19534a;
    public final long f19535b;
    public final Object f19536c;

    public q(Object obj, long j3, int i10) {
        this.f19534a = i10;
        this.f19536c = obj;
        this.f19535b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19534a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19536c).lambda$onError$0(this.f19535b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19536c).lambda$seekTo$11(this.f19535b);
                return;
        }
    }
}
