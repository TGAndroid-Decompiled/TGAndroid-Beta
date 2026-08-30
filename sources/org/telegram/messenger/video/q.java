package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f18732a;
    public final long f18733b;
    public final Object f18734c;

    public q(Object obj, long j10, int i10) {
        this.f18732a = i10;
        this.f18734c = obj;
        this.f18733b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18732a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f18734c).lambda$onError$0(this.f18733b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f18734c).lambda$seekTo$11(this.f18733b);
                return;
        }
    }
}
