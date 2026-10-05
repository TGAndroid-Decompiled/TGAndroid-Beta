package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f19491a;
    public final long f19492b;
    public final Object f19493c;

    public q(Object obj, long j3, int i10) {
        this.f19491a = i10;
        this.f19493c = obj;
        this.f19492b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19491a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19493c).lambda$onError$0(this.f19492b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19493c).lambda$seekTo$11(this.f19492b);
                return;
        }
    }
}
