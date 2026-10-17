package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19805a;
    public final long f19806b;
    public final Object f19807c;

    public o(Object obj, long j10, int i10) {
        this.f19805a = i10;
        this.f19807c = obj;
        this.f19806b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19805a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19807c).lambda$onError$0(this.f19806b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19807c).lambda$seekTo$11(this.f19806b);
                return;
        }
    }
}
