package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17845a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17846b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17845a = i10;
        this.f17846b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17845a) {
            case 0:
                this.f17846b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17846b.lambda$onError$1();
                return;
        }
    }
}
