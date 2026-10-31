package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class p implements Runnable {
    public final int f18584a;
    public final VideoPlayerHolderBase.AnonymousClass2 f18585b;

    public p(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f18584a = i10;
        this.f18585b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f18584a) {
            case 0:
                this.f18585b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f18585b.lambda$onError$1();
                return;
        }
    }
}
