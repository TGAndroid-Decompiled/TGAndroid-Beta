package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f21834a;
    public final VideoPlayerRewinder f21835b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i9) {
        this.f21834a = i9;
        this.f21835b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f21834a) {
            case 0:
                VideoPlayerRewinder.b(this.f21835b);
                return;
            default:
                VideoPlayerRewinder.a(this.f21835b);
                return;
        }
    }
}
