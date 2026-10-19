package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f19806a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19807b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19806a = i10;
        this.f19807b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19806a) {
            case 0:
                this.f19807b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19807b.lambda$onError$1();
                return;
        }
    }
}
