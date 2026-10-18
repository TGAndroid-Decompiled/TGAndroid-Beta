package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f19816a;
    public final VideoPlayerRewinder f19817b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19816a = i10;
        this.f19817b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19816a) {
            case 0:
                VideoPlayerRewinder.b(this.f19817b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19817b);
                return;
        }
    }
}
