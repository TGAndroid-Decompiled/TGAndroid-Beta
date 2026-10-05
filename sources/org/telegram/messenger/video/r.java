package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f19494a;
    public final VideoPlayerRewinder f19495b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19494a = i10;
        this.f19495b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19494a) {
            case 0:
                VideoPlayerRewinder.b(this.f19495b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19495b);
                return;
        }
    }
}
