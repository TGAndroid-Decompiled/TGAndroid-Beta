package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f27512a;
    public final long f27513b;
    public final Object f27514c;

    public o(Object obj, long j3, int i7) {
        this.f27512a = i7;
        this.f27514c = obj;
        this.f27513b = j3;
    }

    @Override
    public final void run() {
        switch (this.f27512a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f27514c).lambda$onError$0(this.f27513b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f27514c).lambda$seekTo$11(this.f27513b);
                return;
        }
    }
}
