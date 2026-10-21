package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19802a;
    public final long f19803b;
    public final Object f19804c;

    public o(Object obj, long j10, int i10) {
        this.f19802a = i10;
        this.f19804c = obj;
        this.f19803b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19802a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19804c).lambda$onError$0(this.f19803b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19804c).lambda$seekTo$11(this.f19803b);
                return;
        }
    }
}
