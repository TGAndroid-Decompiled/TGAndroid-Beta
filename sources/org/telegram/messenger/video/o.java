package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f17596a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17597b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17596a = i10;
        this.f17597b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17596a) {
            case 0:
                this.f17597b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17597b.lambda$onError$1();
                return;
        }
    }
}
