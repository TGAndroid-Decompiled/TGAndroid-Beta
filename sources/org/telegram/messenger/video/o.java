package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f26042a;
    public final VideoPlayerHolderBase.AnonymousClass2 f26043b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f26042a = i7;
        this.f26043b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f26042a) {
            case 0:
                this.f26043b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f26043b.lambda$onError$1();
                return;
        }
    }
}
