package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f18730a;
    public final VideoPlayerHolderBase.AnonymousClass2 f18731b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f18730a = i10;
        this.f18731b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18730a) {
            case 0:
                this.f18731b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f18731b.lambda$onError$1();
                return;
        }
    }
}
