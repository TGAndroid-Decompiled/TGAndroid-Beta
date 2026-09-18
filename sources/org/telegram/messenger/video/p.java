package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17785a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17786b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17785a = i10;
        this.f17786b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17785a) {
            case 0:
                this.f17786b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17786b.lambda$onError$1();
                return;
        }
    }
}
