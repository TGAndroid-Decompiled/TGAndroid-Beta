package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f19808a;
    public final VideoPlayerRewinder f19809b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19808a = i10;
        this.f19809b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19808a) {
            case 0:
                VideoPlayerRewinder.b(this.f19809b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19809b);
                return;
        }
    }
}
