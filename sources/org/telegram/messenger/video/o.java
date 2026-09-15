package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f17599a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17600b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17599a = i10;
        this.f17600b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17599a) {
            case 0:
                this.f17600b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17600b.lambda$onError$1();
                return;
        }
    }
}
