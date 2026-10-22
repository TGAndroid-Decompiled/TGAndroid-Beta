package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f19825a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19826b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19825a = i10;
        this.f19826b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19825a) {
            case 0:
                this.f19826b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19826b.lambda$onError$1();
                return;
        }
    }
}
