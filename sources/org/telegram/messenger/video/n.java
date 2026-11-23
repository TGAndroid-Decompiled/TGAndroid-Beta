package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f27422a;
    public final VideoPlayerHolderBase.AnonymousClass2 f27423b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f27422a = i7;
        this.f27423b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f27422a) {
            case 0:
                this.f27423b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f27423b.lambda$onError$1();
                return;
        }
    }
}
