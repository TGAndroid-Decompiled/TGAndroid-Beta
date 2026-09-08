package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f19326a;
    public final VideoPlayerHolderBase.AnonymousClass2 f19327b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f19326a = i10;
        this.f19327b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f19326a) {
            case 0:
                this.f19327b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f19327b.lambda$onError$1();
                return;
        }
    }
}
