package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f19500a;
    public final VideoPlayerRewinder f19501b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19500a = i10;
        this.f19501b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19500a) {
            case 0:
                VideoPlayerRewinder.b(this.f19501b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19501b);
                return;
        }
    }
}
