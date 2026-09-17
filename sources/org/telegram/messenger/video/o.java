package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f17608a;
    public final VideoPlayerHolderBase.AnonymousClass2 f17609b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f17608a = i10;
        this.f17609b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f17608a) {
            case 0:
                this.f17609b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f17609b.lambda$onError$1();
                return;
        }
    }
}
