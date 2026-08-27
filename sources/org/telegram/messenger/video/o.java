package org.telegram.messenger.video;

public final class o implements Runnable {

    public final int f21865a;

    public final VideoPlayerHolderBase.AnonymousClass2 f21866b;

    public o(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i10) {
        this.f21865a = i10;
        this.f21866b = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.f21865a) {
            case 0:
                this.f21866b.lambda$onRenderedFirstFrame$2();
                break;
            default:
                this.f21866b.lambda$onError$1();
                break;
        }
    }
}
