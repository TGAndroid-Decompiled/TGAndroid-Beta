package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17816a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17817b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17816a = i10;
        this.f17817b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17816a) {
            case 0:
                this.f17817b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17817b.lambda$onError$1();
                return;
        }
    }
}
