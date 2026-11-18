package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f27419a;
    public final VideoPlayerRewinder f27420b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f27419a = i7;
        this.f27420b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f27419a) {
            case 0:
                VideoPlayerRewinder.b(this.f27420b);
                return;
            default:
                VideoPlayerRewinder.a(this.f27420b);
                return;
        }
    }
}
