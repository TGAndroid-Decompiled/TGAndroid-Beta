package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f21893a;
    public final VideoPlayerHolderBase.AnonymousClass2 f21894b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f21893a = i10;
        this.f21894b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f21893a) {
            case 0:
                this.f21894b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f21894b.lambda$onError$1();
                return;
        }
    }
}
