package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f19823a;
    public final VideoPlayerRewinder f19824b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19823a = i10;
        this.f19824b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19823a) {
            case 0:
                VideoPlayerRewinder.b(this.f19824b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19824b);
                return;
        }
    }
}
