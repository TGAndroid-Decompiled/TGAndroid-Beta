package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f27386a;
    public final VideoPlayerHolderBase.AnonymousClass2 f27387b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f27386a = i7;
        this.f27387b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f27386a) {
            case 0:
                this.f27387b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f27387b.lambda$onError$1();
                return;
        }
    }
}
