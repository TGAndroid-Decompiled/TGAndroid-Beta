package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f20357a;
    public final VideoPlayerHolderBase.AnonymousClass2 f20358b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f20357a = i10;
        this.f20358b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f20357a) {
            case 0:
                this.f20358b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f20358b.lambda$onError$1();
                return;
        }
    }
}
