package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f27416a;
    public final VideoPlayerHolderBase.AnonymousClass2 f27417b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f27416a = i7;
        this.f27417b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f27416a) {
            case 0:
                this.f27417b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f27417b.lambda$onError$1();
                return;
        }
    }
}
