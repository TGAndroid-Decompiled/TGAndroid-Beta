package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f21831a;
    public final long f21832b;
    public final Object f21833c;

    public q(Object obj, long j10, int i9) {
        this.f21831a = i9;
        this.f21833c = obj;
        this.f21832b = j10;
    }

    @Override
    public final void run() {
        switch (this.f21831a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f21833c).lambda$onError$0(this.f21832b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f21833c).lambda$seekTo$11(this.f21832b);
                return;
        }
    }
}
