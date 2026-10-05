package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19489a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19490b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19489a = i10;
        this.f19490b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19489a) {
            case 0:
                this.f19490b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19490b.lambda$onError$1();
                return;
        }
    }
}
