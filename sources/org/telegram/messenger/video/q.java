package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f19493a;
    public final long f19494b;
    public final Object f19495c;

    public q(Object obj, long j3, int i10) {
        this.f19493a = i10;
        this.f19495c = obj;
        this.f19494b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19493a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19495c).lambda$onError$0(this.f19494b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19495c).lambda$seekTo$11(this.f19494b);
                return;
        }
    }
}
