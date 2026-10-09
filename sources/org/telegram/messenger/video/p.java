package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19495a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19496b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19495a = i10;
        this.f19496b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19495a) {
            case 0:
                this.f19496b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19496b.lambda$onError$1();
                return;
        }
    }
}
