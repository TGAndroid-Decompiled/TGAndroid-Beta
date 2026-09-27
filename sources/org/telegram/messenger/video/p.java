package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17828a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17829b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17828a = i10;
        this.f17829b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17828a) {
            case 0:
                this.f17829b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17829b.lambda$onError$1();
                return;
        }
    }
}
