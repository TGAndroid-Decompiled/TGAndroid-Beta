package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19279a;
    public final long f19280b;
    public final Object f19281c;

    public p(Object obj, long j3, int i10) {
        this.f19279a = i10;
        this.f19281c = obj;
        this.f19280b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19279a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19281c).lambda$onError$0(this.f19280b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19281c).lambda$seekTo$11(this.f19280b);
                return;
        }
    }
}
