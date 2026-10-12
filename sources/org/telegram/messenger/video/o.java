package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19276a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19277b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19276a = i10;
        this.f19277b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19276a) {
            case 0:
                this.f19277b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19277b.lambda$onError$1();
                return;
        }
    }
}
