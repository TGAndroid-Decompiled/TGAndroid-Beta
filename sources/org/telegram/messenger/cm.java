package org.telegram.messenger;
public final class cm implements Runnable {
    public final int f17347a;
    public final VideoEncodingService f17348b;

    public cm(VideoEncodingService videoEncodingService, int i10) {
        this.f17347a = i10;
        this.f17348b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17347a) {
            case 0:
                VideoEncodingService.a(this.f17348b);
                return;
            default:
                VideoEncodingService.b(this.f17348b);
                return;
        }
    }
}
