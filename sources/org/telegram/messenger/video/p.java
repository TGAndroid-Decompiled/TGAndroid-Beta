package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19499a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19500b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19499a = i10;
        this.f19500b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19499a) {
            case 0:
                this.f19500b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19500b.lambda$onError$1();
                return;
        }
    }
}
