package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f26035a;
    public final VideoPlayerHolderBase.AnonymousClass2 f26036b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f26035a = i7;
        this.f26036b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f26035a) {
            case 0:
                this.f26036b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f26036b.lambda$onError$1();
                return;
        }
    }
}
