package org.telegram.messenger.video;

public final class q implements Runnable {

    public final int f21870a;

    public final VideoPlayerRewinder f21871b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f21870a = i10;
        this.f21871b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f21870a) {
            case 0:
                this.f21871b.lambda$updateRewindSpeed$0();
                break;
            default:
                this.f21871b.lambda$cancelRewind$1();
                break;
        }
    }
}
