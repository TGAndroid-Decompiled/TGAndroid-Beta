package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f19489a;
    public final VideoPlayerRewinder f19490b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19489a = i10;
        this.f19490b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19489a) {
            case 0:
                VideoPlayerRewinder.b(this.f19490b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19490b);
                return;
        }
    }
}
