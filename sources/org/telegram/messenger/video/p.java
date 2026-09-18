package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17610a;
    public final long f17611b;
    public final Object f17612c;

    public p(Object obj, long j3, int i10) {
        this.f17610a = i10;
        this.f17612c = obj;
        this.f17611b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17610a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17612c).lambda$onError$0(this.f17611b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17612c).lambda$seekTo$11(this.f17611b);
                return;
        }
    }
}
