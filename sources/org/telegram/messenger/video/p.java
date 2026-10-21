package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f19805a;
    public final VideoPlayerRewinder f19806b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19805a = i10;
        this.f19806b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19805a) {
            case 0:
                VideoPlayerRewinder.b(this.f19806b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19806b);
                return;
        }
    }
}
