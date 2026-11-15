package org.telegram.messenger.video;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class o implements Runnable {
    public final int f27039a;
    public final VideoPlayerHolderBase.AnonymousClass2 f27040b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i7) {
        this.f27039a = i7;
        this.f27040b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f27039a) {
            case 0:
                this.f27040b.lambda$onRenderedFirstFrame$2();
                return;
            default:
                this.f27040b.lambda$onError$1();
                return;
        }
    }
}
