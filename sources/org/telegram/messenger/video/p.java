package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f20355a;
    public final VideoPlayerHolderBase.AnonymousClass2 f20356b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f20355a = i10;
        this.f20356b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f20355a) {
            case 0:
                this.f20356b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f20356b.lambda$onError$1();
                return;
        }
    }
}
