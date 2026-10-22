package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19827a;
    public final long f19828b;
    public final Object f19829c;

    public o(Object obj, long j10, int i10) {
        this.f19827a = i10;
        this.f19829c = obj;
        this.f19828b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19827a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19829c).lambda$onError$0(this.f19828b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19829c).lambda$seekTo$11(this.f19828b);
                return;
        }
    }
}
