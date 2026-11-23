package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f27424a;
    public final long f27425b;
    public final Object f27426c;

    public o(Object obj, long j3, int i7) {
        this.f27424a = i7;
        this.f27426c = obj;
        this.f27425b = j3;
    }

    @Override
    public final void run() {
        switch (this.f27424a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f27426c).lambda$onError$0(this.f27425b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f27426c).lambda$seekTo$11(this.f27425b);
                return;
        }
    }
}
