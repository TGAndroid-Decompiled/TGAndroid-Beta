package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f19501a;
    public final long f19502b;
    public final Object f19503c;

    public q(Object obj, long j3, int i10) {
        this.f19501a = i10;
        this.f19503c = obj;
        this.f19502b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19501a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19503c).lambda$onError$0(this.f19502b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19503c).lambda$seekTo$11(this.f19502b);
                return;
        }
    }
}
