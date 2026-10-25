package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f21587a;
    public final VideoPlayerHolderBase.AnonymousClass2 f21588b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f21587a = i10;
        this.f21588b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f21587a) {
            case 0:
                this.f21588b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f21588b.lambda$onError$1();
                return;
        }
    }
}
