package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f18443a;
    public final long f18444b;
    public final Object f18445c;

    public p(Object obj, long j10, int i10) {
        this.f18443a = i10;
        this.f18445c = obj;
        this.f18444b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18443a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f18445c).lambda$onError$0(this.f18444b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f18445c).lambda$seekTo$11(this.f18444b);
                return;
        }
    }
}
