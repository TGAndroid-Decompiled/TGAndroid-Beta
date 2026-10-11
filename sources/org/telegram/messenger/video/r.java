package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f19501a;
    public final VideoPlayerRewinder f19502b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19501a = i10;
        this.f19502b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19501a) {
            case 0:
                VideoPlayerRewinder.b(this.f19502b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19502b);
                return;
        }
    }
}
