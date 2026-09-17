package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19308a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19309b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19308a = i10;
        this.f19309b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19308a) {
            case 0:
                this.f19309b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19309b.lambda$onError$1();
                return;
        }
    }
}
