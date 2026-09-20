package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f17818a;
    public final long f17819b;
    public final Object f17820c;

    public q(Object obj, long j3, int i10) {
        this.f17818a = i10;
        this.f17820c = obj;
        this.f17819b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17820c).lambda$onError$0(this.f17819b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17820c).lambda$seekTo$11(this.f17819b);
                return;
        }
    }
}
