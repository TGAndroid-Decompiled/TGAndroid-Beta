package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19299a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19300b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19299a = i10;
        this.f19300b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19299a) {
            case 0:
                this.f19300b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19300b.lambda$onError$1();
                return;
        }
    }
}
