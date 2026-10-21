package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f19800a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19801b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19800a = i10;
        this.f19801b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19800a) {
            case 0:
                this.f19801b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19801b.lambda$onError$1();
                return;
        }
    }
}
