package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f25940a;
    public final long f25941b;
    public final Object f25942c;

    public q(Object obj, long j10, int i3) {
        this.f25940a = i3;
        this.f25942c = obj;
        this.f25941b = j10;
    }

    @Override
    public final void run() {
        switch (this.f25940a) {
            case 0:
                VideoPlayerHolderBase.AnonymousClass2.c((VideoPlayerHolderBase.AnonymousClass2) this.f25942c, this.f25941b);
                return;
            default:
                VideoPlayerHolderBase.j((VideoPlayerHolderBase) this.f25942c, this.f25941b);
                return;
        }
    }
}
