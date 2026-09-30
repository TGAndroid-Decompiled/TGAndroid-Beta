package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f17861a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17862b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17861a = i10;
        this.f17862b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17861a) {
            case 0:
                this.f17862b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17862b.lambda$onError$1();
                return;
        }
    }
}
