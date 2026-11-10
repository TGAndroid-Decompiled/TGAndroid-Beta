package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f26044a;
    public final long f26045b;
    public final Object f26046c;

    public p(Object obj, long j3, int i7) {
        this.f26044a = i7;
        this.f26046c = obj;
        this.f26045b = j3;
    }

    @Override
    public final void run() {
        switch (this.f26044a) {
            case 0:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f26046c).lambda$onError$0(this.f26045b);
                return;
            default:
                ((VideoPlayerHolderBase) this.f26046c).lambda$seekTo$11(this.f26045b);
                return;
        }
    }
}
