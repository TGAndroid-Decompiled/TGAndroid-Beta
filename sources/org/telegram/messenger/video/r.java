package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f19504a;
    public final VideoPlayerRewinder f19505b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19504a = i10;
        this.f19505b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19504a) {
            case 0:
                VideoPlayerRewinder.b(this.f19505b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19505b);
                return;
        }
    }
}
