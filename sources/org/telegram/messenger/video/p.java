package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19278a;
    public final long f19279b;
    public final Object f19280c;

    public p(Object obj, long j3, int i10) {
        this.f19278a = i10;
        this.f19280c = obj;
        this.f19279b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19278a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19280c).lambda$onError$0(this.f19279b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19280c).lambda$seekTo$11(this.f19279b);
                return;
        }
    }
}
