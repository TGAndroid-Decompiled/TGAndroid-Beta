package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f17833a;
    public final long f17834b;
    public final Object f17835c;

    public q(Object obj, long j3, int i10) {
        this.f17833a = i10;
        this.f17835c = obj;
        this.f17834b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17833a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17835c).lambda$onError$0(this.f17834b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17835c).lambda$seekTo$11(this.f17834b);
                return;
        }
    }
}
