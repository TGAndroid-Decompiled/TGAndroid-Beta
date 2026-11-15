package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f27041a;
    public final long f27042b;
    public final Object f27043c;

    public p(Object obj, long j3, int i7) {
        this.f27041a = i7;
        this.f27043c = obj;
        this.f27042b = j3;
    }

    @Override
    public final void run() {
        switch (this.f27041a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f27043c).lambda$onError$0(this.f27042b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f27043c).lambda$seekTo$11(this.f27042b);
                return;
        }
    }
}
