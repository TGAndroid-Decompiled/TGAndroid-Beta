package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f19811a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19812b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19811a = i10;
        this.f19812b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19811a) {
            case 0:
                this.f19812b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19812b.lambda$onError$1();
                return;
        }
    }
}
