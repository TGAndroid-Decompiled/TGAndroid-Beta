package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f17847a;
    public final long f17848b;
    public final Object f17849c;

    public q(Object obj, long j3, int i10) {
        this.f17847a = i10;
        this.f17849c = obj;
        this.f17848b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17847a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17849c).lambda$onError$0(this.f17848b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17849c).lambda$seekTo$11(this.f17848b);
                return;
        }
    }
}
