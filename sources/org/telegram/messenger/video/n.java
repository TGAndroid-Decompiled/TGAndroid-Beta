package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f27510a;
    public final VideoPlayerHolderBase.AnonymousClass2 f27511b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f27510a = i7;
        this.f27511b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f27510a) {
            case 0:
                this.f27511b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f27511b.lambda$onError$1();
                return;
        }
    }
}
