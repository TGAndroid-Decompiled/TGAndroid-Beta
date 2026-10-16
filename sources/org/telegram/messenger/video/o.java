package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f18441a;
    public final VideoPlayerHolderBase.AnonymousClass2 f18442b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f18441a = i10;
        this.f18442b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18441a) {
            case 0:
                this.f18442b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f18442b.lambda$onError$1();
                return;
        }
    }
}
