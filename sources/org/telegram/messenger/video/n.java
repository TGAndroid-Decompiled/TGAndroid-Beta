package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f19803a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19804b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19803a = i10;
        this.f19804b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19803a) {
            case 0:
                this.f19804b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19804b.lambda$onError$1();
                return;
        }
    }
}
