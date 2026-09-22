package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17831a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17832b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17831a = i10;
        this.f17832b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17831a) {
            case 0:
                this.f17832b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17832b.lambda$onError$1();
                return;
        }
    }
}
