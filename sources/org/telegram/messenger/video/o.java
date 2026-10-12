package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19277a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19278b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19277a = i10;
        this.f19278b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19277a) {
            case 0:
                this.f19278b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19278b.lambda$onError$1();
                return;
        }
    }
}
