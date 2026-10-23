package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f19886a;
    public final VideoPlayerRewinder f19887b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19886a = i10;
        this.f19887b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19886a) {
            case 0:
                VideoPlayerRewinder.b(this.f19887b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19887b);
                return;
        }
    }
}
