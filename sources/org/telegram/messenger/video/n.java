package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f19888a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19889b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19888a = i10;
        this.f19889b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19888a) {
            case 0:
                this.f19889b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19889b.lambda$onError$1();
                return;
        }
    }
}
