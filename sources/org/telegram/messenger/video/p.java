package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f18712a;
    public final VideoPlayerHolderBase.AnonymousClass2 f18713b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f18712a = i10;
        this.f18713b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18712a) {
            case 0:
                this.f18713b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f18713b.lambda$onError$1();
                return;
        }
    }
}
