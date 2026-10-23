package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f19818a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19819b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19818a = i10;
        this.f19819b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19818a) {
            case 0:
                this.f19819b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19819b.lambda$onError$1();
                return;
        }
    }
}
