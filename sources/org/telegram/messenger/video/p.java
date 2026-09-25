package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17834a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17835b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17834a = i10;
        this.f17835b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17834a) {
            case 0:
                this.f17835b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17835b.lambda$onError$1();
                return;
        }
    }
}
