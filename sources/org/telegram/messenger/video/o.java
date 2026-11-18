package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f27416a;
    public final long f27417b;
    public final Object f27418c;

    public o(Object obj, long j3, int i7) {
        this.f27416a = i7;
        this.f27418c = obj;
        this.f27417b = j3;
    }

    @Override
    public final void run() {
        switch (this.f27416a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f27418c).lambda$onError$0(this.f27417b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f27418c).lambda$seekTo$11(this.f27417b);
                return;
        }
    }
}
