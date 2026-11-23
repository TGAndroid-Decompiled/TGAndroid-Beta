package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f27427a;
    public final VideoPlayerRewinder f27428b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f27427a = i7;
        this.f27428b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f27427a) {
            case 0:
                VideoPlayerRewinder.b(this.f27428b);
                return;
            default:
                VideoPlayerRewinder.a(this.f27428b);
                return;
        }
    }
}
