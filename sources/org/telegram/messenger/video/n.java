package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f21573a;
    public final VideoPlayerHolderBase.AnonymousClass2 f21574b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f21573a = i10;
        this.f21574b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f21573a) {
            case 0:
                this.f21574b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f21574b.lambda$onError$1();
                return;
        }
    }
}
