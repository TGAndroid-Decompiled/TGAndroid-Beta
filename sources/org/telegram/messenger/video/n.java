package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f19881a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19882b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19881a = i10;
        this.f19882b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19881a) {
            case 0:
                this.f19882b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19882b.lambda$onError$1();
                return;
        }
    }
}
