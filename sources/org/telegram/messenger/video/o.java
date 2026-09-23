package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f17576a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17577b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17576a = i10;
        this.f17577b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17576a) {
            case 0:
                this.f17577b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17577b.lambda$onError$1();
                return;
        }
    }
}
