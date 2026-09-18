package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f17787a;
    public final long f17788b;
    public final Object f17789c;

    public q(Object obj, long j3, int i10) {
        this.f17787a = i10;
        this.f17789c = obj;
        this.f17788b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17787a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17789c).lambda$onError$0(this.f17788b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17789c).lambda$seekTo$11(this.f17788b);
                return;
        }
    }
}
