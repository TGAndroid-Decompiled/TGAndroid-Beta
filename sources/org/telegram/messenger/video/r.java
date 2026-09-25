package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f17839a;
    public final VideoPlayerRewinder f17840b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17839a = i10;
        this.f17840b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17839a) {
            case 0:
                VideoPlayerRewinder.b(this.f17840b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17840b);
                return;
        }
    }
}
