package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17578a;
    public final long f17579b;
    public final Object f17580c;

    public p(Object obj, long j3, int i10) {
        this.f17578a = i10;
        this.f17580c = obj;
        this.f17579b = j3;
    }

    @Override
    public final void run() {
        switch (this.f17578a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f17580c).lambda$onError$0(this.f17579b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f17580c).lambda$seekTo$11(this.f17579b);
                return;
        }
    }
}
