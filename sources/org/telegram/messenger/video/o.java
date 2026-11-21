package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f27444a;
    public final long f27445b;
    public final Object f27446c;

    public o(Object obj, long j3, int i7) {
        this.f27444a = i7;
        this.f27446c = obj;
        this.f27445b = j3;
    }

    @Override
    public final void run() {
        switch (this.f27444a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f27446c).lambda$onError$0(this.f27445b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f27446c).lambda$seekTo$11(this.f27445b);
                return;
        }
    }
}
