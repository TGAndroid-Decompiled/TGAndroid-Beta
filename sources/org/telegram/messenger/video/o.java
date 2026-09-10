package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f16659a;
    public final VideoPlayerHolderBase.AnonymousClass2 f16660b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f16659a = i10;
        this.f16660b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f16659a) {
            case 0:
                this.f16660b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f16660b.lambda$onError$1();
                return;
        }
    }
}
