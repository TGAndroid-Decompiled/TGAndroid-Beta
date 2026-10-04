package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class q implements Runnable {
    public final int f19494a;
    public final long f19495b;
    public final Object f19496c;

    public q(Object obj, long j3, int i10) {
        this.f19494a = i10;
        this.f19496c = obj;
        this.f19495b = j3;
    }

    @Override
    public final void run() {
        switch (this.f19494a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f19496c).lambda$onError$0(this.f19495b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f19496c).lambda$seekTo$11(this.f19495b);
                return;
        }
    }
}
