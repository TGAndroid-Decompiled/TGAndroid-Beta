package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f19491a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19492b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19491a = i10;
        this.f19492b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19491a) {
            case 0:
                this.f19492b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19492b.lambda$onError$1();
                return;
        }
    }
}
