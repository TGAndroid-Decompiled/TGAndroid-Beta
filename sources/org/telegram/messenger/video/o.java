package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19335a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19336b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19335a = i10;
        this.f19336b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19335a) {
            case 0:
                this.f19336b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19336b.lambda$onError$1();
                return;
        }
    }
}
