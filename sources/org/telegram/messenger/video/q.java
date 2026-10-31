package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f18586a;
    public final long f18587b;
    public final Object f18588c;

    public q(Object obj, long j10, int i10) {
        this.f18586a = i10;
        this.f18588c = obj;
        this.f18587b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18586a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f18588c).lambda$onError$0(this.f18587b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f18588c).lambda$seekTo$11(this.f18587b);
                return;
        }
    }
}
