package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class n implements Runnable {
    public final int f18743a;
    public final VideoPlayerHolderBase.AnonymousClass2 f18744b;

    public n(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f18743a = i10;
        this.f18744b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18743a) {
            case 0:
                this.f18744b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f18744b.lambda$onError$1();
                return;
        }
    }
}
