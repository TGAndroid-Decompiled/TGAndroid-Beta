package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f27038a;
    public final VideoPlayerHolderBase.AnonymousClass2 f27039b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f27038a = i7;
        this.f27039b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f27038a) {
            case 0:
                this.f27039b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f27039b.lambda$onError$1();
                return;
        }
    }
}
