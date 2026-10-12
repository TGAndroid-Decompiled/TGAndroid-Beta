package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f18745a;
    public final long f18746b;
    public final Object f18747c;

    public o(Object obj, long j10, int i10) {
        this.f18745a = i10;
        this.f18747c = obj;
        this.f18746b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18745a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f18747c).lambda$onError$0(this.f18746b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f18747c).lambda$seekTo$11(this.f18746b);
                return;
        }
    }
}
