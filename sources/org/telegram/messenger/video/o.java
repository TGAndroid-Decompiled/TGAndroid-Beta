package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f26038a;
    public final VideoPlayerHolderBase.AnonymousClass2 f26039b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f26038a = i7;
        this.f26039b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f26038a) {
            case 0:
                this.f26039b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f26039b.lambda$onError$1();
                return;
        }
    }
}
