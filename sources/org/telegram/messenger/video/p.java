package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17819a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17820b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17819a = i10;
        this.f17820b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17819a) {
            case 0:
                this.f17820b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17820b.lambda$onError$1();
                return;
        }
    }
}
