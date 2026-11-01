package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f18744a;
    public final VideoPlayerRewinder f18745b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f18744a = i10;
        this.f18745b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f18744a) {
            case 0:
                VideoPlayerRewinder.b(this.f18745b);
                return;
            default:
                VideoPlayerRewinder.a(this.f18745b);
                return;
        }
    }
}
