package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f27414a;
    public final VideoPlayerHolderBase.AnonymousClass2 f27415b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f27414a = i7;
        this.f27415b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f27414a) {
            case 0:
                this.f27415b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f27415b.lambda$onError$1();
                return;
        }
    }
}
