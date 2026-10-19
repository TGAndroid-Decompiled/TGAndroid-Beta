package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f19808a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19809b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19808a = i10;
        this.f19809b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19808a) {
            case 0:
                this.f19809b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19809b.lambda$onError$1();
                return;
        }
    }
}
