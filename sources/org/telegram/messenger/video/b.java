package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class b implements Runnable {
    public final byte a;
    public final VideoPlayerHolderBase.AnonymousClass2 b;

    public b(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, byte b) {
        this.a = b;
        this.b = anonymousClass2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VideoPlayerHolderBase.AnonymousClass2 anonymousClass2 = this.b;
        switch (b) {
            case 0:
                anonymousClass2.lambda$onRenderedFirstFrame$2();
                return;
            default:
                anonymousClass2.lambda$onError$1();
                return;
        }
    }
}
