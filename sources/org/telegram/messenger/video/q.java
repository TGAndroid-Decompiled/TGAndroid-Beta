package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f18714a;
    public final long f18715b;
    public final Object f18716c;

    public q(Object obj, long j10, int i10) {
        this.f18714a = i10;
        this.f18716c = obj;
        this.f18715b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18714a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f18716c).lambda$onError$0(this.f18715b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f18716c).lambda$seekTo$11(this.f18715b);
                return;
        }
    }
}
