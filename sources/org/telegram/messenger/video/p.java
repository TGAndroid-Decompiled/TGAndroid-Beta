package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f19811a;
    public final VideoPlayerRewinder f19812b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19811a = i10;
        this.f19812b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19811a) {
            case 0:
                VideoPlayerRewinder.b(this.f19812b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19812b);
                return;
        }
    }
}
