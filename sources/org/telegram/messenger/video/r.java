package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f19537a;
    public final VideoPlayerRewinder f19538b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19537a = i10;
        this.f19538b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19537a) {
            case 0:
                VideoPlayerRewinder.b(this.f19538b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19538b);
                return;
        }
    }
}
