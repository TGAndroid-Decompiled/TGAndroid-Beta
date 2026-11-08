package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f26043a;
    public final VideoPlayerRewinder f26044b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f26043a = i7;
        this.f26044b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f26043a) {
            case 0:
                VideoPlayerRewinder.b(this.f26044b);
                return;
            default:
                VideoPlayerRewinder.a(this.f26044b);
                return;
        }
    }
}
