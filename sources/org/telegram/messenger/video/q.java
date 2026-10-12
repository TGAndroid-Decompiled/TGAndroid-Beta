package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f19282a;
    public final VideoPlayerRewinder f19283b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19282a = i10;
        this.f19283b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19282a) {
            case 0:
                VideoPlayerRewinder.b(this.f19283b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19283b);
                return;
        }
    }
}
