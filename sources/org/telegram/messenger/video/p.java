package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19492a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19493b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19492a = i10;
        this.f19493b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19492a) {
            case 0:
                this.f19493b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19493b.lambda$onError$1();
                return;
        }
    }
}
