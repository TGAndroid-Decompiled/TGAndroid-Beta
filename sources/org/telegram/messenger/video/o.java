package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f27418a;
    public final long f27419b;
    public final Object f27420c;

    public o(Object obj, long j3, int i7) {
        this.f27418a = i7;
        this.f27420c = obj;
        this.f27419b = j3;
    }

    @Override
    public final void run() {
        switch (this.f27418a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f27420c).lambda$onError$0(this.f27419b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f27420c).lambda$seekTo$11(this.f27419b);
                return;
        }
    }
}
