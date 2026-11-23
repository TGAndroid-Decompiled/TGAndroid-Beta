package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f27388a;
    public final long f27389b;
    public final Object f27390c;

    public o(Object obj, long j3, int i7) {
        this.f27388a = i7;
        this.f27390c = obj;
        this.f27389b = j3;
    }

    @Override
    public final void run() {
        switch (this.f27388a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f27390c).lambda$onError$0(this.f27389b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f27390c).lambda$seekTo$11(this.f27389b);
                return;
        }
    }
}
