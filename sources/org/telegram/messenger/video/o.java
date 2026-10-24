package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19890a;
    public final long f19891b;
    public final Object f19892c;

    public o(Object obj, long j10, int i10) {
        this.f19890a = i10;
        this.f19892c = obj;
        this.f19891b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19890a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19892c).lambda$onError$0(this.f19891b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19892c).lambda$seekTo$11(this.f19891b);
                return;
        }
    }
}
