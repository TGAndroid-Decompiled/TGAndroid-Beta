package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17844a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17845b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17844a = i10;
        this.f17845b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17844a) {
            case 0:
                this.f17845b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17845b.lambda$onError$1();
                return;
        }
    }
}
