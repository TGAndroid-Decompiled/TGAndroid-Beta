package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f19281a;
    public final VideoPlayerRewinder f19282b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19281a = i10;
        this.f19282b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19281a) {
            case 0:
                VideoPlayerRewinder.b(this.f19282b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19282b);
                return;
        }
    }
}
