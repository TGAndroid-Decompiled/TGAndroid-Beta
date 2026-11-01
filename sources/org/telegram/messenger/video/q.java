package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f18741a;
    public final long f18742b;
    public final Object f18743c;

    public q(Object obj, long j10, int i10) {
        this.f18741a = i10;
        this.f18743c = obj;
        this.f18742b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18741a) {
            case 0:
                VideoPlayerHolderBase.AnonymousClass2.c((VideoPlayerHolderBase.AnonymousClass2) this.f18743c, this.f18742b);
                return;
            default:
                VideoPlayerHolderBase.j((VideoPlayerHolderBase) this.f18743c, this.f18742b);
                return;
        }
    }
}
